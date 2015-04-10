<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="UTF-8" >
<title>Sitio | Login</title>
</head>
<body>
<core:url value="menu" var="urlInicioDeSesion" />
 <h1>Inicio de sesion</h1>
 <h3><core:out value="${titulo}" /></h3>
  
  <form action="${urlInicioDeSesion}"  method="post">
	  <div>
	    <label>Usuario</label>
	    <input type="text" name="usuario" />
	  </div>	  
	  <div>
	    <label>Contraseña</label>
	    <input type="text" name="pass" />
	  </div>
	  <input type="submit" value="Iniciar sesión"/>
  </form>
</body>
</html>