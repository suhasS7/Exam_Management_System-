<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" rel="stylesheet">
</head>
 <style>
  .textcolor{
  color:#d37aff;
  }
  .back{
  background-color:#d37aff;
  }
  </style>
<body>
<nav class="navbar navbar-expand-lg transparent">
  <div class="container-fluid">
    <a class="navbar-brand textcolor" href="#">Exam</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav ms-auto">
        <li class="nav-item">
          <a class="nav-link textcolor" aria-current="page" href="index">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link textcolor" href="register">Student_register</a>
        </li>
        <li class="nav-item">
          <a class="nav-link textcolor" href="login">LogIn</a>
        </li>
      </ul>
    </div>
  </div>
</nav>
<div class="container py-5">
  <div class="row">
    <div class="col-4 mx-auto">
    </div>
    <div class="col-4 text-center">
      <div class="card shadow">
        <div class="card-body">
          <h5 class="card-title border-bottom pb-3 fs-2 textcolor">Login <i class="fas fa-sign-in-alt"></i></h5>
           <b><%@ include file="Messageprint.jsp"%></b>
          <img src="https://static.vecteezy.com/system/resources/previews/000/351/681/original/vector-graduation-cap-icon.jpg" alt="Placeholder" class="img-fluid rounded-circle border-1" height="150" width="150">
          <form action="checkuser" method="post">
            <div class="row mb-3 pt-3">
              <div class="col-sm-10 mx-auto">
                <input type="email" name="email" class="form-control" id="inputEmail3" placeholder="Enter email" required>
              </div>
            </div>
            <div class="row mb-3">
              <div class="col-sm-10 mx-auto">
                <input type="password" name="pass" class="form-control" id="inputPassword3" placeholder="Enter password" required>
              </div>
            </div>
            <button type="submit" class="btn back text-light text-center py-2 rounded-5 px-5" value="Login Here">Log in <i class="fas fa-sign-in-alt"></i></button>
          </form>
        </div>
      </div>
    </div>
    <div class="col-4 mx-auto">
    </div>
  </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</body>
</html>

<!-- <div class="container-fluid " style="background-color:#dff8ff">
<div class="row">
<div class="col-6 mx-auto">
	<img src="https://cdn-icons-png.flaticon.com/512/1946/1946032.png" alt="image not found" class="rounded mx-auto d-block">
</div>
<div class="col-6 mx-auto">
<h1 class="text-center pt-2 mt-5"><b>Student & Admin Login</b></h1>
<form action="checkuser" method="post" class="row mt-4">
<div class="col-3"></div>
<div class="col-6">
Email: <input type="email" name="email"><br><br>
</div>
<div class="col-3"></div>
<div class="col-3"></div>
<div class="col-6">
Password: <input type="password" name="pass"><br><br>
</div>
<div class="col-3"></div>
<div class="col-3"></div>
<div class="col-6">
<input type="submit" value="Login Here">
</div>
<div class="col-3">
</div>
</div>
</div> -->