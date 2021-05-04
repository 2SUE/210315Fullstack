<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글목록</title>
</head>
<body>
	<div>
		<h3>글목록</h3>
	</div>
	
	<ul>
		<c:forEach var="i" items="${list}">
			<li onclick="gotopage(${i.iboard})" style="cursor: pointer;">
				<span>${i.iboard}. </span>
				<span>${i.title}</span>
				<span>(${i.regdt})</span>
			</li>
		</c:forEach>
	</ul>
	
	<div><a href="/write" style="text-decoration: none; color: black;"><h3>글쓰기</h3></a></div>
</body>
<script>
	function gotopage(iboard) {
		location.href="detail?iboard=" + iboard;
	}
</script>
</html>