<%@page import="com.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		Student stu = (Student) request.getAttribute("data");
	%>

	<h1>Update Student</h1>
	<form action="updatestudent" method="post">
		Enter RollNo : <input type="text" name="rno"
			value="<%=stu.getRno()%>" readonly><br> <br> Enter Name : <input
			type="text" name="name" value="<%=stu.getName()%>"><br>
		<br> Enter MobileNo : <input type="text" name="mobileNo"
			value="<%=stu.getMobileNo()%>"><br> <br> Enter
		Email : <input type="text" name="email" value="<%=stu.getEmail()%>"><br>
		<br> Enter City : <input type="text" name="city"
			value="<%=stu.getCity()%>"><br> <br> <input
			type="submit" value="Update">
	</form>
</body>
</html>