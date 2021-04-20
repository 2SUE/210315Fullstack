function clkLogin() {
    var txtIdElem = document.getElementById("txtId"); // ID가 있어야 가져올 수 있음
    var txtPwElem = document.getElementById("txtPw");
    console.log('ID : ' + txtIdElem.value);
    console.log('PW : ' + txtPwElem.value);

    if (txtIdElem.value === '' || txtPwElem.value === '') {
        alert("로그인을 할 수 없습니다.");
    } else {
        location.href="main.html";
    }
}

function goToBack() {
    history.back();
}

function join() {
    var pwElem1 = document.getElementById("pw1");
    var pwElem2 = document.getElementById("pw2");

    if(pwElem1.value === pwElem2.value) {
        if(pwElem1.value === '' || pwElem2.value === '') {
            alert("비밀번호를 확인해 주세요");
        } else {
            location.href="login.html";
        }
    } else {
        alert("비밀번호를 확인해 주세요");
    }
}