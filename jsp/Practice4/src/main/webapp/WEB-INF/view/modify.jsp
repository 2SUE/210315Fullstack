<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수정</title>
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
    
    #formArea { width: 100%; height: 90%; padding-top: 10px; }
    form { width: 90%; padding: 5px; margin: 10px auto; }

    #titleArea { width: 100%; height: 20%; margin-bottom: 20px; }
    .title { width: 16%; height: 100%; padding: 3px 0; margin-bottom: 10px; display: inline-block; text-align: center; margin-right: 1%; background: rgb(253, 216, 115); color: white; font-size: .9rem; }
    .titleInput { width: 100%; height: 25px; padding: 2px 6px; display: inline-block; border: none; border-bottom: 1px solid rgb(253, 216, 115); }
    
    #txtArea { width: 100%; height: 20%; }
    .ctnt { width: 100%; height: 100%; display: inline-block; padding: 0 1%; }
    .txtInput { width: 100%; height: 380px; resize: none; margin: 10px 0 15px 0; padding: 8px 10px; border: 1px solid rgb(253, 216, 115); }
    
    input:focus, textarea:focus { outline:none; }

    #write { text-align: center; }
    #write>input { cursor: pointer; border:0; display: inline-block; width: 40%; padding: 10px; background: rgb(253, 216, 115); text-align: center; color: white; text-shadow: 0px 0px 3px 1px white; }
</style>
</head>
<body>
	<div id="container">
        <div id="formArea">
			<form action="/mod" method="post">
				<div id="titleArea">
					<span class="title">제목</span>
					<input class="titleInput" type="text" name="title" value="${vo.title}">
				</div>
				
				<div id="txtArea">
					<span class="title">내용</span>
					<textarea class="txtInput" name="ctnt">${vo.ctnt}</textarea>
				</div>
				
				<div id="write">
					<input type="submit" value="수정">
				</div>
				<input class="titleInput" type="hidden" name="iboard" value="${param.iboard}">
			</form>
		</div>
	</div>
</body>
</html>