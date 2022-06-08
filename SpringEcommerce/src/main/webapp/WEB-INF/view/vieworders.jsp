<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order Page</title>
</head>
<body>
<div class="maincart">
<c:forEach items="${ords}" var="ord">
<div class="childcart">
<img alt="image" src="${ord.getProducturl()}">
${ord.getProductprice()}
${ord.getProductname()}

<button><a href ="/SpringEcommerce/remove-order/${ord.getId()}">Remove</a></button>
</div>

</c:forEach>
</body>
</html>