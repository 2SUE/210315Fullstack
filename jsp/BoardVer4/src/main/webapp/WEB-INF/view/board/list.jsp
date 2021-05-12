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
		  <!-- items : 시퀀스가 있는 주소값 -->
	<c:forEach items="${list}" var="i">
		<li onclick="moveToDetail(${i.iboard})" style="cursor: pointer;">
			(${i.iboard}) 제목 : ${i.title}, 작성자 : ${i.unm}, 작성일 : ${i.regdt}
		</li>
	</c:forEach>
	
	<script>
		function moveToDetail(iboard) {
			location.href = '/board/detail?iboard=' + iboard;
		}
	</script>
</body>
</html>