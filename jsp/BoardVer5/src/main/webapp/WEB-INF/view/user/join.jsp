<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
	<div>
		<form action="join" method="post">
			<div>
				<label>아이디 : <input type="text" name="uid"></label>
			</div>
			<div>
				<label>비밀번호 : <input type="password" name="upw"></label>
			</div>
			<div>
				<label>이름 : <input type="text" name="unm"></label>
			</div>
			<div>
				성별 : 
				<label>여자 : <input type="radio" name="gender" value="0" checked="checked"></label>
				<label>남자 : <input type="radio" name="gender" value="1"></label>
			</div>
			<div>
				<input type="submit" value="회원가입">
			</div>
		</form>
	</div>
</body>
</html>