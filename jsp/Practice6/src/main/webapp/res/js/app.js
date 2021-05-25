
/*
	var selCmtElem = document.querySelector('#selCmt_' + icmt);
	var updCmtElem = document.querySelector('#updCmt_' + icmt);
	var comCmtElem = document.querySelector('#comCmt_' + icmt);
	var modAndDelCmtElem = document.querySelector('#modAndDelCmt_' + icmt);
*/
var insF = document.querySelector('#insF');
var modF = document.querySelector('#modF');

function moveTodetail(iboard) {
	location.href="/board/detail?iboard=" + iboard;
}

function goToBack() {
	history.back();
}

function modForm() {	
	insF.className = 'hidden';
	modF.className = '';
}

function insForm() {
	insF.className = '';
	modF.className = 'hidden';
}

function modCmt(icmt) {
	var selCmtElem = document.querySelector('#selCmt_' + icmt);
	var updCmtElem = document.querySelector('#updCmt_' + icmt);
	var comCmtElem = document.querySelector('#comCmt_' + icmt);
	var modAndDelCmtElem = document.querySelector('#modAndDelCmt_' + icmt);

	selCmtElem.className = 'hidden';
	modAndDelCmtElem.className = 'hidden';
	updCmtElem.className = '';
	comCmtElem.className = '';
}

function delCmt(icmt, iboard) {
	if(confirm('삭제하시겠습니까?')) {
		location.href = `/board/cmt?icmt=${icmt}&iboard=${iboard}`;
	}
}

function comCmt(icmt, cmt, iboard) {
	var updCmtElem = document.querySelector('#updCmt_' + icmt);
	cmt = updCmtElem.value;
	location.href = `/board/cmt?icmt=${icmt}&cmt=${cmt}&iboard=${iboard}`;
}