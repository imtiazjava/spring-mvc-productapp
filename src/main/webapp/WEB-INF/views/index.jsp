<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
<html>
<body>
<h2>WELCOME TO HOME PAGE</h2>
<hr/>
<form:form action="store" method="post" modelAttribute="student">
 <table>
 		<tr>
 			<td>PRODUCT ID:</td>
 			<td>
 				<form:input path="pid"/>
 			</td>
 		</tr>
 		
 		<tr>
 			<td>PRODUCT NAME:</td>
 			<td>
 				<form:input path="pname"/>
 			</td>
 		</tr>
 		<tr>
 			<td>PRODUCT PRICE:</td>
 			<td>
 				<form:input path="price"/>
 			</td>
 		</tr>
 		<tr>
 			<td></td>
 			<td>
 				<input type="submit" value="STORE"/>
 			</td>
 		</tr>
 		
 		
 </table>

</form:form>
    
</body>
</html>

