<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<script type="text/javascript" src="${pageContext.request.contextPath}/JavaScript/Functions.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration Form</title>
</head>
<body>
<h2>User Registration Form</h2>
<br>
<form name="registration" action="registration" method ="post" onsubmit="return registrationformValidate()">

First Name &emsp;&emsp;<input type="text" name="uname">
<br>
Gender &nbsp;&nbsp;&emsp;&emsp;&emsp;<input type="radio" name="gender" value="male" checked="checked">Male <br>
       &nbsp;&nbsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;<input type="radio" name="gender" value="female">Female <br>
       
Address &emsp;&emsp;&emsp;&nbsp;<input type="text" name="uaddress"><br>

Email &emsp;&emsp;&emsp;&emsp;&nbsp;&nbsp;<input type="email" name="umail"><br>

Languages &emsp;&emsp;<input type="checkbox" class="messageCheckbox" name="languages" value="English">English<br>
		  &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&nbsp;&nbsp;&nbsp;<input type="checkbox" class="messageCheckbox" name="languages" value="Hindi">Hindi<br>	

Phone No. &emsp;&emsp;<input type="text" name="uphone" pattern="[789][0-9]{9}"><br>       

User ID &nbsp;&emsp;&emsp;&emsp;<input type="text" name="uid"><br>

password &emsp;&emsp;  <input type="password" name="upass"><br>
<br>

<input type="submit" value="Submit">

<br>
<br>
 <a href="show">Retrieve data</a> 


 
 



</form>


</body>
</html>