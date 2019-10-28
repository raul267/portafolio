


<%@page import="model.Error"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../../CargaEmpresas" flush="true"></jsp:include>
<html xmlns="http://www.w3.org/1999/xhtml">
        <head>
                <title>Case of Use Master Page. </title>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>

                <%@include file="../../menu.jsp" %>

<!-- ############################################################################################# -->
<!-- ############################################################################################# -->
<!-- ############################################################################################# -->



<div class="content-wrapper">
    <section class="content-header">
      <h1>
     Agregar Capacitacion
        
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
        <li class="active">Agregar Capacitacion </li>
      </ol>
    </section>


<section class="content">

    
           
     
            <table border="0">
                <form action="../../GuardarCapacitacion" method="post">
                <tr>
                    <td>Fecha Capacitacion</td>
                    <td><input type="datetime-local" name="fecha"></input> </td>
                     <td><input type="text" name="lol" value="${txtFecha}"></input> </td>
                </tr>
                 <tr>
                    <td>Cantidad Asistentes</td>
                    <td><input type="text" name="t" value="${total}" readonly="true"></input> </td>
                </tr>
                 <tr>
                    <td>Profesional que la realiza</td>
                    <td><input type="text" name="p" value="${sesionNombre}" readonly="true"></input> </td>
                </tr>
                  <tr>
                    <td>Lugar capacitacion</td>
                    <td><input type="text" name="txtLugar" value=""></input> </td>
                </tr>
                                  <tr>
                    <td>Material Utilizar</td>
                    <td><input type="text" name="txtMaterial" value=""></input> </td>
                </tr>
                  <tr>
                    <td>Guardar Capacitacion</td>
                    <td> 
             
                     
                        <input type="submit" value="Guardar Capacitacion" />
                 
                   </td>
                </tr>
                </form>  
                </table>
    <br></br>
          <table border="3">
    <thead>
        
    <tr>
        <td>Run</td>
        <td>Nombre</td>
        <td>Direccion</td>
        <td>Id_tipo_cargoEmpleado</td>
       
        <td>Sacar Empleado de la capacitacion</td>
    </tr>
        
    </thead>
  
    <tbody>
    <c:forEach items="${empleados}" var="x">
    
        <tr>
             <c:if test="${x.operativo ==0}">
            <td>
                ${x.run}
            </td>
             <td>
                ${x.nombre}
            </td>
            <td>
                ${x.direccion}
            </td>
             <td>
                ${x.id_tipo_cargoEmpleado}
            </td>
           
            <td>
              
 <form action="../../SacarEmpleado" method="post">
                      <input type="submit" value="Sacar Empleado" />
                      <input type="hidden" value="${x.id}" name="txtId" />
                </form>


          

</c:if>
              
            </td>
            
        </tr>
        
        
    </c:forEach>
        
    </tbody>
</table>
    <br></br>
          
       
     
   
           <%if (session.getAttribute("errores")!=null) {%>
                <h3> <% ArrayList<Error> le =  (ArrayList<model.Error>)session.getAttribute("errores");%> </h3>
                <%for (Error e : le) {%>

                <h3><%=e.getError()%></h3>
                       <% }%>           
                <% session.removeAttribute("errores");%>
                
                
   
<%}%>
</section>

</div>




<!-- ############################################################################################# -->
<!-- ############################################################################################# -->
<!-- ############################################################################################# -->

<%@include file="../../scripts.html" %>




<!-- ############################################################################################# -->
<!-- ############################################################################################# -->
<!-- ############################################################################################# -->




