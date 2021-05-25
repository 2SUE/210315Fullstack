<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div>
	<a href="#" onclick="goBack();">리스트로 돌아가기</a>
	<h1>${requestScope.data.title}</h1>
	<div>글번호 : ${requestScope.data.iboard}</div>
	<div>작성자 : ${requestScope.data.writerNm} | 작성일 : ${requestScope.data.regdt}</div>
	<div><c:out value="${requestScope.data.ctnt}" /></div> <!-- c:out으 보안상 쓴다,,,, -->
</div>	

<div>						<!-- data-어쩌고에 값 저장 	enter 치면 form이 날아가는데, 이걸 방지-->
	<form id="cmtFrm" data-iboard="${param.iboard}" onsubmit="return false;">
		<input type="text" id="cmt">
		<input type="button" value="댓글 달기" onclick="regCmt();">
	</form>
</div>

<div id="cmtList">

</div>

<script src="/res/js/boardDetail.js"></script>