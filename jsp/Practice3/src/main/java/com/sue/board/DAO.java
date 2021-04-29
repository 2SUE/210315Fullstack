package com.sue.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

// DB랑 연동하는 클래스
// sql 작성
// db라 생각하라
// 보통은 클래스명 = 테이블명.DAO
public class DAO {
	Connection con; // DB 연결
	PreparedStatement pstmt; // sql문을 실행
	ResultSet rs; // pstmt 결과값 담는 변수
	
	public void getCon() {
		try {
			Context initctx = new InitialContext();
			
			Context envctx = (Context) initctx.lookup("java:comp/env");
			DataSource ds = (DataSource) envctx.lookup("jdbc/pool");
			con = ds.getConnection();
			System.out.println("연겨 ㄹ성공!");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("연결 시류ㅐ!");
		}
	}
	
	public List<SuVO> selectName() {
		List<SuVO> list = new ArrayList<SuVO>();
		getCon();
		try {
			String sql = "select * from su";
			pstmt = con.prepareStatement(sql); // sql을 적재!
			rs = pstmt.executeQuery(sql);
			if(rs.next()) {
				SuVO suvo = new SuVO();
				suvo.setName(rs.getString(1));
				list.add(suvo);
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
