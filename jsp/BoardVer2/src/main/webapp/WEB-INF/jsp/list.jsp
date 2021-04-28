<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- !!!!!!!!!!!!!!!! jstl 문법 사용 시 적어줘야함 !!!!!!!!!!!!!!!! -->    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list</title>
<style>
	table, td, tr { border: 1px solid black; border-collapse: collapse; }
</style>
</head>
<body>
	<a href="/write">글쓰기</a>
	
	<%--
		pageContext에 setAttribute로,,,생성,, 
		begin : 시작 인덱스, end : 종료 인덱스, step : 증가값
		페이징할 때 쓰니까 알아둬라~~~
	
	<c:forEach var="i" begin="1" end="5" step="1">
		<div>${i}</div>
	</c:forEach>
	--%>
	
	<table>
		<tr>
			<td>no</td>
			<td>제목</td>
		</tr>
		<c:forEach var="item" items="${list}" varStatus="status">
			<tr>
				<td>${status.index}</td>
				<td>
					<a href="/detail?no=${status.index}">${item.title}</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>