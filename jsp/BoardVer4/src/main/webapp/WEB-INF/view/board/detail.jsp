<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${data.title}</title>
</head>
<body>
	<h3>${data.iboard}번 글</h3>
	<div>제목 : ${data.title}</div>
	<div>작성자 : ${data.unm}</div>
	<div>작성일 : ${data.regdt}</div>
	<div>${data.ctnt}</div>
	
	<!-- 글 작성자일 시에만 보임 -->
	<c:if test="${loginUser.iuser == data.iuser}">
		<div>
			<a href="del?iboard=${param.iboard}"><button>삭제</button></a>
			<a href="mod?iboard=${param.iboard}"><button>수정</button></a>
		</div>
	</c:if>
	
</body>
</html>