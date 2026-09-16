$(document).ready(function(){
	$('#prdNoCheckBtn').on('click', function(){
	
		event.preventDefault();
		
		let prdNo = $('#prdNo').val();
		
		if(prdNo == ""){
			alert("상품 번호를 입력하세요");
			return false;
		} else {
			//서버로 상품 번호 전달 중복 확인 진행
			$.ajax({
			
				type:"post",
				url:"/mybatis/product/prdNoCheck1/"+prdNo, // uri data 전송
				//url:"/mybatis/product/prdNoCheck1?prdNo="+prdNo, // 쿼리스트링 방식 전송
				data:{"prdNo":prdNo},
				dataType="text",
				success:function(result){
					if(result=="available") {
						alert("사용 가능한 번호입니다1");
					}else {
						alert("사용 불가능한 번호입니다1");
					}
				},
				error:function(){
					alert("전송 실패")
				}
			
			}); // ajax
		}
	
	}); //on
}); // ready

