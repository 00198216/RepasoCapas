<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Main</title>
</head>
<body>
<h1>${Message}</h1><br>

   <form  name="show"   action="${pageContext.request.contextPath}/Show" method="post">
             
           
           <input TYPE="Submit"   VALUE="Mostrar Todos"> 
           
           </form>
 <br>

<form:form action="${pageContext.request.contextPath}/Guardar" method="post" modelAttribute="ContribuyenteDTO">

      <label>Nombre</label>
      <form:input type="text" path="Name"/>
      <form:errors path="Name" cssStyle="color:#E81505;"></form:errors><br>
      
      
       <label>Apellido</label>
      <form:input type="text" path="Lname"/>
       <form:errors path="Lname" cssStyle="color:#E81505;"></form:errors><br>
      
       <label>NIT</label>
      <form:input type="text" path="Nit"/>
      <form:errors path="Nit" cssStyle="color:#E81505;"></form:errors><br>
      
      <form:select path="importancia" name="importancia">
                   <c:forEach items="${importancia}" var="importancia">
                   <option value="${importancia.claveI}">${importancia.nivel}</option>
                   </c:forEach>
      </form:select><br><br>
      
      
      <input type="Submit" value="Guardar">
      
</form:form>
</body>
</html>