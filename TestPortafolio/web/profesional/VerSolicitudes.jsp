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
	
    
        <h1>Visualizar Actividades</h1>
    
            <select>
		<option>Pendiente</option>
		<option>Confirmada</option>
		<option>Rechazada</option>
		<option>Realizada</option>
            </select>
            <table border="1px">
                <tr> <th> Ver                      </th><th> Tipo  </th> <th> Fecha      </th> <th> Hora  </th> <th> Confirmacion Cliente</th> <th> Confirmacion Profesional</th> <th> Estado    </th> </tr>
                <tr> <td><a href="#">Visualizar</a></td><td> Asesoria </td> <td> 20/10/2019 </td> <td> 22:00 </td> <td> OK      </td> <td> <input type="button" value="Aceptar"/> <input type="button" value="Rechazar"/></td><td> PENDIENTE </td>
                <tr> <td><a href="#">Visualizar</a></td><td> Capacitacion </td> <td> 20/10/2019 </td> <td> 22:00 </td> <td> OK      </td> <td> <input type="button" value="Aceptar"/> <input type="button" value="Rechazar"/></td><td> PENDIENTE </td>
                <tr> <td><a href="#">Visualizar</a></td><td> Visita </td> <td> 20/10/2019 </td> <td> 22:00 </td> <td> OK      </td> <td> <input type="button" value="Aceptar"/> <input type="button" value="Rechazar"/></td><td> PENDIENTE </td>
                <tr> <td><a href="#">Visualizar</a></td><td> A-C-V </td> <td> 20/10/2019 </td> <td> 22:00 </td> <td> OK      </td> <td> <input type="button" value="Aceptar"/> <input type="button" value="Rechazar"/></td><td> PENDIENTE </td>
	    </table>
        </section>
</body>
    <%@include file="../linkfooter.html" %>
</html>
