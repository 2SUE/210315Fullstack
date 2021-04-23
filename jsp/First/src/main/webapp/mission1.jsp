<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>mission1</title>
</head>
<body>
	<div>스크립틀릿 이해를 하였는가 미션1</div>
	<div>for문을 이용하여 1 ~ 10 세로방향으로 찍히도록 해주세요.</div>
	<div>각 숫자들은 div로 감싸주세요.</div>
	
	<%
		for(int i = 1; i <= 10; i++) {
			out.println("<div>");
			out.println(i);
			out.println("</div>");
		}
	%>
	
	<hr>
	<% for(int i = 1; i <= 10; i++) { %>
		<div><%=i %></div>
	<% } %>
	
	<!-- <%%> 안에 메소드 못 만듦~~ 이 문서 자체가 하나의 메소드 안에 있기 때무넹 -->
	
	<%! // ! 붙이면 전역 메소드로 바귐
		int sum(int n1, int n2) {
		return n1 + n2;
	}
	%>
</body>
</html>