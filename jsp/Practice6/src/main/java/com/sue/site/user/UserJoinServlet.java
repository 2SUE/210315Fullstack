package com.sue.site.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mindrot.jbcrypt.BCrypt;

import com.sue.site.MyUtils;

@WebServlet("/user/join")
public class UserJoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MyUtils.openJSP("user/join", request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uid = request.getParameter("uid");
		String upw = request.getParameter("upw");
		String unm = request.getParameter("unm");
		int gender = MyUtils.paramStringToInt("gender", request);
		String hashedUpw = BCrypt.hashpw(upw, BCrypt.gensalt());
		
		UserVO param = new UserVO();
		param.setUid(uid);
		param.setUpw(hashedUpw);
		param.setUnm(unm);
		param.setGender(gender);
		
		UserDAO.insertUser(param);
		
		response.sendRedirect("/user/login");
	}
}