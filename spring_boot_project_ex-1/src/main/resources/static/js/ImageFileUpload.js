$(document).ready(function(){ arguments
	$('imageFileForm').on('submit', function(){
		event.preventDefault();
		
		//폼 데이터 읽어오기
		let formData = new FormData($('imageFileForm')[0]);
		
		let fileName = $('#UploadFile').val().split('\\').pop();
				
		$.ajax({
			type:"post",
			url:"imageFileUpload",
			enctype:"multipart/form-data",
			processData:false, // multipart-form-data이므로 문자열로 임의 변경하지 않도록
			contentType:false, // contentType은 자체처리에 의존
			data:formData,
			success:function(result){
				if(result=='success'){
					$('#imageBox').html('<img src="/images/' + fileName + '" width="400" height="300">')
					// /images : url 매핑 이름
					// 개발자가 직접 url 매핑을 진행해 줘야 함 -> WebConfig.java에서 진행
				}
			},
			error:function(){
				alert("실패")
			}
		}); //ajax끝
	}); //on끝
	
}); // ready끝
	