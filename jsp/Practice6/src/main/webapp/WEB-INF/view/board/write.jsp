<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기</title>
<script src="/res/js/app.js"></script>
</head>
<body>
	<div>
		<form action="write" method="post">
			<div>제목 : <input type="text" name="title"></div>
			<div>내용 : <textarea name="ctnt" rows="12" cols="20"></textarea></div>
			<div>
				<input type="submit" value="글쓰기">
			</div>
		</form>
		<button onclick="goToBack()">뒤로가기</button>
	</div>
</body>
</html>