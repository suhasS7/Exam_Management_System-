<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
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
<form method="post" action="${pageContext.request.contextPath}/index1/submit">
    <ol type="1">
        <input type="hidden" name="emid" value="${id}">
        <c:forEach var="question" items="${questions}">
            <li>${question.content}
                <input type="hidden" name="questionId" value="${question.id}">
                <ol type="a">
                    <c:forEach var="answer" items="${question.answer}">
                        <li>
                            <input type="radio" name="question_${question.id}" value="${answer.id}">
                            ${answer.content}
                        </li>
                    </c:forEach>
                </ol>
            </li>
        </c:forEach>
    </ol>
    <br>
    <input type="submit" value="Submit">
</form>
</body>
</html>