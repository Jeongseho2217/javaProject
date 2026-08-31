<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>폼에 입력된 값으로 빈 속성값 설정</title>
	</head>
	<body>
	<%
		request.setCharacterEncoding("utf-8");
	%>
	<jsp:useBean id="member" class="exam.beans.MemberBean" scope="page">
		<jsp:setProperty property="*" name="member"/>
	</jsp:useBean>
	
		<h3>빈 속성값 출력</h3><br>
		아이디 : <%= member.getUid() %><br>
		비밀번호 : <%= member.getPw() %><br>
		이름 : <%= member.getName() %><br>
		이메일 : <%= member.getEmail() %>
		%>
	</body>
</html>