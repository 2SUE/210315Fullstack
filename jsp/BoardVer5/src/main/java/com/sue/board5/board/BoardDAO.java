package com.sue.board5.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sue.board5.DBUtils;

public class BoardDAO {
	public static int isrtBoard(BoardVO param) {
		Connection con = null;
		PreparedStatement ps = null;
		
		String sql = " INSERT INTO t_board (title, ctnt, iuser) VALUES (?,?,?) ";
		
		try {
			con = DBUtils.getCon();
			ps = con.prepareStatement(sql);
			ps.setString(1, param.getTitle());
			ps.setString(2, param.getCtnt());
			ps.setInt(3, param.getIuser());

			return ps.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
			return 0;
		} finally {
			DBUtils.close(con, ps);
		}
	}
	
	public static List<BoardVO> selList() {
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
				vo.setIboard(rs.getInt("iboard"));
				vo.setTitle(rs.getString("title"));
				vo.setCtnt(rs.getString("ctnt"));
				vo.setIuser(rs.getInt("iuser"));
				vo.setRegdt(rs.getString("regdt"));
				
				list.add(vo);
			}
			
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return list;
		} finally {
			DBUtils.close(con, ps, rs);
		}
	}
	
	public static BoardVO selBoard(int iboard) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		BoardVO vo = null;
		
		String sql = " SELECT * FROM t_board WHERE iboard = ? ";
		
		try {
			con = DBUtils.getCon();
			ps = con.prepareStatement(sql);
			ps.setInt(1, iboard);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				vo = new BoardVO();
				vo.setIboard(iboard);
				vo.setTitle(rs.getString("title"));
				vo.setCtnt(rs.getString("ctnt"));
				vo.setIuser(rs.getInt("iuser"));
				vo.setRegdt(rs.getString("regdt"));	
			}
			return vo;
		} catch (Exception e) {
			e.printStackTrace();
			return vo;
		} finally {
			DBUtils.close(con, ps, rs);
		}
	}
}