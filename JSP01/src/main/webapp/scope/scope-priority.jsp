<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>우선 순위</title>
	</head>
	<body>
	<%
		session.setAttribute("name", "세션");
		application.setAttribute("name", "애플리케이션");
		//request.setAttr
	%>
		<jsp:forward page="scope-priority-result"/>
	</body>
</html>