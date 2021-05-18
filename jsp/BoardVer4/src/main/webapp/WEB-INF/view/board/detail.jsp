<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${data.title}</title>
<link href="/res/css/detail.css" type="text/css" rel="stylesheet">
</head>
<body>
	<div id="container">
		<h3>${data.iboard}번 글</h3>
		<div>제목 : ${data.title}</div>
		<div>작성자 : ${data.unm}</div>
		<div>작성일 : ${data.regdt}</div>
		<div>${data.ctnt}</div>
		
		<!-- 글 작성자일 시에만 보임 -->
		<c:if test="${loginUser.iuser == data.iuser}">
			<div>
				<a href="del?iboard=${param.iboard}"><button>삭제</button></a>
				<a href="mod?iboard=${param.iboard}"><button>수정</button></a>
			</div>
		</c:if>
		
		<br/><hr>
		
		<div>
			<form action="cmt" method="post">
				<input type="hidden" name="iboard" value="${param.iboard}">
				<h3>댓글</h3>
				<textarea name="cmt"></textarea>
				<div><input type="submit" value="댓글 달기"></div>
			</form>
		</div>
		
		<div class="popup">
			<form action="cmt" method="post">
				<input type="hidden" name="iboard" value="${param.iboard}">
				<h3>댓글 수정</h3>
				<textarea name="cmt"></textarea>
				<div><input type="submit" value="댓글 수정"></div>
			</form>
		</div>
				
		<br/>
		
		<div>
			<table>
				<tr>
					<th>닉네임</th>
					<th>댓글</th>
					<th>날짜</th>
					<th>비고</th>
				</tr>
				
				<c:forEach items="${cmtList}" var="item">
					<tr>
						<td>${item.unm}</td>
						<td>${item.cmt}</td>
						<td>${item.regdate}</td>
						<c:if test="${item.iuser == loginUser.iuser}">
							<td>
								<button onclick="cmtMod()">수정</button>
								<a href="cmt?icmt=${item.icmt}&iboard=${param.iboard}">
									<button>삭제</button>
								</a>
							</td>
						</c:if>
						<c:if test="${item.iuser != loginUser.iuser}">
							<td>암것도 아님니다</td>
						</c:if>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>