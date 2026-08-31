<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="member" class="exam.beans.MemberBean" scope="page">
	<jsp:setProperty property="name" value="홍길동" name="member"/>
</jsp:useBean>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		표현식 : <%= member.getName() %><br>
		EL : ${member.name }<br> <!-- getter 호출과 같다 -->
		Member 인스턴스 존재 여부 : ${empty member } <!-- member 클래스의 객체 존재 여부 -->
	</body>
</html>