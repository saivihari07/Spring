<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="maincart">
<c:forEach items="${ords}" var="ord">
<div class="childcart">
<img alt="image" src="${ord.getProducturl()}">
${ord.getProductprice()}
${ord.getProductname()}

<button><a href ="/SpringEcommerce/order/${ct.getProductid()}">Remove</a></button>
</div>

</c:forEach>
</body>
</html>