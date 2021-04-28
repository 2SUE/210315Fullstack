<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--
	pageContext.setAttribute("name", "A");
	request.setAttribute("name", "B");
	session.setAttribute("name", "C");
	application.setAttribute("name", "D");
 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>디테일</title>
</head>
<body>
<%--  
				 <!-- setAttribute에서 보내준 것만 EL식 사용 가능 -->
				 <!-- key값(setAttribute - key).멤버필드명 -->
	<div>제목 : ${data.title} | ${data.getTitle()}</div>
	<div>${data.ctnt}</div>
	<div>data : ${data}</div>
	<!--
		주소창에 query String이 있어야 값이 찍힘 
		query String에서 값 가져옴!
		setAttribute key값으로 param 쓰지 말 것
	-->	
	<div>쿼리스트링 : ${param.no}</div> 
	<div>내장객체 : ${name}</div>
	<div>내장객체 : ${name}</div>
--%>	

	<div>제목 : ${data.title}</div>
	<div>내용 : ${data.ctnt}</div>
	
	<form action="/del" method="post">
		<input type="hidden" name="no" value="${param.no}">
		<input type="submit" value="삭제">
	</form>
	<a href="/mod?no=${param.no}"><button>수정</button></a>
</body>
</html>