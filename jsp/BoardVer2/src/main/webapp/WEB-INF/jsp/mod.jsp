<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수정</title>
</head>
<body>
	<div><a href="/list">돌아가기</a></div>
	<div>
		<form action="/mod" method="post">
			<input type="hidden" name="no" value="${param.no}">
			<div>제목 : <input type="text" name="title" value="${vo.title}"></div>
			<div>내용 : <textarea name="ctnt" cols="22" rows="12" name="ctnt">${vo.ctnt}</textarea></div>
			<div><input type="submit" value="수정"></div>
			<div><input type="reset" value="초기화"></div>
		</form>
	</div>
</body>
</html>