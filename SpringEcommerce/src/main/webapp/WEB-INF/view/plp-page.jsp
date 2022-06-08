<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page isELIgnored="false" %>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PLP_Page</title>
<style type="text/css">
.home{
display:flex;
flex-direction:row;
flex-wrap:wrap;

}
.child a img{
width:250px;
height:350px;

}
.child{
padding-left:50px;
}

.buy {
 padding: 1em;
 font-size: 12px;
 text-transform: uppercase;
 letter-spacing: 2.5px;
 font-weight: 500;
 color: #000;
 background-color: #fff;
 border: none;
 border-radius: 45px;
 box-shadow: 0px 8px 15px rgba(0, 0, 0, 0.1);
 transition: all 0.3s ease 0s;
 cursor: pointer;
 outline: none;
}

.buy:hover {
 background-color: #2EE59D;

 color: #fff;
 transform: translateY(-7px);
}

.buy:active {
 transform: translateY(-1px);
}

    .cart {
 padding: 1em;
 font-size: 12px;
 text-transform: uppercase;
 letter-spacing: 2.5px;
 font-weight: 500;
 color: #000;
 background-color: #fff;
 border: none;
 border-radius: 45px;
 box-shadow: 0px 8px 15px rgba(0, 0, 0, 0.1);
 transition: all 0.3s ease 0s;
 cursor: pointer;
 outline: none;
}
.cart a {
 text-decoration: none;
}

.cart:hover {
 background-color: #ffaf1c;

 color: #fff;
 transform: translateY(-7px);
}

.cart:active {
 transform: translateY(-1px);
}
</style>
</head>
<body>
	<div class="home">
		<c:forEach items="${list}" var="ldata">
			<div class="child">
				<p>${ldata.getProductname()}</p>
				<a href="/SpringEcommerce/pdp/${ldata.getProductid()}"><img
					alt="image" src="${ldata.getProducturl()}"></a>
				<p><b>Price:${ldata.getProductprice()}/-</b></p>

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