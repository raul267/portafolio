
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

                <%@include file="../../../menu.jsp" %>

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
                    <a href="ingresarCliente.jsp" class="btn btn-success">Agregar Empresa</a>
                </div>
            </div>
            <div class="row" style="margin-top:20px; margin-left: 10px;">
                <div class="col-md-11 col-sm-11 row">
                <table id="example" class="display" style="width:100%">
                 <thead>
                     <tr>
                         <th>Nombre</th>
                         <th>Tipo</th>
                         <th>Direccion</th>
                         <th>Comuna</th>
                         <th>Estado</th>
                         <th>Plan</th>
                     </tr>
                 </thead>
                 <tbody>
                     <tr>
                         <td>La Polar</td>
                         <td>Retail</td>
                         <td>Una direccion</td>
                         <td>Providencia</td>
                         <td>Vigente</td>
                         <td>1</td>
                     </tr>
                     <tr>
                         <td>Duoc UC</td>
                         <td>Educacional</td>
                         <td>Antonio Varas 666</td>
                         <td>Providencia</td>
                         <td>No vigente</td>
                         <td>1</td>
                     </tr>
                   
                 </tbody>
             </table> 
            </div>
            </div>
        </div>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->

<!-- ############################################################################################# -->
<!-- ############################################################################################# -->
<!-- ############################################################################################# -->


<%@include file="../../../scripts.html" %>

