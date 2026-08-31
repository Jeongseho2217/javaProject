<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>forward 액션 태그</title>
	</head>
	<body>
		<%
			request.setCharacterEncoding("utf-8");
			String user_id=request.getParameter("user_id");
		
			if(user_id.length() == 0) {// id가 입력되지 않았으니 다시 입력하라고 포워딩 진행
				//포워딩 액션태그
				%>
				<jsp:forward page=login_forward.jsp/>
		<%
			}
		%>
		
		<h3>환영합니다 <%= user_id %> 님</h3>
	</body>
</html>