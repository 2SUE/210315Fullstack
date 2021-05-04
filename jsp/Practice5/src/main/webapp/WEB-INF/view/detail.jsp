<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>디테일</title>
</head>
<body>
	<div>
		<h3>제목 : ${vo.title}</h3>
		<h3>내용</h3>
		<span>${vo.ctnt}</span>
	</div>
	<br/>
	<div>
		<form action="/del" method="post">
			<input type="hidden" name="iboard" value="${param.iboard}">
			<input type="submit" value="삭제">				
		</form>
		<a href="/mod?iboard=${param.iboard}"><button>수정</button></a>
	</div>
</body>
</html>