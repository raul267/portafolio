package org.apache.jsp.cliente;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.EmpresaCliente;
import DAO.DaoEmpresaCliente;
import DAO.DaoEmpleadoCliente;
import DAO.DaoAccidente;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;
import model.ConectorOracle;
import java.sql.ResultSet;
import model.TipoUsuario;
import model.Usuario;

public final class ReportarAccidente_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/cliente/../linkhead.html");
    _jspx_dependants.add("/cliente/../menu.jsp");
    _jspx_dependants.add("/cliente/../linkfooter.html");
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
  
    
    Date date = new Date();
    Usuario u = (Usuario)session.getAttribute("usuario");
    EmpresaCliente e = new DaoEmpresaCliente().obtener(u);
    

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Reportar Accidente</title>\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"/TestPortafolio/css/estilos.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"/TestPortafolio/style.css\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0,minimum-scale=1.0\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");
      out.write('\n');
      out.write('\n');
 
    boolean cliente = false;
    boolean admin = false;
    boolean profesional = false;
    session.setAttribute("usuario", new Usuario(1, "cliente", "cliente", new TipoUsuario(3, "cliente")));
    Usuario usuario = (Usuario)session.getAttribute("usuario");
    if(usuario==null) response.sendRedirect("/TestPortafolio");
    
    switch(usuario.getId_tipo()){
        case 1: admin = true; break;
        case 2: profesional = true; break;
        case 3: cliente = true; break;
        default: response.sendRedirect("/TestPortafolio");
    }

      out.write("\n");
      out.write("\n");
      out.write("    <header>\n");
      out.write("            <div class=\"menu_bar\">\n");
      out.write("                <a href=\"#\" class=\"bt-menu\"><span class=\"icon-list\"></span>Menu</a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write(" ");
 if(cliente){ 
      out.write("          <!-- Cliente -->\n");
      out.write("            <nav>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href='/TestPortafolio/cliente/ReportarAccidente.jsp'><span class=\"icon-forward\"></span>Reportar Accidente</a></li>\n");
      out.write("                    <li><a href='/TestPortafolio/cliente/SolicitarAsesoria.jsp'><span class=\"icon-forward3\"></span>Solicitar Asesoria</a></li>\n");
      out.write("                    <li><a href='/TestPortafolio/cliente/SolicitarCapacitacion.jsp'><span class=\"icon-forward3\"></span>Solicitar Capacitacion</a></li>\n");
      out.write("                    <li><a href='/TestPortafolio/cliente/VerInformeCheck.jsp'><span class=\"icon-clipboard\"></span>Ver Informe Check List</a></li>\n");
      out.write("                    <li><a href='/TestPortafolio/cliente/VerServicio.jsp'><span class=\"icon-profile\"></span>Ver Servicio</a></li>\n");
      out.write("                    <li><a href='/TestPortafolio/cliente/VerSolicitudes.jsp'><span class=\"icon-profile\"></span>Ver Solicitudes</a></li>\n");
      out.write("                    <li><a href='/TestPortafolio/cliente/AgregarEmpleadoCliente.jsp'><span class=\"icon-profile\"></span>Agregar Empleado Cliente</a></li>\n");
      out.write("                    <li><a href='/TestPortafolio/cerrarSession.jsp'><span class=\"icon-exit\"></span>Cerrar Session</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
 } 
      out.write("    \n");
 if(profesional){ 
      out.write(" \n");
      out.write("            <!-- Profesional -->\n");
      out.write("            <nav>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href='/TestPortafolio/profesional/CrearCapacitacion.jsp'><span class=\"icon-forward\"></span>Crear Capacitacion</a></li>\n");
      out.write("                    <li><a href='/TestPortafolio/profesional/PlanificarVisita.jsp'><span class=\"icon-forward3\"></span>Planificar Visita</a></li>\n");
      out.write("                    <li><a href='/TestPortafolio/profesional/RevisarCliente.jsp'><span class=\"icon-forward3\"></span>Revisar Cliente</a></li>\n");
      out.write("                    <li><a href='/TestPortafolio/profesional/CrearCasoAsesoria.jsp'><span class=\"icon-clipboard\"></span>Crear Caso Asesoria</a></li>\n");
      out.write("                    <li><a href='/TestPortafolio/profesional/VerServicio.jsp'><span class=\"icon-profile\"></span>Ingresar Actividad Mejora</a></li>\n");
      out.write("                    <li><a href='/TestPortafolio/profesional/IngresarActividadMejora.jsp'><span class=\"icon-profile\"></span>Ingresar Asesoria</a></li>\n");
      out.write("                    <li><a href='/TestPortafolio/profesional/VisualizarActividades.jsp'><span class=\"icon-profile\"></span>Visualizar Actividades</a></li>\n");
      out.write("                    <li><a href='/TestPortafolio/profesional/NotificarAtrasos.jsp'><span class=\"icon-profile\"></span>Notificar Atrasos</a></li>\n");
      out.write("                    <li><a href='/TestPortafolio/profesional/CrearCheckList.jsp'><span class=\"icon-profile\"></span>Crear Check List</a></li>\n");
      out.write("                    <li><a href='/TestPortafolio/profesional/ResponderCheckList.jsp'><span class=\"icon-profile\"></span>Responder Check List</a></li>\n");
      out.write("                    <li><a href='/TestPortafolio/profesional/Todo.jsp'><span class=\"icon-profile\"></span>ALL pages</a></li>\n");
      out.write("                    <li><a href='/TestPortafolio/cerrarSession.jsp'><span class=\"icon-exit\"></span>Cerrar Session</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
 } 
      out.write("  \n");
 if(admin){ 
      out.write("            \n");
      out.write("            <!-- Admin -->\n");
      out.write("            <nav>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href='/TestPortafolio/administrador/MantenerCliente.jsp'><span class=\"icon-forward\"></span>Mantener Cliente</a></li>\n");
      out.write("                    <li><a href='/TestPortafolio/administrador/MantenerProfesional.jsp'><span class=\"icon-forward3\"></span>Mantener Profesional</a></li>\n");
      out.write("                    <li><a href='/TestPortafolio/administrador/CalcularAccidentabilidad.jsp'><span class=\"icon-forward3\"></span>Calcular Accidentabilidad</a></li>\n");
      out.write("                    <li><a href='/TestPortafolio/administrador/CalcularPagoCliente.jsp'><span class=\"icon-clipboard\"></span>Calcular Pago Cliente</a></li>\n");
      out.write("                    <li><a href='/TestPortafolio/administrador/GenerarReporteGlobal.jsp'><span class=\"icon-profile\"></span>Generar Reporte Global</a></li>\n");
      out.write("                    <li><a href='/TestPortafolio/administrador/GenerarReporteCliente.jsp'><span class=\"icon-profile\"></span>Generar Reporte Cliente</a></li>\n");
      out.write("                    <li><a href='/TestPortafolio/cerrarSession.jsp'><span class=\"icon-exit\"></span>Cerrar Session</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
 } 
      out.write("              \n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <section>\n");
      out.write("            <form action=\"/TestPortafolio/AccidenteController\" method=\"POST\">\n");
      out.write("                <h1>");
      out.print(e.getNombre() );
      out.write("</h1>\n");
      out.write("\n");
      out.write("                <h3>Agregar Accidente</h3>\n");
      out.write("                <label>Fecha Accidente</label>\n");
      out.write("                <input type=\"date\" value=\"");
      out.print(new SimpleDateFormat("YYYY-MM-dd").format(date));
      out.write("\"' name=\"fecha_accidente\"/>\n");
      out.write("                <label>Hora Accidente</label>\n");
      out.write("                <input type=\"time\" value=\"");
      out.print(new SimpleDateFormat("HH:mm").format(date));
      out.write("\" name=\"hora_accidente\"/>\n");
      out.write("\n");
      out.write("                <label>Descripcion Accidente</label>\n");
      out.write("                <textarea rows=\"4\" cols=\"50\" name=\"descripcion_accidente\" placeholder=\"Descripcion... Que hacia y como sucedio el accidente\">\n");
      out.write("\n");
      out.write("                </textarea>\n");
      out.write("                <label>Tipo Accidente</label>\n");
      out.write("\n");
      out.write("                <!-- COMBO BOX Accidente-->\n");
      out.write("                ");
      out.print(new DaoAccidente().comboBoxTipo_Accidente("tipo_accidente"));
      out.write("\n");
      out.write("\n");
      out.write("                <label>Empleado Cliente que sufrio Accidente</label>\n");
      out.write("                <!-- COMBO BOX Empleado Cliente-->\n");
      out.write("                ");
      out.print(new DaoEmpleadoCliente().comboBoxEmpleadoCliente("empleado_cliente",e));
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <input type=\"submit\" value=\"Submit\"/>\n");
      out.write("            </form>\n");
      out.write("                \n");
      out.write("                ");
if (session.getAttribute("errores")!=null) {
      out.write("\n");
      out.write("                <h3> ");
      out.print( "<script>alert('" + session.getAttribute("errores") +"')<  </script>");
      out.write(" </h3>\n");
      out.write("                ");
 session.removeAttribute("errores");}
      out.write("\n");
      out.write("                \n");
      out.write("        </section>\n");
      out.write("        \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("    </body>\n");
      out.write("    ");
      out.write("\n");
      out.write("        <script src=\"http://code.jquery.com/jquery-latest.js\"></script>\n");
      out.write("        <script src=\"/TestPortafolio/js/menu.js\"></script>");
      out.write("\n");
      out.write("</html>");
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
