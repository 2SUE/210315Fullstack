<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${vo.title}</title>
<link type="text/css" rel="stylesheet" href="/res/css/boardList.css">
<link type="text/css" rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
<style>
	.hidden { display: none; }
	.fa-heart { color: red; }	
</style>
<script defer src="/res/js/boardDetail.js"></script>
</head>
<body>
	<div>
		<div>
			<h3>
				(${requestScope.vo.iboard}) ${requestScope.vo.title}
				<c:if test="${vo.isFav == 0}">					<!-- 꽉찬 하트 -->
					<a href="fav?iboard=${param.iboard}&fav=1"><i class="far fa-heart"></i></a>
				</c:if>
				<c:if test="${vo.isFav == 1}">
					<a href="fav?iboard=${param.iboard}&fav=0"><i class="fas fa-heart"></i></a>
				</c:if>
			</h3>
			
		
		</div>
		<div>작성자 : ${requestScope.vo.unm} | 작성일 : ${requestScope.vo.regdt}</div>
		<div>${requestScope.vo.ctnt}</div>
		
		<div>
			<form id="insForm" action="cmt" method="post">
													   		<!-- param.iboard -->
				<input type="hidden" name="iboard" value="${requestScope.vo.iboard}">
				<input type="hidden" name="icmt" value="0">
				<h3>댓글</h3>
				<div>
					<textarea name="cmt" placeholder="댓글 내용"></textarea>
					<div>
						<input type="submit" value="댓글 작성">
					</div>
				</div>
			</form>
		</div>
		
		<div>
			<form id="updForm" class="hidden" action="cmt" method="post">
													   		<!-- param.iboard -->
				<input type="hidden" name="iboard" value="${requestScope.vo.iboard}">
				<input type="hidden" name="icmt" value="0">
				<h3>댓글 수정</h3>
				<div>
					<textarea name="cmt" placeholder="댓글 내용"></textarea>
					<div>
						<input type="submit" value="댓글 수정">
						<input type="button" value="수정 취소" onclick="showInsFrm();">
					</div>
				</div>
			</form>
		</div>
		
		<br/>
		<div>
			<table>
				<tr>
					<th>no</th>
					<th>내용</th>
					<th>작성자</th>
					<th>작성일</th>
					<th>비고</th>
				</tr>
				
				<!-- 
					requestScope어쩌고 쓰면 
					pageContext, request, session에 일일이 묻지 않고 
					바로 request에서 처리 가능 
					
					jstl은 pageContext에 값 넣어줌
				-->
				<c:forEach items="${requestScope.cmtlist}" var="i" >
					<tr>
						<td>${pageScope.i.icmt}</td>
						<td>${i.cmt}</td>
						<td>${i.unm}</td>
						<td>${i.regdate}</td>
						<td>
							<c:if test="${i.iuser == sessionScope.loginUser.iuser}">				    <!-- 문자열이라서 홑따옴표로 감싸줘야댐 -->
								<input type="button" value="수정" onclick="updCmt(${i.icmt}, '${i.cmt}');">
								<button onClick="delCmt(${requestScope.vo.iboard}, ${i.icmt})">삭제</button>
							</c:if>
						</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>	
</body>
</html>