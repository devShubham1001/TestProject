<%@ page import="java.util.ArrayList ,com.skilrock.bean.RegistrationBean" %> 
<%
ArrayList<RegistrationBean> ar=(ArrayList<RegistrationBean>)request.getAttribute("ar");
%>


<html>
<head>
<script type="text/javascript" src="${pageContext.request.contextPath}/JavaScript/Functions.js"></script>
</head>
<table>
<thead>
<tr>
<th> Name  </th>
<th> Gender  </th>
<th> Address </th>
<th> Email </th>
<th> Language  </th>
<th> Phone </th>
<th> UserID </th>
<th> UserPassword </th>
</tr>
</thead>
<br>
<tbody>
<h3>Data Fetched from Database</h3>



<% for(RegistrationBean bn:ar)
{
	%>
	<tr>
	
	<td> <center><%=bn.getName() %></center></td>
	<td> <center><%=bn.getGender() %></center></td>
	<td> <center><%= bn.getAddress() %></center></td>
	<td> <center><%= bn.getEmail() %></center></td>
	<td> <center><%= bn.getPhone() %></center></td>
	<td> <center><%=bn.getLanguagee() %></center></td>
	<td> <center><%= bn.getUserId()%></center></td>
	<td> <center><%= bn.getUserpassword()%></center></td>
	
	</tr>
	
	<br>
	
<% }%>

</tbody>
</table>
<html>

