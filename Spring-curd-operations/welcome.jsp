<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html>
<body>
	
		<br><br><br><br><br>
		<table border="1">
			<tr>
				<td class="heading">User Id</td>
				<td class="heading">Name</td>
				<td class="heading">Addres Name</td>
				<td class="heading">Age</td>
				<td class="heading">Salary</td>
				<td class="heading">Edit</td>
				<td class="heading">Delete</td>
			</tr>
			<c:forEach var="list1" items="${list}">
				<tr>
					<td>${list1.id}</td>
					<td>${list1.name}</td>
					<td>${list1.address}</td>
					<td>${list1.age}</td>
					<td>${list1.salary}</td>
					<td><a href="edit.htm?id=${list1.id}">Edit</a></td>
					<td><a href="delete.htm?id=${list1.id}">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
		
	
</body>
</html>
