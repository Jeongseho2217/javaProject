<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
</head>
<body>
	index 페이지 입니다. <br>
	
	<a href="/projectData/showInfo">showInfo</a><br>
	<a href="/projectData/showInfoMV">showInfoMV</a><br>
	<a href="/projectData/bookInfoView1">bookInfoView1</a><br>
	<a href="<c:url value="/bookInfoView2"/>">bookInfoView2</a><br>
	<a href="/projectData/showInfo3">showInfo3</a><br>
	<a href="/projectData/bookInfoView4">bookInfoView4</a><br>
	<a href="<c:url value="/bookInfoView5"/>">bookInfoView5</a><br>
	<a href="product/productForm">상품 등록1</a><br>
	<a href="<c:url value="student/studentForm"/>">studentForm</a><br>
	<a href="product/productForm">상품 등록2</a><br>
	<a href="product/productForm3">상품 등록3</a><br>
	<a href="product/productForm3">상품 등록4</a><br>
	<a href="<c:url value="student/studentForm2"/>">studentFormBirth</a><br>
	<a href="<c:url value="/newView"/>">PathTest</a><br>
	<a href="<c:url value="student/studentSearchForm"/>">검색</a><br>
	<a href="<c:url value="/redirect"/>">redirect</a><br>
	<a href="<c:url value="/redirect1"/>">redirectParam1</a><br>
	<a href="<c:url value="/redirect2"/>">redirectParam2</a><br>
	<a href="<c:url value="/redirect3"/>">redirectParam3</a><br>
</body>
</html>