package com.sue.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtils {
	/*
	연결 확인
	
	public static void main(String[] args) {
		try {
			getCon();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	*/
	
	public static Connection getCon() throws Exception {
		final String DB_NAME = "boardver3";
		final String DRIVER = "com.mysql.cj.jdbc.Driver";
		final String URL = "jdbc:mysql://localhost:3308/" + DB_NAME;
		final String USER_NAME = "root";
		final String PASSWORD = "koreait";
		
		Class.forName(DRIVER);
		Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
		System.out.println("연결 성공!");
		
		return con;
	}
	
	public static void close(Connection con, PreparedStatement ps) {		
		close(con, ps, null);
	}
	
   						  // 자바, DB 연결		 쿼리문 실행			   select문에서만 사용
	public static void close(Connection con, PreparedStatement ps, ResultSet rs) {
		// 닫는 순서 중요!
		if(rs != null) {
			 try { rs.close(); } catch (SQLException e) { e.printStackTrace(); }
		}
		
		if(ps != null) {
			 try { ps.close(); } catch (SQLException e) { e.printStackTrace(); }
		}
		
		if(con != null) {
			 try { con.close(); } catch (SQLException e) { e.printStackTrace(); }
		}
	}
}