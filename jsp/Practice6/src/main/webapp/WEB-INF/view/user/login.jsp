<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
	<div>
		<span style="background: orange; font-weight: bold;">${errMsg}</span>
		<form action="login" method="post">
			<div><label>아이디 : <input type="text" name="uid" value="none"></label></div>
			<div><label>비밀번호 : <input type="password" name="upw" value="0"></label></div>
			<input type="submit" value="로그인">
		</form>
		<a href="join"><button>회원가입</button></a>
	</div>
</body>
</html>