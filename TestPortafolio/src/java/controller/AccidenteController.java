
package controller;


import DAO.DaoAccidente;
import DAO.DaoAsesoria;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Accidente;
import model.Asesoria;
import model.ConectorOracle;
import model.EmpleadoCliente;
import model.EmpresaCliente;


@WebServlet(name = "AccidenteController", urlPatterns = {"/AccidenteController"})
public class AccidenteController extends HttpServlet  {
@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        EmpleadoCliente empleado = (EmpleadoCliente)session.getAttribute("empleadoCliente");

        
        int id = IDFactory.generate();
        String fecha_accidente = request.getParameter("fecha_accidente");
        String hora_accidente = request.getParameter("hora_accidente");
        int id_tipo_accidente = Integer.parseInt(request.getParameter("tipo_accidente"));
        String descripcion_accidente = request.getParameter("descripcion_accidente");
        int id_empleado_cliente = Integer.parseInt(request.getParameter("empleado_cliente"));
        
        Accidente accidente = new Accidente(
                id,
                id_empleado_cliente,
                id_tipo_accidente,
                Date.valueOf(fecha_accidente),
                hora_accidente+" "+descripcion_accidente);
        
        if(new DaoAccidente().ingresar(accidente)) session.setAttribute("errores", "Accidente Agregado!"  );
        
        response.sendRedirect("/TestPortafolio/cliente/ReportarAccidente.jsp?added=1");
    
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<br>id_accidente : " +id);
          out.println("<br>fecha_accidente : " +fecha_accidente);
          out.println("<br>hora_accidente : " +hora_accidente);
          out.println(accidente.toSql());
          out.println("<br>tipo_accidente : " +id_tipo_accidente);
          out.println("<br>descripcion_accidente : " +descripcion_accidente);
          out.println("<br>id_empleado_cliente : " +id_empleado_cliente);
          out.println("<hr>");
          out.println("<table>");
            try {
                for(Asesoria a : new DaoAsesoria().listar()){
                    out.println("<tr><td>"+a.getNombre()+"</td>"
                            + "<td>"+a.getDescripcion()+"</td>"
                                    + "<td>"+a.getAsesoria().getDescripcion()+"</td>"
                                            + "<td>"+a.getId()+"</td>"
                                                    + "</tr>");
                } } catch (SQLException ex) {
                Logger.getLogger(AccidenteController.class.getName()).log(Level.SEVERE, null, ex);
            }
          out.println("</table>");
          
        }
    }
}
