<%--
  Created by IntelliJ IDEA.
  User: Максим
  Date: 25.11.2023
  Time: 20:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring MVC</title>
</head>
<body>
    <h2>Enter your details</h2><br><br>
    <form action="showDetails" method="get">
        <input type="text" name="employeeName"
        placeholder="Write your name"/>
        <input type="submit">
    </form>
</body>
</html>
