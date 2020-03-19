<%@ page import="java.util.Date" %>
<%@ page import="userdata.Customer" %>
<%@ page import="userdata.Order" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="userdata.Pizza" %>
<%@ page import="java.util.Arrays" %><%--
  Created by IntelliJ IDEA.
  User: ANCPI
  Date: 2019-10-18
  Time: 1:34 p.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Checkout</title>
    <link href="styles/checkout.css" rel="stylesheet" type="text/css">
</head>
<body>
<%
    Customer customer = Order.getCustomer();
    ArrayList<Pizza> pizzas = Order.getPizzas();
%>
<header>
    <h1 align="center">Thanks for Your Order!</h1>
</header>
<div class="flex-container">
    <div class="flex-box" style="padding: 10px">
        <h2>Your Receipt</h2>
        <%= customer.getName()%><br>
        <%= customer.getAddress()%><br>
        <%= customer.getPhoneNumber()%><br>
        <%= customer.getEmail()%><br>
        <table class="order-table">
            <tr>
                <th>Size
                    <hr>
                </th>
                <th>Toppings
                    <hr>
                </th>
                <th>Price
                    <hr>
                </th>
            </tr>
            <% for (Pizza pizza : pizzas) { %>
            <tr>
                <td><%= pizza.getSize() %>
                </td>
                <td><%
                    String toppings = Arrays.toString(pizza.getToppings());
                    out.print(toppings.substring(1, toppings.length() - 1));
                %>
                </td>
                <td><%= pizza.getPrice()%>
                </td>
            </tr>
            <% } %>
            <tr>
                <td></td>
                <td><p align="right">Tax:</p></td>
                <td><%= String.format("%.2f", Order.getTax()) %>
                </td>
            </tr>
            <tr>
                <td></td>
                <td><p align="right">Total:</p></td>
                <td><%= String.format("%.2f", Order.getTotal()) %>
                </td>
            </tr>
        </table>
        <h3>Delivery Time:&nbsp;<%= new Date() %>
        </h3>
    </div>
    <div class="flex-box">
        <img src="Pizza.jfif" style="width: -webkit-fill-available;" alt="pizza">
    </div>
</body>
</html>
