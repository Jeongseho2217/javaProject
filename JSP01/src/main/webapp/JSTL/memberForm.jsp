<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>beans 연습</title>
	</head>
	<body>
		<h3>회원 가입창</h3>
		<form name="member" method="post" action="newMemberOk">
			<table>
				<!-- 클래스의 필드명과 태그의 name 속성을 동일하게 구성 -->
				<tr><td>아이디</td><td><input type="text" name="uid"></td></tr>
				<tr><td>비밀번호</td><td><input type="password" name="pw"></td></tr>
				<tr><td>이름</td><td><input type="text" name="name"></td></tr>
				<tr><td>이메일</td><td><input type="text" name="email"></td></tr>
				<tr><td colspan="2">
			        <input type="submit" value="가입하기">
			        <input type="reset" value="다시입력"></td></tr>
			</table>
		</form>
	</body>
</html>