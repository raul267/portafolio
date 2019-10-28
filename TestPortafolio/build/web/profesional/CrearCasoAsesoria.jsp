
<%@page import="DAO.DaoTipoAsesoria"%>
<%@page import="DAO.DaoAsesoria"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Crear Caso Asesoria</title>
        <%@include file="../linkhead.html" %>
    </head>
    <body>
        <%@include file="../menu.jsp" %>
        <section>
            <h1>Crear Caso Asesoria</h1>
            <form method="post" action="/TestPortafolio/AsesoriaController">
                <label>Nombre</label>
                <input type="text" name="nombre"/>

                <label>Tipo</label>
                <%= new DaoTipoAsesoria().combobox("tipo") %>
                
                <label>Descripcion</label>
                <textarea name="descripcion"></textarea>
                
                <br>
                <label><input type="checkbox" name="enterreno"/> En Terreno</label>
                
                <input type="submit" value="Submit">
            </form>
        </section>
        
        
        
    </body>
    <%@include file="../linkfooter.html" %>
</html>
