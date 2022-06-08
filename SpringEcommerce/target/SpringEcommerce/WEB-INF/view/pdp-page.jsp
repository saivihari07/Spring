<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PDP_Page</title>
</head>
<body>
<div class="home">

<div class="child">
<img alt="image" src="${product.getProducturl()}">
<p>Name:${product.getProductname()}</p>
<p>Desc:${product.getProductdesc()}</p>
<p>Price:${product.getProductprice()}</p>
</div>

<a href="/SpringEcommerce/cart/${product.getProductid()}">Add To Cart</a>

</div>

</body>
</html>