<%-- template.jsp 파일 안에 들어갈 거라서 내부 태그와 최상단 태그를 제외하고 모두 삭제 --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 

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