<%@page import="java.util.List"%>
<%@page import="com.sue.board.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<% List<BoardVO> list = (List) request.getAttribute("data"); %>
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
        body { background: rgb(253, 216, 115);}
        ::-webkit-scrollbar { display: none; }
        
        #container { width: 400px; height: 600px; box-shadow: 0px 0px 15px 5px white; border-radius: 3%; margin: 100px auto; padding-top: 25px; background: white; }        
        
        #write { text-align: center; }
        #write>a { display: inline-block; width: 88%; padding: 10px; background: rgb(253, 216, 115); text-align: center; color: white; text-shadow: 0px 0px 3px 1px white; }
        
        #listArea { width: 100%; height: 91.5%; overflow-y: scroll; }
        #list { width: 90%; padding: 5px; margin: 10px auto; }
        .no { width: 5%; height: 100%; display: inline-block; text-align: center; float: left; margin-right: 1%; background: rgb(253, 216, 115); color: white; }
        .title>a { width: 94%; height: 100%; display: inline-block; padding: 0 1%; font-size: 14px; }
    </style>
</head>
<body>
	<div id="container">
        <div id="write">
            <a href="/write">글쓰기</a>
        </div>
        
        
        <div id="listArea">
        	<% for(int i = 0; i < list.size(); i++) { 
        		BoardVO vo = list.get(i);
        	%>
            <div id="list">
                <span class="no"><%=i+1 %></span>
                <span class="title"><a href="/detail?no=<%=i %>"><%=vo.getTitle() %></a></span>
            </div>
        	<%} %>
        </div>
    </div>
</body>
</html>