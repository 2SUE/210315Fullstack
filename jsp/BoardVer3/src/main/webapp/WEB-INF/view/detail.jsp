<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>page ${param.iboard}</title>
</head>
<body>
	<h1>${param.iboard}번째 글</h1>
	<div><a href="/list">리스트</a></div>
	<div>제목 : ${data.title}</div>
	<div>내용 : ${data.ctnt}</div>
	<div>${data.regdt}</div>
</body>
</html>