<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
	<form id="regForm" action="Register" method="post" onSubmit="return validateRegister">
		Enter username: <input type="text" name="uname" required><br>
		Enter password: <input type="password" name="pass" required><br>
		Re-Enter to confirm password: <input type="password" name="confpass"><br>
		<input type="submit" value="Register">
		
		<label id="register-label" class="text-danger">${sessionScope.registerMessage}</label>
	</form>
</body>
<script src="validation.js"></script>
</html>