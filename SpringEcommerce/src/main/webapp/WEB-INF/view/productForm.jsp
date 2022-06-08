<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AddProducts</title>
<style>




    form{
        left: 40%;
        position: absolute;
        top: 25%;
        
    }
     .text{
        padding: 8px;
     font-size: 16px;
     border-width: 2px;
     border-color: #CCCCCC;
     background-color: #FFFFFF;
     color: #000000;
     border-style: solid;
     border-radius: 16px;
     box-shadow: 0px 0px 4px rgba(66,66,66,.59);
     text-shadow: 0px 0px 5px rgba(66,66,66,.75);
     margin-left: 20px;
    }
    /* From uiverse.io by @alexroumi */
/* From uiverse.io by @alexroumi */
button {
 padding: 15px 25px;
 border: unset;
 border-radius: 15px;
 color: #212121;
 z-index: 1;
 background: #e8e8e8;
 position: relative;
 font-weight: 1000;
 font-size: 17px;
 -webkit-box-shadow: 4px 8px 19px -3px rgba(0,0,0,0.27);
 box-shadow: 4px 8px 19px -3px rgba(0,0,0,0.27);
 transition: all 250ms;
 overflow: hidden;
}

button::before {
 content: "";
 position: absolute;
 top: 0;
 left: 0;
 height: 100%;
 width: 0;
 border-radius: 15px;
 background-color: #212121;
 z-index: -1;
 -webkit-box-shadow: 4px 8px 19px -3px rgba(0,0,0,0.27);
 box-shadow: 4px 8px 19px -3px rgba(0,0,0,0.27);
 transition: all 250ms
}

button:hover {
 color: #e8e8e8;
}

button:hover::before {
 width: 100%;
}

</style>
</head>
<body>
<div class="productbox">
<form:form action = "productProcess" modelAttribute="product" method="POST">
<center><h1>ADD PRODUCT</h1></center>
Product Name: &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
<form:errors path="productname" cssStyle="color: #ff0000;" />
<form:input class="text"  path = "productname"/><br><br>
Product Description:
<form:errors path="productdesc" cssStyle="color: #ff0000;" />
<form:input class="text"  path = "productdesc"/><br><br>
Product Price:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
<form:errors path="productprice" cssStyle="color: #ff0000;" />
<form:input class="text"  path = "productprice"/><br><br>
Image URL:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
<form:input class="text"  path = "producturl"/><br><br>
Category:<form:input class="text"  path = "productcat"/><br><br>
<br><button  >Add Product</button>
</form:form>
</div>


</body>
</html>