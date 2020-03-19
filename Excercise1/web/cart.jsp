<%--
  Created by IntelliJ IDEA.
  User: kunja
  Date: 10/30/2019
  Time: 1:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" tagdir="lib/jstl-1.2.jar" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cart</title>
</head>
<body>
<p>hello</p>
<c:forEach var="phone" items="${phoneList}">
    <p>${phone.name}</p>
    <p>${phone.price}</p>
</c:forEach>
</body>
</html>
