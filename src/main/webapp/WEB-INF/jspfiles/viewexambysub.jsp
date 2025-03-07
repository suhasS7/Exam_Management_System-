<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" rel="stylesheet">
<style>
    body {
        font-family: Arial, sans-serif;
        background-color:lightGrey;
    }

    h3 {
        text-align: center;
    }

    form {
        max-width: 600px;
        margin: 0 auto;
    }

   

    ol li {
        margin-bottom: 10px;
    }

    ol li:before {
       
        font-weight: bold;
    }

    ol ol li {
        list-style-type: lower-alpha;
    }

    input[type="submit"] {
        display: block;
        margin: 20px auto;
        padding: 10px 20px;
        font-size: 16px;
        color: black;
        border: none;
        border-radius: 5px;
        
    }

    input[type="radio"] {
        margin-right: 10px;
    }
</style>
</head>
<body>
<h3>Quiz <i class="fas fa-question-circle"></i></h3>
	
	<form action="scorefetch">
	 <ol type="1">
	 <input type="hidden" name="emid" value="${email}">
	
	<c:forEach var="q" items="${exam}">
        
        <br>
      <li> <label for="html">${ q.question}</label>
       <input type="hidden" name="qid" value="${q.questionid}">
		<br></li>
	 <ol type="a">
	 <li>
		<input type="radio" name="que${q.questionid}" id="html" value="${q.opt1}">${q.opt1}</li>
		<li><input type="radio" name="que${q.questionid}" id="html" value="${q.opt2}">${q.opt2}</li>
		<li><input type="radio" name="que${q.questionid}" id="html" value="${q.opt3}">${q.opt3}</li>
	<li>	<input type="radio" name="que${q.questionid}" id="html" value="${q.opt4}">${q.opt4}</li>
	<br>
	
	</ol>


	</c:forEach>
	</ol>
	<input type="submit" value="submit">
	
	</form>



</body>
</html>