<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${vo.title}</title>
<link type="text/css" rel="stylesheet" href="/res/css/boardList.css">
<script defer src="/res/js/boardDetail.js"></script>
</head>
<body>
	<div>
		<div>(${vo.iboard}) ${vo.title}</div>
		<div>작성자 : ${vo.unm} | 작성일 : ${vo.regdt}</div>
		<div>${vo.ctnt}</div>
		
		<div>
		<form action="/board/cmt" method="post">
			<input type="hidden" name="iboard" value="${vo.iboard}">
			<div>
				<textarea name="cmt" placeholder="댓글 내용"></textarea>
				<div>
					<input type="submit" value="댓글 작성">
				</div>
			</div>
		</form>
		</div>
		
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
				-->
				<c:forEach items="${requestScope.cmtlist}" var="i" >
					<tr>
						<td>${i.icmt}</td>
						<td>${i.cmt}</td>
						<td>${i.unm}</td>
						<td>${i.regdate}</td>
						<td>
							<c:if test="${i.iuser == sessionScope.loginUser.iuser}">
								<input type="button" value="수정">
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