<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<a href="#" onclick="goBack();">돌아가기</a>

<c:if test="${sessionScope.loginUser.iuser eq requestScope.boardDomain.iuser}">
    <div>
        <a href="writeMod?iboard=${param.iboard}"><button>수정</button></a>
        <a href="delBoard?iboard=${param.iboard}"><button>삭제</button></a>
    </div>
</c:if>

<h1>${requestScope.boardDomain.title}</h1>
<div>글번호 : ${requestScope.boardDomain.iboard}
    <c:if test="${ not empty sessionScope.loginUser }">
        <i id="favIcon" class="far fa-kiss-wink-heart pointer"></i>
    </c:if>
</div>
<div>작성자 : ${requestScope.boardDomain.writerNm} | 작성일 : ${requestScope.boardDomain.regdt}</div>
<div><c:out value="${requestScope.boardDomain.ctnt}" /></div> <!-- c:out은 보안상 쓴다,,,, -->

<c:if test="${not empty sessionScope.loginUser}">
    <form id="cmtFrm" onsubmit="return false;">
        <input type="text" id="cmt">
        <input type="button" value="댓글 달기" onclick="regCmt();">
    </form>
</c:if>

<div id="cmtList" data-login-user-pk="${sessionScope.loginUser.iuser}"
     data-iboard="${param.iboard}">
</div>

<div id="modal" class="displayNone">
    <div class="modal_content">
        <form action="#" id="cmtModFrm">
            <input type="hidden" id="icmt">
            <input type="text" id="modCmt">
        </form>
        <input type="button" value="댓글 수정" onclick="modAjax();">
        <input type="button" value="취소" onclick="closeModal();">
    </div>
</div>