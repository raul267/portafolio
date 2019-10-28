
<%@page import="DAO.DaoAsesoria"%>
<%@page import="DAO.DaoEmpleadoCliente"%>
<%@page import="DAO.DaoAccidente"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="DAO.DaoEmpresaCliente"%>
<%@page import="model.EmpresaCliente"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%  
    
    Date date = new Date();
    
    Usuario u = (Usuario)session.getAttribute("usuario");
    EmpresaCliente e = new DaoEmpresaCliente().obtener(u);
    
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Solicitar Asesoria</title>
        <%@include file="../linkhead.html" %>
    </head>
    <body>
        <%@include file="../menu.jsp" %>
        
            <section>
            <form action="/TestPortafolio/AsesoriaController" method="POST">
                <h1><%=e.getNombre() %></h1>
                <h3>Solicitar Asesoria</h3>
                <label>Fecha</label>
                <input type="date"/>
                <label>Tipo</label>
                <select>
                    <option>Asesoria</option>
                </select>
                <label>Descripcion</label>
                <textarea rows="4" cols="50" name="" placeholder="Descripcion..."></textarea>
                <label>Enterreno</label>
                <input type="radio"/>
                <br>
                <input type="submit" value="Submit"/>
            </form>
        </section>
    
    </body>
    <%@include file="../linkfooter.html" %>
</html>
