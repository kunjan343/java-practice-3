<%--
  Created by IntelliJ IDEA.
  User: kunja
  Date: 10/30/2019
  Time: 3:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Purchases</title>
</head>
<body>
<form method="post" action="ServletController">
    <p>
        <input type="radio" name="cellphone" value="google" checked>
        Google<input type="hidden" name="googlePrice" value="975">
    </p>
    <p>
        <input type="radio" name="cellphone" value="htc">
        HTC<input type="hidden" name="htcPrice" value="892">
    </p>
    <p>
        <input type="radio" name="cellphone" value="lenovo">
        Lenovo<input type="hidden" name="lenovoPrice" value="624">
    </p>
    <p>
        <input type="radio" name="cellphone" value="motorola">
        Motorola<input type="hidden" name="motorolaPrice" value="752">
    </p>
    <input type="submit" value="Purchase">
</form>
</body>
</html>
