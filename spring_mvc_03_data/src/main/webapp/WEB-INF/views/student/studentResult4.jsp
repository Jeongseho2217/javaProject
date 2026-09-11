<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Form</title>
</head>
<body>
	<p>학생 정보 등록</p>
	학번 : ${student.no }<br>
	이름 : ${student.name }<br>
	학년 : ${student.year }<br>
	생일 : <fmt:formatDate value="${student.birthday}" pattern="yyyy-MM-dd"/> : 입력 형식 yyyy-MM-dd<br>
	<input type="submit" value="등록"/> <input type="reset" value="취소"/>
</body>
</html>