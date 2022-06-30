<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib uri = "http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>조인(Join) 정보 출력</title>
</head>
<body>

<center> 
	<h2>조인(Join) 정보 출력 </h2>
	<hr> 
	
	<TABLE BORDER = "1" WIDTH = "700" CELLSPACING="0" CELLPADDING="0">
		<TR> 
			<TD>EMPLOYEE_ID</TD>
			<TD>FIRST_NAME</TD>
			<TD>LAST_NAME</TD>
			<TD>EMAIL</TD>
			<TD>PHONE_NUMBER</TD>
			<TD>HIRE_DATE</TD>
			<TD>JOB_ID</TD>
			<TD>SALARY</TD>
			<TD>COMMISSION_PCT</TD>
			<TD>MANAGER_ID</TD>
			<TD>DEPARTMENT_ID</TD>
			<TD>DEPARTMENT_NAME</TD>
			<TD>LOCATION_ID</TD>
			<TD>STREET_ADDRESS</TD>
			<TD>POSTAL_CODE</TD>
			<TD>CITY</TD>
			<TD>STATE_PROVINCE</TD>
			<TD>COUNTRY_ID</TD>
			<TD>START_DATE</TD>
			<TD>END_DATE</TD>
		</TR>
		
		<!-- Loop 시작  -->
		<c:forEach items ="${joinList}" var="join">
		<tr> 
			<td>${join.emps.employee_ID }</td>
			<td>${join.emps.first_Name }</td>
			<td>${join.emps.last_Name }</td>
			<td>${join.emps.email }</td>
			<td>${join.emps.phone_Number }</td>
			<td>${join.emps.hire_Date}</td>
			<td>${join.emps.job_ID }</td>
			<td>${join.emps.salary}</td>
			<td>${join.emps.commission_Pct }</td>
			<td>${join.emps.manager_ID }</td>
			<td>${join.depts.department_ID}</td>
			<td>${join.depts.department_Name}</td>
			<td>${join.depts.location_ID}</td>
			<td>${join.location.street_Address}</td>
			<td>${join.location.postal_Code}</td>
			<td>${join.location.city}</td>
			<td>${join.location.state_Province}</td>
			<td>${join.location.country_ID}</td>
			<td>${join.job.start_Date}</td>
			<td>${join.job.end_Date}</td>
		</tr>
		</c:forEach>
	
	</table>

</center>


</body>
</html>