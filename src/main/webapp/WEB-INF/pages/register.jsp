<%--
  Created by IntelliJ IDEA.
  User: m.biryukov
  Date: 26.10.2018
  Time: 19:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/addUser" method="post">
    <input type="text" name="login" placeholder="Введите логин" required autofocus/><br>
    <input type="password" name="password" placeholder="Введите пароль" required/><br>
    <input type="submit" value="Зарегистрироваться">
</form>
</body>
</html>
