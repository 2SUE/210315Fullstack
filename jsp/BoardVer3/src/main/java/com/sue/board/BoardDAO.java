package com.sue.board;

import java.sql.Connection;
import java.sql.PreparedStatement;

// Data Access Object (DB 담당)
// db에 명령어 날림
public class BoardDAO { 
	
	// 글등록
	public static int insertBoard(BoardVO vo) {
		Connection con= null;
		PreparedStatement ps = null;
		
		String sql = " INSERT INTO t_board (title, ctnt) "
				+ " VALUES (?, ?) ";
		
		try {
			con = DBUtils.getCon();
			ps = con.prepareStatement(sql);
					  // 첫 번째 물음표, 넣을 값
			ps.setString(1, vo.getTitle());
			ps.setString(2, vo.getCtnt());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(con, ps);
		}
		
		return 0;
	}
}
