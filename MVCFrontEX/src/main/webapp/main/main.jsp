<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"  />
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>쇼핑몰</title>
	</head>
	<body>
		<a href="${contextPath}/view/memberForm.jsp">회원 관리</a>
		<a href="${contextPath}/view/prdForm.jsp">상품 관리</a>
	</body>
</html>