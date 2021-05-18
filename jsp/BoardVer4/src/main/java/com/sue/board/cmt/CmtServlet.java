package com.sue.board.cmt;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sue.board.MyUtils;

@WebServlet("/board/cmt")
public class CmtServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int icmt = MyUtils.getParamInt("icmt", request);
		int iboard = MyUtils.getParamInt("iboard", request);
		int iuser = MyUtils.getLoginUserPK(request);
		
		CmtVO vo = new CmtVO();
		vo.setIcmt(icmt);
		vo.setIuser(iuser);
		
		CmtDAO.delCmt(vo);
		
		response.sendRedirect("/board/detail?iboard=" + iboard);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int iboard = MyUtils.getParamInt("iboard", request);
		int iuser = MyUtils.getLoginUserPK(request);
		int icmt = MyUtils.getParamInt("icmt", request);
		String cmt = request.getParameter("cmt");
		
		CmtVO param = new CmtVO();
		param.setIboard(iboard);
		param.setIuser(iuser);
		param.setCmt(cmt);

		CmtDAO.insertCmt(param);
		
		response.sendRedirect("/board/detail?iboard=" + iboard);
	}
}