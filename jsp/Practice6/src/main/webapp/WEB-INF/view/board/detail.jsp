<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${param.iboard}번째 글</title>
<script src="/res/js/app.js"></script>
<link rel="stylesheet" type="text/css" href="/res/css/style.css">
</head>
<body>
	<!-- 글 -->
	<div>
		<div id="insF">
			<h3>
				${data.iboard}. ${data.title}
				<c:if test="${data.isFav == 0}">					
					<a href="fav?iboard=${param.iboard}&fav=1" class="heart">♡</a>
				</c:if>
				<c:if test="${data.isFav == 1}">
					<a href="fav?iboard=${param.iboard}&fav=0" class="heart">♥</a>
				</c:if>
			</h3>
			<div>${data.ctnt}</div>
		
			<div>
				<button onclick="modForm();">수정</button>
				<form action="detail" method="post">
					<input type="hidden" name="iboard" value="${param.iboard}">
					<input type="hidden" name="modOrDel" value="1">
					<input type="submit" value="삭제">
				</form>
			</div>
		</div>
		
		<div id="modF" class="hidden">
			<form action="detail" method="post">
				<input type="hidden" name="iboard" value="${param.iboard}">
				<input type="hidden" name="modOrDel" value="0">
				<div><label>제목 : <input type="text" name="title" value="${data.title}"></label></div>
				<div><label>내용 : <textarea name="ctnt" rows="12" cols="20">${data.ctnt}</textarea></label></div>
				<div>
					<input type="submit" value="등록" onclick="insForm();">
				</div>
			</form>
		</div>	
	</div>
	
	<hr/>
	<!-- 댓글 -->	
	<div>
		<h3>댓글</h3>
		<form action="cmt" method="post">
			<input type="hidden" name="iboard" value="${param.iboard}">
			<input type="text" name="cmt">
			<input type="submit" value="등록">
		</form>
		
		<div>
			<c:forEach items="${requestScope.cmtList}" var="i">
				<li>
					<span>${i.unm} : </span>
					<span id="selCmt_${i.icmt}">${i.cmt}</span>
					
					<input type="text" value="${i.cmt}" id="updCmt_${i.icmt}" class="hidden">
					<button id="comCmt_${i.icmt}" onclick="comCmt(${i.icmt}, '${i.cmt}', ${param.iboard});" class="hidden">수정</button>
					
					<c:if test="${not empty sessionScope.loginUser}">
						<span id="modAndDelCmt_${i.icmt}">
							<button onclick="modCmt(${i.icmt});">수정</button>
							<button onclick="delCmt(${i.icmt}, ${param.iboard});">삭제</button>
						</span>
					</c:if>
				</li>
			</c:forEach>
		</div>
	</div>
</body>
</html>