package com.sue.board7;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sue.board7.user.UserEntity;

public class MyUtils {
	public static void openJSP(String title, String jsp, HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setAttribute("title", title);
		req.setAttribute("jsp", jsp);
		String tmep = "/WEB-INF/view/template.jsp";
		req.getRequestDispatcher(tmep).forward(req, res);
	}
	
	public static int parseStringToInt(String val) {
		try {
			return Integer.parseInt(val);
		} catch (Exception e) {
			return 0;
		}
	}
	
	public static int getParamInt(String key, HttpServletRequest req) {
		String val = req.getParameter(key);
		int intval = parseStringToInt(val);
		return intval;
	}
	
	public static UserEntity getLoginUser(HttpServletRequest req) {
		if(req == null) { return null; }
		HttpSession hs = req.getSession();
		return (UserEntity) hs.getAttribute("loginUser");
	}
	
	/*
	public static int getLoginUserPK(HttpServletRequest req) {
		return getLoginUser(req).getIuser();
	}
	*/
	
}