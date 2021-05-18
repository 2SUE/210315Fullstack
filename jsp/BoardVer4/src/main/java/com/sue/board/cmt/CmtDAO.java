package com.sue.board.cmt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sue.board.DBUtils;

public class CmtDAO {
	public static void insertCmt(CmtVO param) {
		Connection con = null;
		PreparedStatement ps = null;
		
		String sql = " INSERT INTO t_board_cmt (iboard, iuser, cmt) VALUES (?, ?, ?)";
		
		try {
			con = DBUtils.getCon();
			ps = con.prepareStatement(sql);
			ps.setInt(1, param.getIboard());
			ps.setInt(2, param.getIuser());
			ps.setString(3, param.getCmt());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(con, ps);
		}
	}
	
	public static List<CmtVO> selCmtList(int iboard) {
		List<CmtVO> list = new ArrayList<>();
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = " SELECT A.icmt, A.iboard, A.iuser, A.cmt, A.regdate, B.unm "
				+ " FROM t_board_cmt A "
				+ " INNER JOIN t_user B "
				+ " ON a.iuser = b.iuser "
				+ " WHERE iboard = ? ";
		
		try {
			con = DBUtils.getCon();
			ps = con.prepareStatement(sql);
			ps.setInt(1, iboard);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				CmtVO vo = new CmtVO();
				vo.setIcmt(rs.getInt("icmt"));
				vo.setIboard(rs.getInt("iboard"));
				vo.setIuser(rs.getInt("iuser"));
				vo.setCmt(rs.getString("cmt"));
				vo.setRegdate(rs.getString("regdate"));
				vo.setUnm(rs.getString("unm"));
				list.add(vo);
			}
			
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			DBUtils.close(con, ps, rs);
		}
	}
	
	public static void delCmt(CmtVO param) {
		Connection con = null;
		PreparedStatement ps = null;
		
		String sql = " DELETE FROM t_board_cmt WHERE icmt = ? AND iuser = ? ";
		
		try {
			con = DBUtils.getCon();
			ps = con.prepareStatement(sql);
			ps.setInt(1, param.getIcmt());
			ps.setInt(2, param.getIuser());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(con, ps);
		}
		
	}
}