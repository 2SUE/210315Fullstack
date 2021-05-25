package com.sue.board7.cmt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sue.board7.DBUtils;

public class BoardCmtDAO {
	// Ajax는 등록 유무를 꼭 알려줘야함! void no
	public static int insBoardCmt(BoardCmtEntity param) {
		int result = 0;
		Connection con = null;
		PreparedStatement ps = null;
		
		String sql = " INSERT INTO t_board_cmt (iboard, iuser, cmt) VALUES (?,?,?) ";
				
		try {
			con = DBUtils.getCon();
			ps = con.prepareStatement(sql);
			ps.setInt(1, param.getIboard());
			ps.setInt(2, param.getIuser());
			ps.setString(3, param.getCmt());
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(con, ps);
		}
		return result;
	}
	
	public static List<BoardCmtDomain> selBoardCmtList(BoardCmtEntity param) {
		List<BoardCmtDomain> list = new ArrayList<BoardCmtDomain>();
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = " SELECT A.icmt, A.regdate, A.iuser, A.cmt, B.unm AS writerNm"
				+ " FROM t_board_cmt A "
				+ " INNER JOIN t_user B "
				+ " ON A.iuser = B.iuser "
				+ " WHERE A.iboard = ? ";
		
		try {
			con = DBUtils.getCon();
			ps = con.prepareStatement(sql);
			ps.setInt(1, param.getIboard());
			rs = ps.executeQuery();
			
			while(rs.next()) {
				BoardCmtDomain vo = new BoardCmtDomain();
				vo.setIcmt(rs.getInt("icmt"));				
				vo.setCmt(rs.getString("cmt"));
				vo.setRegdate(rs.getString("regdate"));
				vo.setIuser(rs.getInt("iuser"));
				vo.setWriterNm(rs.getString("writerNm"));
				list.add(vo);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(con, ps, rs);
		}
		return list;
	}
	
}
