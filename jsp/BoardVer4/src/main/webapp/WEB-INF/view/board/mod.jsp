<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수정</title>
</head>
<body>
	<h1>수정</h1>
	<div>
		<form action="mod" method="post">
															   <!-- readonly : 값 수정 안 됨 -->
			<input type="hidden" name="iboard" value="${vo.iboard}" readonly>
			<div><input type="text" name="title" placeholder="제목" value="${vo.title}"></div>
			<div><textarea name="ctnt">${vo.ctnt}</textarea></div>
			<div>
				<input type="submit" value="글쓰기">
				<input type="reset" value="초기화">
			</div>
		</form>
	</div>
</body>
</html>