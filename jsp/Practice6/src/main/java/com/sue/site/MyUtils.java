package com.sue.site;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sue.site.user.UserVO;

public class MyUtils {
	public static void openJSP(String fileNm, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String jsp = "/WEB-INF/view/" + fileNm + ".jsp";
		request.getRequestDispatcher(jsp).forward(request, response);
	}
	
	public static int paramStringToInt(String val, HttpServletRequest request) {
		return Integer.parseInt(request.getParameter(val));
	}
	
	public static int loginUserPK(HttpServletRequest request) {
		HttpSession hs = request.getSession();
		UserVO user = (UserVO) hs.getAttribute("loginUser");
		return user.getIuser();
	}
}
