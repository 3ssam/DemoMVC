<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@page session="true" %>

<!DOCTYPE html>
<html>
<head>
    <title>Student Form</title>
</head>
<body>
<form action="addStudent">
    <label>ID</label>
    <input type="text" name="id"><br><br>
    <label>Name</label>
    <input type="text" name="name"><br><br>
    <label>Age</label>
    <input type="text" name="age"><br><br>
    <label>E-mail Address</label>
    <input type="text" name="email"><br><br>
    <input type="submit">
</form>
</body>
</html>