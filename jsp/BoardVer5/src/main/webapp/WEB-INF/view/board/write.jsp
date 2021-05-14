<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기</title>
</head>
<body>
	<form action="write" method="post">
		<div>
			<label><input type="text" name="title"></label>
		</div>
		<div>
			<label><textarea name="ctnt"></textarea></label>
		</div>
		<div>
			<input type="submit" value="글쓰기">
			<input type="reset" value="초기화">
		</div>
	</form>
</body>
</html>