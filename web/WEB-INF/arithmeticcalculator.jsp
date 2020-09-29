<%-- 
    Document   : arithmeticcalculator
    Created on : 22-Sep-2020, 11:21:08 AM
    Author     : Jean
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            First: <input type="text" name="first" value="${firstnum}"><br>
            Second: <input type="text" name="second" value="${secondnum}"><br>
            <input type="submit" name="submit" value="+">
            <input type="submit" name="submit" value="-">
            <input type="submit" name="submit"  value="*">
            <input type="submit" name="submit" value="%">
        </form>
        <p>Result: ${result}</p>
        <a href="age">Age Calculator</a>
    </body>
</html>
