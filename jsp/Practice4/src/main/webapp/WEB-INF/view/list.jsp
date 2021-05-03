<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글목록</title>
<style>
    @font-face {
        font-family: 'DOSGothic';
        src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_eight@1.0/DOSGothic.woff') format('woff');
        font-weight: normal;
        font-style: normal;
    }
    * { margin: 0; padding: 0; box-sizing: border-box; list-style-type: none; text-decoration: none; font-family: "DOSGothic"; color: #333; }
    body { background: rgb(253, 216, 115); }
    ::-webkit-scrollbar { display: none; }

    #container { width: 400px; height: 600px; box-shadow: 0px 0px 15px 2px white; border-radius: 3%; margin: 100px auto; padding-top: 25px; background: white; }        
    
    #write { text-align: center; }
    #write>a { display: inline-block; width: 88%; padding: 10px; background: rgb(253, 216, 115); text-align: center; color: white; text-shadow: 0px 0px 3px 1px white; }
    
    #listArea { width: 100%; height: 91.5%; overflow-y: scroll; }
    #list { width: 90%; height: 25px; padding: 5px; margin: 10px auto; cursor: pointer; }
    .no { width: 5%; height: 100%; display: inline-block; text-align: center; float: left; margin-right: 1%; background: rgb(253, 216, 115); color: white; }
    .title { width: 50%; height: 100%; display: inline-block; padding: 0 1%; font-size: 14px; overflow:hidden; text-overflow:ellipsis; white-space:nowrap; word-wrap:break-word; }
    .nowDate { width: 40%; height: 100%; display: inline-block; padding: 0 1%; font-size: 14px; }
</style>
</head>
<body>
	<div id="container">
		<div id="write">
		 	<a href="/write">글쓰기</a>
		</div>
		<ul id="listArea">
			<c:forEach items="${list}" var="i">
				<div id="list" onclick="goToDetail(${i.iboard})">
					<div class="no">${i.iboard}</div>
					<div class="title">${i.title}</div>
					<div class="nowDate">${i.nowDate}</div>
				</div>
			</c:forEach>
		</ul>
	</div>
</body>
<script>
	function goToDetail(iboard) {
        location.href="/detail?iboard=" + iboard;
    }
</script>
</html>