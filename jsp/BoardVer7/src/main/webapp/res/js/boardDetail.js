var cmtFrmElem = document.querySelector('#cmtFrm');

function regCmt() {
    var cmtVal = cmtFrmElem.cmt.value;

    var param = {
        iboard:cmtFrmElem.dataset.iboard, // data-iboard로 보낸 값 받음!
        cmt: cmtVal
    };

    regAjax(param);
}

// 서버에 등록
function regAjax(param) {
    const init = {
        method:'post',
        body:new URLSearchParams(param)
    };

    fetch('cmtInsSel', init)
    .then(function(res) {
        return res.json(); // 서버에서 받은 자료를 JSON()을 통해 객체화
    })
    .then(function(myJson) { // 객체화된 자료 받음
        console.log(myJson);

        switch(myJson.result) {
        case 0:
            alert('등록 실패!');
            break;
        case 1:
            cmtFrmElem.cmt.value = '';
            alert('등록 오나료!');
            break;
        }
    })
}

// 서버에게 댓글 리스트 자료 요청
function getListAjax() {
    var iboard = cmtFrmElem.dataset.iboard;

    // 두 번째 값(설정)이 없다! -> get방식으로 queryString 날림
    // String이 객체가 된다.
    fetch('cmtInsSel?iboard=' + iboard) 
    .then(function(res) {
        return res.json();
    })
    .then(function(myJson) { 
        console.log(myJson);
    })
}

getListAjax(); // 파일이 import되면 이 함수 1회 호출