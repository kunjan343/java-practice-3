<%--
  Created by IntelliJ IDEA.
  User: kunja
  Date: 11/29/2019
  Time: 9:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"
                   url="jdbc:mysql://localhost:3306/SheridanUsedCars?useSSL=false"
                   user="root" password="root"/>
<sql:query dataSource="${db}" var="result">SELECT * FROM
    manufacturer</sql:query>

<form method="post" action="ServletController">
    <label for="manufacturer">Select Manufacturer</label>
    <select id="manufacturer" name="manufacturerId" required>
        <c:forEach var="row" items="${result.rows}">
            <option value="${row.manufacturerID}">${row.manufacturer}</option>
        </c:forEach>
    </select>
    <br>
    <label for="maxPrice">Max Price : </label>
    <input id="maxPrice" type="number" name="maxPrice" min="0" required>
    <br>
    <input type="submit" value="Submit">
</form>
</body>
</html>
