<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리스트</title>
<style>
	table, tr, th, td { border: 1px solid black; border-collapse: collapse; padding: 5px 10px; }
	table { text-align: center; }
	.record { cursor: pointer; }
	.record:hover { background: lightgray; }
</style>
</head>
<body>
 	<div>
 		<a href="/write"><button>글쓰기</button></a>
 	</div>
 	<br />
 	<div>
 		<table>
 			<tr>
 				<th>no</th>
 				<th>제목</th>
 				<th>작성일</th>
 			</tr>
 			
 			<c:forEach items="${list}" var="item">
 				<tr class="record" onclick="moveToDetail(${item.iboard});">
 					<td>${item.iboard}</td>
 					<td>${item.title}</td>
 					<td>${item.regdt}</td>
 				</tr>
 			</c:forEach>
 		</table>
 	</div>
 	<script>
 		function moveToDetail(iboard) {
 			location.href = '/detail?iboard=' + iboard;	
 		}
 	</script>
</body>
</html>