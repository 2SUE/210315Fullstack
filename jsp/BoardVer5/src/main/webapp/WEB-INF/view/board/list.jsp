<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리스트</title>
<style>
	li { cursor : pointer; }
</style>
</head>
<body>
	<div>
		<c:forEach var="i" items="${list}">
			<li onclick="goToDetail(${i.iboard})">${i.iboard}. ${i.title} (${i.regdt}))</li>
		</c:forEach>
		<div>
			<a href="write"><button>글쓰기</button></a>
		</div>
	</div>
	
	<script>
		function goToDetail(iboard) {
			location.href = "detail?iboard=" + iboard;
		}
	</script>
</body>
</html>