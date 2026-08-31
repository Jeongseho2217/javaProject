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
			// 내장 객체 : out(톰캣 버퍼쪽으로 출력(응답) 데이터 전송하는 객체)
			out.println("서버 : " + request.getServerName() + "<br>");
			out.println("포트번호 : " + request.getServerPort() + "<br>");
			out.println("요청방식 : " + request.getMethod() + "<br>");
			out.println("프로토콜 : " + request.getProtocol() + "<br>");
			out.println("URL : " + request.getRequestURL() + "<br>");
			out.println("URI : " + request.getRequestURI() + "<br>");
			out.println("ContextPath : " + request.getContextPath() + "<br>");
			out.println("ServletPath : " + request.getServletPath() + "<br>");
		%>
	</body>
</html>