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
	
	<div>제목 : ${data.title}</div>
	<div>내용 : ${data.ctnt}</div>
	<div>${data.regdt}</div>
	
	<div>
		<a href="/del?iboard=${param.iboard}">
			<button>삭제</button>
		</a>
		<a href="/mod?iboard=${param.iboard}">
			<button>수정</button>
		</a>
		<a href="/list">
			<button>리스트</button>
		</a>
	</div>
</body>
</html>