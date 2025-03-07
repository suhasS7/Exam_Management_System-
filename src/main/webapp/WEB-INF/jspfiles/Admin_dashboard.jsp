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
<div class="col-4 mt-5">
<div class="card" style="width: 18rem;">
  <div class="card-body">
    <h5 class="card-title"><i class="bi bi-filetype-doc"></i>List Of Student</h5>
    <h6 class="card-subtitle mb-2 text-muted">All Student List who Registered</h6>
    <p class="card-text">Only for Admin</p>
  <a href="StudentRecord">Click</a>
  </div>
</div>
</div>

<div class="col-4 mt-5">
<div class="card" style="width: 18rem;">
  <div class="card-body">
    <h5 class="card-title"><i class="bi bi-filetype-doc"></i>Make Exam</h5>
    <h6 class="card-subtitle mb-2 text-muted">Java Exam</h6>
    <p class="card-text">Java Exam For Student</p>
  <a href="MakeExam">Make Exam</a>
  </div>
</div>
</div>

</div>
</div>





<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>

</body>
</html>