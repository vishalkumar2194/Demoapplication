<%--
  Created by IntelliJ IDEA.
  User: enbake
  Date: 12/4/19
  Time: 11:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

<form:form id="loginForm" modelAttribute="login" action="login" method="post">
    <div align="center">
        <table align="center">
            <tr>
                <td><a href="login">Login</a>
                </td>
                <td><a href="register">Register</a>
                </td>
            </tr>
            <tr>
                <td>Username</td>
                <td><input type="text" name="username"/></td>
            </tr>

            <tr>
                <td>Password</td>
                <td><input type="password" name="password"/></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" name="Login"/></td>
            </tr>

        </table>
    </div>
</form:form>

<table align="center">
    <tr>
        <td style="font-style: italic; color: red;">${message}</td>
    </tr>
</table>

</body>
</html>
