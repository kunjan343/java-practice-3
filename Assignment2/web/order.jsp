<%@ page import="userdata.Pizza" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="userdata.Order" %>
<%@ page import="userdata.Customer" %>
<%--
  Created by IntelliJ IDEA.
  User: patkunja
  Date: 2019-10-16
  Time: 11:05 a.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Place Your Order</title>
    <link href="styles/order.css" rel="stylesheet" type="text/css">
</head>
<body>

<%
    ArrayList<Pizza> pizzas = Order.getPizzas();
    Customer customer = Order.getCustomer();
%>

<header>
    <h1 align="center">Order for&nbsp;<%= customer.getName() %>
    </h1>
</header>
<form class="flex-container" method="post" action="ServletOrderBuilder">
    <div class="flex-box">
        <h2>Add a Pizza</h2>

        <h2>Size:</h2>
        <input type="radio" name="size" value="S">Small
        <input type="radio" name="size" value="M">Medium
        <input type="radio" name="size" value="L" checked>Large
        <input type="radio" name="size" value="XL">Ex-Large

        <h2>Toppings:</h2>
        <input type="checkbox" name="topping" value="Pepperoni">Pepperoni<br>
        <input type="checkbox" name="topping" value="Sausage">Sausage<br>
        <input type="checkbox" name="topping" value="Mushrooms" checked>Mushrooms<br>
        <input type="checkbox" name="topping" value="Green Olives">Green Olives<br>
        <input type="checkbox" name="topping" value="Black Olives" checked>Black Olives<br>
        <input type="checkbox" name="topping" value="Green Peppers" checked>Green Peppers<br>
        <input type="checkbox" name="topping" value="Hot Peppers">Hot Peppers<br>
        <input type="checkbox" name="topping" value="Extra Cheese">Extra Cheese<br>
        <input type="checkbox" name="topping" value="Extra Sauce">Extra Sauce<br>
        <input type="submit" name="actionButton" value="Add Pizza">
    </div>
    <div class="flex-box">
        <h2>Your Order So far&nbsp;(<%=customer.getOrderType() %>)</h2>
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
        <p align="right"><input type="submit" name="actionButton" value="Proceed to Checkout"></p>
    </div>
</form>
</body>
</html>
