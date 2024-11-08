<%@page import="com.model.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Page</title>
</head>
<body>
	<center>
		<h1>Products</h1>
		<%
			List<Product> pList = (List<Product>) request.getAttribute("data");
		%>

		<table border="1" cellspacing="0" cellpadding="10">
			<tr>
				<th>Product Id</th>
				<th>Product Name</th>
				<th>Product Category</th>
				<th>Product Price</th>
			</tr>
			<tr>
				<%
					for (Product pr : pList) {
				%>
				<td><%=pr.getpId()%></td>
				<td><%=pr.getpName()%></td>
				<td><%=pr.getpCategeory()%></td>
				<td><%=pr.getpPrice()%></td>
			</tr>
			<%
				}
			%>
		</table>
	</center>
</body>
</html>