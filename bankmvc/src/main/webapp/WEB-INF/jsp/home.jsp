<%@page import="java.net.http.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="/css/home.css" rel="stylesheet">
<title>Home Page</title>

</head>
<body background="Images/bank.jpg">
<h1 align="center">Welcome to Retail Banking System</h1>

     <div id="login-box" align="center"> 
         <h1 >HDFC Bank</h1>
           <form action="/employeelogin" method="get">
          <button class="custom-btn btn-2">Employee Login</a></button>
           </form>
           <form action="/customerlogin" method="get">
             <button class="custom-btn btn-2">Customer Login</a></button>
           </form>
         
    </div>
</body>
</html>