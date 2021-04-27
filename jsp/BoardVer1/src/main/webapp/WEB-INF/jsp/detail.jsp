<%@ page import="com.sue.board.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	String no = request.getParameter("no");
	// getAttribute, setAttribute는 set
	BoardVO vo = (BoardVO) request.getAttribute("data");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>디테일</title>
</head>
<body>
	<h1>디테일</h1>
<!-- 
	<h1>Detail page number <%=no %></h1>
	<h1>Detail page number <%=request.getParameter("no") %></h1> 
	<h1>Detail page number ${param.no}</h1>
 -->
	<div>
		<form action="/del" method="post">
			<input type="hidden" name="no" value="<%=no %>">
			<input type="submit" value="삭제">
		</form>
		<a href="/mod?no=<%=no %>"><button>수정</button></a>
		
		<!-- get방식 del : <a href="/del?no=<%=no%>"><button>삭제</button></a> -->
	</div>
	<div>제목 : <%= vo.getTitle()%></div>
	<div><%= vo.getCtnt()%></div>
</body>
</html>