<%-- 
    Document   : PlanificarVisita
    Created on : 22-10-2019, 16:35:30
    Author     : 56942
--%>

<%@page import="DAO.DaoEmpresaCliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Planificar Visita</title>
        <%@include file="../linkhead.html" %>
    </head>
    <body>
        <%@include file="../menu.jsp" %>
        <h1>Planificar Visita</h1>
        <section>
	<form method="post">
	<h3>Planificar Visita</h3>
	
	<label>Fecha</label>
	<input type="date" name="fecha" required/>
	<br>

	<label>Hora</label>
	<input type="time" name="hora" value="00:00">
	<br>

	<label>Empresa Cliente</label>
        <%= new DaoEmpresaCliente().combobox("empresaCliente") %>
	<br>

	<label>Descripcion</label>
	<textarea name="descripcion"></textarea>
	<br>

	<input type="submit" value="Solicitar a Cliente"/>

	</form>
</section>
    </body>
    <%@include file="../linkfooter.html" %>
</html>
