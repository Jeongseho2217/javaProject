<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="contextPath" value="${pageContext.request.contextPath }"/>
<%
	request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>상품 정보 출력창</title>
		<c:choose>
			<c:when test='${param.msg=="addProduct" || msg=="addProduct"}'>
				<script type="text/javascript">
					window.onload=function(){
						alert("상품등록 완료");
					}
				</script>
			</c:when>
			<c:when test='${param.msg=="modified" || msg=="modified"}'>
				<script type="text/javascript">
					window.onload=function(){
						alert("상품정보 수정 완료");
					}
				</script>
			</c:when>
			<c:when test='${param.msg=="deleted" || msg=="deleted"}'>
				<script type="text/javascript">
					window.onload=function(){
						alert("상품정보 삭제 완료");
					}
				</script>
			</c:when>
		</c:choose>
		<style>
			.cls1 {
				font-size: 40px;
				text-align: center;
			}
			.cls2 {
				font-size: 20px;
				text-align: center;
			}
		</style>
	</head>
	<body>
		<p class="cls1">상품정보</p>
		<table align="center" border="1">
			<tr align="center" bgcolor="lightgreen">
				<td width="10%"><b>상품번호</b></td>
				<td width="20%"><b>상품명</b></td>
				<td width="10%"><b>가격</b></td>
				<td width="10%"><b>재고수량</b></td>
				<td width="7%"><b>수정</b></td>
				<td width="7%"><b>삭제</b></td>
			</tr>
			<c:choose>
				<c:when test="${empty productList}">
					<tr>
						<td colspan="6" align="center">
							<b>등록된 상품이 없습니다</b>
						</td>
					</tr>
				</c:when>
				<c:when test="${!empty productList}">
					<c:forEach var="prd" items="${productList}">
						<tr align="center">
							<td>${prd.prdNo}</td>
							<td>${prd.prdName}</td>
							<td><fmt:formatNumber value="${prd.prdPrice}" pattern="#,###원"/></td>
							<td>${prd.prdStock}</td>
							<td><a href="${contextPath}/product/prdView.do?prdNo=${prd.prdNo}">수정</a></td>
							<td><a href="${contextPath}/product/delProduct.do?prdNo=${prd.prdNo}" onclick="return confirm('정말 삭제하시겠습니까?');">삭제</a></td>
						</tr>
					</c:forEach>
				</c:when>
			</c:choose>
		</table>
		<div style="text-align:center; margin-top: 15px;">
			<a href="${contextPath}/product/prdForm.do">상품 등록하기</a> | 
			<a href="${contextPath}/main.jsp">메인 화면</a>
		</div>
	</body>
</html>