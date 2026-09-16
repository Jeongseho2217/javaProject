$(document).ready(function(){
	$('#prdNoCheckBtn').on('click', function(){
	
		event.preventDefault();
		
		let prdNo = $('#prdNo').val();
		
		if(prdNo == ""){
			alert("상품 번호를 입력하세요");
			return false;
		} else {
			//서버로 상품 번호 전달 중복 확인 진행
			//fetch(요청 url) 응답이 오면 then() 실행
			// 1. 응답 객체를 사용가능한 형태로 변환(text로 파싱)
			// 2. then에소 파싱한 결과를 result에서 받아 처리
			// fetch의 get 방식
			fetch("/mybatis/product/prdNoCheck3/" + prdNo)
			//.then(response => console.log(response.text())) //응답 객체를 text() 파싱
			.then(response => response.text()) //응답 객체를 text() 파싱
			.then(result => {
				console.log(result);
				if(result=="available") {
					alert("사용가능한 번호3");
				}else{
					alert("사용 불가능한 번호3");
				}
			})
			.catch(err => console.log(err))
		}
	
	}); //on
}); // ready

