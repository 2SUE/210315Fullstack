<%@page import="com.sue.board.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% BoardVO vo = (BoardVO)request.getAttribute("data"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세 페이지</title>
</head>
<body>
	<h1>상세 페이지</h1>
	<div><%=vo.getTitle() %></div>
	<div><%=vo.getCtnt() %></div>
</body>
</html>