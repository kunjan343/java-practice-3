<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enter login info</title>
</head>
<body>
<h1> Please provide your login information below</h1>
<form action="j_security_check">
Username: <input type="text" name="j_username"><br>
Password: <input type="password" name="j_password"><br>
<input type="submit" value="Login">
</form>

</body>
</html>