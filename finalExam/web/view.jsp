<%--
  Created by IntelliJ IDEA.
  User: kunja
  Date: 12/11/2019
  Time: 1:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet" href="style.css" type="text/css">
<html>
<head>
    <title>Grommets</title>
</head>
<body>
<h1>The Grommet Factory</h1>
<p>Here are your grommets!</p>
<div>
    <c:forEach var="grommet" items="${grommets}">
        <div class="grommet"
             style="background-color: ${grommet.color};width: 50px;height: 50px;border: 1px solid black;">
                ${grommet.symbol}
        </div>
    </c:forEach>
</div>
<br style="clear: both">
<p><a href="index.html">Get More Grommets</a></p>
</body>
</html>
