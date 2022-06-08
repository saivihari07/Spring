<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/">HOME</a>
<p>
	User:<security:authentication property="principal.username"/>
	<br/><br/>
	Role(s): <security:authentication property="principal.authorities"/><!-- It returns list of roles -->
</p>
      <!-- It is for leaders only -->
   <security:authorize access="hasRole('MANAGER')">   
	<a href="${pageContext.request.contextPath}/leaders">LEADERS</a>(Only allowed for leaders)
	</security:authorize>
	<br/><br/>
	<!-- It is only for admins only -->
   <security:authorize access="hasRole('ADMIN')">	 
	<a href="${pageContext.request.contextPath}/systems">SYSTEMS</a>(Only allowed for admins)
	</security:authorize>
	<br/><br/>
<!-- Add logout button -->
	<form:form action="${pageContext.request.contextPath}/logout" 
					 method="POST">
		<input type="submit" value="Logout"/>
	</form:form>
	<br/><br/>
	




</body>
</html>