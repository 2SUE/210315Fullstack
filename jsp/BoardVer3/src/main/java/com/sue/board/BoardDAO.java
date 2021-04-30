package com.sue.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

// Data Access Object (DB 담당)
// db에 명령어 날림
public class BoardDAO {

	// 글등록
	public static int insertBoard(BoardVO vo) {
		// finally에서도 쓰기 위해 전역변수로 사용
		
		// Connection : 자바와 DB연결, PreparedStatement 객체 생성
		Connection con = null;
		
		// 쿼리문에 값 삽입, 쿼리문 실행
		PreparedStatement ps = null;

		String sql = " INSERT INTO t_board (title, ctnt) VALUES (?, ?) ";

		try {
			con = DBUtils.getCon();
			ps = con.prepareStatement(sql);
			// 물음표 자리, 넣을 값
			ps.setString(1, vo.getTitle());
			ps.setString(2, vo.getCtnt());

			return ps.executeUpdate(); // 쿼리 실행, create, update, delete 리턴 타입 : int
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(con, ps);
		}

		return 0;
	}
	
	public static List<BoardVO> selBoardList() {
		List<BoardVO> list = new ArrayList();
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = " SELECT iboard, title, regdt FROM t_board "; // 문장 끝에 세미콜론 넣으면 안 된다~~
		
		try {
			con = DBUtils.getCon();
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery(); // 쿼리 실행, select문에서만 사용
			
			// rs.next() : 레코드 가리키는 역할
			// 최초 실행 시 첫 번째 레코드 가리킴
			// 리턴값 : boolean
			// 레코드 유 => true | 레코드 무 => false
			while(rs.next()) {
				BoardVO vo = new BoardVO();
				list.add(vo); // 레퍼런스 변수 (주소값) : 어차피 주소에 접근할거라서 위치는 상관 없음!
				
//				int iboard = rs.getInt("iboard");
//				String title = rs.getString("title");
//				String regdt = rs.getString("regdt");
//				
//				vo.setIboard(iboard);
//				vo.setTitle(title);
//				vo.setRegdt(regdt);
				
				vo.setIboard(rs.getInt("iboard"));
				vo.setTitle(rs.getString("title"));
				vo.setRegdt(rs.getString("regdt"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(con, ps, rs);
		}
				
		return list;
	}
	
	public static BoardVO selBoard(int iboard) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = " SELECT * FROM t_board where iboard = ? ";
		
		try {
			con = DBUtils.getCon();
			ps = con.prepareStatement(sql);
			ps.setInt(1, iboard);
			
			rs = ps.executeQuery();
			
			// while문 써도 됨!
			// 한 줄 가져올 땐 if문 쓰자~~
			if (rs.next()) { 
				BoardVO vo = new BoardVO();

				vo.setTitle(rs.getString("title"));
				vo.setCtnt(rs.getString("ctnt"));
				vo.setRegdt(rs.getString("regdt"));

				return vo;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(con, ps, rs);
		}
				
		return null;
	}
}