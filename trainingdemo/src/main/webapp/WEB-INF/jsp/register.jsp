<%--
  Created by IntelliJ IDEA.
  User: enbake
  Date: 12/4/19
  Time: 11:35 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Registration</title>
</head>
<body>

<form:form id="regForm" modelAttribute="register" action="register" method="post">
   <div align="center">
    <table align="center">
    <tr>
    <td>Username</td>
    <td><input type="text" name="username"/></td>
    </tr>

    <tr>
    <td>Password</td>
    <td><input type="text" name="password"/></td>
    </tr>

    <tr>
    <td>Name</td>
    <td><input type="text" name="name"/></td>
    </tr>

    <tr>
    <td>E-mail</td>
    <td><input type="text" name="email"/></td>
    </tr>

    <tr>
    <td colspan="2"><input type="submit" name="Submit"/></td>
    </tr>

    </table>
    </div>
</form:form>

</body>
</html>
