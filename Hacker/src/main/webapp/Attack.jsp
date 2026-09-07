<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<%
			application.log(request.getParameter("JSSESSIONID")); // 반환되는 파라미터 값을 로그로 남기는 메소드
		%>
		<script>history.back(-1)</script>
	</body>
</html>