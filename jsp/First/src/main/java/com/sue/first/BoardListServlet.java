package com.sue.first;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/list")
public class BoardListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doGet");
		response.setCharacterEncoding("UTF-8");
		
		// 주소값.
		response.getWriter()
		.append("<html>") // append로 문자열 추가
		.append("<head><title>안녕</title><meta charset=\"UTF-8\"></head>")
		.append("<body>")
		.append("바디영역")
		.append("</body>")
		.append("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doPost");
		doGet(request, response);
	}
}

/*
	web_inf 폴더 안에 jsp 파일 생성 할 예정~~
	web_inf 폴더는 외부에서 접근 못함
*/
