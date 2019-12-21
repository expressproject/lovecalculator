
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

  <form:form action="process-form" method="post" modelAttribute="userData">
  <h2 align="center">Love Calculator 
  </h2>
  <hr/>
  <p align="right">
    <a href="/logout">Logout</a>
  <p>
  <label id = name>Your Name:</label>
  <form:input path="userName"/>
  </p>
  
  <p>
  <label id = name>Crush Name:</label>
  <form:input path="curshName"/>
  </p>
  
  <input type ="submit" value="calulate">

 </form:form>
  
  
</body>
</html>