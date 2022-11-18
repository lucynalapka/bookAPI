<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: cyluna
  Date: 18.11.2022
  Time: 12:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Szczegóły ksiażki</title>
</head>
<body>
<h1>Szczegóły książki</h1>
<table>
  <thead>
  <th>isbn</th>
  <th>title</th>
  <th>author</th>
  <th>publisher</th>
  <th>type</th>
  </thead>
  <tbody>
  <tr>
    <td><c:out value="${book.isbn}"/></td>
    <td><c:out value="${book.title}"/></td>
    <td><c:out value="${book.author}"/></td>
    <td><c:out value="${book.publisher}"/></td>
    <td><c:out value="${book.type}"/></td>
    <td>
    </td>
  </tr>

  </tbody>
</table>
</body>
</html>
