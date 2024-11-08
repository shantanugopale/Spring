<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Page</title>
</head>
<body>
	<h1>Registration Page</h1>
	<form action="savestudent" method="post">
		Enter RollNo : <input type="text" name="rno"><br> <br>
		Enter Name : <input type="text" name="name"><br> <br>
		Enter MobileNo : <input type="text" name="mobileNo"><br>
		<br> Enter Email : <input type="text" name="email"><br>
		<br> Enter City : <input type="text" name="city"><br>
		<br> <input type="submit" value="REGISTER">
	</form>
</body>
</html>