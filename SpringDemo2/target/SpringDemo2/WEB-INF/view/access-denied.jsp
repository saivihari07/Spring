<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<title>Access Denied</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0"/>
<meta charset="UTF-8">
<style>
	body{
background-color: white;
color: white;
}

h1 {
color: grey;
text-align: center;

}

h2{
color: red;
text-decoration: underline;
text-align: center;
}
</style>
</head>
<body>
<div class="w3-display-middle">

<h1 class="w3-jumbo w3-animate-top w3-center"><code>Access Denied</code></h1>

<h3 class="w3-center w3-animate-right">You dont have permission to view this site.</h3>
<h3 class="w3-center w3-animate-zoom"></h3>
<h2 class="w3-center w3-animate-zoom">Error code:403 forbidden</h2>

</div>

<button class="btn btn-success"><a href="${pageContext.request.contextPath}/">Back to Home</a></button>
</body>
</html>