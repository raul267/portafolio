<%-- 
    Document   : VerServicio
    Created on : 22-10-2019, 2:37:26
    Author     : 56942
--%>

<%@page import="DAO.DaoServicio"%>
<%@page import="DAO.DaoEmpresaCliente"%>
<%@page import="model.EmpresaCliente"%>
<%  
    Usuario u = (Usuario)session.getAttribute("usuario");
    EmpresaCliente e = new DaoEmpresaCliente().obtener(u);
    
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ver Servicio</title>
        
<%@include file="../linkhead.html" %>
    </head>
    <body>
        <%@include file="../menu.jsp" %>
        <section>
            <h1><%=e.getNombre()%></h1>
            <h3>Ver Servicio</h3>
            <%= new DaoServicio().exportToHtml(e)%>
        </section>
    </body>
    
    <%@include file="../linkfooter.html" %>
</html>
