<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글목록</title>
</head>
<body>
	<h3>로그인 오나료</h3>
	<div>${loginUser.unm}님 (${loginUser.uid}) 환영합니다.</div>
	<br/>
	<a href="/user/logout"><button>로그아웃</button></a>
	<a href="write"><button>글쓰기</button></a>

	<br/><hr/>

	<h3>리스트</h3>
	<c:forEach var="i" items="${list}">
		<li>(${i.iboard}) 제목 : ${i.title}, 작성자 : ${i.unm}, 작성일 : ${i.regdt}</li>
	</c:forEach>
</body>
</html> 