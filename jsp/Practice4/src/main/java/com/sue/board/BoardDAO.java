package com.sue.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardDAO {
	
	// 값 입력
	public static int insertBoard(BoardVO vo) {
		Connection con = null;
		PreparedStatement ps = null;

		String sql = " INSERT INTO t_board(title, ctnt) VALUES (?, ?) ";

		try {
			con = DBUtils.getCon();
			ps = con.prepareStatement(sql);
			ps.setString(1, vo.getTitle());
			ps.setString(2, vo.getCtnt());
			
			return ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(con, ps);
		}

		return 0;
	}
	
	// 리스트 출력
	public static List<BoardVO> listBoard() {
		List<BoardVO> list = new ArrayList<BoardVO>();
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = " SELECT * FROM t_board ";
		
		try {
			con = DBUtils.getCon();
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				BoardVO vo = new BoardVO();
				vo.setIboard(rs.getInt(1));
				vo.setTitle(rs.getString(2));
				vo.setCtnt(rs.getString(3));
				vo.setNowDate(rs.getString(4));
				
				list.add(vo);
			}
			
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(con, ps, rs);
		}
		
		return null;
	}
	
	// 글 상세페이지
	public static BoardVO selBoard(BoardVO vo) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = " SELECT * FROM t_board where iboard = ? ";
		
		try {
			con = DBUtils.getCon();
			ps = con.prepareStatement(sql);
			ps.setInt(1, vo.getIboard());
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				vo.setTitle(rs.getString(2));
				vo.setCtnt(rs.getString(3));
			}
			
			return vo;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(con, ps, rs); 
		}
		return null;
	}
	
	// 글 삭제
	public static int delBoard(int iboard) {
		Connection con = null;
		PreparedStatement ps = null;
		
		String sql = " DELETE from t_board where iboard = ? ";
		
		try {
			con = DBUtils.getCon();
			ps = con.prepareStatement(sql);
			ps.setInt(1, iboard);
			
			return ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(con, ps);
		}
		
		return 0;
	}
	
	// 글 수정
	public static int updBoard(BoardVO vo) {
		Connection con = null;
		PreparedStatement ps = null;
		
		String sql = " UPDATE t_board set title = ?, ctnt = ? where iboard = ? ";
		
		try {
			con = DBUtils.getCon();
			ps = con.prepareStatement(sql);
			ps.setString(1, vo.getTitle());
			ps.setString(2, vo.getCtnt());
			ps.setInt(3, vo.getIboard());
			
			return ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(con, ps);
		}
		
		return 0;
	}
}
