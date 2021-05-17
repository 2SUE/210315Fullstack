package com.sue.board.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.sue.board.DBUtils;

public class UserDAO {
	public static int joinUser(UserVO vo) {
		Connection con = null;
		PreparedStatement ps = null;
		
		String sql = " INSERT INTO t_user(uid, upw, unm, gender) "
				+ " VALUES (?, ?, ?, ?) ";
		
		try {
			con = DBUtils.getCon();
			ps = con.prepareStatement(sql);
			ps.setString(1, vo.getUid());
			ps.setString(2, vo.getUpw());
			ps.setString(3, vo.getUnm());
			ps.setInt(4, vo.getGender());
			
			return ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		} finally {
			DBUtils.close(con, ps);
		}
	}
	
	// 로그인 성공 : 1, 아이디 오류 : 2, 비번 오류 : 3, 걍 오류 : 0
	public static int loginUser(UserVO vo) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = " SELECT * FROM t_user WHERE uid = ? ";
		
		try {
			con = DBUtils.getCon();
			ps = con.prepareStatement(sql);
			ps.setString(1, vo.getUid());
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				if(rs.getString("uid").equals(vo.getUid())) {
					if(rs.getString("upw").equals(vo.getUpw())) {
						return 1;
					}
					return 3;
				} else {
					return 2;
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		} finally {
			DBUtils.close(con, ps, rs);
		}
		return 0;
	}
}
