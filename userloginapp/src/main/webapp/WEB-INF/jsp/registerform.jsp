<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> New User Form</title>
<style>

</style>
</head>
<body>
<h2>Enter User data: </h2>
<form name="register" method="post" action="/addUser" modelAttribute="userlogin">
    User Name: <input type="text" name="userName"/> <br/>
    User Password: <input type="text" name="password"/> <br/> 
    User First Name: <input type="text" name="firstName"/> <br/>
    User Last Name: <input type="text" name="lastName"/> <br/>
    User Email: <input type="text" name="email"/> <br/>
    User Mobile: <input type="text" name="mobile"/> <br/>
    <input type="submit" value="Create User" />
</form>

</body>
</html>