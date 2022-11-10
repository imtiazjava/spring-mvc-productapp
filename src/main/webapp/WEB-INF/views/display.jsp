<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
         
        
		<h2>PRODUCT LIST</h2>
		<table border="2" width="70%">
			<tr>
				<td>PRODUCTID</td>
				<td>PRODUCTNAME</td>
				<td>PRODUCTPRICE</td>
				<td>DELETE</td>
				
			</tr>
			<c:forEach var="product" items="${list}">
			  <tr>
			       <td>${product.pid}</td>
			       <td>${product.pname}</td>
			       <td>${product.price}</td>
			       <td><a href="delete/${product.pid}">DELETE</a></td>
			       
			  </tr>
			</c:forEach>
		
		</table>  
		<hr/>
		<a href="./">ADD NEW PRODUCT</a>
</body>
</html>