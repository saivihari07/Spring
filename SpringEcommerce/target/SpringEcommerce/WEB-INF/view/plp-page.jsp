<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page isELIgnored="false" %>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PLP_Page</title>
</head>
<body>
	<div class="home">
		<c:forEach items="${list}" var="ldata">
			<div class="child">
				<p>${ldata.getProductname()}</p>
				<a href="/SpringEcommerce/pdp/${ldata.getProductid()}"><img
					alt="image" src="${ldata.getProducturl()}"></a>
				<p>Price:${ldata.getProductprice()}</p>

				<button class="buy">Buy Now</button>
				<button class="cart">
					<a href="/SpringEcommerce/cart/${ldata.getProductid()}">Add To
						Cart</a>
				</button>
			</div>
		</c:forEach>
	</div>
</body>
</html>