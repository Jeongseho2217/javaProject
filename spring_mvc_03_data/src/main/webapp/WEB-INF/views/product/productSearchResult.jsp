<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>검색 결과</title>
	</head>
	<body>
		<table border="1">
			<tr><th>제품번호</th></tr><tr><th>제품명</th></tr><tr><th>가격</th></tr>
			<tr><th>제조회사</th></tr><tr><th>제조년도</th></tr><tr><th>재고</th></tr>
			<c:forEach var="prd" items=${stdList}>
				<tr>
					<td>${prd.no}</td>
					<td>${prd.name}</td>
					<td>${prd.price}</td>
					<td>${prd.pub}</td>
					<td>${prd.year}</td>
					<td>${prd.stock}</td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>