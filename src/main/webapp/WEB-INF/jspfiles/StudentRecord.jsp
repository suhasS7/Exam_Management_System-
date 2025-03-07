<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">

</head>
<body>
<nav class="navbar navbar-expand-lg bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Navbar</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav ms-auto">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="index">Home</a>
        </li>
        <li class="nav-item">
         <a class="nav-link" href="register" >Student_register</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="login">LogIn</a>
        </li>
      
      </ul>
    </div>
  </div>
</nav>

<div class="container">
<div class="row">


<h1 class="text-center mb-4">List Of Student</h1>
<table class="table table-striped">
<thead class="">
	<tr>
		<th>Student Email</th>
		<th>Student First_name</th>
		<th>Student Last_name</th>
		<th>Student Pass</th>
		<th>Student Gender</th>
		<th>Student Type</th>
		<th>Action</th>
	</tr>
</thead>
<tbody>
<c:forEach items="${Users}" var="m">
	<tr>
		<td  class="text-primary" >${m.email}</td>
		<td >${m.first_name}</td>
		<td  >${m.last_name}</td>
		<td  >${m.password}</td>
		<td  >${m.gender}</td>
		<td> ${m.userType}</td>
		<td><button type="button" class="btn btn-danger"><a href="updateuser?id=${m.email } " class="text-center link-light text-decoration-none">Update </a></button> 
		<button type="button" class="btn btn-dark"><a href="submitscore?id=${m.email}" class="text-center link-light text-decoration-none">Result </a></button></td>
	</tr>
	</c:forEach>
</tbody>
</table>
</div>
</div>






<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>

</body>
</html>