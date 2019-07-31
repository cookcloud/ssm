<%--
  Created by IntelliJ IDEA.
  User: adaline
  Date: 2019/7/31
  Time: 20:31
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>部门列表</title>
</head>
<body>

<table>
    <tr>
        <td>id</td>
        <td>departname</td>
    </tr>
    <c:forEach items="${departList}" var="depart">
        <tr>
            <td>${depart.id }</td>
            <td>${depart.departname }</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
