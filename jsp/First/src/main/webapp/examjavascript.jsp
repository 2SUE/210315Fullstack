<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Javascript</title>
</head>
<body>
	<div>
		<input type="number" id="num1"> <!-- value=""에 들은 값은 초기에 한 번 뿌려지고, 이후 값 수정, 삭제 가능 --> 
		<input type="number" id="num2">
		<button onclick="sum();">더하기</button>
		<button onclick="minus();">빼기</button>
	</div>
	<div>
		<input type="number" id="result">
	</div>
	
	<script>
		var num1Elem = document.getElementById('num1');
		var num2Elem = document.querySelector('#num2');
		var resultElem = document.querySelector('#result');
		
		function sum() {
			var num1 = parseInt(num1Elem.value);
			var num2 = Number(num2Elem.value);
			
			resultElem.value = num1 + num2;
		}

		function minus() {
			var num1 = parseInt(num1Elem.value);
			var num2 = Number(num2Elem.value);
			
			resultElem.value = num1 - num2;
		}
	</script>
</body>
</html>