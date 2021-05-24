package com.sue.board7.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sue.board7.DBUtils;

public class BoardDAO {
	public static List<BoardDomain> selBoardList() {
		List<BoardDomain> list = new ArrayList<BoardDomain>();
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = " SELECT b.iboard, b.title, b.regdt, b.iuser, u.unm AS writerNm "
				+ " FROM t_board b "
				+ " LEFT JOIN t_user u "
				+ " ON b.iuser = u.iuser "
				+ " ORDER BY iboard DESC ";
		
		try {
			con = DBUtils.getCon();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				BoardDomain vo = new BoardDomain();
				vo.setIboard(rs.getInt("iboard"));
				vo.setTitle(rs.getString("title"));
				vo.setRegdt(rs.getString("regdt"));
				vo.setIuser(rs.getInt("iuser"));
				vo.setWriterNm(rs.getString("writerNm"));
				
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
}
