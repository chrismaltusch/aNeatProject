<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    String table = (String) request.getAttribute("table");

%>    


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Shop</title>
<h1>D2Decoys</h1>
<a href="./Register.jsp">Register </a>
<a href="./Login.jsp">Login </a>
</head>
<body>
<main>
<nav>
<a href="./Cart.jsp">Cart </a>
<a href="./Locations.jsp">Retail Locations </a>
<a href="./Shop.jsp">Shop </a>
<a href="./Contact.jsp">Contact Us </a>
</main>

<h1>Product Library</h1>

<%= table %>



</body>
</html>