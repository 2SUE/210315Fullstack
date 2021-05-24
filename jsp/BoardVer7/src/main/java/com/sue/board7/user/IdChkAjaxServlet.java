package com.sue.board7.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/user/idChk")
public class IdChkAjaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uid = request.getParameter("uid");
		System.out.println("uid : " + uid);
		int result = UserDAO.selIdChk(uid);
		
		// JSON 객체 형태인 {"key" : value} 으로 리턴
		// JSON 객체를 사용하지 않고 value 값만 보내도 된다
		// response.getWriter().append(result);
		
		/*
		PrintWriter pw = response.getWriter();
		pw.append("{\"result\" : ");
		pw.append(String.valueOf(result));
		pw.append("}");
		*/

		response.getWriter()
		.append("{\"result\" : ")
		.append(String.valueOf(result))
		.append("}");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
