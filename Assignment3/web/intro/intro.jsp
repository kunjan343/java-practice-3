<%@ page import="services.StudentService" %>
<%--
  Created by IntelliJ IDEA.
  User: kunja
  Date: 11/28/2019
  Time: 5:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Intro</title>
</head>
<body>
<div align="center">
    <h2>Search Result</h2>

    <% if (StudentService.studentExist) {%>
    <p>You search for <b>${student.firstName}&nbsp;${student.lastName}</b></p>
    <table>
        <tr>
            <td>
                <form method="post" action="ServletReport">
                    <button type="submit">Show Report</button>
                </form>
            </td>
            <td>
                <form method="post" action="ServletModify">
                    <button type="submit">Edit Grades</button>
                </form>
            </td>
        </tr>
    </table>

    <% } else { %>
    <p> Student you are looking for is not available in system.</p>
    <form method="post" action="">
        <button type="submit">Add Student</button>
    </form>
    <% } %>
</div>
<a href="index.jsp">Back to Search</a>
</body>
</html>
