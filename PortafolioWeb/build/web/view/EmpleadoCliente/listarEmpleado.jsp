<%@page import="model.Profesional"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.ArrayList"%>
<%@page import="DAO.DAOEmpleado_Cliente" %>
<%@page import="model.EmpleadoCliente" %>
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
                <h1>Empleados</h1>
            </div>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-md-6 col-sm-12">
                    <a href="ingresarEmpleado.jsp" class="btn btn-success">Agregar Empleado</a>
                </div>
            </div>
            <div class="row" style="margin-top:20px; margin-left: 10px;">
                <div class="col-md-11 col-sm-11 row">
                <table id="example" class="display" style="width:100%">
                 <thead>
                     <tr>
                         <th>Nombre</th>
                         <th>Rut</th>
                         <th>Direccion</th>
                         <th>Operrativo</th>
                         <th>Empresa</th>
                         <th>Editar</th>
                         <th>Eliminar</th>
                     </tr>
                 </thead>
                 <tbody>
                     <% DAOEmpleado_Cliente e = new DAOEmpleado_Cliente();    
                        ArrayList<EmpleadoCliente> le = e.todos();
                     %>
                     <% for(EmpleadoCliente p : le){
                         out.print("<tr>");
                         out.print("<td>"+p.getNombre()+"</td>");
                         out.print("<td>"+p.getRun()+"</td>");
                         out.print("<td>"+p.getDireccion()+"</td>");
                         out.print("<td>"+p.getOperativo()+"</td>");
                         out.print("<td>"+p.getId_empresa()+"</td>");
                         out.print("<td><a href=\"modificarEmpleado.jsp?id="+p.getId_empleado_cliente()+"\">Editar</a></td>");
                          out.print("<td><a href=\"../../EliminarEmpleado?id="+p.getId_empleado_cliente()+"\">Eliminar</a></td>");
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


