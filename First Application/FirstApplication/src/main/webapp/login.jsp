<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<form id="loginForm" action="Login" method="post" onSubmit="return validateLogin()">
		Enter username: <input type="text" name="uname" required><br>
		Enter password: <input type="password" name="pass" required><br>
		<input type="submit" value="login">
		
		<a href="register.jsp" class="text-success">Create a new account.</a>
		<label id="login-label" class="text-danger">${sessionScope.loginMessage}</label>
	</form>
</body>
<script src="validation.js"></script>
</html>