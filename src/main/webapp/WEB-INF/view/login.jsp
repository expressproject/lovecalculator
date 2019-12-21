<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body>
	<form:form action="${pageContext.request.contextPath}/processLogin" method="POST" >
		<p>
			<label id="userName">User Name</label>
			<input type="text" id="userName" path="username" />

		</p>

		<p>
			<label id="password">User Name</label>
			<input type="password" id="password" path="password" />
		</p>
		<input type="submit" value="sign in">
	</form:form>
</body>
</html>