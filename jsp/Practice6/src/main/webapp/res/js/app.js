function moveTodetail(iboard) {
	location.href="/board/detail?iboard=" + iboard;
}

function goToBack() {
	history.back();
}

function modForm() {
	var insF = document.querySelector('#insF');
	var modF = document.querySelector('#modF');
	insF.className = 'hidden';
	modF.className = '';
}

function insForm() {
	var insF = document.querySelector('#insF');
	var modF = document.querySelector('#modF');
	insF.className = '';
	modF.className = 'hidden';
}