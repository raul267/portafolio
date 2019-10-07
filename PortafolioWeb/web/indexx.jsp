
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
        <head>
                <title>Case of Use Master Page. </title>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>

<%@include file="menu.jsp" %>

<!-- ############################################################################################# -->
<!-- ############################################################################################# -->
<!-- ############################################################################################# -->



<div class="content-wrapper">
    <section class="content-header">
      <h1>
        Informacion sobre el Portafolio 
        <a href="../portafolio.pdf"><small>PDF CASO 4</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
        <li class="active">Casos de Uso</li>
      </ol>
    </section>


<section class="content">

	<div class="row">
        <!-- /.col -->
        <div class="col-md-3">
	  <div class="box box-success box-solid">
            <div class="box-header with-border">
              <h3 class="box-title">Roles por CU </h3>

              <div class="box-tools pull-right">
                <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i>
                </button>
              </div>
              <!-- /.box-tools -->
            </div>
            <!-- /.box-header -->
            <div class="box-body">
              <i class="fa fa-circle-o text-green">  </i><a href="index.jsp?tipoUser=1"> <span> ALL</span></a><br>
	      <i class="fa fa-circle-o text-red">    </i> <a href="index.jsp?tipoUser=4"> <span> Administrador</span></a><br>
              <i class="fa fa-circle-o text-yellow"> </i> <a href="index.jsp?tipoUser=2"> <span> Profesional</span>  </a><br>
              <i class="fa fa-circle-o text-aqua">   </i> <a href="index.jsp?tipoUser=3"> <span> Cliente</span>      </a><br>
            </div>
            <!-- /.box-body -->
          </div>
          <!-- /.box -->
        </div>

        <!-- /.col -->
        <div class="col-md-4">
	  <div class="box box-success box-solid">
            <div class="box-header with-border">
              <h3 class="box-title">&Aacutembito de Gesti&oacuten</h3>

              <div class="box-tools pull-right">
                <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i>
                </button>
              </div>
              <!-- /.box-tools -->
            </div>
            <!-- /.box-header -->
            <div class="box-body">
	      <i class="fa fa-file-word-o"></i> <a href="/PortafolioWeb/resourcesPortafolio/InformeControlySeguimiento.abw"><span>Informe Control y Seguimiento</span></a><br/>
              <i class="fa fa-file-word-o"></i> <a href="/PortafolioWeb/resourcesPortafolio/Minuta de Reuniones_ Avance Proyecto Edu.xlsx"><span>Actas de Reunion</span></a><br/>
              <i class="fa fa-file-word-o"></i> <a href="#"><span>Documentos Casos de Prueba</span></a><br/>
              <i class="fa fa-file-code-o"></i> <a href="#"><span>Informe de Aplicacion de Pruebas</span></a><br/>
              <i class="fa fa-file-image-o"></i> <a href="#"><span>Diagrama de Arquitectura</span></a><br/>
             <i class="fa fa-file-text-o"></i> <a href="#"><span>Diccionario de datos</span></a>
            </div>
            <!-- /.box-body -->
          </div>
          <!-- /.box -->
        </div>



	<div class="row">
        <!-- /.col -->
        <div class="col-md-4">
	  <div class="box box-success box-solid">
            <div class="box-header with-border">
              <h3 class="box-title">&Aacutembito de Dise&ntildeo</h3>

              <div class="box-tools pull-right">
                <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i>
                </button>
              </div>
              <!-- /.box-tools -->
            </div>
            <!-- /.box-header -->
            <div class="box-body">
	      <i class="fa fa-file-image-o"></i> <a href="#"><span>Modelo de Datos E-R </span></a><br>
              <i class="fa fa-file-image-o"></i> <a href="#"><span>Modelo Relacional Normalizado</span></a><br>
              <i class="fa fa-file-image-o"></i> <a href="/PortafolioWeb/resourcesPortafolio/DiagramaClases.png"><span>Diagrama de Clases </span></a><br>             
	      <i class="fa fa-file-image-o"></i> <a href="/PortafolioWeb/resourcesPortafolio/Diagramasecuencia.png"><span>Diagrama de Secuencia </span></a>
            </div>
            <!-- /.box-body -->
          </div>
          <!-- /.box -->
        </div>


	<div class="row">
        <!-- /.col -->
        <div class="col-md-4">
	  <div class="box box-success box-solid">
            <div class="box-header with-border">
              <h3 class="box-title">&Aacutembito de Desarrollo Software</h3>

              <div class="box-tools pull-right">
                <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i>
                </button>
              </div>
              <!-- /.box-tools -->
            </div>
            <!-- /.box-header -->
            <div class="box-body">
	      <i class="fa fa-file-code-o"></i> <a href="#"><span>Programacion autenticacion</span></a><br>
              <i class="fa fa-file-code-o"></i> <a href="#"><span>Aplicacion de Pruebas</span></a><br>
              <i class="fa fa-file-code-o"></i> <a href="#"><span>Programacion de Base de Datos</span></a><br>
              <i class="fa fa-file-code-o"></i> <a href="#"><span>Programacion de Casos de Negocio</span></a><br>
              <i class="fa fa-file-code-o"></i> <a href="#"><span>Programacion de Casos de Integracion</span></a><br>
              <i class="fa fa-file-code-o"></i> <a href="#"><span>Programacion de Casos de Investigacion</span></a><br>
            
	</div>
            <!-- /.box-body -->
          </div>
          <!-- /.box -->
        </div>


</section>

</div>




<!-- ############################################################################################# -->
<!-- ############################################################################################# -->
<!-- ############################################################################################# -->

<%@include file="scripts.html" %>

<!-- ############################################################################################# -->
<!-- ############################################################################################# -->
<!-- ############################################################################################# -->




