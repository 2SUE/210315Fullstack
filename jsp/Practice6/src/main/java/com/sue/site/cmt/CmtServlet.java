package com.sue.site.cmt;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sue.site.MyUtils;

@WebServlet("/board/cmt")
public class CmtServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int icmt = MyUtils.paramStringToInt("icmt", request);
		int iuser = MyUtils.loginUserPK(request);
		int iboard = MyUtils.paramStringToInt("iboard", request);
		String cmt = request.getParameter("cmt");
		
		CmtVO param = new CmtVO();
		param.setIcmt(icmt);
		param.setIuser(iuser);
		
		if(cmt == null) {
			CmtDAO.delCmt(param);
		} else {
			System.out.println("cmt : " + cmt);
			param.setCmt(cmt);
			CmtDAO.updCmt(param);
		}
		
		response.sendRedirect("/board/detail?iboard=" + iboard);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int iboard = MyUtils.paramStringToInt("iboard", request);
		int iuser = MyUtils.loginUserPK(request);
		String cmt = request.getParameter("cmt");
		
		CmtVO param = new CmtVO();
		param.setIboard(iboard);
		param.setIuser(iuser);
		param.setCmt(cmt);
		
		CmtDAO.insCmt(param);
		
		response.sendRedirect("detail?iboard=" + iboard);
	}
}