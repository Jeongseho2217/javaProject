<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>c:redirect 태그 사용</title>
	</head>
	<body>
		<c:url var="url1" value="/JSTL/urlTestRes.jsp">
			<c:param name="id" value="hong"/> <%-- ?id=hong --%>
			<c:param name="pwd" value="1234"/><%-- ?id=hong&pwd=1234 --%>
			<c:param name="name" value="홍길동"/>
			<c:param name="email" value="hong@test.com"/><%-- /JSP01/jstl/urlTestRes.jsp?id=hong&pwd=1234&name=홍길동&email=hong@test.com --%>
		</c:url>
	</body>
</html>