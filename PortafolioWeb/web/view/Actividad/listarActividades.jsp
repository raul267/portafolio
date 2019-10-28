<%@page import="model.Actividad"%>
<%@page import="DAO.DAOActividad"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.ArrayList"%>
<%@page import="DAO.DAOEmpresa" %>
<%@page import="model.Empresa" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    
        <head>
                <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
                <title>Gestion Cliente. </title>
                
        <script>

        function v(nombre,rut,direccion,estado,tipo,o,r) {
                var programa = "agregarCliente.jsp";

			parent.location.href="ver.jsp?nombre=" + nombre + "&rut=" + rut + "&direccion=" + direccion + "&estado=" + estado + "&tipo=" + tipo + "&o=" + o + "&r=" + r + "&programa=" + programa;
		}
                </script>

                <%@include file="../../menu.jsp" %>

<!-- ############################################################################################# -->
<!-- ############################################################################################# -->
<!-- ############################################################################################# -->

 <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
           <div class="row">
            <div class="col-md-12 col-sm-12 text-center">
                <h1>Empresas</h1>
            </div>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-md-6 col-sm-12">
                    <a href="ingresarActividad.jsp" class="btn btn-success">Agregar Actividad</a>
                </div>
            </div>
            <div class="row" style="margin-top:20px; margin-left: 10px;">
                <div class="col-md-11 col-sm-11 row">
                <table id="example" class="display" style="width:100%">
                 <thead>
                     <tr>
                         <th>Tipo actividad</th>
                         <th>Profesional</th>
                         <th>Empresa</th>
                         <th>Direccion</th>
                         <th>Terreno</th>
                         <th>Tiempo ejecucion</th>
                         <th>Fecha</th>
                         <th>Descripcion</th>
                         <th>lista chequeo</th>
                         <th>Realizado</th>
                         <th>Editar</th>
                         <th>Eliminar</th>
                     </tr>
                 </thead>
                 <tbody>
                     <% DAOActividad a = new DAOActividad();    
                        ArrayList<Actividad> le = a.todos();
                     %>
                     <% for(Actividad ac : le){
                         out.print("<tr>");
                         out.print("<td>"+ac.getId_tipo_actividad()+"</td>");
                         out.print("<td>"+ac.getId_empleado()+"</td>");
                         out.print("<td>"+ac.getId_empresa()+"</td>");
                         out.print("<td>"+ac.getDireccion()+"</td>");
                         out.print("<td>"+ac.getEnterreno()+"</td>");
                         out.print("<td>"+ac.getTiempo_ejecucion()+"</td>");
                         out.print("<td>"+ac.getFecha_actividad()+"</td>");
                         out.print("<td>"+ac.getDescripcion()+"</td>");
                         out.print("<td>"+ac.getId_check_list()+"</td>");
                         out.print("<td>"+ac.getRealizada()+"</td>");
                         out.print("<td><a href=\"actualizarActividad.jsp?id="+ac.getId_actividad()+"\">Editar</a></td>");
                          out.print("<td><a href=\"../../EliminarActividad?id="+ac.getId_actividad()+"\">Eliminar</a></td>");
                         out.print("</tr>");
                     }%>
                    
                   
                 </tbody>
             </table> 
            </div>
            </div>
        </div>
                     
                         
                         <%if (session.getAttribute("error")!=null)
                             {%>
                             <label style="color:red">
                                 <%=session.getAttribute("error") %>
                             </label>
                             <%}
                         %>
                         <% session.removeAttribute("error"); %>
                     
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->

<!-- ############################################################################################# -->
<!-- ############################################################################################# -->
<!-- ############################################################################################# -->



<%@include file="../../scripts.html" %>


