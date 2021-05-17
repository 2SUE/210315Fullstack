package com.sue.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyUtils {
	public static void openJSP(String fileNm, HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/view/" + fileNm + ".jsp").forward(req, res);
	}
	
	public static int getparaInt(String key, HttpServletRequest req) {
		String val = req.getParameter(key);
		int intVal = Integer.parseInt(val);
		return intVal;
	}
}
