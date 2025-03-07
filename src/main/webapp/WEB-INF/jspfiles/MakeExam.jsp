<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
  </head>
  <body>
  
   <div class="container">
   <div class="row">
   <div class="col-12">
   <form action="makeexam" method="post">
   <div class="row">
   <div class="col-6">
   
     <div class="row mb-3">
    <label for="inputEmail3" class="col-sm-2 col-form-label">Question</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputEmail3" name="id">
    </div>
  </div>
   <div class="row mb-3">
    <label for="inputEmail3" class="col-sm-2 col-form-label">Subject</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputEmail3" name="sub">
    </div>
  </div>
  <div class="row mb-3">
    <label for="inputEmail3" class="col-sm-2 col-form-label">Option1</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputEmail3" name="ans1">
    </div>
  </div>


   <div class="row mb-3">
    <label for="inputEmail3" class="col-sm-2 col-form-label">Option2</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputEmail3" name="ans2">
    </div>
  </div>
    <div class="row mb-3">
    <label for="inputEmail3" class="col-sm-2 col-form-label">Option3</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputEmail3" name="ans3">
    </div>
  </div>
      <div class="row mb-3">
    <label for="inputEmail3" class="col-sm-2 col-form-label">Option4</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputEmail3" name="ans4">
    </div>
  </div>
   <div class="row mb-3">
    <label for="inputEmail3" class="col-sm-2 col-form-label">Answer</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputEmail3" name="real">
    </div>
  </div>
  
  
  <button type="submit" class="btn btn-primary">Make</button>
  
   
  
   </form>
     </div>
   </div>
   </div>
   </div>
    
    
    
    
    
    
    
    
    
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
  </body>
</html>