<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		JSP 표현식 : <%= 100 %> <br>
		JSP EL : ${100 } <br>
		${3.14 }<br>
		${true }<br>
		${true and true }<br>
		${10 + 1}<br>
		${100 % 9}<br>
		${100 mod 9}<br>
		${"Hello" + "World"}<br> <!-- 얘는 EL에서불가능 -->
		<%="Hello" + "World" %><br>
	</body>
</html>