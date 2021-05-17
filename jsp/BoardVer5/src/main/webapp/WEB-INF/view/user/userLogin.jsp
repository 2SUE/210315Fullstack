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
		<div>${errMsg}</div>
		<form action="login" method="post">
			<div>
				<label> ID : <input type="text" name="uid" value="sue"></label>
			</div>
			<div>
				<label> PW : <input type="password" name="upw" value="1"></label>
			</div>
			<div>
				<input type="submit" value="로그인">
			</div>
		</form>
		
		<div>
			<a href="join"><button>회원가입</button></a>
		</div>
	</div>
</body>
</html>