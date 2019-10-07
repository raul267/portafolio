                                                               


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<%
String nombre=request.getParameter("nombre");
String rut=request.getParameter("rut");
String direccion=request.getParameter("direccion");
String estado=request.getParameter("estado");
String tipo=request.getParameter("tipo");
String accion=request.getParameter("o");
String r=request.getParameter("r");
String programa=request.getParameter("programa");

String[] arrayestado = new String[2];
arrayestado[0] = "Activo";
arrayestado[1] = "Inactivo";

String[] arraytipo = new String[4];
arraytipo[0] = "Base datos";
arraytipo[1] = "Desarrollador";
arraytipo[2] = "Prevencion de Riesgo";
arraytipo[3] = "Gestor proyecto";

%>    
        <head>
                <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
                <title> Modificar Cliente</title>


<%@include file="../../../menu.jsp" %>

<!-- ############################################################################################# -->
<!-- ############################################################################################# -->
<!-- ############################################################################################# -->
  
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1> Modificar Cliente</h1>
    </section>

	<section class="content">
		<div class="row">
			<div class="col-md-6">
				<b> %% CU1 - Mantener informacion cliente - Administrador - Mantencion</b>
			</div>
		</div>
	
	
	<div class="row">
	<div class="box box-primary">
<!--            <div class="box-header with-border">
              <h3 class="box-title">Quick Example</h3>
            </div>
             /.box-header -->
            <!-- form start -->
            <form role="form" action="<%= programa%>">
              <div class="box-body">
                <!-- text input -->
                <div class="form-group">
                  <label>Nombre</label>
                  <input type="text" class="form-control" placeholder="Enter ..." value="<%= nombre%>">
                </div>
                <!-- text input -->
                <div class="form-group">
                  <label>Rut</label>
                  <input type="text" class="form-control" placeholder="Enter ..." value="<%= rut%>">
                </div>
                <!-- text input -->
                <div class="form-group">
                  <label>Direccion</label>
                  <input type="text" class="form-control" placeholder="Enter ..." value="<%= direccion%>">
                </div>
                <!-- select -->
                <div class="form-group">
                  <label>Seleciona Estado</label>
                  <select class="form-control">
<%for (int i = 0; i < 2; i++) {
			if(estado.equals(arrayestado[i])) {%>
			        <option value="<%= arrayestado[i]%>" selected=selected><%= arrayestado[i]%></option>
            <%}else{%>
			        <option value="<%= arrayestado[i]%>"><%= arrayestado[i]%></option>
		<%}}%>
<!--
				<option value=<?php echo $z[0]?> selected=selected><?php echo $z[1]?></option>
			<?php } else {?>
				<option value=<?php echo $z[0]?>><?php echo $z[1]?></option>
-->
                  </select>
                </div>
                <!-- select -->
                <div class="form-group">
                  <label>Seleciona Tipo</label>
                  <select class="form-control">
<%for (int j = 0; j < 4; j++) {
			if (tipo.equals(arraytipo[j])){%>
			        <option value="<%=arraytipo[j]%>" selected=selected><%= arraytipo[j]%></option>
            <%}else{%>
			        <option value="<%=arraytipo[j]%>"><%= arraytipo[j]%></option>
		<%}}%>
                  </select>
                </div>


              <!-- /.box-body -->

              <div class="box-footer">
                <button type="submit" class="btn btn-primary"><%= accion%></button>
              </div>
            </form>
          </div>
		</div>
	</section>

<!-- ############################################################################################# -->
<!-- ############################################################################################# -->
<!-- ############################################################################################# -->

<%@include file="../../../scripts.html" %>


