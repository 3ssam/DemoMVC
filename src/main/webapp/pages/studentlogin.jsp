<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@page session="true" %>

<!DOCTYPE html>
<html>
<head>
    <title>Student Form</title>
</head>
<body>
<form action="add">
    <label>Name</label>
    <input type="text" name="name"><br><br>
    <label>Age</label>
    <input type="text" name="age"><br><br>
    <label>E-mail Address</label>
    <input type="text" name="email"><br><br>
    <input type="submit">
</form>

<br><br>

<form action="show">
    <label>Id</label>
    <input type="text" name="id"><br><br>
    <input type="submit" title="Search">
</form>

<form action="delete">
    <label>Id</label>
    <input type="text" name="id"><br><br>
    <input type="submit" title="Delete">
</form>


<form action="update">
    <label>Id</label>
    <input type="text" name="id"><br><br>
    <label>Name</label>
    <input type="text" name="name"><br><br>
    <label>Age</label>
    <input type="text" name="age"><br><br>
    <label>E-mail Address</label>
    <input type="text" name="email"><br><br>
    <input type="submit">
    <input type="submit" title="Update">
</form>

</body>
</html>