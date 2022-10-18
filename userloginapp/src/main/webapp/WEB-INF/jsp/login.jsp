<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>

	<form name="userForm" method="post" action="/login" modelAttribute="logindetails">
    User Name : <input type="text" name="userName"/> <br/>
    Password : <input type="text" name="password"/> <br/> 
    <input type="submit" value="Login" />
    <input type="submit" value="Create" href="registerform"/>
</form>

</body>
</html>