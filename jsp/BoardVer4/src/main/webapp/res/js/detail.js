function modBtn(icmt) {
 	$('.popup').show();

	var cmt = document.querySelector('#cmt_' + icmt).innerText;
	var modFrmElem = document.querySelector('#modFrm');
	modFrmElem.icmt.value = icmt;
	modFrmElem.cmt.value = cmt;	
}

function closeModMode() {
	$('.popup').hide();
}