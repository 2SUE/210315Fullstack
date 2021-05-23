package com.sue.site.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.mindrot.jbcrypt.BCrypt;

import com.sue.site.DBUtils;

public class UserDAO {
	public static void insertUser(UserVO param) {
		Connection con = null;
		PreparedStatement ps = null;
		
		String sql = " INSERT INTO t_user (uid, upw, unm, gender) VALUES (?,?,?,?) ";
		
		try {
			con = DBUtils.getCon();
			ps = con.prepareStatement(sql);
			
			ps.setString(1, param.getUid());
			ps.setString(2, BCrypt.hashpw(param.getUpw(), BCrypt.gensalt()));
			ps.setString(3, param.getUnm());
			ps.setInt(4, param.getGender());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(con, ps);
		}
	}

	public static UserVO selUser(UserVO param) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null; 
		UserVO result = null;
		
		String sql = " SELECT * FROM t_user WHERE uid = ? ";
		
		try {
			con = DBUtils.getCon();
			ps = con.prepareStatement(sql);
			ps.setString(1, param.getUid());
			rs = ps.executeQuery();
			
			if(rs.next()) {
				result = new UserVO();
				result.setIuser(rs.getInt("iuser"));
				result.setUpw(rs.getString("upw"));
				result.setUnm(rs.getString("upw"));
				result.setGender(rs.getInt("gender"));
			}
			
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return result;
		} finally {
			DBUtils.close(con, ps, rs);
		}
	}
}