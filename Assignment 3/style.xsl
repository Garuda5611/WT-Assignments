<?xml version="1.0" encoding="ISO-8859-1"?>
<html xsl:version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
xmlns="http://www.w3.org/1999/xhtml">
<head>
<style>
table
{
width:50%;
margin-left:30%;
font-size: 30px;
}
.center {
  padding: 70px 0;
  border: 3px solid green;
  text-align: center;
}
</style>
</head>
<body style="background-color:#9ee05c;">
<div class="center">
<h1>Faculty Details</h1>
<table border="1">
<tr style="background-color:navy;color:white">
<th align="left">ID</th>
<th align="left">Name</th>
<th align="left">Class</th>
</tr>
<xsl:for-each select="teacherlist/teacher">
<xsl:sort select="id"/>
<tr>
<td>
<xsl:value-of select="id"/>
</td>
<td>
<xsl:value-of select="name"/>
</td>
<td>
<xsl:value-of select="class"/>
</td>
</tr>
</xsl:for-each>
</table>
</div>
</body>
</html>