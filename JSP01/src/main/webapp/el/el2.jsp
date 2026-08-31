<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="member" class="exam.beans.MemberBean" scope="page">
	<jsp:setProperty property="name" value="홍길동" name="member"/>
</jsp:useBean>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>EL 표현어</title>
	</head>
	<body>
		<%
			request.setCharacterEncoding("utf-8");
		%>
		<h3>Bean 속성 값 출력(EL 표현어)</h3>
		아이디 : ${member.uid }<br>
		비밀번호 : ${member.pw }<br>
		이름 : ${member.name }<br>
		이메일 : ${member.email }<br>
	</body>
</html>