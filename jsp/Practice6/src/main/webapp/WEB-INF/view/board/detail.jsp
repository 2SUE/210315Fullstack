<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${param.iboard}번째 글</title>
<script src="/res/js/app.js?ver6"></script>
<link rel="stylesheet" type="text/css" href="/res/css/style.css">
</head>
<body>
	<div>
		<div id="insF">
			<h3>${data.iboard}. ${data.title}</h3>
			<div>${data.ctnt}</div>
		</div>
		
		<div id="modF" class="hidden">
			<form action="detail" method="post">
				<input type="hidden" name="iboard" value="${param.iboard}">
				<input type="hidden" name="modOrDel" value="0">
				<div><label>제목 : <input type="text" name="title" value="${data.title}"></label></div>
				<div><label>내용 : <textarea name="ctnt" rows="12" cols="20">${data.ctnt}</textarea></label></div>
				<div>
					<input type="submit" value="등록" onclick="insForm();">
				</div>
			</form>
			<a href="del"><button>삭제</button></a>
		</div>
		
		<div>
			<button onclick="modForm();">수정</button>
			<form action="detail" method="post">
				<input type="hidden" name="iboard" value="${param.iboard}">
				<input type="hidden" name="modOrDel" value="1">
				<input type="submit" value="삭제">
			</form>
		</div>
	</div>
</body>
</html>