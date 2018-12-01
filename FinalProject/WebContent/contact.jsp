<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Contact Us</title>
<h1>D2Decoys</h1>
<img src ="images/logo.jpg" alt="1" class="center">
<br />
<link rel="stylesheet" href ="style.css">
</head>
<body>
<main>
<nav>
<a href="./cart.jsp">Cart </a>
<a href="./locations.jsp">Retail Locations </a>
<a href="./shop.jsp">Shop </a>
<a href="./contact.jsp">Contact Us </a>
</main>

<h2>Contact Form</h2>
<p>We'd love to hear from our customers.</p>
<form name=contact action=contact method=post >
	<label>
      First Name:
   	</label>
   	<input type=text name=Fname value="" />
   	<br />
   	<label>
      Last Name:
   	</label>
   	<input type=text name=Lname value="" />
   	<br />
   	<label>
   	<label>
      Email:
   	</label>
   	<input type=text name=email value="" />
   	<br />
   	<label>
      Your Message:
   	</label>
   	<input type=text name=msg value="" />
   	<br />
   	<input type="submit" name="send" value="Send Message" />
</form>


</body>
</html>