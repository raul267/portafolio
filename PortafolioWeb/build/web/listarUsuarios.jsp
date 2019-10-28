<%@page import="DAO_.DAOUsuario"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Usuario" %>
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

                <%@include file="menu.jsp" %>

<!-- ############################################################################################# -->
<!-- ############################################################################################# -->
<!-- ############################################################################################# -->

 <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
           <div class="row">
            <div class="col-md-12 col-sm-12 text-center">
                <h1>Usuarios</h1>
            </div>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-md-6 col-sm-12">
                        <a href="ingresarCliente.jsp" class="btn btn-success">Agregar Empresa</a>
                </div>
            </div>
            <div class="row" style="margin-top:20px; margin-left: 10px;">
                <div class="col-md-11 col-sm-11 row">
                <table id="example" class="display" style="width:100%">
                 <thead>
                     <tr>
                         <th>NickName</th>
                         <th>Tipo</th>
                     </tr>
                 </thead>
                 <tbody>
                     <% DAOUsuario du = new DAOUsuario();    
                        ArrayList<Usuario> u = du.todos();
                     %>
                     <% for(Usuario us : u){
                         out.print("<tr>");
                            out.print("<td>"+us.getNick_name()+"</td>");
                            out.print("<td>"+us.getId_tipo_usuario()+"</td>");
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



<%@include file="scripts.html" %>


