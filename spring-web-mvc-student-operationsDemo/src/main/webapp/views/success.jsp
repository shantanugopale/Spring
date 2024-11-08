<%@page import="com.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
</head>
<body>
	<%
		List<Student> sList = (List<Student>) request.getAttribute("data");
	%>

	<h1>Student List</h1>
	<form name="myForm">
		<table border="1" cellspacing="0" cellpadding="10">
			<tr>
				<th>Select</th>
				<th>Roll No</th>
				<th>Name</th>
				<th>Email</th>
				<th>Mobile No</th>
				<th>City</th>
				<th>Actions</th>
			</tr>

			<%
				for (Student stu : sList) {
			%>
			<tr>
				<td><input type="radio" name="rno" value="<%=stu.getRno()%>">
				</td>
				<td><%=stu.getRno()%></td>
				<td><%=stu.getName()%></td>
				<td><%=stu.getEmail()%></td>
				<td><%=stu.getMobileNo()%></td>
				<td><%=stu.getCity()%></td>
				<td><input type="submit" onclick="deleteStudent()"
					value="Delete"/>
				<td><input type="submit" onclick="updateStudent()"
					value="Update"/>
			</tr>
			<%
				}
			%>

		</table>
	</form>
</body>
<script>
	function deleteStudent() {
		document.myForm.action = "deleteStudent";
		document.myForm.submit();
	}
	
	function updateStudent() {
		document.myForm.action = "getStudentById";
		document.myForm.submit();	
	}
</script>

</html>