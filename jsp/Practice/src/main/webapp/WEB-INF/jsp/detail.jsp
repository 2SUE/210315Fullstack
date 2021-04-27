<%@ page import="com.sue.board.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	BoardVO vo = (BoardVO)request.getAttribute("data"); 
	String no = request.getParameter("no");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세페이지</title>
<style>
        @font-face {
            font-family: 'DOSGothic';
            src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_eight@1.0/DOSGothic.woff') format('woff');
            font-weight: normal;
            font-style: normal;
        }
        
        * { margin: 0; padding: 0; box-sizing: border-box; list-style-type: none; text-decoration: none; font-family: "DOSGothic"; color: #333; }
        
        body { background: rgb(253, 216, 115);}
        
        #container { width: 400px; height: 600px; box-shadow: 0px 0px 15px 5px white; border-radius: 3%; margin: 100px auto; background: white; }        
        
        #articleArea { width: 100%; height: 90%; padding-top: 10px; }
        #article { width: 90%; padding: 5px; margin: 10px auto; }

        #titleArea { width: 100%; height: 20%; margin-bottom: 20px; }
        .title { width: 100%; padding: 10px; display: inline-block; text-align: center; margin-right: 1%; background: rgb(253, 216, 115); color: white; font-size: .9rem; }
        
        .txtOut { width: 100%; height: 450px; resize: none; margin: 15px 0; padding: 8px 10px; border: 1px solid rgb(253, 216, 115); word-break:break-all; font-size: .8rem; }
        
        input:focus, textarea:focus { outline:none; }

        #modify { text-align: center; }
        #modify a, .del { cursor: pointer; border:0; display: inline-block; width: 30%; padding: 10px; background: rgb(253, 216, 115); text-align: center; color: white; text-shadow: 0px 0px 3px 1px white; font-size: .9rem; }
</style>
</head>
<body>
	<div id="container">
        <div id="articleArea">
	        <div id="article">
	        	<div id="titleArea">
	        		<div class="title"><%=vo.getTitle() %></div>
	        	</div>
	        	
	        	<div id="txtArea">
	        		<div class="txtOut"><%=vo.getCtnt() %></div>
	        	</div>

                <div id="modify">
                    <form action="/delete" method="post">
                    	<a href="/modify?no=<%=no %>">수정</a> 
						<input type="hidden" name="no" value="<%=no %>">
						<input class="del" type="submit" value="삭제">
						<a href="/list">글목록</a> 
					</form>
                </div>
	        </div>
        </div>
    </div>
</body>
</html>