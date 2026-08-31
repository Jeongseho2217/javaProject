<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	String answer;
%>    
<%-- 아래 html 태그는 브라우저에 의해 해석되지 않음 헤더 통해 302상태 확인 후 바로 재요청 --%>
<%
	request.setCharacterEncoding("utf-8");

	answer = request.getParameter("answer");
	
	if (answer.equals("서울")) response.sendRedirect("pass.jsp");
	else response.sendRedirect("fail.jsp");
%>
