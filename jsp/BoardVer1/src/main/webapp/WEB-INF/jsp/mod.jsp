<%@page import="com.sue.board.BoardVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	String no = request.getParameter("no");
	BoardVO vo = (BoardVO)request.getAttribute("data");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>수정</title>
</head>
<body>
	<h1>글수정</h1>
	<form action="/mod" method="post">
		<input type="hidden" name="no" value="<%=no %>">
		<div> 
														<!-- 기존 값이 세팅되어 있어야 함 -->
			제목 : <input type="text" name="title" value="<%=vo.getTitle() %>">
		</div>
		
		<div>
			내용 : <textarea name="ctnt" rows="10" cols="10"><%=vo.getCtnt()%></textarea>
		</div>
		 
		<div>
			<input type="submit" value="글수정"> 
			<input type="reset" value="초기화">
		</div>
	</form>
</body>
</html>