<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>product Form</title>
	</head>
	<body>
		<h3>상품 정보 등록</h3>
		
		<form method="post" action="/student/newStudent">
		<!-- <form method="post" action=""> -->
			상품번호 <input type="text" name="no"><br>
			상품명 <input type="text" name="name"><br>
			가격 <input type="text" name="price"><br>
			제조회사 <input type="text" name="pub"><br>
			제조일 <input type="date" name="date"><br>
			재고 <input type="text" name="stock"><br>
			<input type="submit" value="등록"> <input type="reset" value="취소">
		</form>
		
		<a href="newView">newView</a><br> <!-- 상대 경로 -->
		<a href="/projectData/newView">/projectData/newView</a><br>
		<a href="projectData/newView">projectData/newView</a><br> <!--  -->
		<a href="<c:url value="/newView"/>">c:url-newView</a><br>

	</body>
</html>