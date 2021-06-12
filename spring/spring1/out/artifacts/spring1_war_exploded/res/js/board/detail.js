var cmtFrmElem = document.querySelector('#cmtFrm');
var cmtListElem = document.querySelector('#cmtList');
var cmtModModalElem = document.querySelector('#modal');

function regCmt() {
    var cmtVal = cmtFrmElem.cmt.value;

    var param = {
        iboard: cmtListElem.dataset.iboard, // data-iboard로 보낸 값 받음!
        cmt: cmtVal
    };

    regAjax(param);
}

// 서버에 등록
function regAjax(param) {
    const init = {
        method:'POST',
        body: JSON.stringify(param),
        headers:{
            'accept' : 'application/json',
            'content-type' : 'application/json;charset=UTF-8'
        }
    };

    fetch('cmt', init)
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
            getListAjax();
            break;
        }
    })
}

// 서버에게 댓글 리스트 자료 요청
function getListAjax() {
    var iboard = cmtListElem.dataset.iboard;

    // 두 번째 값(설정)이 없다! -> get방식으로 queryString 날림
    // String이 객체가 된다.
    fetch('cmt/' + iboard)
    .then(function(res) {
        return res.json();
    })
    .then(function(myJson) {
        console.log("myJson = " + myJson);
        makeCmtElemList(myJson);
    })
}

function makeCmtElemList(data) {
    cmtListElem.innerHTML = ''; // 댓글 달면 테이블이 하나 더 생성되는 현상을 방지

    var tableElem = document.createElement('table'); // 테이블 태그 생성
    var trElemTitle = document.createElement('tr');
    var thElemCtnt = document.createElement('th');
    var thElemWriter = document.createElement('th');
    var thElemRegdate = document.createElement('th');
    var thElemBigo = document.createElement('th');

    thElemCtnt.innerText = '내용';
    thElemWriter.innerText = '작성자';
    thElemRegdate.innerText = '작성일';
    thElemBigo.innerText = '비고';

    // append 안 히면 화면에 안 나타남
    trElemTitle.append(thElemCtnt);
    trElemTitle.append(thElemWriter);
    trElemTitle.append(thElemRegdate);
    trElemTitle.append(thElemBigo);

    tableElem.append(trElemTitle);
    cmtListElem.append(tableElem);

    var loginUserPk = cmtListElem.dataset.loginUserPk;

    data.forEach(function(item) { // 인자로 함수 받음 (callback)
        var trElemCtnt = document.createElement('tr');
        var tdElem1 = document.createElement('td');
        var tdElem2 = document.createElement('td');
        var tdElem3 = document.createElement('td');
        var tdElem4 = document.createElement('td');

        tdElem1.innerText = item.cmt;
        tdElem2.append(item.writerNm);
        tdElem3.append(item.regdate);

        if(parseInt(loginUserPk) === item.iuser) {
			var delBtn = document.createElement('button');
			var modBtn = document.createElement('button');

            // 삭제 버튼 클릭 시 호출
            delBtn.addEventListener('click', function() {
                if(confirm('삭제하시겠습니까?')) {
                    delAjax(item.icmt);
                }
            });

            // 수정 버튼 클릭 시 호출
            // 댓글 수정 모달창 띄우기
            modBtn.addEventListener('click', function() {
                openModal(item);
            })

			delBtn.innerText = '삭제';
			modBtn.innerText = '수정';

			tdElem4.append(delBtn);
			tdElem4.append(modBtn);
		}

		trElemCtnt.append(tdElem1);
		trElemCtnt.append(tdElem2);
		trElemCtnt.append(tdElem3);
		trElemCtnt.append(tdElem4);

		tableElem.append(trElemCtnt);
    });
}

function delAjax(icmt) {
    fetch('cmt/' + icmt, { method: 'DELETE' })
    .then(function(res) {
        return res.json();
    })
    .then(function(myJson) { // {"result: 0"}
        console.log(myJson);

        switch(myJson.result) {
        case 0 :
            alert('삭제 실패!');
            break;
        case 1 :
            cmtFrmElem.cmt.value = '';
            getListAjax();
            break;
        }
    })
}

function modAjax() {
    var cmtModFrmElem = document.querySelector('#cmtModFrm');
    var param = {
        icmt : cmtModFrmElem.icmt.value,
        cmt : cmtModFrmElem.modCmt.value
    }

    const init = {
        method:'PUT',
        body: JSON.stringify(param), // 보안을 위해 body애 넣어줌
        headers:{
            'accept' : 'application/json',
            'content-type' : 'application/json;charset=UTF-8'
        }
    };

    fetch('cmt', init)
    .then(function(res) {
        return res.json();
    })
    .then(function(myJson) {
        closeModal();
        switch(myJson.result) {
        case 0 :
            alert('수정 실패!');
            break;
        case 1 :
            getListAjax();
            break;
        }
    })
}

// {멤버 필드명} : 객체를 보내면 객체 안의 변수 값이 들어감
function openModal({icmt, cmt}) {
    var cmtModFrmElem = document.querySelector('#cmtModFrm');
    cmtModModalElem.className = '';
    cmtModFrmElem.icmt.value = icmt;
    cmtModFrmElem.modCmt.value = cmt;
}

function closeModal() {
    cmtModModalElem.className = 'displayNone';
}

var favIconElem = document.querySelector('#favIcon');
favIconElem.addEventListener('click', function() {
	if(favIconElem.classList.contains('far')) { // X > O
		insFavAjax();
	} else { // O > X
		delFavAjax();
	}
});

//좋아요 처리
function insFavAjax() {
	const param = { iboard: cmtListElem.dataset.iboard };
	const init = {
		method: 'POST',
		body: JSON.stringify(param),
		headers:{
			'accept' : 'application/json',
			'content-type' : 'application/json;charset=UTF-8'
		}
	};
	fetch('fav', init)
		.then(function(res) {
			return res.json();
		})
		.then(function (myJson) {
			if(myJson.result === 1) {
				toggleFav(1);
			}
		})
}

//좋아요 취소
function delFavAjax() {
	const init = {
		method: 'DELETE'
	}
	const iboard = cmtListElem.dataset.iboard;

	fetch('fav?iboard=' + iboard, init)
		.then(function(res) {
			return res.json();
		})
		.then(function (myJson) {
			if(myJson.result === 1) {
				toggleFav(0);
			}
		})
}


//좋아요 여부 값 가져오기
function getFavAjax() {
	fetch('fav/' + cmtListElem.dataset.iboard)
		.then(function(res) {
			return res.json();
		})
		.then(function (myJson) {
			toggleFav(myJson.result);
		});
}

function toggleFav(toggle) {
	switch(toggle) {
		case 0: //좋아요 X
			favIconElem.classList.remove('fas');
			favIconElem.classList.add('far');
			break;
		case 1: //좋아요 O
			favIconElem.classList.remove('far');
			favIconElem.classList.add('fas');
			break;
	}
}


getListAjax(); //이 파일이 임포트되면 함수 1회 호출!
getFavAjax();

getListAjax(); // 파일이 import되면 이 함수 1회 호출