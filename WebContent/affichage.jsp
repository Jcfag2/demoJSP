<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Traitement</title>
</head>
<body>


<h2>Bonjour, ${param['name']} !</h2>
<c:if test="${param['email1'] ne param['email2']}">
	<h4>Les emails ne sont pas les mêmes!</h4>
</c:if>

<c:forEach begin="1" end="10" var="i" varStatus="st">
	<li>item : ${i }</li>
</c:forEach>


</body>
</html>