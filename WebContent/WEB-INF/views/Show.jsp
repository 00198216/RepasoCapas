<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show</title>
</head>
<body>
<div >

 <table border="1" >
       <tr>
           <th>Nombre</th>
           <th>Apellido</th>
           <th>Nit</th>
           <th>Importancia</th>
           <th>Fecha</th>
           
       </tr>
       
    
       <c:forEach items="${cont}" var="cont">
         <tr>
           <th>${cont.nombre}</th>
           <th>${cont.apellido}</th>
           <th>${cont.nit}</th>
           <th>${cont.level.nivel}</th>
           <th>${cont.fechaDelegate}</th>
           
       </tr>
       </c:forEach>
       
  </table>


</div>
</body>
</html>