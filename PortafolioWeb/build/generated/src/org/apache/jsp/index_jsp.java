package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/menu.jsp");
    _jspx_dependants.add("/scripts.html");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("        <head>\n");
      out.write("                <title>Case of Use Master Page. </title>\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\n");
      out.write("\n");
      out.write('\n');
 

	boolean admin = false;
	boolean profesional = false;
	boolean cliente = false;
	boolean adminsolo = false;

	int param = (request.getParameter("tipoUser")==null) ? 1 : Integer.parseInt(request.getParameter("tipoUser"));

	switch(param){
		case 1: admin = true; break;
		case 2: profesional = true; break;
		case 3: cliente = true; break;
		case 4: adminsolo = true; break;
		default: admin = true; break;
	}


      out.write("\n");
      out.write("<!--\n");
      out.write("  <meta content=\"width=device-width, initial-scale=1.3, maximum-scale=1, user-sca$\n");
      out.write("-->\n");
      out.write("\n");
      out.write("<!-- Bootstrap 3.3.6 -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"/PortafolioWeb/bootstrap/css/bootstrap.min.css\">\n");
      out.write("  <!-- Font Awesome -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css\">\n");
      out.write("  <!-- Ionicons -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css\">\n");
      out.write("  <!-- Theme style -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"/PortafolioWeb/dist/css/AdminLTE.min.css\">\n");
      out.write("  <!-- AdminLTE Skins. Choose a skin from the css/skins\n");
      out.write("       folder instead of downloading all of them to reduce the load. -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"/PortafolioWeb/dist/css/skins/_all-skins.min.css\">\n");
      out.write("  <!-- iCheck -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"/PortafolioWeb/plugins/iCheck/flat/blue.css\">\n");
      out.write("  <!-- Morris chart -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"/PortafolioWeb/plugins/morris/morris.css\">\n");
      out.write("  <!-- jvectormap -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"/PortafolioWeb/plugins/jvectormap/jquery-jvectormap-1.2.2.css\">\n");
      out.write("  <!-- Date Picker -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"/PortafolioWeb/plugins/datepicker/datepicker3.css\">\n");
      out.write("  <!-- Daterange picker -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"/PortafolioWeb/plugins/daterangepicker/daterangepicker.css\">\n");
      out.write("  <!-- bootstrap wysihtml5 - text editor -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"/PortafolioWeb/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css\">\n");
      out.write("\n");
      out.write("  <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("  <!--[if lt IE 9]>\n");
      out.write("  <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\n");
      out.write("  <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("  <![endif]-->\t\t\n");
      out.write("\t\n");
      out.write("\t</head>\n");
      out.write("\n");
      out.write("        <body class=\"hold-transition skin-blue sidebar-mini\">\n");
      out.write("<div class=\"wrapper\">\n");
      out.write("\n");
      out.write("  <header class=\"main-header\">\n");
      out.write("    <!-- Logo -->\n");
      out.write("    <a href=\"/PortafolioWeb/index.jsp\" class=\"logo\">\n");
      out.write("      <span class=\"logo-mini\"><b>P-</b>G4</span>\n");
      out.write("      <span class=\"logo-lg\"><b>Portafolio</b>GRUPO4</span>\n");
      out.write("    </a>\n");
      out.write("    <nav class=\"navbar navbar-static-top\">\n");
      out.write("      <a href=\"#\" class=\"sidebar-toggle\" data-toggle=\"offcanvas\" role=\"button\">\n");
      out.write("        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("      </a>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("  </header>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- ############################################################################################# -->\n");
      out.write("<!-- ############################################################################################# -->\n");
      out.write("<!-- ############################################################################################# -->\n");
      out.write("\n");
      out.write("  <aside class=\"main-sidebar\">\n");
      out.write("    <section class=\"sidebar\">\n");
      out.write("      <ul class=\"sidebar-menu\">\n");
      out.write("\n");
      out.write("        <li class=\"header\"> PORTAFOLIO CASOS DE USO                         </li>\n");
      out.write("\t\n");
      out.write("\t<li class=\"treview\"><a href=\"/PortafolioWeb/portafolio.pdf\">\n");
      out.write("\t <i class=\"fa fa-fw fa-file-pdf-o\"></i>\n");
      out.write("\t<span class=\"pull-left-container\"> - PORTAFOLIO PDF CASE</a> </span>                        </li>        \n");
      out.write("\t<li class \"treview\"><a href=\"/PortafolioWeb/Informe\">\n");
      out.write("\t  <i class=\"fa fa-fw fa-file-word-o\"></i>\n");
      out.write("\t<span class=\"pull-left-container\"> - INFORME WORD</a></span>                        </li>        \n");
      out.write("\n");
 if(admin || adminsolo){ 			
      out.write("\t\t\n");
      out.write("\n");
      out.write("     <li id=\"CU1_0\" class=\"treeview\">\n");
      out.write("          <a href=\"CU1\">\n");
      out.write("            <i class=\"fa fa-circle-o text-red\"></i>\n");
      out.write("            <span>CU1 - Mantener Cliente</span>\n");
      out.write("            <span class=\"pull-right-container\">\n");
      out.write("              <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("             </span>\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"treeview-menu\">\n");
      out.write("            <li><a href=\"/PortafolioWeb/cases/CU1/CU1/agregarCliente.jsp\">      <i id=\"CU1_1\" class=\"fa fa-circle-o\"></i> Agregar Cliente</a></li>\n");
      out.write("            <li><a href=\"/PortafolioWeb/cases/CU1/CU1/modificarCliente.jsp\">          <i id=\"CU1_2\" class=\"fa fa-circle-o\"></i> Modificar Cliente</a></li>\n");
      out.write("            <li><a href=\"/PortafolioWeb/cases/CU1/CU1/eliminarCliente.jsp\">        <i id=\"CU1_3\" class=\"fa fa-circle-o\"></i> Eliminar Cliente</a></li>\n");
      out.write("            <li><a href=\"/PortafolioWeb/cases/CU1/CU1/listarCliente.jsp\">        <i id=\"CU1_4\" class=\"fa fa-circle-o\"></i> Listar Cliente</a></li>\n");
      out.write("            <li><a href=\"/PortafolioWeb/cases/CU1/CU1/todoCliente.jsp\">        <i id=\"CU1_5\" class=\"fa fa-circle-o\"></i> (TODO) Cliente</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
 }                            
      out.write('\n');
 if(admin || adminsolo){ 			
      out.write("\n");
      out.write("\n");
      out.write("      <li id=\"CU2_0\" class=\"treeview\">\n");
      out.write("         <a href=\"/web/CU2\">\n");
      out.write("            <i class=\"fa fa-circle-o text-red\"></i>\n");
      out.write("            <span> CU2 - Mantener Profesional</span>\n");
      out.write("            <span class=\"pull-right-container\">\n");
      out.write("              <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("             </span>\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"treeview-menu\">\n");
      out.write("\t    <li><a href=\"/PortafolioWeb/cases/CU2/agregarProfesional.jsp\">      <i id=\"CU2_1\" class=\"fa fa-circle-o\"></i> Agregar Profesional</a></li>\n");
      out.write("            <li><a href=\"/PortafolioWeb/cases/CU2/modificarProfesional.jsp\">          <i id=\"CU2_2\"class=\"fa fa-circle-o\"></i> Modificar Profesional</a></li>\n");
      out.write("            <li><a href=\"/PortafolioWeb/cases/CU2/eliminarProfesional.jsp\">        <i id=\"CU2_3\" class=\"fa fa-circle-o\"></i> Eliminar Profesional</a></li>\n");
      out.write("            <li><a href=\"/PortafolioWeb/cases/CU2/listarProfesional.jsp\">        <i id=\"CU2_4\" class=\"fa fa-circle-o\"></i> Listar Profesional</a></li>\n");
      out.write("            <li><a href=\"/PortafolioWeb/cases/CU2/todoProfesional.jsp\">        <i id=\"CU2_5\" class=\"fa fa-circle-o\"></i> (TODO) Profesional</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("\n");
 }                            
      out.write('\n');
 if(admin || profesional){ 			
      out.write("\n");
      out.write("\n");
      out.write("        <li id=\"CU3_0\" class=\"treeview\">\n");
      out.write("          <a href=\"#\">\n");
      out.write("            <i class=\"fa fa-circle-o text-yellow\"></i>\n");
      out.write("            <span>CU3 - Crear capacitaci&oacuten</span>\n");
      out.write("            <span class=\"pull-right-container\">\n");
      out.write("              <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("            </span>\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"treeview-menu\">\n");
      out.write("            <li><a href=\"/PortafolioWeb/cases/CU3/\"><i id=\"CU3_1\" class=\"fa fa-circle-o\"></i> Gestiona Capacitacion</a></li>\n");
      out.write("            <li><a href=\"/PortafolioWeb/cases/CU3/\"><i id=\"CU3_2\" class=\"fa fa-circle-o\"></i> Solicita Capacitacion cli</a></li>\n");
      out.write("            <li><a href=\"/PortafolioWeb/cases/CU3/\"><i id=\"CU3_3\" class=\"fa fa-circle-o\"></i> TODO</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("\n");
 }                            
      out.write('\n');
 if(admin || profesional){ 			
      out.write("\n");
      out.write("\n");
      out.write("        <li id=\"CU4_0\" class=\"treeview\">\n");
      out.write("          <a href=\"#\">\n");
      out.write("            <i class=\"fa fa-circle-o text-yellow\"></i>\n");
      out.write("            <span>CU4 - Planificar visita </span>\n");
      out.write("            <span class=\"pull-right-container\">\n");
      out.write("              <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("            </span>\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"treeview-menu\">\n");
      out.write("            <li><a href=\"/PortafolioWeb/cases/CU4/\"><i id=\"CU4_1\" class=\"fa fa-circle-o\"></i> Planificar Visita</a></li>\n");
      out.write("            <li><a href=\"/PortafolioWeb/cases/CU4/\"><i id=\"CU4_2\" class=\"fa fa-circle-o\"></i> Gestionar Visita</a></li>\n");
      out.write("            <li><a href=\"/PortafolioWeb/cases/CU4/\"><i id=\"CU4_3\" class=\"fa fa-circle-o\"></i> Lista de Chequeo</a></li>\n");
      out.write("            <li><a href=\"/PortafolioWeb/cases/CU4/\"><i id=\"CU4_4\" class=\"fa fa-circle-o\"></i> TODO</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("\n");
 }                            
      out.write('\n');
 if(admin || profesional){ 			
      out.write("\n");
      out.write("\n");
      out.write("        <li id=\"CU5_0\" class=\"treeview\">\n");
      out.write("          <a href=\"#\">\n");
      out.write("            <i class=\"fa fa-circle-o text-yellow\"></i>\n");
      out.write("            <span>CU5 - Revisar cliente </span>\n");
      out.write("            <span class=\"pull-right-container\">\n");
      out.write("              <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("            </span>\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"treeview-menu\">\n");
      out.write("            <li><a href=\"/PortafolioWeb/cases/CU5/\"><i id=\"CU5_1\" class=\"fa fa-circle-o\"></i> Emitir Informe Cliente </a></li>\n");
      out.write("            <li><a href=\"/PortafolioWeb/cases/CU5/\"><i id=\"CU5_2\" class=\"fa fa-circle-o\"></i> (todo) Revisar Cliente </a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("\n");
 }                            
      out.write('\n');
 if(admin || cliente){ 			
      out.write("\n");
      out.write("\n");
      out.write("        <li id=\"CU6_0\" class=\"treeview\">\n");
      out.write("          <a href=\"#\">\n");
      out.write("            <i class=\"fa fa-circle-o text-aqua\"></i>\n");
      out.write("            <span>CU6 - Reportar accidente </span>\n");
      out.write("            <span class=\"pull-right-container\">\n");
      out.write("              <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("            </span>\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"treeview-menu\">\n");
      out.write("            <li><a href=\"/PortafolioWeb/cases/CU6/\"><i id=\"CU6_1\" class=\"fa fa-circle-o\"></i> TODO</a></li>\n");
      out.write("            <li><a href=\"/PortafolioWeb/cases/CU6/\"><i id=\"CU6_2\" class=\"fa fa-circle-o\"></i> TODO</a></li>\n");
      out.write("</ul>\n");
      out.write("        </li>\n");
      out.write("\n");
 }                            
      out.write('\n');
 if(admin || profesional){ 			
      out.write("\n");
      out.write("\n");
      out.write("        <li id=\"CU7_0\" class=\"treeview\">\n");
      out.write("          <a href=\"#\">\n");
      out.write("            <i class=\"fa fa-circle-o text-yellow\"></i>\n");
      out.write("            <span>CU7 - Crear caso de asesora </span>\n");
      out.write("            <span class=\"pull-right-container\">\n");
      out.write("              <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("            </span>\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"treeview-menu\">\n");
      out.write("            <li><a href=\"/PortafolioWeb/cases/CU7/\"><i id=\"CU7_1\" class=\"fa fa-circle-o\"></i> TODO</a></li>\n");
      out.write("            <li><a href=\"/PortafolioWeb/cases/CU7/\"><i id=\"CU7_2\" class=\"fa fa-circle-o\"></i> TODO</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("\n");
 }                            
      out.write('\n');
 if(admin || profesional){ 			
      out.write("\n");
      out.write("\n");
      out.write("        <li id=\"CU8_0\" class=\"treeview\">\n");
      out.write("          <a href=\"#\">\n");
      out.write("            <i class=\"fa fa-circle-o text-yellow\"></i>\n");
      out.write("            <span>CU8 - Ingresar actividad de mejora </span>\n");
      out.write("            <span class=\"pull-right-container\">\n");
      out.write("              <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("            </span>\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"treeview-menu\">\n");
      out.write("            <li><a href=\"/PortafolioWeb/cases/CU8/\"><i id=\"CU8_1\" class=\"fa fa-circle-o\"></i> TODO</a></li>\n");
      out.write("            <li><a href=\"/PortafolioWeb/cases/CU8/\"><i id=\"CU8_2\" class=\"fa fa-circle-o\"></i> TODO</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("\n");
 }                            
      out.write('\n');
 if(admin || profesional){ 			
      out.write("\n");
      out.write("\n");
      out.write("        <li id=\"CU9_0\" class=\"treeview\">\n");
      out.write("          <a href=\"#\">\n");
      out.write("            <i class=\"fa fa-circle-o text-yellow\"></i>\n");
      out.write("            <span>CU9 - Revisar actividad mejora </span>\n");
      out.write("            <span class=\"pull-right-container\">\n");
      out.write("              <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("            </span>\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"treeview-menu\">\n");
      out.write("            <li><a href=\"/PortafolioWeb/cases/CU9/\"><i id=\"CU9_1\" class=\"fa fa-circle-o\"></i> TODO</a></li>\n");
      out.write("            <li><a href=\"/PortafolioWeb/cases/CU9/\"><i id=\"CU9_2\" class=\"fa fa-circle-o\"></i> TODO</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("\n");
 }                            
      out.write('\n');
 if(admin || adminsolo){ 			
      out.write("\n");
      out.write("\n");
      out.write("        <li id=\"CU10_0\" class=\"treeview\">\n");
      out.write("          <a href=\"#\">\n");
      out.write("            <i class=\"fa fa-circle-o text-red\"></i>\n");
      out.write("            <span>CU10 - Controlar pagos cliente </span>\n");
      out.write("            <span class=\"pull-right-container\">\n");
      out.write("              <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("            </span>\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"treeview-menu\">\n");
      out.write("            <li><a href=\"/PortafolioWeb/cases/CU10/\"><i id=\"CU10_1\" class=\"fa fa-circle-o\"></i> TODO</a></li>\n");
      out.write("            <li><a href=\"/PortafolioWeb/cases/CU10/\"><i id=\"CU10_2\" class=\"fa fa-circle-o\"></i> TODO</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("\n");
 }                            
      out.write('\n');
 if(admin || profesional || cliente){ 			
      out.write("\n");
      out.write("\n");
      out.write("        <li id=\"CU11_0\" class=\"treeview\">\n");
      out.write("          <a href=\"#\">\n");
      out.write("            <i class=\"fa fa-laptop\"></i>\n");
      out.write("            <span>CU11 - BUG ME :3 </span>\n");
      out.write("            <span class=\"pull-right-container\">\n");
      out.write("              <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("            </span>\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"treeview-menu\">\n");
      out.write("\n");
      out.write("            <li><a href=\"/PortafolioWeb/cases/CU11/\"><i id=\"CU11_1\" class=\"fa fa-circle-o\"></i> TODO</a></li>\n");
      out.write("            <li><a href=\"/PortafolioWeb/cases/CU11/\"><i id=\"CU11_2\" class=\"fa fa-circle-o\"></i> TODO</a></li>\n");
      out.write("            <li><a href=\"/PortafolioWeb/cases/CU11/\"><i id=\"CU11_3\" class=\"fa fa-circle-o\"></i> TODO</a></li>\n");
      out.write("            <li><a href=\"/PortafolioWeb/cases/CU11/\"><i id=\"CU11_4\" class=\"fa fa-circle-o\"></i> TODO</a></li>\n");
      out.write("\n");
      out.write("          </ul>\n");
      out.write("\t</li>\n");
      out.write("\n");
 }                            
      out.write('\n');
 if(admin || adminsolo){ 			
      out.write("\n");
      out.write("\n");
      out.write("        <li id=\"CU12_0\" class=\"treeview\">\n");
      out.write("          <a href=\"#\">\n");
      out.write("            <i class=\"fa fa-circle-o text-red\"></i>\n");
      out.write("            <span>CU12 - Calcular accidentabilidad </span>\n");
      out.write("            <span class=\"pull-right-container\">\n");
      out.write("              <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("            </span>\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"treeview-menu\">\n");
      out.write("            <li><a href=\"/PortafolioWeb/cases/CU12/\"><i id=\"CU12_1\" class=\"fa fa-circle-o\"></i> TODO</a></li>\n");
      out.write("            <li><a href=\"/PortafolioWeb/cases/CU12/\"><i id=\"CU12_2\" class=\"fa fa-circle-o\"></i> TODO</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("\n");
      out.write("\n");
 }                            
      out.write('\n');
 if(admin || profesional){ 			
      out.write("\n");
      out.write("\n");
      out.write("        <li id=\"CU13_0\" class=\"treeview\">\n");
      out.write("          <a href=\"#\">\n");
      out.write("            <i class=\"fa fa-circle-o text-yellow\"></i>\n");
      out.write("            <span>CU13 - Ingresar asesor&iacutea </span>\n");
      out.write("            <span class=\"pull-right-container\">\n");
      out.write("              <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("            </span>\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"treeview-menu\">\n");
      out.write("            <li><a href=\"/PortafolioWeb/cases/CU13/\"><i id=\"CU13_1\" class=\"fa fa-circle-o\"></i> TODO</a></li>\n");
      out.write("            <li><a href=\"/PortafolioWeb/cases/CU13/\"><i id=\"CU13_2\" class=\"fa fa-circle-o\"></i> TODO</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("\n");
 }                            
      out.write('\n');
 if(admin || profesional){ 			
      out.write("\n");
      out.write("\n");
      out.write("        <li id=\"CU14_0\" class=\"treeview\">\n");
      out.write("          <a href=\"#\">\n");
      out.write("            <i class=\"fa fa-circle-o text-yellow\"></i>\n");
      out.write("            <span>CU14 - Visualizar actividades </span>\n");
      out.write("            <span class=\"pull-right-container\">\n");
      out.write("              <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("            </span>\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"treeview-menu\">\n");
      out.write("            <li><a href=\"/PortafolioWeb/cases/CU14/\"><i id=\"CU14_1\" class=\"fa fa-circle-o\"></i> TODO</a></li>\n");
      out.write("            <li><a href=\"/PortafolioWeb/cases/CU14/\"><i id=\"CU14_2\" class=\"fa fa-circle-o\"></i> TODO</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("\n");
 }                            
      out.write('\n');
 if(admin || profesional){ 			
      out.write("\n");
      out.write("\n");
      out.write("        <li id=\"CU15_0\" class=\"treeview\">\n");
      out.write("          <a href=\"#\">\n");
      out.write("            <i class=\"fa fa-circle-o text-yellow\"></i>\n");
      out.write("            <span>CU15 - Notificar atrasos </span>\n");
      out.write("            <span class=\"pull-right-container\">\n");
      out.write("              <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("            </span>\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"treeview-menu\">\n");
      out.write("            <li><a href=\"/PortafolioWeb/cases/CU15/\"><i id=\"CU15_1\" class=\"fa fa-circle-o\"></i> TODO</a></li>\n");
      out.write("            <li><a href=\"/PortafolioWeb/cases/CU15/\"><i id=\"CU15_2\" class=\"fa fa-circle-o\"></i> TODO</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("\n");
 }                            
      out.write('\n');
 if(admin || cliente){ 			
      out.write("\n");
      out.write("\n");
      out.write("        <li id=\"CU16_0\" class=\"treeview\">\n");
      out.write("          <a href=\"#\">\n");
      out.write("            <i class=\"fa fa-circle-o text-aqua\"></i>\n");
      out.write("            <span>CU16 - Solicitar asesor&iacutea especial </span>\n");
      out.write("            <span class=\"pull-right-container\">\n");
      out.write("              <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("            </span>\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"treeview-menu\">\n");
      out.write("            <li><a href=\"/PortafolioWeb/cases/CU16/\"><i id=\"CU16_1\" class=\"fa fa-circle-o\"></i> TODO</a></li>\n");
      out.write("            <li><a href=\"/PortafolioWeb/cases/CU16/\"><i id=\"CU16_2\" class=\"fa fa-circle-o\"></i> TODO</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("\n");
 }                            
      out.write('\n');
 if(admin || profesional){ 			
      out.write("\n");
      out.write("\n");
      out.write("        <li id=\"CU17_0\" class=\"treeview\">\n");
      out.write("          <a href=\"#\">\n");
      out.write("            <i class=\"fa fa-circle-o text-yellow\"></i>\n");
      out.write("            <span>CU17 - Crear Cheklist </span>\n");
      out.write("            <span class=\"pull-right-container\">\n");
      out.write("              <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("            </span>\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"treeview-menu\">\n");
      out.write("            <li><a href=\"/PortafolioWeb/cases/CU17/\"><i id=\"CU17_1\" class=\"fa fa-circle-o\"></i> TODO</a></li>\n");
      out.write("            <li><a href=\"/PortafolioWeb/cases/CU17/\"><i id=\"CU17_2\" class=\"fa fa-circle-o\"></i> TODO</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("\n");
 }                            
      out.write('\n');
 if(admin || profesional){ 			
      out.write("\n");
      out.write("\n");
      out.write("        <li id=\"CU18_0\" class=\"treeview\">\n");
      out.write("          <a href=\"#\">\n");
      out.write("            <i class=\"fa fa-circle-o text-yellow\"></i>\n");
      out.write("            <span>CU18 - Responder Checklist </span>\n");
      out.write("            <span class=\"pull-right-container\">\n");
      out.write("              <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("            </span>\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"treeview-menu\">\n");
      out.write("            <li><a href=\"/PortafolioWeb/cases/CU18/\"><i id=\"CU18_1\" class=\"fa fa-circle-o\"></i> TODO</a></li>\n");
      out.write("            <li><a href=\"/PortafolioWeb/cases/CU18/\"><i id=\"CU18_2\" class=\"fa fa-circle-o\"></i> TODO</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("\n");
 }                            
      out.write('\n');
 if(admin || adminsolo){ 			
      out.write("\n");
      out.write("\n");
      out.write("        <li id=\"CU19_0\" class=\"treeview\">\n");
      out.write("          <a href=\"#\">\n");
      out.write("            <i class=\"fa fa-circle-o text-red\"></i>\n");
      out.write("            <span>CU19 - Generar reporte cliente</span>\n");
      out.write("            <span class=\"pull-right-container\">\n");
      out.write("              <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("            </span>\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"treeview-menu\">\n");
      out.write("            <li><a href=\"/PortafolioWeb/cases/CU19/\"><i id=\"CU19_1\" class=\"fa fa-circle-o\"></i> General Reporte PDF</a></li>\n");
      out.write("            <li><a href=\"/PortafolioWeb/cases/CU19/\"><i id=\"CU19_2\" class=\"fa fa-circle-o\"></i> General Reporte WEB</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("\n");
 }                            
      out.write('\n');
 if(admin || adminsolo){ 			
      out.write("\n");
      out.write("\n");
      out.write("        <li id=\"CU20_0\" class=\"treeview\">\n");
      out.write("          <a href=\"#\">\n");
      out.write("            <i class=\"fa fa-circle-o text-red\"></i>\n");
      out.write("            <span>CU20 - Generar reporte global</span>\n");
      out.write("            <span class=\"pull-right-container\">\n");
      out.write("              <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("            </span>\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"treeview-menu\">\n");
      out.write("            <li><a href=\"/PortafolioWeb/cases/CU20/\"><i id=\"CU20_1\" class=\"fa fa-circle-o\"></i> TODO</a></li>\n");
      out.write("            <li><a href=\"/PortafolioWeb/cases/CU20/\"><i id=\"CU20_2\" class=\"fa fa-circle-o\"></i> TODO</a></li>\n");
      out.write("            <li><a href=\"/PortafolioWeb/pages/UI/general.html\"><i id=\"CU20_3\" class=\"fa fa-circle-o\"></i> General</a></li>\n");
      out.write("            <li><a href=\"/PortafolioWeb/pages/UI/icons.html\"><i class=\"fa fa-circle-o\"></i> Icons</a></li>\n");
      out.write("            <li><a href=\"/PortafolioWeb/pages/UI/buttons.html\"><i class=\"fa fa-circle-o\"></i> Buttons</a></li>\n");
      out.write("            <li><a href=\"/PortafolioWeb/pages/UI/sliders.html\"><i class=\"fa fa-circle-o\"></i> Sliders</a></li>\n");
      out.write("            <li><a href=\"/PortafolioWeb/pages/UI/timeline.html\"><i class=\"fa fa-circle-o\"></i> Timeline</a></li>\n");
      out.write("            <li><a href=\"/PortafolioWeb/pages/UI/modals.html\"><i class=\"fa fa-circle-o\"></i> Modals</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("\n");
 }                            
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("      </ul>\n");
      out.write("    </section>\n");
      out.write("    <!-- /.sidebar -->\n");
      out.write("  </aside>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- ############################################################################################# -->\n");
      out.write("<!-- ############################################################################################# -->\n");
      out.write("<!-- ############################################################################################# -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"content-wrapper\">\n");
      out.write("    <section class=\"content-header\">\n");
      out.write("      <h1>\n");
      out.write("        Informacion sobre el Portafolio \n");
      out.write("        <a href=\"../portafolio.pdf\"><small>PDF CASO 4</small>\n");
      out.write("      </h1>\n");
      out.write("      <ol class=\"breadcrumb\">\n");
      out.write("        <li><a href=\"#\"><i class=\"fa fa-dashboard\"></i> Home</a></li>\n");
      out.write("        <li class=\"active\">Casos de Uso</li>\n");
      out.write("      </ol>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("<section class=\"content\">\n");
      out.write("\n");
      out.write("\t<div class=\"row\">\n");
      out.write("        <!-- /.col -->\n");
      out.write("        <div class=\"col-md-3\">\n");
      out.write("\t  <div class=\"box box-success box-solid\">\n");
      out.write("            <div class=\"box-header with-border\">\n");
      out.write("              <h3 class=\"box-title\">Roles por CU </h3>\n");
      out.write("\n");
      out.write("              <div class=\"box-tools pull-right\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-box-tool\" data-widget=\"collapse\"><i class=\"fa fa-minus\"></i>\n");
      out.write("                </button>\n");
      out.write("              </div>\n");
      out.write("              <!-- /.box-tools -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /.box-header -->\n");
      out.write("            <div class=\"box-body\">\n");
      out.write("              <i class=\"fa fa-circle-o text-green\">  </i><a href=\"index.jsp?tipoUser=1\"> <span> ALL</span></a><br>\n");
      out.write("\t      <i class=\"fa fa-circle-o text-red\">    </i> <a href=\"index.jsp?tipoUser=4\"> <span> Administrador</span></a><br>\n");
      out.write("              <i class=\"fa fa-circle-o text-yellow\"> </i> <a href=\"index.jsp?tipoUser=2\"> <span> Profesional</span>  </a><br>\n");
      out.write("              <i class=\"fa fa-circle-o text-aqua\">   </i> <a href=\"index.jsp?tipoUser=3\"> <span> Cliente</span>      </a><br>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.box-body -->\n");
      out.write("          </div>\n");
      out.write("          <!-- /.box -->\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- /.col -->\n");
      out.write("        <div class=\"col-md-4\">\n");
      out.write("\t  <div class=\"box box-success box-solid\">\n");
      out.write("            <div class=\"box-header with-border\">\n");
      out.write("              <h3 class=\"box-title\">&Aacutembito de Gesti&oacuten</h3>\n");
      out.write("\n");
      out.write("              <div class=\"box-tools pull-right\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-box-tool\" data-widget=\"collapse\"><i class=\"fa fa-minus\"></i>\n");
      out.write("                </button>\n");
      out.write("              </div>\n");
      out.write("              <!-- /.box-tools -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /.box-header -->\n");
      out.write("            <div class=\"box-body\">\n");
      out.write("\t      <i class=\"fa fa-file-word-o\"></i> <a href=\"/PortafolioWeb/resourcesPortafolio/InformeControlySeguimiento.abw\"><span>Informe Control y Seguimiento</span></a><br/>\n");
      out.write("              <i class=\"fa fa-file-word-o\"></i> <a href=\"/PortafolioWeb/resourcesPortafolio/Minuta de Reuniones_ Avance Proyecto Edu.xlsx\"><span>Actas de Reunion</span></a><br/>\n");
      out.write("              <i class=\"fa fa-file-word-o\"></i> <a href=\"#\"><span>Documentos Casos de Prueba</span></a><br/>\n");
      out.write("              <i class=\"fa fa-file-code-o\"></i> <a href=\"#\"><span>Informe de Aplicacion de Pruebas</span></a><br/>\n");
      out.write("              <i class=\"fa fa-file-image-o\"></i> <a href=\"#\"><span>Diagrama de Arquitectura</span></a><br/>\n");
      out.write("             <i class=\"fa fa-file-text-o\"></i> <a href=\"#\"><span>Diccionario de datos</span></a>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.box-body -->\n");
      out.write("          </div>\n");
      out.write("          <!-- /.box -->\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<div class=\"row\">\n");
      out.write("        <!-- /.col -->\n");
      out.write("        <div class=\"col-md-4\">\n");
      out.write("\t  <div class=\"box box-success box-solid\">\n");
      out.write("            <div class=\"box-header with-border\">\n");
      out.write("              <h3 class=\"box-title\">&Aacutembito de Dise&ntildeo</h3>\n");
      out.write("\n");
      out.write("              <div class=\"box-tools pull-right\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-box-tool\" data-widget=\"collapse\"><i class=\"fa fa-minus\"></i>\n");
      out.write("                </button>\n");
      out.write("              </div>\n");
      out.write("              <!-- /.box-tools -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /.box-header -->\n");
      out.write("            <div class=\"box-body\">\n");
      out.write("\t      <i class=\"fa fa-file-image-o\"></i> <a href=\"#\"><span>Modelo de Datos E-R </span></a><br>\n");
      out.write("              <i class=\"fa fa-file-image-o\"></i> <a href=\"#\"><span>Modelo Relacional Normalizado</span></a><br>\n");
      out.write("              <i class=\"fa fa-file-image-o\"></i> <a href=\"/PortafolioWeb/resourcesPortafolio/DiagramaClases.png\"><span>Diagrama de Clases </span></a><br>             \n");
      out.write("\t      <i class=\"fa fa-file-image-o\"></i> <a href=\"/PortafolioWeb/resourcesPortafolio/Diagramasecuencia.png\"><span>Diagrama de Secuencia </span></a>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.box-body -->\n");
      out.write("          </div>\n");
      out.write("          <!-- /.box -->\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<div class=\"row\">\n");
      out.write("        <!-- /.col -->\n");
      out.write("        <div class=\"col-md-4\">\n");
      out.write("\t  <div class=\"box box-success box-solid\">\n");
      out.write("            <div class=\"box-header with-border\">\n");
      out.write("              <h3 class=\"box-title\">&Aacutembito de Desarrollo Software</h3>\n");
      out.write("\n");
      out.write("              <div class=\"box-tools pull-right\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-box-tool\" data-widget=\"collapse\"><i class=\"fa fa-minus\"></i>\n");
      out.write("                </button>\n");
      out.write("              </div>\n");
      out.write("              <!-- /.box-tools -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /.box-header -->\n");
      out.write("            <div class=\"box-body\">\n");
      out.write("\t      <i class=\"fa fa-file-code-o\"></i> <a href=\"#\"><span>Programacion autenticacion</span></a><br>\n");
      out.write("              <i class=\"fa fa-file-code-o\"></i> <a href=\"#\"><span>Aplicacion de Pruebas</span></a><br>\n");
      out.write("              <i class=\"fa fa-file-code-o\"></i> <a href=\"#\"><span>Programacion de Base de Datos</span></a><br>\n");
      out.write("              <i class=\"fa fa-file-code-o\"></i> <a href=\"#\"><span>Programacion de Casos de Negocio</span></a><br>\n");
      out.write("              <i class=\"fa fa-file-code-o\"></i> <a href=\"#\"><span>Programacion de Casos de Integracion</span></a><br>\n");
      out.write("              <i class=\"fa fa-file-code-o\"></i> <a href=\"#\"><span>Programacion de Casos de Investigacion</span></a><br>\n");
      out.write("            \n");
      out.write("\t</div>\n");
      out.write("            <!-- /.box-body -->\n");
      out.write("          </div>\n");
      out.write("          <!-- /.box -->\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- ############################################################################################# -->\n");
      out.write("<!-- ############################################################################################# -->\n");
      out.write("<!-- ############################################################################################# -->\n");
      out.write("\n");
      out.write("<!-- jQuery 2.2.3 -->\n");
      out.write("<script src=\"/PortafolioWeb/plugins/jQuery/jquery-2.2.3.min.js\"></script>\n");
      out.write("<!-- jQuery UI 1.11.4 -->\n");
      out.write("<script src=\"https://code.jquery.com/ui/1.11.4/jquery-ui.min.js\"></script>\n");
      out.write("<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->\n");
      out.write("<script>\n");
      out.write("  $.widget.bridge('uibutton', $.ui.button);\n");
      out.write("</script>\n");
      out.write("<!-- Bootstrap 3.3.6 -->\n");
      out.write("<script src=\"/PortafolioWeb/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("<!-- Morris.js charts -->\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js\"></script>\n");
      out.write("<script src=\"/web/plugins/morris/morris.min.js\"></script>\n");
      out.write("<!-- Sparkline -->\n");
      out.write("<script src=\"/web/plugins/sparkline/jquery.sparkline.min.js\"></script>\n");
      out.write("<!-- jvectormap -->\n");
      out.write("<script src=\"/web/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js\"></script>\n");
      out.write("<script src=\"/web/plugins/jvectormap/jquery-jvectormap-world-mill-en.js\"></script>\n");
      out.write("<!-- jQuery Knob Chart -->\n");
      out.write("<script src=\"/web/plugins/knob/jquery.knob.js\"></script>\n");
      out.write("<!-- daterangepicker -->\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.11.2/moment.min.js\"></script>\n");
      out.write("<script src=\"plugins/daterangepicker/daterangepicker.js\"></script>\n");
      out.write("<!-- datepicker -->\n");
      out.write("<script src=\"/PortafolioWeb/plugins/datepicker/bootstrap-datepicker.js\"></script>\n");
      out.write("<!-- Bootstrap WYSIHTML5 -->\n");
      out.write("<script src=\"/PortafolioWeb/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js\"></script>\n");
      out.write("<!-- Slimscroll -->\n");
      out.write("<script src=\"/PortafolioWeb/plugins/slimScroll/jquery.slimscroll.min.js\"></script>\n");
      out.write("<!-- FastClick -->\n");
      out.write("<script src=\"/PortafolioWeb/plugins/fastclick/fastclick.js\"></script>\n");
      out.write("<!-- AdminLTE App -->\n");
      out.write("<script src=\"/PortafolioWeb/dist/js/app.min.js\"></script>\n");
      out.write("<!-- AdminLTE dashboard demo (This is only for demo purposes) -->\n");
      out.write("<script src=\"/PortafolioWeb/dist/js/pages/dashboard.js\"></script>\n");
      out.write("<!-- AdminLTE for demo purposes -->\n");
      out.write("<script src=\"dist/js/demo.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- ############################################################################################# -->\n");
      out.write("<!-- ############################################################################################# -->\n");
      out.write("<!-- ############################################################################################# -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
