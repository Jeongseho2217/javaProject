// ajax를 활용한 비동기 통신, 검색 결과를 받아와서 정해진 위치에 태그 생성 후 포함

$(document).ready(function(){
	$('#prdSearchFrm2').on('submit', function(){
		event.preventDefault();
		
		// 폼에 있는 폼 data를 payload(파라미터)로 구성
		let formData = $(this).serialize();
		
		let keyword = $("#keyword").val();
		let type = $("#type").val();
		
		if(keyword == "" || type == "") {
			alert("검색 조건과 검색어를 입력하세요");
			return false;
		} else {
			$.ajax({
				type:"post",
				url:"/mybatis/product/productSearch2",
				data:formData,
				success:function(result){
					$('SearchResultBox').html(result);
				}, // success
				error:function(){ alert('실패');}
			}); //ajax
		} // else
	}); //on
}); //ready