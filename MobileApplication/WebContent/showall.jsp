<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib  prefix="a" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>List of All Mobiles</h1>
<table border="2">
<tr>
<th>Mobile Id</th>
<th>Mobile Name</th>
<th>Price</th>
<th>Quantity</th>
<th>Delete Mobile</th>
<th>Update Mobileit</th>

</tr>
<a:forEach var="emp" items="${temp}" >
<tr>
<td>${emp.mobileId}</td>
<td>${emp.name}</td>
<td>${emp.price}</td>
<td>${emp.quantity}</td>
 <td><a href="delete?mobid=${emp.mobileId}">Delete</a></td>
 <td> <a href="updatemobile?mobid=${emp.mobileId}">Update</a>
</td>
</tr>
</a:forEach>

</table>
</body>
</html>