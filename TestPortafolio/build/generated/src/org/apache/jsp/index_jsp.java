package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;
import model.ConectorOracle;
import java.sql.ResultSet;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
  
    ConectorOracle con = new ConectorOracle("localhost", "1521", "bd3", "a", "xe"); 
     DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
     Date date = new Date();
    out.println("Hora actual: " + dateFormat.format(date));


      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>THING TO USE</title>\n");
      out.write("        <style>\n");
      out.write("            label {\n");
      out.write("                display: block; \n");
      out.write("                font: 1rem 'Fira Sans', sans-serif;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <form action=\"AccidenteController\" method=\"POST\">\n");
      out.write("            <h3>Agregar Accidente</h3>\n");
      out.write("            <label>Fecha Accidente</label>\n");
      out.write("            <input type=\"datetime-local\" name=\"fecha_accidente\"/>\n");
      out.write("            \n");
      out.write("            <label>Descripcion Accidente</label>\n");
      out.write("            <input type=\"text\" name=\"descripcion_accidente\"/>\n");
      out.write("            \n");
      out.write("            <label>Tipo Accidente</label>\n");
      out.write("            <!-- COMBO BOX Accidente-->\n");
      out.write("            ");
  ResultSet rs = con.execute("select id_tipo_accidente,descripcion from tipo_accidente order by id_tipo_accidente asc");
                out.println("\n<select name='tipo_accidente'>");
                while(rs.next()) out.println("   <option value='"+rs.getString("id_tipo_accidente")+"'>"+rs.getString("descripcion")+"</option>");
                out.println("<select/>");
            
      out.write("\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
