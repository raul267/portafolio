
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Crear Capacitacion</title>
        <%@include file="../linkhead.html" %>
    </head>
    <body>
        <%@include file="../menu.jsp" %>
        <section>
            <h1>Crear Capacitacion</h1>
            <form method="post" action="/TestPortafolio/CapacitacionController">
                <label>Nombre</label>
                <input type="text" name="nombre" required/>

                <label>Cantidad Asistentes</label>
                <input type="number" name="cantidad_asistentes" min="1" required/>
                
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
