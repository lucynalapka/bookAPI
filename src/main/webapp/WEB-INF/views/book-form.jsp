<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: cyluna
  Date: 18.11.2022
  Time: 12:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Book add</title>
</head>
<body>

<form:form method="post"
           modelAttribute="book">
    <div>
        <form:label path="isbn">Isbn</form:label>
        <form:input path="isbn"/>
    </div>
    <div>
        <form:label path="title">Tytuł</form:label>
        <form:textarea path="title"/>
    </div>
    <div>
        <form:label path="author">Autor</form:label>
        <form:input path="author"/>
    </div>
    <div>
        <form:label path="publisher">Wydawca</form:label>
        <form:input path="publisher"/>
    </div>
    <div>
        <form:label path="type">Rodzaj</form:label>
        <form:input path="type"/>
    </div>

    <input type="submit" value="Zapisz">
</form:form>

</body>
</html>

