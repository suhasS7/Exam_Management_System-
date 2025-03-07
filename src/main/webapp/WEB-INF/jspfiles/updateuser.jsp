<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="updateuserdetails" method="post">
Email : <input type="email" name="email" required value="${user.email}" ><br><br>
First_Name : <input type="text" name="First_name" value="${user.first_name}"><br><br>
Last_name: <input type="text" name="Last_name" value="${user.last_name}"><br><br>
gender:
<select name="gender" required value="${user.gender}">
<option value="Male"> Male </option>
<option value="Female"> Female </option>
<option value="Others"> Others </option>
</select><br><br>
password: <input type="password" name="pass" required value="${user.password}"><br><br>

<input type="submit" value="Click here to Register">
</form>

</body>
</html>