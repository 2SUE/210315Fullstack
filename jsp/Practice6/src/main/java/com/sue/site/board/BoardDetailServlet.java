package com.sue.site.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sue.site.MyUtils;
import com.sue.site.cmt.CmtDAO;
import com.sue.site.cmt.CmtVO;

@WebServlet("/board/detail")
public class BoardDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int iboard = MyUtils.paramStringToInt("iboard", request);
		int iuser = MyUtils.loginUserPK(request);
		
		BoardVO paramB = new BoardVO();
		paramB.setIboard(iboard);
		paramB.setIuser(iuser);
		
		request.setAttribute("data", BoardDAO.selBoard(paramB));
		
		CmtVO paramC = new CmtVO();
		paramC.setIboard(iboard);
		
		request.setAttribute("cmtList", CmtDAO.selCmtList(paramC));
		
		MyUtils.openJSP("board/detail", request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int iboard = MyUtils.paramStringToInt("iboard", request);
		String title = request.getParameter("title");
		String ctnt = request.getParameter("ctnt");
		int modOrDel = MyUtils.paramStringToInt("modOrDel", request);
		int iuser = MyUtils.loginUserPK(request);
				
		BoardVO param = new BoardVO();
		param.setIboard(iboard);
		param.setTitle(title);
		param.setCtnt(ctnt);
		
		if(modOrDel == 1) {
			param.setIuser(iuser);
			BoardDAO.delBoard(param);
			response.sendRedirect("list");
			return;
		}

		BoardDAO.updBoard(param);
		response.sendRedirect("detail?iboard="+iboard);
	}
}