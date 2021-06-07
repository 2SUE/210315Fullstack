<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet" href="/res/css/boardDetail.css">
<script defer src="/res/js/boardDetail.js"></script>

<div>
    <a href="#" onclick="goBack();">리스트로 돌아가기</a>
    <h1>${requestScope.data.title}</h1>
    <div>글번호 : ${requestScope.data.iboard}</div>
    <div>작성자 : ${requestScope.data.writerNm} | 작성일 : ${requestScope.data.regdt}</div>
    <div><c:out value="${requestScope.data.ctnt}" /></div> <!-- c:out으 보안상 쓴다,,,, -->
</div>

<c:if test="${not empty sessionScope.loginUser}">
    <form id="cmtFrm" onsubmit="return false;">
        <input type="text" id="cmt">
        <input type="button" value="댓글 달기" onclick="regCmt();">
    </form>
</c:if>

<div id="cmtList" data-login-user-pk="${sessionScope.loginUser.iuser}" data-iboard="${param.iboard}"></div>