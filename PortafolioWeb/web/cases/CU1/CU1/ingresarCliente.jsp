
<%@page import="model.Usuario"%>
<%@page import="DAO.DAOUsuario"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
        <head>
                <title>Case of Use Master Page. </title>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>

                <%@include file="../../../menu.jsp" %>

<!-- ############################################################################################# -->
<!-- ############################################################################################# -->
<!-- ############################################################################################# -->



<div class="content-wrapper">
    <section class="content-header">
      <h1>
       Registrar empresas
        <a href="../portafolio.pdf"><small>PDF CASO 4</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
        <li class="active">Casos de Uso</li>
      </ol>
    </section>


<section class="content">

    <div class="container">
        <div class="row">
        <div class="col-md-6 col-sm-12">
            <input type="text" id="nombre" name="nombre" class="form-control" placeholder="Nombre empresa" />
        </div>
        <div class="col-md-5" id="divTipo">
            <select class="form-control" id="id_tipo_empresa" name="id_tipo_empresa">
                <option values="">Seleccione un tipo</option>
                <option values="1">Estudiantil</option>
            </select>
          </div>
        </div><hr>
        <div class="row">
            <div class="col-md-6 col-sm-12">
                 <input type="text" class="form-control" placeholder="Direccion"/>
            </div>
             <div class="col-md-5">
            <select class="form-control" id="id_comuna" name="id_comuna">
                <option values="">Seleccione una comuna</option>
                <option values="1">Providencia</option>
            </select>
        </div>
        </div><hr>
            <div class="row">
                <div class="col-md-6 col-sm-12">
                    <select class="form-control">
                        <option value="">Seleccione un plan</option>
                        <option value="1">Plan 1</option>
                    </select>
                </div>
            </div><hr>
                <div class="row">
                    <h1>Usuario</h1>
                <div class="col-md-6 col-sm-12">
                    <input class="form-control" id="nick_name"name="nick_name" type="text" placeholder="Nombre usuario"></input>
                </div>
                    <div class="col-md-6 col-sm-12">
                        <input class="form-control" id="password" name="password" type="password" placeholder="Contraseña"></input>
                    </div>
            </div><hr>
                
        <div class="row">
            <div class="col-md-12">
                <a href="../../../indexx.jsp" class="btn btn-primary">Volver</a>
                <button type="submit" class="btn btn-success">Registrar Empresa</button>
            </div>
        </div>
    </div>
</section>

</div>




<!-- ############################################################################################# -->
<!-- ############################################################################################# -->
<!-- ############################################################################################# -->
<%@include file="../../../scripts.html" %>



<!-- ############################################################################################# -->
<!-- ############################################################################################# -->
<!-- ############################################################################################# -->




