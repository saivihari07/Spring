<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
<style type="text/css">
body {
  box-sizing: border-box;
  margin: 0;
  padding: 0;
  background-color: white;
  font-family: "lato", sans-serif;
  }
.signupFrm {
  display: flex;
  justify-content: center;
  align-items: center;
  height: 100vh;
}
.form {
  background-color: white;
  width: 400px;
  border-radius: 8px;
  padding: 20px 40px;
  box-shadow: 0 10px 25px rgba(92, 99, 105, .2);
}

.title {
  font-size: 50px;
  margin-bottom: 50px;
}
.inputContainer {
  position: relative;
  height: 45px;
  width: 90%;
  margin-bottom: 17px;
}
.input {
  position: absolute;
  top: 0px;
  left: 0px;
  height: 100%;
  width: 100%;
  border: 1px solid #DADCE0;
  border-radius: 7px;
  font-size: 16px;
  padding: 0 20px;
  outline: none;
  background: none;
  z-index: 1;
}
::placeholder {
  color: transparent;
}
.label {
  position: absolute;
  top: 15px;
  left: 15px;
  padding: 0 4px;
  background-color: white;
  color: #DADCE0;
  font-size: 16px;
  transition: 0.5s;
  z-index: 0;
}
.submitBtn {
  display: block;
  margin-left: auto;
  padding: 15px 30px;
  border: none;
  background-color: purple;
  color: white;
  border-radius: 6px;
  cursor: pointer;
  font-size: 16px;
  margin-top: 30px;
}

.submitBtn:hover {
  background-color: #9867C5;
  transform: translateY(-2px);
}
.input:focus + .label {
  top: -7px;
  left: 3px;
  z-index: 10;
  font-size: 14px;
  font-weight: 600;
  color: purple;
}
.input:focus {
  border: 2px solid purple;
}
.input:not(:placeholder-shown)+ .label {
  top: -7px;
  left: 3px;
  z-index: 10;
  font-size: 14px;
  font-weight: 600;
}
</style>
</head>
<body>
<div class="signupFrm">
    <form:form action="processForm" modelAttribute="userInfo" method="POST" class="form">
      <h1 class="title">Sign up</h1>
		
        <div class="inputContainer">
        <label for="" class="label">Username</label>
        <form:errors path="username" cssStyle="color: #ff0000;" />
        <form:input type="text" class="input" path="username" placeholder="a"/>      
      </div>
      
      <div class="inputContainer">
      	<label for="" class="label">Email</label>
      	<form:errors path="email" cssStyle="color: #ff0000;" />
        <form:input type="text" class="input" path="email" placeholder="a"/>    
      </div>

      <div class="inputContainer">
      	<label for="" class="label">Password</label>
      	<form:errors path="password" cssStyle="color: #ff0000;" />
        <form:input type="text" class="input" path="password" placeholder="a"/>
      </div>

      
      <input type="submit" class="submitBtn" value="Sign up">
    </form:form>
  </div>

</body>
</html>