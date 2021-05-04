<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기</title>
</head>
<body>
	<form action="/write" method="post">
		<div><h3>제목</h3></div>
		<div><input type="text" name="title"></div>
		
		<div><h3>내용</h3></div>
		<div><textarea name="ctnt" rows="13" cols="22"></textarea></div>
		
		<div>
			<input type="hidden" name="iboard" value="${param.iboard}">
			<input type="submit" value="등록">
			<input type="reset" value="초기화">
		</div>
	</form>
</body>
</html>