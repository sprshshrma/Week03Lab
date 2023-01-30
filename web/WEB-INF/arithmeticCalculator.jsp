<%-- 
    Document   : arithmeticCalculator
    Created on : 30-Jan-2023, 3:41:25 AM
    Author     : Sparsh
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
        
        <form method="POST" action="arithmeticCalculator">
            
            First: <input type="text" name="firstNum"><br>
            Second: <input type="text" name="secondNum"><br>
            
            <input type="submit" value="+" name="Calculation">
            <input type="submit" value="-" name="Calculation">
            <input type="submit" value="*" name="Calculation">
            <input type="submit" value="%" name="Calculation">
            
            <p> ${message} </p>
            
        </form>
        
        <a href="Age">Age Calculator</a>
            
    </body>
</html>
