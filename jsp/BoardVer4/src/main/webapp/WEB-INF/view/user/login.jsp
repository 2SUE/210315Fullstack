<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<style>
	.errMsg { background: yellow; display: inline; }
</style>
</head>
<body>
	<div>
		<!-- pageContext, request, session, application에 담겨야 EL식으로 사용 가넝한 -->
		<h3 class="errMsg">${errMsg}</h3>
		<div>
			<form action="login" method="post">
				<div><input type="text" name="uid" placeholder="아이디" value="2SUE"></div>
				<div><input type="password" name="upw" placeholder="비밀번호" value="2sue"></div>
				<div>
					<input type="submit" value="Login">
				</div>
			</form>
		</div>
		<div>
			<!-- join 앞에 / 안 쓰면 1차 주소값 (user) 유지 --> 
			<a href="join">회원가입</a> 
		</div>
	</div>
</body>
</html>