<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name="userForm" method="post" action="/login" modelAttribute="adminupdate">
    User Name : <input type="text" name="userName"/> <br/>
    Password : <input type="text" name="password"/> <br/> 
    <input type="submit" value="Login" />
</form>
</body>
</html>