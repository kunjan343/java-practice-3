<%--
  Created by IntelliJ IDEA.
  User: ANCPI
  Date: 2019-10-16
  Time: 8:53 a.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome to Pizza Service</title>
    <link href="styles/index.css" rel="stylesheet" type="text/css">
</head>
<body style="padding: 10px">
<header>
    <h1 align="center">Welcome to the Pizza Shop</h1>
</header>
<div class="flex-container">
    <div class="flex-box">
        <img src="Pizza.jfif" style="width: -webkit-fill-available;" alt="pizza">
    </div>
    <div class="flex-box">
        <form action="ServletCustomer" method="post" style="padding: 10px">
            <h2>Tell Ue About Yourself..</h2>
            <table>
                <tr>
                    <td><input type="text" name="name" placeholder="Your Name" required autofocus></td>
                </tr>
                <tr>
                    <td><input type="text" name="address" placeholder="Address" required></td>
                </tr>
                <tr>
                    <td><input type="tel" name="pNumber" placeholder="Phone Number" min="11111111111" max="9999999999"
                               required></td>
                </tr>
                <tr>
                    <td><input type="email" name="email" placeholder="Email Address" required></td>
                </tr>
                <tr>
                    <td>
                        <input type="radio" name="orderType" value="Pickup" checked> Pick-Up
                        <input type="radio" name="orderType" value="Delivery"> Delivery
                    </td>
                </tr>
            </table>
            <button type="submit">Begin</button>
        </form>
    </div>
</div>
</body>
</html>
