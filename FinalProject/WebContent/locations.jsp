<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Retail Locations</title>
<h1>D2Decoys Locator</h1>
<img src ="images/logo.jpg" alt="1" class="center">	
<link rel="stylesheet" href ="style.css">
<br>
</head>
<body>
<main>
<nav>
<a href="./cart.jsp"> Cart </a>
<a href="./locations.jsp"> Retail Locations </a>
<a href="./shop.jsp"> Shop </a>
<a href="./contact.jsp"> Contact Us </a>
</main>

<form name=locator action=locate method=post >
   <label>
      Find a Retailer.
   </label>
   <br />
   <label>
      Enter your zip code to start:
   </label>
   <input type=text name=zipcode value="" />
   <br />
   <input type="submit" name="Go" value="Go" />
</form>

<img src ="images/map.png" alt="1" class="center" width = 50%>	
    
</body>
</html>