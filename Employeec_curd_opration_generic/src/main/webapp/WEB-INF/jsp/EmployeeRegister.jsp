<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script>
$(document).ready(function()
{
    $("#btnSave").click(function()
    {
    	$('#employeeForm').attr('action', 'empRegister.hms');
    	
        
    });
    $("#btnUpdate").click(function()
    {
    	$('#employeeForm').attr('action', 'EmployeeUpdate.hms');   
    });
    $("#btnSearch").click(function()
    	    {
    	    	$('#employeeForm').attr('action', 'EmployeeByName.hms');   
   	});
});
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Registration</title>
</head>
<body>

	<form:form id="employeeForm" method="post" modelAttribute="employee" commandName="employee">
	
		<fieldset>
			<form:input path="empId" type="hidden"/>
			<legend>Employee Registration</legend>
			
			<form:label path="">Employee Name</form:label>
			<form:input path="empName" id="empName" name="EmpName" plceholder="Enter Employee Name" type="text" required=""/>
			<form:errors path="empName" cssClass="error" />
			<br><br>
			<form:label path="">Employee Salary</form:label>
			<form:input path="empSalary" id="empSalary" name="EmpSalary" plceholder="Enter Employee Salary" type="Number" required=""/>
			<form:errors path="empSalary" cssClass="error" />
			
			<c:choose>
				<c:when test="${employee.empId==0}">
						<div>							
							<form:input path="" type="submit" id="btnSave" value="Save" onclick="btnSave()"/>
						</div>	
				</c:when>
					
				<c:otherwise>
						<div>
							<form:input path="" type="submit" id="btnUpdate" value="Update" onclick="btnUpdate()"/>
						</div>
				</c:otherwise>
			</c:choose>
			
			<form:label path="">Employee Name</form:label>
			<form:input path="empNames" id="empNames" name="empNames" plceholder="Enter Employee Name" type="text" required=""/>
			<form:errors path="empNames" cssClass="error" />
			<form:input path="" type="submit" id="btnSearch" value="Search" onclick="btnSearch()"/>
		</fieldset>
		${employeeMsg}
		${maxSalary}
		
			
	</form:form>
	
	<div>
		<section>
		<h1>Employee Records</h1>
		<table id="example" cellspacing="0" width="100%" border="1">
			<thead>
				<tr>
					<th>ID</th>
					<th>FirstName</th>
					<th>LasttName</th>
					<th>Designation</th>	
				</tr>
			</thead>
			<tfoot>
				<tr>
					<th>ID</th>
					<th>FirstName</th>
					<th>LasttName</th>
					<th>Designation</th>
				</tr>
			</tfoot>
			<tbody align="center">
				<c:forEach items="${employeeList}" var="emp" varStatus="row">
					<tr>
						<td>${emp.empId}</td>
						<td>${emp.empName}</td>
						<td>${emp.empSalary}</td>
						<td>
							<a href="EmployeeEdit.hms?empId=${emp.empId}">Edit</a>&nbsp;&nbsp;&nbsp;&nbsp;
							<a href="EmployeeDelete.hms?empId=${emp.empId}">Delete</a>
							<a href="EmployeeMaxSalary.hms?empId=${emp.empId}">Max salary</a>&nbsp;&nbsp;&nbsp;&nbsp;
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		</section>
	</div>
	
	<div>
		<section>
		<h1>Employee Search Records</h1>
		<table id="example" cellspacing="0" width="100%" border="1">
			<thead>
				<tr>
					<th>ID</th>
					<th>FirstName</th>
					<th>LasttName</th>
					<th>Designation</th>	
				</tr>
			</thead>
			<tfoot>
				<tr>
					<th>ID</th>
					<th>FirstName</th>
					<th>LasttName</th>
					<th>Designation</th>
				</tr>
			</tfoot>
			<tbody align="center">
				<c:forEach items="${employeeNameList}" var="emp" varStatus="row">
					<tr>
						<td>${emp.empId}</td>
						<td>${emp.empName}</td>
						<td>${emp.empSalary}</td>
						<td>
							<a href="EmployeeEdit.hms?empId=${emp.empId}">Edit</a>&nbsp;&nbsp;&nbsp;&nbsp;
							<a href="EmployeeDelete.hms?empId=${emp.empId}">Delete</a>
							<a href="EmployeeMaxSalary.hms?empId=${emp.empId}">Max salary</a>&nbsp;&nbsp;&nbsp;&nbsp;
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		</section>
	</div>
</body>
</html>