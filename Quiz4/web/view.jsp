<%--
  Created by IntelliJ IDEA.
  User: kunja
  Date: 11/29/2019
  Time: 10:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Affordable Cars</h2>
<table border="1">
    <tr>
        <th>Car Name</th>
        <th>Year</th>
        <th>Color</th>
        <th>Price</th>
    </tr>
    <c:forEach var="car" items="${cars}">
        <tr>
            <td>${car.model}</td>
            <td>${car.year}</td>
            <td>${car.colour}</td>
            <td>${car.price}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
