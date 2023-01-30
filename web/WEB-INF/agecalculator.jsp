<%-- 
    Document   : agecalculator
    Created on : 30-Jan-2023, 3:08:29 AM
    Author     : Sparsh
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
        <form  method="POST" action="Age" >
            Enter your age : <input type="text" name="AGE"><br>
            <input type="submit" value="Age next birthday" >  
            
              <p>${message}</p>
            
        </form>
        
        <a href="arithmeticCalculator">Arithmetic Calculator</a>
        
    </body>
</html>
