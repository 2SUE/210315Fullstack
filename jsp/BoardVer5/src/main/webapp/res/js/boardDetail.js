// 댓글 삭제
function delCmt(iboard, icmt) {
	console.log(`iboard : %d, icmt : %d`, iboard, icmt);
	
	if(confirm('삭제하시겠습니까?')) {
		// get방식으로 날아간다 ~.~
		location.href=`/board/cmt?icmt=${icmt}&iboard=${iboard}`;
	}
}

// 객체 안 : 메소드
// 객체 밖 : 함수

var insFrm = document.querySelector('#insForm');
var updFrm = document.querySelector('#updForm');

// 댓글 수정
function updCmt(icmt, cmt) {
	console.log('icmt : ' + icmt);
	console.log('cmt : ' + cmt);
	
	updFrm.icmt.value = icmt;
	updFrm.cmt.value = cmt;
	
	insFrm.className = 'hidden';
	updFrm.className = '';
}

function showInsFrm() {
	insFrm.className = '';
	updFrm.className = 'hidden';
}