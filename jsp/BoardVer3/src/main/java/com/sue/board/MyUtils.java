package com.sue.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyUtils {
	public static void openJSP (String fileNm, HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/view/" + fileNm + ".jsp").forward(request, response);
	}
	
	public static int parseStringToInt(String strNum) {
		try {
			return Integer.parseInt(strNum);
		} catch (Exception e) {
			return 0; // 파라미터가 문자열인 경우 0리턴
		}
	}
	
	public static int getParamInt(String key, HttpServletRequest request) {
		String strVal = request.getParameter("key");
		int intVal = parseStringToInt(strVal);
		
		return intVal;
	}
}
