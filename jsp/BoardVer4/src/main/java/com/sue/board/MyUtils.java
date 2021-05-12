package com.sue.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sue.board.user.UserVO;

public class MyUtils {
	public static void openJSP(String fileNm, HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String jsp = "/WEB-INF/view/" + fileNm + ".jsp"; // fileNm에 폴더명 + 파일명 받음
		req.getRequestDispatcher(jsp).forward(req, res);
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
	
	public static UserVO getLoginUser(HttpServletRequest req) {
		if(req == null) { return null; }
		HttpSession hs = req.getSession();
		return (UserVO) hs.getAttribute("loginUser");
	}
	
	public static int getLoginUserPK(HttpServletRequest req) {
		return getLoginUser(req).getIuser();
	}
}