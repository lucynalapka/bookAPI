<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: cyluna
  Date: 18.11.2022
  Time: 12:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Lista książek</h1>
<table>

    <thead>
    <th>id</th>
    <th>isbn</th>
    <th>tytuł</th>
    <th>autor</th>
    <th>akcja</th>

    </thead>
    <tbody>
    <c:forEach items="${books}" var="item">
        <tr>
            <td>${item.id}</td>
            <td>${item.isbn}</td>
            <td>${item.title}</td>
            <td>${item.author}</td>


            <td>
                <a href="<c:url value="/admin/books/update/${item.id}"/>">Edytuj</a>
                <a href="<c:url value="/admin/books/delete/${item.id}"/>">Usuń</a>
                <a href="<c:url value="/admin/books/${item.id}"/>">Szczegóły</a>

            </td>


        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
