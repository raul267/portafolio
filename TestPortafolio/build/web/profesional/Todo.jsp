<%@page import="DAO.DaoAsesoria"%>
<%@page import="DAO.DaoEmpresaCliente"%>
<%@page import="DAO.DaoTipoAsesoria"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profesional</title>

        <%@include file="../linkhead.html" %>
    </head>
    <body>
        <%@include file="../menu.jsp" %>
     
    <h1>PROFESIONAL</h1>
    <hr>
    
    
    <!-- Crear Casos Asesoria, Capacitacion, Visita -->
    
    <section>
        <form method="post" action="/TestPortafolio/AsesoriaController">
	<h3>Crear Caso Asesoria</h3>
	<label>nombre</label>
	<input type="text" name="nombre" />
	<br>

	<label>tipo</label>
        <%= new DaoTipoAsesoria().combobox("tipo") %>        
	<br>

	<label>descripcion</label>
	<textarea name="descripcion"></textarea>
	<br>

	<label>En terreno
	<input type="checkbox" name="enterreno"/>
	</label>
        <br>

	<input type="submit" value="Agregar"/>
	</form>
    </section>

        
    <hr>
        
        
    <section>
	<form method="post">
	<h3>Crear Caso Visita</h3>
	<label>nombre</label>
	<input type="text" name="nombre" />
	<br>

	<label>Tipo</label>
        <%= new DaoTipoAsesoria().combobox("tipo") %>        
	<br>

	<label>Descripcion</label>
	<textarea name="descripcion"></textarea>
	<br>

	<label>En terreno
	<input type="checkbox" name="enterreno"/>
	</label>
        <br>

	<input type="submit" value="Agregar"/>
	</form>
    </section>
    
    <hr>           
        
        
        
        
<section>
	<form method="post" action="/TestPortafolio/CapacitacionController">
	<h3>Crear Caso Capacitacion</h3>
	
	<label>Nombre</label>
	<input type="text" name="nombre" />
	<br>

	<label>Descripcion</label>
	<textarea name="descripcion"></textarea>
	<br>

	<label>Cantidad Asistentes</label>
	<input type="number" min="1" />
	<br>

	<label>En terreno</label>
	<input type="checkbox" name="enterreno"/>
	<br>

	<label>Materiales</label><br>
	<input type="checkbox" name="material1"/> UNIFORME <br>
	<input type="checkbox" name="material2"/> PC <br>
	<input type="checkbox" name="material3"/> NOTEBOOK <br>
	
	<br>
	
	<input type="submit" value="Ingresar Caso Capacitacion"/>

	</form>
</section>
<hr>

<section>
	<form method ="post">
	<h3>Revisar Cliente</h3>

	<label>Cliente</label>
        <%= new DaoEmpresaCliente().combobox("empresaCliente") %>
	<br>
	
	<h4>Servicio</H4>
	<label>cantidad de visitas</label>
	<input type="number" value="2" disabled/><br>
	<label>cantidad de asesorias</label>
	<input type="number" value="1" disabled/><br>
	<label>cantidad de capacitacion</label>
	<input type="number" value="0" disabled/><br>
	<label>estado check list</label>
	<input type="text" value="Realizado" disabled/><br>

	<h4>Informe Check List</h4>
	
	<h4>Pago</h4>

	</form>
</section>
<hr>
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
<hr>

<section>
	<form method="post">
	<h3>Ingresar Asesoria (FACT)</h3>
	
	<label>Fecha</label>
	<input type="date" name="fecha" required/>
	<br>

	<label>Hora</label>
	<input type="time" name="hora" value="00:00">
	<br>

	<label>Empresa Cliente</label>
        <%= new DaoEmpresaCliente().combobox("empresaCliente") %>
	<br>

	<label>Asesoria</label>
	<%= new DaoAsesoria().combobox("tipo") %>        
	
	<br>

	<label>Servicio</label>
	<select name="servicio_cliente">
		<option>Servicio Actual</option>
	</select>	
	<br>

	<input type="submit" value="Ingresar Cliente"/>

	</form>
</section>
<hr>




<section>
	<form method="post">
	<h3>Crear Capacitacion</h3>
	
	<label>Nombre</label>
	<input type="text" name="nombre" />
	<br>

	<label>Descripcion</label>
	<textarea name="descripcion"></textarea>
	<br>

	<label>Cantidad Asistentes</label>
	<input type="number" min="1" />
	<br>

	<label>En terreno</label>
	<input type="checkbox" name="enterreno"/>
	<br>

	<label>Materiales</label><br>
	<input type="checkbox" name="1"/> UNIFORME <br>
	<input type="checkbox" name="3"/> PC <br>
	<input type="checkbox" name="4"/> NOTEBOOK <br>
	
	<br>
	
	<input type="submit" value="Ingresar Caso Capacitacion"/>

	</form>
</section>
<hr>

<section>
	<h3>Ver Solicitudes</h3>
	
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

<section>
	<h3> Ver Informe Check </h3>
	
</section>

    </body>  
<%@include file="../linkfooter.html" %>