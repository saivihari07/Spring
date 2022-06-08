<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
         <%@ page isELIgnored="false" %>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="carthome">
<c:forEach items="${carts}" var="ct">
<div class="childcart">
<img alt="image" src="${ct.getProducturl()}">
${ct.getProductprice()}
${ct.getProductname()}
<button><a href ="/SpringEcommerce/order/${ct.getId()}">Order</a></button>
<button><a href ="/SpringEcommerce/remove/${ct.getId()}">Remove</a></button>
</div>
</c:forEach>
</body>
</html>