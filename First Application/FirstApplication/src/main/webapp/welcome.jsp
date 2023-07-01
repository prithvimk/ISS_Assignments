<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	
	<%
		// Prevents users from using the back button to access secure pages after logging out
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		
		// To check if user has logged in before accessing the welcome page
		if (session.getAttribute("username") == null) {
			// If not, redirect to login page
			response.sendRedirect("login.jsp");
		}
	%>
	Hello, World! <br>
	
	Welcome ${username}
	
	<form action="Logout">
		<input type="submit" value="Logout">
	</form>
	
	 
</body>
</html>