<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<style>
     .textcolor{
  color:#d37aff;
  }
  .back{
  background-color:#d37aff;
  }

    .card {
        border-radius: 15px;
        border: none;
        box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
    }

    .card-title {
        font-weight: bold;
       
    }

    .form-control {
        border-radius: 10px;
    }

    .btn-primary {
        border-radius: 10px;
        padding: 10px 30px;
        font-weight: bold;
    }

  

  
    .form-group {
        display: flex;
        align-items: center;
    }

    .form-group label {
        flex: 0 0 30%;
        margin-bottom: 0;
    }

    .form-group .input-group {
        flex: 1;
    }

    .form-group .input-group-prepend {
        flex: 0 0 auto; 
    }

    .form-group input,
    .form-group select {
        width: 100%; 
    }
</style>
</head>
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
          <a class="nav-link  textcolor " aria-current="page" href="index">Home</a>
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
        <div class="col-4 mx-auto"></div>
        <div class="col-4 text-center">
            <div class="card shadow">
                <h5 class="card-title border-bottom pb-3 fs-2 textcolor">Register Form</h5>
                <div class="card-body">
                <b><%@ include file="Messageprint.jsp"%></b>
                    <form action="insertUser" method="post">
                        <div class="form-group">
               
                            <label for="inputEmail3">Email</label>
                            <div class="input-group">
                                <div class="input-group-prepend">
                                    <span class="input-group-text"><i class="fas fa-envelope"></i></span>
                                </div>
                                <input type="email" class="form-control" id="inputEmail3" name="email" required>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="Name">First Name</label>
                            <div class="input-group">
                                <div class="input-group-prepend">
                                    <span class="input-group-text"><i class="fas fa-user"></i></span>
                                </div>
                                <input type="text" class="form-control" id="Name" name="First_name" required>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="Name">Last Name</label>
                            <div class="input-group">
                                <div class="input-group-prepend">
                                    <span class="input-group-text"><i class="fas fa-user"></i></span>
                                </div>
                                <input type="text" class="form-control" id="Name" name="Last_name" required>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputState">Gender</label>
                            <div class="input-group">
                                <div class="input-group-prepend">
                                    <span class="input-group-text"><i class="fas fa-venus-mars"></i></span>
                                </div>
                                <select id="inputState" class="form-select form-control" name="gender" required>
                                    <option value="Male">Male</option>
                                    <option value="Female">Female</option>
                                    <option value="Others">Others</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputPassword4">Password</label>
                            <div class="input-group">
                                <div class="input-group-prepend">
                                    <span class="input-group-text"><i class="fas fa-lock"></i></span>
                                </div>
                                <input type="password" class="form-control" id="inputPassword4" name="pass" required>
                            </div>
                        </div>
                        <button type="submit" class="btn back text-light">Register</button>
                    </form>
                </div>
            </div>
        </div>
        <div class="col-4 mx-auto"></div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>

</body>
</html>

<!--  <form action="insertUser" method="post">
Email : <input type="email" name="email" required ><br><br>
First_Name : <input type="text" name="First_name"><br><br>
Last_name: <input type="text" name="Last_name"><br><br>
gender:
<select name="gender" required>
<option value="Male"> Male </option>
<option value="Female"> Female </option>
<option value="Others"> Others </option>
</select><br><br>

password: <input type="password" name="pass" required><br><br>

<input type="submit" value="Click here to Register">
</form>
 -->