<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리스트</title>
<!-- js, css file은 상대경로 x -->
<!-- defer : 외부 파일을 제일 마지막에 읽음 -->
<link type="text/css" rel="stylesheet" href="/res/css/boardList.css">
<script defer src="/res/js/boardList.js"></script>
</head>
<body>
	<div>
		<c:forEach var="i" items="${requestScope.list}">
			<li class="record" onclick="goToDetail(${i.iboard})">${i.iboard}. ${i.title} (${i.regdt}))</li>
		</c:forEach>
		<div>
			<a href="write"><button>글쓰기</button></a>
			<a href="/user/logout"><button>로그아웃</button></a>
		</div>
	</div>
</body>
</html>