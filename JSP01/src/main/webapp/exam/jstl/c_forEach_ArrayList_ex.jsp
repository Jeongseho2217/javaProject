<%@ page language="java" contentType="text/html; charset=UTF-8"
    import="java.util.*, exam.beans.ProductVO" pageEncoding="UTF-8"%>
    <%
    	request.setCharacterEncoding("utf-8");
    %>
    
    <%
    	ProductVO m1 = new ProductVO("123", "과자", 3000, "오리온");
    	ProductVO m2 = new ProductVO("1234", "TV", 1500000, "삼성");
   		
   		ArrayList<ProductVO> productList = new ArrayList<>();
   		
   		productList.add(m1);
   		productList.add(m2);
   		
   		request.setAttribute("productList", productList);
    %>
<jsp:forward page="c_forEach_ArrayList_result_ex.jsp"/>