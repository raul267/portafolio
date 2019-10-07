package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Bienvenido</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" >\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("        \n");
      out.write("         body\n");
      out.write("         {\n");
      out.write("             background-image: url('assets/img/fondo/login.jpg');\n");
      out.write("             background-repeat: no-repeat;\n");
      out.write("             background-size: cover;\n");
      out.write("         }\n");
      out.write("        .centrar\n");
      out.write("\t{\n");
      out.write("\t\tposition: absolute;\n");
      out.write("\t\t/*nos posicionamos en el centro del navegador*/\n");
      out.write("\t\ttop:50%;\n");
      out.write("\t\tleft:50%;\n");
      out.write("\t\t/*determinamos una anchura*/\n");
      out.write("\t\twidth:600px;\n");
      out.write("\t\t/*indicamos que el margen izquierdo, es la mitad de la anchura*/\n");
      out.write("\t\tmargin-left:-300px;\n");
      out.write("\t\t/*determinamos una altura*/\n");
      out.write("\t\theight:330px;\n");
      out.write("\t\t/*indicamos que el margen superior, es la mitad de la altura*/\n");
      out.write("\t\tmargin-top:-150px;\n");
      out.write("\t\tpadding:5px;\n");
      out.write("                border-radius: 35px;\n");
      out.write("                border: 1px solid grey;\n");
      out.write("                background-color: rgb(255,255,255);\n");
      out.write("\t}\n");
      out.write("        .btnLogin\n");
      out.write("        {\n");
      out.write("            width:78%;\n");
      out.write("           transition: width 2s; \n");
      out.write("        }\n");
      out.write("        .btnLogin:hover\n");
      out.write("        {\n");
      out.write("            \n");
      out.write("            width: 100%;\n");
      out.write("             \n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        h2\n");
      out.write("        {\n");
      out.write("            position: relative;\n");
      out.write("            left: 40%;\n");
      out.write("        }\n");
      out.write("        input\n");
      out.write("        {   \n");
      out.write("            position:relative;\n");
      out.write("            left:30%;\n");
      out.write("        }\n");
      out.write("        .abajo\n");
      out.write("        {\n");
      out.write("            margin-top: 25px;\n");
      out.write("        }\n");
      out.write("        h1\n");
      out.write("        {\n");
      out.write("            position:relative;\n");
      out.write("            left:30%;\n");
      out.write("            margin-top:70px;\n");
      out.write("            font-size: 70px;\n");
      out.write("        }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>No mas accidentes</h1>\n");
      out.write("        <div class=\"container centrar   \">\n");
      out.write("            <form method=\"post\" action=\"../src/java/controller/InicioSesion.java\">\n");
      out.write("                <div class=\"col-md-12 col-sm-12 text-center\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <h2>Ingresar</h2>\n");
      out.write("                </div><hr>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"\">\n");
      out.write("                        <div class=\"col-md-12 col-sm-12\">\n");
      out.write("                            Usuario\n");
      out.write("                           <input type=\"text\" class=\"form-control\" id=\"txtNick_name\" name=\"txtNick_name\" required/>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"\">\n");
      out.write("                        <div class=\"col-md-12 col-sm-12\">\n");
      out.write("                            Contraseña\n");
      out.write("                            <input type=\"password\" class=\"form-control\" id=\"txtPassword\" name=\"txtPassword\" required/>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row abajo\">\n");
      out.write("                    <div class=\"col-md-12 col-sm-12 text-center\">\n");
      out.write("                        <input class=\"btn btn-success btnLogin\" type=\"submit\" text=\"Ingresar\"/>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row abajo\">\n");
      out.write("                    <div class=\"col-md-12 col-sm-12 text-left\">\n");
      out.write("                         <a href=\"#\">Olvide mi contraseña</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("      \n");
      out.write("        \n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
