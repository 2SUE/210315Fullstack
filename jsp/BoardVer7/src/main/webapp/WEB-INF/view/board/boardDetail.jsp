<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet" href="/res/css/boardDetail.css">

<div>
	<a href="#" onclick="goBack();">리스트로 돌아가기</a>
	<h1>${requestScope.data.title}</h1>
	<div>글번호 : ${requestScope.data.iboard}</div>
	<div>작성자 : ${requestScope.data.writerNm} | 작성일 : ${requestScope.data.regdt}</div>
	<div><c:out value="${requestScope.data.ctnt}" /></div> <!-- c:out으 보안상 쓴다,,,, -->
</div>	

<div>

	<c:if test="${not empty sessionScope.loginUser}">
		<!-- onsubmit="return false; : data-어쩌고에 값 저장 	enter 치면 form이 날아가는데, 이걸 방지-->
		<!-- dataset에 대문자 금지-->
		<form id="cmtFrm" onsubmit="return false;">
			<input type="text" id="cmt">
			<input type="button" value="댓글 달기" onclick="regCmt();">
		</form>
	</c:if>
	
</div>

<div id="cmtList" data-login_user_pk="${sessionScope.loginUser.iuser}" data-iboard="${param.iboard}">

</div>

<div id="modal" class="displayNone">
	<div class="modal_content">
		<form action="#" id="cmtModFrm">
			<input type="hidden" id="icmt">
			<input type="text" id="cmt">
		</form>
		<input type="button" value="댓글 수정" onclick="modAjax();">
		<input type="button" value="취소" onclick="closeModal();">
	</div>
</div>

<script src="/res/js/boardDetail.js?ver4"></script>