<%--
  Created by IntelliJ IDEA.
  User: kunja
  Date: 11/26/2019
  Time: 11:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Information System</title>
</head>
<body>
<h2 align="center">Welcome to Student Database</h2>
<hr>
<form method="post" action="ServletIntro" align="center">
    <p>Please Enter student number</p>
    <input type="number" min="1" style="width: 200px" name="studentNo" required>
    <p><input type="submit" value="Search"></p>
</form>
</body>
</html>
