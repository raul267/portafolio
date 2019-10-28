<%@page import="java.util.Date"%>
<%@page import="DAO.DaoEmpresaCliente"%>
<%@page import="model.EmpresaCliente"%>
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
        <title>Solicitar Capacitacion</title>
        <%@include file="../linkhead.html" %>
    </head>
    <body>
        <%@include file="../menu.jsp" %>
        
        <section>
            <form action="/TestPortafolio/CapacitacionController" method="POST">
                <h1><%=e.getNombre() %></h1>
                <h3>Solicitar Capacitacion</h3>

                <label>Fecha</label>
                <input type="date"/>

                <label>Capacitacion</label>
                <select>
                    <option>Capacitacion</option>
                </select>

                <label>Observacion</label>
                <textarea rows="4" cols="50" name="observacion" placeholder="Descripcion..."></textarea>

                <br>
                <input type="submit" value="Submit"/>
            </form>
        </section>
        
    </body>
    <%@include file="../linkfooter.html" %>
</html>
