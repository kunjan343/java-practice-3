<%@ page import="data.model.Student" %>
<%@ page import="data.model.Grade" %>
<%--
  Created by IntelliJ IDEA.
  User: kunja
  Date: 11/26/2019
  Time: 11:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Report</title>
</head>
<body>
<%
    Student student = (Student) request.getAttribute("student");
    Grade grade = (Grade) request.getAttribute("grade");
%>
<div align="center">
    <h2>Student Report</h2>
    <p>${student.firstName}&nbsp;${student.lastName}</p>
    <table border="1">
        <tr>
            <th>Exam</th>
            <th>Percentage</th>
            <th>Grade</th>
        </tr>
        <tr>
            <td>Q1</td>
            <td><%= student.getQ1() %>
            </td>
            <td><%= grade.getQ1() %>
            </td>
        </tr>
        <tr>
            <td>Q2</td>
            <td><%= student.getQ2() %>
            </td>
            <td><%= grade.getQ2() %>
            </td>
        </tr>
        <tr>
            <td>Q3</td>
            <td><%= student.getQ3() %>
            </td>
            <td><%= grade.getQ3() %>
            </td>
        </tr>
        <tr>
            <td>Q4</td>
            <td><%= student.getQ4() %>
            </td>
            <td><%= grade.getQ4() %>
            </td>
        </tr>
        <tr>
            <td>A1</td>
            <td><%= student.getA1() %>
            </td>
            <td><%= grade.getA1() %>
            </td>
        </tr>
        <tr>
            <td>A2</td>
            <td><%= student.getA2() %>
            </td>
            <td><%= grade.getA2() %>
            </td>
        </tr>
        <tr>
            <td>A3</td>
            <td><%= student.getA3() %>
            </td>
            <td><%= grade.getA3() %>
            </td>
        </tr>
        <tr>
            <td>Midterm Exam</td>
            <td><%= student.getMidtermExam() %>
            </td>
            <td><%= grade.getMidtermExam() %>
            </td>
        </tr>
        <tr>
            <td>Final Exam</td>
            <td><%= student.getFinalExam() %>
            </td>
            <td><%= grade.getFinalExam() %>
            </td>
        </tr>
    </table>
</div>
</body>
</html>
