<%@page import="model.Comuna"%>
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
                var programa = "modificarCliente.jsp";
		parent.location.href="ver.jsp?nombre=" + nombre + "&rut=" + rut + "&direccion=" + direccion + "&estado=" + estado + "&tipo=" + tipo + "&o=" + o + "&r=" + r + "&programa=" + programa;
	}
        
	</script>

<%@include file="../../../menu.jsp" %>

<!-- ############################################################################################# -->
<!-- ############################################################################################# -->
<!-- ############################################################################################# -->

 <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        Gestionar Empresa Clientes
        <small>CU1 - Mantener informacion cliente - Administrador - Mantencion</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Principal</a></li>
        <li><a href="#">CU1</a></li>
        <li class="active">Modificar Cliente</li>
      </ol>
    </section>
    <% 
        DAOEmpresa em = new DAOEmpresa();
        Empresa e = em.EmpresaID(Integer.parseInt(request.getParameter("id")));
    %>
    <!-- Main content -->
    
    <form method="post" action="../../../ModificarEmpresa">
        
        <section class="content">
      <div class="row">
        <div class="col-xs-12">
            <h1>
                Modificar datos de la empresa: <%=e.getNombre() %>
            </h1><hr>
            <input type="hidden" id="id_empresa" name="id_empresa" value="<%=e.getId_empresa()%>"/>
             <div class="row">
                <div class="col-md-1">
                    <label>Nombre empresa</label>
                </div>
                <div class="col-md-3">
                    <input type="text" class="form-control"value="<%=e.getNombre() %>" id="nombre" name="nombre"/>
                </div>
            </div>
                <div class="row" style="margin-top:10px;    ">
                    <div class="col-md-1">
                        <label>Direccion</label>
                    </div>
                    <div class="col-md-3">
                        <input type="text" class="form-control"value="<%=e.getDireccion()%>" id="direccion" name="direccion"/>
                    </div>
                    
                    <div class="col-md-1">
                        <label>Comuna</label>
                    </div>
                    <div class="col-md-3">
                        <select class="form-control" id="id_comuna" name="id_comuna">
                            <option value="">Seleccione una comuna</option>
                            
                            <% 
                               DAOEmpresa c = new DAOEmpresa();
                               ArrayList<Comuna> ac = c.ComunasTodas();
                               for (Comuna comuna : ac)
                                   {
                                       if (comuna.getId_comuna() == e.getId_comuna())
                                           {
                                               %>
                                                <option value="<%= comuna.getId_comuna()%>" class="form-control" id="id_comuna" name="id_comuna" selected><%=comuna.getNombre()%></option>
                                               <%

                                           }
                                        else
                                        {
                                              %><option value="<%= comuna.getId_comuna()%>" class="form-control" id="id_comuna" name="id_comuna"><%=comuna.getNombre()%></option><%
                                        }
                                    }
                             %>
                        </select>
                    </div>
            </div>
                        
               <div class="row" style="margin-top:10px;">
                     <div class="col-md-1">
                        <label>Vigente</label>
                    </div>
                    <div class="col-md-3">
                        <select class="form-control" id="estado" name="estado" disabled>
                            <option value="0" 
                                    <%
                                        if (e.getEstado() == 0)
                                            {
                                             %>selected <%  
                                            }
                                    %>>No contratado</option>
                            <option value="1"<%
                                        if (e.getEstado() == 1)
                                            {
                                             %>selected <%  
                                            }
                                    %>>Contratado</option>
                        </select>
                    </div>
               </div>
             <div class="row" style="margin-top:10px;">
                 <div class="col-md-3">
                     <button class="btn btn-primary" type="submit">Volver</button>
                 </div>
                 <div class="col-md-3">
                     <button class="btn btn-success" type="submit">Modificar</button>
                 </div>
             </div>
        </div>
           
        <!-- /.col -->
      </div>
      <!-- /.row -->
    </section>
    </form>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->

<!-- ############################################################################################# -->
<!-- ############################################################################################# -->
<!-- ############################################################################################# -->

<script>
  $(function () {
    $("#example1").DataTable();
    $('#example2').DataTable({
      "paging": true,
      "lengthChange": false,
      "searching": false,
      "ordering": true,
      "info": true,
      "autoWidth": false
    });
  });
</script>

<%@include file="../../../scripts.html" %>

