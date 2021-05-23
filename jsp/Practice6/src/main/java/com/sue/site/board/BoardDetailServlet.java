package com.sue.site.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sue.site.MyUtils;

@WebServlet("/board/detail")
public class BoardDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int iboard = MyUtils.paramStringToInt("iboard", request);
		
		BoardVO param = new BoardVO();
		param.setIboard(iboard);
		
		request.setAttribute("data", BoardDAO.selBoard(param));
		
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