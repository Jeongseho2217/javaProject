<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<%
  request.setCharacterEncoding("UTF-8");
%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 정보 수정창</title>
<style>
  .cls1 {
     font-size: 40px;
     text-align: center;
   }
</style>
</head>
<body>
 <h1 class="cls1">상품 정보 수정창</h1>
<form method="post" action="${contextPath}/product/modProduct.do">
 <table align="center">
   <tr>
     <td width="200"><p align="right">상품번호</td>
     <td width="400"><input type="text" name="prdNo" value="${product.prdNo}" readonly style="background-color:#eee;"></td>
   </tr>
   <tr>
     <td width="200"><p align="right">상품명</td>
     <td width="400"><input type="text" name="prdName" value="${product.prdName}"></td>
   </tr>
   <tr>
     <td width="200"><p align="right">가격</td>
     <td width="400"><input type="number" name="prdPrice" value="${product.prdPrice}"></td>
   </tr>
   <tr>
     <td width="200"><p align="right">재고수량</td>
     <td width="400"><input type="number" name="prdStock" value="${product.prdStock}"></td>
   </tr>
   <tr align="center">
    <td colspan="2" width="400">
       <input type="submit" value="수정하기">
       <input type="reset" value="다시입력">
       <input type="button" value="목록보기" onclick="location.href='${contextPath}/product/listProduct.do'">
    </td>
   </tr>
 </table>
</form>
</body>
</html>