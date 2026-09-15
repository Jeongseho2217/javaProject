<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%
	request.setCharacterEncoding("UTF-8");
%>   
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>제품정보</title>
		<style>
			.cls1 {
				font-size:40px;
				text-align:center;
			}
			
			.cls2 {
				font-size:20px;
				text-align:center;
			}
		</style>
	</head>
	<body>
		<p class="cls1">제품정보</p>
		   <table align="center" border="1" >
		      <tr align="center" bgcolor="lightgreen">
		         <td width="7%" ><b>제품번호</b></td>
		         <td width="7%" ><b>제품명</b></td>
		         <td width="7%" ><b>제품가격</b></td>
		         <td width="7%"><b>재고수량</b></td>       
		   	 </tr>
		   	 <c:choose>
		   	 	<c:when test="${prdList==null}">
		   	 		<tr>
		   	 			<td colspan=5><b>등록된 회원이 없습니다</b></td>
		   	 		</tr>		   	 	
		   	 	</c:when>
		   	 	<c:when test="${prdList!=null}">
		   	 		<c:forEach var="product" items="${prdList}">
		   	 		 <tr>
		   	 			<td>${prdList.prdNo}</td>
		   				<td >${prdList.prdName}</td>
		   				<td >${prdList.prdNPrice}</td>
		   				<td >${prdList.prdStock}</td>
		   			</tr>		   	 			
		   	 		</c:forEach>		   	 	
		   	 	</c:when>		   	 
		   	 </c:choose>
		   </table>		
		
	</body>
</html>











