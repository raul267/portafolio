<%@page import="java.util.ArrayList"%>
<%@page import="DAO.DAOProfesional"%>
<%@page import="model.Profesional"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
        <head>
                <title>Case of Use Master Page. </title>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>

                <%@include file="../../menu.jsp" %>

<!-- ############################################################################################# -->
<!-- ############################################################################################# -->
<!-- ############################################################################################# -->


<div class="content-wrapper">
    
<% 
    DAOProfesional dp = new DAOProfesional();
    Profesional p = dp.ProfesionalID(Integer.parseInt(request.getParameter("id")));
    

%>
    <section class="content-header">
      <h1>
          Modificar Profesinoal 
        <a href="../portafolio.pdf"><small>PDF CASO 4</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
        <li class="active">Casos de Uso</li>
      </ol>
    </section>


<section class="content">

    <form method="post" action="../../ModificarProfesional">
        <input type="hidden" name="id_profesional" id="id_profesional" value="<%= p.getId_profesoinal()%>"/>
            <div class="container">
                <h1>Modificar profesional: <%= p.getNombre()%></h1>
        <div class="row">
        <div class="col-md-6 col-sm-12">
            <input type="text" id="nombre" name="nombre" class="form-control" placeholder="Nombre Profesional" value="<%= p.getNombre()%>" />
        </div>
        <div class="col-md-5" id="divTipo">
            <input type="text" id="rut" disabled name="rut" class="form-control" placeholder="Rut : 11111111-1" value="<%= p.getRut()%>" />
          </div>
        </div><hr>
            <div class="row">
                <div class="col-md-6 col-sm-12">
                    <input type="text" class="form-control" id="direccion" name="direccion" placeholder="Direccion" value="<%= p.getDireccion()%>"/>
                    
                </div>
            </div>

              
        <div class="row">
            <div class="col-md-12">
                <a href="agregarProfesional.jsp" class="btn btn-primary">Volver</a>
                <button type="submit" class="btn btn-success">Registrar Profesional</button>
            </div>
        </div>
    </div>
    </form>
</section>

</div>




<!-- ############################################################################################# -->
<!-- ############################################################################################# -->
<!-- ############################################################################################# -->
<%@include file="../../scripts.html" %>



<!-- ############################################################################################# -->
<!-- ############################################################################################# -->
<!-- ############################################################################################# -->




