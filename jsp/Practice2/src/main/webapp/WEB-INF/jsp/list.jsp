<%@page import="com.sue.board6.BoardVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% List<BoardVO> vo = (List)request.getAttribute("data"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글목록</title>
</head>
<body>
	<h1>글목록</h1>
	<a href="/write">글쓰기</a>
	<ul>
		<% for(int i = 0; i < vo.size(); i++) {
			BoardVO list = vo.get(i); 	
		%>
		<li><%=i+1 %>. <a href="detail=?no=<%=i%>"><%=list.getTitle() %></a></li>
		<%} %>
	</ul>
</body>
</html>