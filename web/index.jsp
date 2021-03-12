<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%
    request.setCharacterEncoding("UTF-8");
%>

<html>
    
    <head>
        <title>Решение примера по формуле</title>
    </head>
    
    
    
    <body>
        <h1>Решение примера по формуле</h1>
        <img src="example.png">
        </br>
        <form action="Main" method="POST">
            <div class="settings">
            <label>X =</label><input type="text" name="x"/>
            <label>A =</label><input type="text" name="a"/>
            <label>B =</label><input type="text" name="b"/> 
            </div>
            </br>
            <div class="buttons">
            <input type="submit" name="calc" value="Решить"/>
            <input type="reset" name="clear" value="Очистить"/>
            </div>
        </form>
    </body>
    
</html>