<%--
  Created by IntelliJ IDEA.
  User: adaline
  Date: 2019/7/27
  Time: 11:08
  To change this template use File | Settings | File Templates.
--%>
<%--使用jstl标签要注明taglib头约束--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工列表</title>
</head>
<body>
<table>
    <tr>
        <td>id</td>
        <td>lastName</td>
        <td>email</td>
        <td>gender</td>
    </tr>
    <c:forEach items="${allEmps }" var="emp">
        <tr>
            <td>${emp.id }</td>
            <td>${emp.lastName }</td>
            <td>${emp.email }</td>
            <td>${emp.gender }</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
