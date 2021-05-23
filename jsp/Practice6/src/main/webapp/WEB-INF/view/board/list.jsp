<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
<script src="/res/js/app.js"></script>
</head>
<body>
	<a href="write"><button>글쓰기</button></a>
	
	<div>
		<c:forEach items="${list}" var="i">
			<li style="cursor: pointer;" onclick="moveTodetail(${i.iboard})">(${i.iboard}) ${i.title}</li>
		</c:forEach>
	</div>
</body>
</html>