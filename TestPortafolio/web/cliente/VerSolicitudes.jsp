
<%@page import="DAO.DaoSolicitudCliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ver Solicitudes</title>
        <%@include file="../linkhead.html" %>
    </head>
    <body>
        <%@include file="../menu.jsp" %>
        <section>
            <h3>Ver Solicitudes</h3>
            <form>
                <%= new DaoSolicitudCliente().solicitudesVisita()%>
                <%= new DaoSolicitudCliente().solicitudesAsesoria()%>
                <%= new DaoSolicitudCliente().solicitudesCapacitacion()%>
            </form>
        </section>   
    </body>
    <%@include file="../linkfooter.html" %>
</html>


