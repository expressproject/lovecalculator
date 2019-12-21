<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

 <script type="text/javascript">
function deleteAlert(){
alert("Record deleted..");
} 
</script> 

</head>
<body>

 
   <p> lc id ${id} </p>
     <c:if test="${id != null}">
       <script type="text/javascript">
       deleteAlert();
       </script>
     </c:if>
   

  <!-- write a for loop for iterate over the model -->
  <table border="1">
  <tr>
  <td>User Name</td>
  <td>Crush Name</td>
  <td>Result</td>
  </tr>
 

        
  <c:forEach var="tempUser"  items="${userHistory}">
  
     <c:url var="loadDeleteLink" value="deleteRecord">
            <c:param name="command" value="load"/>
            <c:param name="id" value="${tempUser.lcId}"/>
        </c:url>
  
   <tr>  
      <td> ${tempUser.userName} </td>
      <td> ${tempUser.curshName} </td>
      <td> ${tempUser.result} </td>
       <td> ${tempUser.lcId} </td>
      <td> <a href="${loadDeleteLink}">delete</a> </td>
   </tr>
  </c:forEach>
  </table>
</body>
<!--  <script type="text/javascript"> window.onload = alertName; </script> -->
</html>
