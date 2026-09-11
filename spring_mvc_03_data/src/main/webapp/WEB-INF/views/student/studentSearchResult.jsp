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
			<tr><th>학번</th></tr><tr><th>성명</th></tr><tr><th>학년</th></tr>
			<c:forEach var="std" items=${stdList}>
				<tr>
					<td>${std.no}</td>
					<td>${std.name}</td>
					<td>${std.year}</td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>