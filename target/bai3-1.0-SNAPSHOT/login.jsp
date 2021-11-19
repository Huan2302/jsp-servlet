<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 11/19/21
  Time: 8:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h1>Login</h1>
<form action="<%=request.getContextPath()%>/login" method="post">
    <lable>Username:</lable>
    <input type="text" name="username">
    <br>
    <lable>Password:</lable>
    <input type="password" name="password">
    <br>
    <input type="submit">
</form>
</body>
</html>
