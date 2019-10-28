
<% 
	boolean admin = false;
	boolean profesional = false;
	boolean cliente = false;
	boolean adminsolo = false;
        //int param = Integer.parseInt(session.getAttribute("sessionTipo").toString());
	int param = (session.getAttribute("sessionTipo")==null) ? 3 : Integer.parseInt(session.getAttribute("sessionTipo").toString());

	switch(param){
		case 1: admin = true; break;
		case 2: profesional = true; break;
		case 3: cliente = true; break;
		case 4: adminsolo = true; break;
		default: admin = true; break;
	}

%>
<!-- links Bootstrap 3.3.6 -->
<%@include file="links.html" %>

 

   <header>     
<div class="wrapper">

  <header class="main-header">
    <!-- Logo -->
    <a href="/TestPortafolio/index.jsp" class="logo">
      <span class="logo-mini"><b>P-</b>G4</span>
      <span class="logo-lg"><b>Portafolio</b>GRUPO4</span>
    </a>
    <nav class="navbar navbar-static-top">
      <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
        <span class="sr-only">Toggle navigation</span>
      </a>
        
      </div>
    
  </header>
    
 <body class="hold-transition skin-blue sidebar-mini">

<!-- ############################################################################################# -->
<!-- ############################################################################################# -->
<!-- ############################################################################################# -->

  <aside class="main-sidebar">
    <section class="sidebar">
      <ul class="sidebar-menu">
<% if(admin || adminsolo){ 			%>	
        <li class="header"> PORTAFOLIO CASOS DE USO                         </li>
	
	<li class="treview"><a href="/TestPortafolio/portafolio.pdf">
	 <i class="fa fa-fw fa-file-pdf-o"></i>
	<span class="pull-left-container"> - PORTAFOLIO PDF CASE</a> </span>                        </li>        
	<li class "treview"><a href="/TestPortafolio/Informe">
	  <i class="fa fa-fw fa-file-word-o"></i>
	<span class="pull-left-container"> - INFORME WORD</a></span>                        </li>        
<% }                            %>
        
<% if(admin || adminsolo){ 			%>		

     <li id="CU1_0" class="treeview">
          <a href="CU1">
            <i class="fa fa-circle-o text-red"></i>
            <span>CU1 - Mantener Cliente</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
             </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="/TestPortafolio/cases/CU1/CU1/agregarCliente.jsp">      <i id="CU1_1" class="fa fa-circle-o"></i> Agregar Cliente</a></li>
            <li><a href="/TestPortafolio/cases/CU1/CU1/modificarCliente.jsp">          <i id="CU1_2" class="fa fa-circle-o"></i> Modificar Cliente</a></li>
            <li><a href="/TestPortafolio/cases/CU1/CU1/eliminarCliente.jsp">        <i id="CU1_3" class="fa fa-circle-o"></i> Eliminar Cliente</a></li>
            <li><a href="/TestPortafolio/cases/CU1/CU1/listarCliente.jsp">        <i id="CU1_4" class="fa fa-circle-o"></i> Listar Cliente</a></li>
            <li><a href="/TestPortafolio/cases/CU1/CU1/todoCliente.jsp">        <i id="CU1_5" class="fa fa-circle-o"></i> (TODO) Cliente</a></li>
          </ul>
        </li>
<% }                            %>
<% if(admin || adminsolo){ 			%>

      <li id="CU2_0" class="treeview">
         <a href="/web/CU2">
            <i class="fa fa-circle-o text-red"></i>
            <span> CU2 - Mantener Profesional</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
             </span>
          </a>
          <ul class="treeview-menu">
	    <li><a href="/PortafolioWeb/cases/CU2/agregarProfesional.jsp">      <i id="CU2_1" class="fa fa-circle-o"></i> Agregar Profesional</a></li>
            <li><a href="/PortafolioWeb/cases/CU2/modificarProfesional.jsp">          <i id="CU2_2"class="fa fa-circle-o"></i> Modificar Profesional</a></li>
            <li><a href="/PortafolioWeb/cases/CU2/eliminarProfesional.jsp">        <i id="CU2_3" class="fa fa-circle-o"></i> Eliminar Profesional</a></li>
            <li><a href="/PortafolioWeb/cases/CU2/listarProfesional.jsp">        <i id="CU2_4" class="fa fa-circle-o"></i> Listar Profesional</a></li>
            <li><a href="/PortafolioWeb/cases/CU2/todoProfesional.jsp">        <i id="CU2_5" class="fa fa-circle-o"></i> (TODO) Profesional</a></li>
          </ul>
        </li>

<% }                            %>
<% if(admin || profesional){ 			%>

        <li id="CU3_0" class="treeview">
          <a href="#">
            <i class="fa fa-circle-o text-yellow"></i>
            <span>CU3 - Crear capacitaci&oacuten</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="/PortafolioWeb/cases/CU3/"><i id="CU3_1" class="fa fa-circle-o"></i> Gestiona Capacitacion</a></li>
            <li><a href="/PortafolioWeb/cases/CU3/"><i id="CU3_2" class="fa fa-circle-o"></i> Solicita Capacitacion cli</a></li>
            <li><a href="/PortafolioWeb/cases/CU3/"><i id="CU3_3" class="fa fa-circle-o"></i> TODO</a></li>
          </ul>
        </li>

<% }                            %>
<% if(admin || profesional){ 			%>

        <li id="CU3_0" class="treeview">
          <a href="#">
            <i class="fa fa-circle-o text-yellow"></i>
            <span>CU3 - Crear capacitaci&oacuten</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="/TestPortafolio/cases/CU3/"><i id="CU3_1" class="fa fa-circle-o"></i> Gestiona Capacitacion</a></li>
            <li><a href="/TestPortafolio/cases/CU3/"><i id="CU3_2" class="fa fa-circle-o"></i> Solicita Capacitacion cli</a></li>
            <li><a href="/TestPortafolio/cases/CU3/"><i id="CU3_3" class="fa fa-circle-o"></i> TODO</a></li>
          </ul>
        </li>

<% }                            %>
<% if(admin || profesional){ 			%>

        <li id="CU4_0" class="treeview">
          <a href="#">
            <i class="fa fa-circle-o text-yellow"></i>
            <span>Generar Capacitacion </span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
       
            <li><a href="/PortafolioWeb/cases/Profesional/GenerarCapacitacion.jsp"><i id="CU4_4" class="fa fa-circle-o"></i> Generar Capacitacion</a></li>
          </ul>
        </li>

<% }                            %>
<% if(admin || profesional){ 			%>

        <li id="CU5_0" class="treeview">
          <a href="#">
            <i class="fa fa-circle-o text-yellow"></i>
            <span>CU5 - Revisar cliente </span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="/PortafolioWeb/cases/CU5/"><i id="CU5_1" class="fa fa-circle-o"></i> Emitir Informe Cliente </a></li>
            <li><a href="/PortafolioWeb/cases/CU5/"><i id="CU5_2" class="fa fa-circle-o"></i> (todo) Revisar Cliente </a></li>
          </ul>
        </li>

<% }                            %>
<% if(admin || cliente){ 			%>

        <li id="CU6_0" class="treeview">
          <a href="#">
            <% if(admin){%><i class="fa fa-circle-o text-red"></i><%}%>
            <% if(cliente){%><i class="fa fa-circle-o text-aqua"></i><%}%>
            
            
            <span>Reportar Accidente </span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <% if(admin) {%>
                <li><a href="/TestPortafolio/cases/CU6/"><i id="CU6_1" class="fa fa-circle-o"></i> Gestionar Accidente</a></li>
            <%}%>    
            <% if(cliente){%>
                <li><a href="/TestPortafolio/cases/CU6/"><i id="CU6_1" class="fa fa-circle-o"></i> Reportar Accidente</a></li>
            <%}%>
</ul>
        </li>

<% }                            %>
<% if(admin || cliente){ 			%>

        <li id="CU6_0" class="treeview">
          <a href="#">
            <i class="fa fa-circle-o text-aqua"></i>
            <span>Agregar Empleado </span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="/PortafolioWeb/index.jsp"><i id="CU6_1" class="fa fa-circle-o"></i> Agregar Empleado</a></li>
           
</ul>
        </li>

<% }                            %>
<% if(admin || profesional){ 			%>

        <li id="CU7_0" class="treeview">
          <a href="/PortafolioWeb/index.jsp">
            <i class="fa fa-circle-o text-yellow"></i>
            <span>CU7 - Crear caso de asesora </span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="/PortafolioWeb/cases/CU7/"><i id="CU7_1" class="fa fa-circle-o"></i> TODO</a></li>
            <li><a href="/PortafolioWeb/cases/CU7/"><i id="CU7_2" class="fa fa-circle-o"></i> TODO</a></li>
          </ul>
        </li>

<% }                            %>
<% if(admin || profesional){ 			%>

        <li id="CU8_0" class="treeview">
          <a href="#">
            <i class="fa fa-circle-o text-yellow"></i>
            <span>CU8 - Ingresar actividad de mejora </span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="/PortafolioWeb/cases/CU8/"><i id="CU8_1" class="fa fa-circle-o"></i> TODO</a></li>
            <li><a href="/PortafolioWeb/cases/CU8/"><i id="CU8_2" class="fa fa-circle-o"></i> TODO</a></li>
          </ul>
        </li>

<% }                            %>
<% if(admin || profesional){ 			%>

        <li id="CU9_0" class="treeview">
          <a href="#">
            <i class="fa fa-circle-o text-yellow"></i>
            <span>CU9 - Revisar actividad mejora </span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="/PortafolioWeb/cases/CU9/"><i id="CU9_1" class="fa fa-circle-o"></i> TODO</a></li>
            <li><a href="/PortafolioWeb/cases/CU9/"><i id="CU9_2" class="fa fa-circle-o"></i> TODO</a></li>
          </ul>
        </li>

<% }                            %>
<% if(admin || adminsolo){ 			%>

        <li id="CU10_0" class="treeview">
          <a href="#">
            <i class="fa fa-circle-o text-red"></i>
            <span>CU10 - Controlar pagos cliente </span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="/PortafolioWeb/cases/CU10/"><i id="CU10_1" class="fa fa-circle-o"></i> TODO</a></li>
            <li><a href="/PortafolioWeb/cases/CU10/"><i id="CU10_2" class="fa fa-circle-o"></i> TODO</a></li>
          </ul>
        </li>

<% }                            %>
<% if(admin){ 			%>

        <li id="CU11_0" class="treeview">
          <a href="#">
            <i class="fa fa-laptop"></i>
            <span>CU11 - BUG ME :3 </span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">

            <li><a href="/PortafolioWeb/cases/CU11/"><i id="CU11_1" class="fa fa-circle-o"></i> TODO</a></li>
            <li><a href="/PortafolioWeb/cases/CU11/"><i id="CU11_2" class="fa fa-circle-o"></i> TODO</a></li>
            <li><a href="/PortafolioWeb/cases/CU11/"><i id="CU11_3" class="fa fa-circle-o"></i> TODO</a></li>
            <li><a href="/PortafolioWeb/cases/CU11/"><i id="CU11_4" class="fa fa-circle-o"></i> TODO</a></li>

          </ul>
	</li>

<% }                            %>
<% if(admin || adminsolo){ 			%>

        <li id="CU12_0" class="treeview">
          <a href="#">
            <i class="fa fa-circle-o text-red"></i>
            <span>CU12 - Calcular accidentabilidad </span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="/PortafolioWeb/cases/CU12/"><i id="CU12_1" class="fa fa-circle-o"></i> TODO</a></li>
            <li><a href="/PortafolioWeb/cases/CU12/"><i id="CU12_2" class="fa fa-circle-o"></i> TODO</a></li>
          </ul>
        </li>


<% }                            %>
<% if(admin || profesional){ 			%>

        <li id="CU13_0" class="treeview">
          <a href="#">
            <i class="fa fa-circle-o text-yellow"></i>
            <span>CU13 - Ingresar asesor&iacutea </span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="/PortafolioWeb/cases/CU13/"><i id="CU13_1" class="fa fa-circle-o"></i> TODO</a></li>
            <li><a href="/PortafolioWeb/cases/CU13/"><i id="CU13_2" class="fa fa-circle-o"></i> TODO</a></li>
          </ul>
        </li>

<% }                            %>
<% if(admin || profesional){ 			%>

        <li id="CU14_0" class="treeview">
          <a href="#">
            <i class="fa fa-circle-o text-yellow"></i>
            <span>CU14 - Visualizar actividades </span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="/PortafolioWeb/cases/CU14/"><i id="CU14_1" class="fa fa-circle-o"></i> TODO</a></li>
            <li><a href="/PortafolioWeb/cases/CU14/"><i id="CU14_2" class="fa fa-circle-o"></i> TODO</a></li>
          </ul>
        </li>

<% }                            %>
<% if(admin || profesional){ 			%>

        <li id="CU15_0" class="treeview">
          <a href="#">
            <i class="fa fa-circle-o text-yellow"></i>
            <span>CU15 - Notificar atrasos </span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="/PortafolioWeb/cases/CU15/"><i id="CU15_1" class="fa fa-circle-o"></i> TODO</a></li>
            <li><a href="/PortafolioWeb/cases/CU15/"><i id="CU15_2" class="fa fa-circle-o"></i> TODO</a></li>
          </ul>
        </li>

<% }                            %>
<% if(admin || cliente){ 			%>

        <li id="CU16_0" class="treeview">
          <a href="#">
            <i class="fa fa-circle-o text-aqua"></i>
            <span>Solicitar Asesor&iacutea Especial </span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="/PortafolioWeb/cases/CU16/"><i id="CU16_1" class="fa fa-circle-o"></i> TODO</a></li>
            <li><a href="/PortafolioWeb/cases/CU16/"><i id="CU16_2" class="fa fa-circle-o"></i> TODO</a></li>
          </ul>
        </li>

<% }                            %>
<% if(admin || profesional){ 			%>

        <li id="CU17_0" class="treeview">
          <a href="#">
            <i class="fa fa-circle-o text-yellow"></i>
            <span>CU17 - Crear Cheklist </span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="/PortafolioWeb/cases/CU17/"><i id="CU17_1" class="fa fa-circle-o"></i> TODO</a></li>
            <li><a href="/PortafolioWeb/cases/CU17/"><i id="CU17_2" class="fa fa-circle-o"></i> TODO</a></li>
          </ul>
        </li>

<% }                            %>
<% if(admin || profesional){ 			%>

        <li id="CU18_0" class="treeview">
          <a href="#">
            <i class="fa fa-circle-o text-yellow"></i>
            <span>CU18 - Responder Checklist </span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="/PortafolioWeb/cases/CU18/"><i id="CU18_1" class="fa fa-circle-o"></i> TODO</a></li>
            <li><a href="/PortafolioWeb/cases/CU18/"><i id="CU18_2" class="fa fa-circle-o"></i> TODO</a></li>
          </ul>
        </li>

<% }                            %>
<% if(admin || adminsolo){ 			%>

        <li id="CU19_0" class="treeview">
          <a href="#">
            <i class="fa fa-circle-o text-red"></i>
            <span>CU19 - Generar reporte cliente</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="/PortafolioWeb/cases/CU19/"><i id="CU19_1" class="fa fa-circle-o"></i> General Reporte PDF</a></li>
            <li><a href="/PortafolioWeb/cases/CU19/"><i id="CU19_2" class="fa fa-circle-o"></i> General Reporte WEB</a></li>
          </ul>
        </li>

<% }                            %>
<% if(admin || adminsolo){ 			%>

        <li id="CU20_0" class="treeview">
          <a href="#">
            <i class="fa fa-circle-o text-red"></i>
            <span>CU20 - Generar reporte global</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="/PortafolioWeb/cases/CU20/"><i id="CU20_1" class="fa fa-circle-o"></i> TODO</a></li>
            <li><a href="/PortafolioWeb/cases/CU20/"><i id="CU20_2" class="fa fa-circle-o"></i> TODO</a></li>
            <li><a href="/PortafolioWeb/pages/UI/general.html"><i id="CU20_3" class="fa fa-circle-o"></i> General</a></li>
            <li><a href="/PortafolioWeb/pages/UI/icons.html"><i class="fa fa-circle-o"></i> Icons</a></li>
            <li><a href="/PortafolioWeb/pages/UI/buttons.html"><i class="fa fa-circle-o"></i> Buttons</a></li>
            <li><a href="/PortafolioWeb/pages/UI/sliders.html"><i class="fa fa-circle-o"></i> Sliders</a></li>
            <li><a href="/PortafolioWeb/pages/UI/timeline.html"><i class="fa fa-circle-o"></i> Timeline</a></li>
            <li><a href="/PortafolioWeb/pages/UI/modals.html"><i class="fa fa-circle-o"></i> Modals</a></li>
          </ul>
        </li>

<% }                            %>

        <li id="CU19_0" class="treeview">
          <a href="#">
            <i class="fa fa-circle-o text-red"></i>
            <span>Cerrar Session</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="salir.jsp"><i id="CU19_1" class="fa fa-circle-o"></i> Cerrar Sesion</a></li>
          
          </ul>
        </li>
      </ul>
    </section>
    <!-- /.sidebar -->
  </aside>


