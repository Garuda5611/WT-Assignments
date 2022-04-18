<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student details</title>
<style>
table, tr, td
{
border: 1px solid black;
}
table
{
margin-left:25%;
width:50%;
}
.cent
{
text-align: center;
}
</style>
</head>
<body style="background:#e4f578;">
<%@page import="java.sql.*"%>
<div class="cent">
<h1>Student Details</h1><br/>
<%
try
{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/wt","root","root");   
	Statement stmt=con.createStatement();
	ResultSet rs=stmt.executeQuery("select * from student");
%>
<table>
<tr style="background-color:#071966;color:#fff;">
<td>Roll No</td>
<td>Name</td>
<td>Address</td>
<td>Percentage</td>
<td>DOB</td>
</tr>
<%
while(rs.next())
{
%>
<tr>
<td><%=rs.getInt(1) %></td>
<td><%=rs.getString(2) %></td>
<td><%=rs.getString(3) %></td>
<td><%=rs.getString(4) %></td>
<td><%=rs.getString(5) %></td>
</tr>
<%
}
}
catch(Exception e)
{
	out.println(e);
}
%>
</table>
</div>
</body>
</html>