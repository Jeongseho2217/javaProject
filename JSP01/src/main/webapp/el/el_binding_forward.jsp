<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>바인딩 속성 EL 표현 예제</title>
	</head>
	<body>
		<%
			//바인딩 진행
			request.setAttribute("uid", "hong");
			request.setAttribute("pwd", 1234);
			request.setAttribute("name","홍길동");
			request.setAttribute("email", "hong_result.jsp");
		%>
		<jsp:forward page="el_forward_result.jsp"/>
	</body>
</html>