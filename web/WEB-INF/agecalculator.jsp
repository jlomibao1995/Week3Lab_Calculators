<%-- 
    Document   : agecalculator
    Created on : 22-Sep-2020, 8:44:12 AM
    Author     : Jean
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            Enter your age: <input type="text" name="age"><br>
            <input type="submit" value="Age next birthday">
        </form>
        <a href="arithmetic">Arithmetic Calculator</a>
        <p>${message}</p>
    </body>
</html>
