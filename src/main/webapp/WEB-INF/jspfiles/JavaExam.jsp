<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h3>Quiz</h3>
	<form  method="post" action="${pageContext.request.contextPath }/index1/submit">
	<ol type="1">
	<input type="hidden" name=emid value=${id }>
	<c:forEach var="question" items="${questions }">
	<li> ${question.content }
		<input type="hidden" name="questionId" value="${question.id }">
		<ol type="a">
		<c:forEach var="answer" items="${question.answer }">
		
			<li>
			<input type="radio" name="question_${question.id }" value="${answer.id }">
			${answer.content }
			</li>
		</c:forEach>
		
		</ol>
	 </li>
	
	</c:forEach>
	</ol>
	<br>
	<input type="submit" value="submit">
	</form>
</body>
</html>