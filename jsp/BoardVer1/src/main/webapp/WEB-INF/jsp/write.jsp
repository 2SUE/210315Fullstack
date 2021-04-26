<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기</title>
</head>
<body>
	<h1>글쓰기</h1>
	<!-- 
		action : 목적지 
		method : get/post 둘 중 하나만 사용 가능
		post : 주소값 이동 /동작 처리 / 노출하지 않고 이동 (이미지 업로드, 장문의 글, 비밀번호 등)
		get : 화면 이동 / 외부에 노출쓰 (query string 어쩌구라서 양에 제한이 있음, 가벼운 자료 처리, 화면이동 시 사용)
	-->
	
	<form action="/write" method="post">
		<div> 
			<!-- key(name)=value(input) -->
			제목 : <input type="text" name="title">
		</div>
		
		<div>
			내용 : <textarea name="ctnt" rows="10" cols="10"></textarea>
		</div>
		 
		<div>
			<!-- submit을 누르면 form이 동작 -->
			<input type="submit" value="글쓰기"> 
			<input type="reset" value="초기화">
		</div>
	</form>
</body>
</html>