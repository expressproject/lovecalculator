<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Love Calculator</h1>
<h2>The Love Calculator Predicts</h2>
 <p>It's ${userData.result}</p>

 <a href="email">email to a friend</a>
 <a href="userHistory">User History</a>
 <!--  
 <c:url value="/email" var = "emailUrl">
  <c:param name="userName" value =  "${userData.userName}" />
  <c:param name="curshName" value = "${userData.curshName}" />
  <c:param name="curshName" value = "${userData.result}" />
 </c:url>
 
 <c:import url="/email"></c:import>
 -->
</body>
</html>