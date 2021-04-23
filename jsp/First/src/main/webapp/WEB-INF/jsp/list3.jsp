<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
 	String name = request.getParameter("name");
	String age = request.getParameter("age");
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list3</title>
</head>
<body>
	<h1 style="margin:0; padding:0; color: orange;">List3 화면</h1>
	<%=name %>, <%=age %>
</body> 
</html>