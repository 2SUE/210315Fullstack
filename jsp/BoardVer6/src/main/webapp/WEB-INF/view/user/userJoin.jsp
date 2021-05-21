<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<div>
	<div>
		<a href="login">Login으로 이동</a>
	</div>
	<form id="frm">
		<div><input type="text" name="uid" placeholder="아이디"></div>
		<div><input type="password" name="upw" placeholder="비밀번호"></div>	
		<div><input type="text" name="unm" placeholder="이름"></div>	
		<div>
			성별 : 
			<label>여성 <input type="radio" name="gender" value="0" checked></label>
			<label>남성 <input type="radio" name="gender" value="1" checked></label>
		</div>
	</form>
		
	<!-- ajax 쓸 때 form은 별 의미 x -->
	
	<input type="button" value="회원가입" onclick="join();">
	
	<script>
		function join() {
			var frmElem = document.querySelector('#frm');		
			var uid = frmElem.uid.value; // . 으로 자식에 접근
			var upw = frmElem.upw.value;
			var unm = frmElem.unm.value;
			var gender = frmElem.gender.value;

			console.log('uid : ' + uid);
			console.log('upw : ' + upw);
			console.log('unm : ' + unm);
			console.log('gender : ' + gender);
			
			// 자바스크립트 객체로 만들어서 서버로 보내준다.
			// jackson library를 사용해서 값 빼서 쓴당
			// 통신은 무조건 문자열 형태로 됨
			
			var param = {
			// 필드명 (홑따옴표로 감싸도 되고 안 감사도 되고) : 값
				uid: uid,
				upw : upw,
				unm : unm,
				gender : gender
			};
			
			var param2 = {
			// 변수명이랑 멤버필드명이 같은 경우 
				uid, upw, unm, gender
			};
						
			console.log(param);
			console.log(param2);
			
			ajax(param);
		}
		
		function ajax(param) {
			// JSON.stringify() : 자바스크립트 객체 -> json 문자열
			// JSON.parse() : json 문자열 -> 자바스크립트 객체
			const init = {
				method: 'POST',
				body: new URLSearchParams(param)
			}

			// ajax fetch
			// default : doGet 방식으로 날아감
			// promise 객체라서 .then 사용,,,ㅋ뭔솔
			fetch('/user/join', init)
			.then(function(res) { 
				return res.json(); 
			})
			.then(function(myJson) { // myJson에 응답이 들어옴
				switch(myJson.result) {
				case 0: 
					alert('회원가입 실패');
					break;
				case 1:
					location.href="/user/login";
					break;
				}
			});
			
			/*
				AJAX get방식 - 자바스크립트 문법 내에서 호출 (JSON 형태로 리턴)
				get방식 - 브라우저에서 호출 (HTML 태그 열이 리턴)
			*/
		}
	</script>
</div>