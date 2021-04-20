function login() {
    var loginId = document.getElementById("loginId");
    var loginPw = document.getElementById("loginPw");

    loginId.value === '' || loginPw.value === '' ?
    alert("로그인을 할 수 없습니다.") :
    location.href="main.html";
}

function join(){
    location.href="join.html";
}

function goToBack() {
    history.back();
}

function joinCom() {
    var joinId = document.getElementById("joinId");
    var joinPw = document.getElementById("joinPw");
    var re_joinPw = document.getElementById("re_joinPw");

    joinId.value === '' || joinPw.value === '' || re_joinPw.value === '' ?
    alert("회원가입을 할 수 없습니다.") :
    joinPw.value !== re_joinPw.value ?
    alert("비밀번호를 확인해 주세요.") :
    location.href="login.html";
}