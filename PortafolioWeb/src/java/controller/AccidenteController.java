
package controller;

import DAO.DaoEmpleadoCliente;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Accidente;
import model.ConectorOracle;
import model.EmpleadoCliente;

@WebServlet(name = "AccidenteController", urlPatterns = {"/AccidenteController"})
public class AccidenteController extends HttpServlet  {
@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ConectorOracle con = new ConectorOracle();
        
        ResultSet rs = con.execute("SELECT MAX(id_accidente) FROM accidente");
        
        String fecha_accidente = request.getParameter("fecha_accidente");
        String hora_accidente = request.getParameter("hora_accidente");
        String tipo_accidente = request.getParameter("tipo_accidente");
        String descripcion_accidente = request.getParameter("descripcion_accidente");
        String empleado_cliente = request.getParameter("empleado_cliente");
        
        
        //DaoEmpleadoCliente.getEmpleadoCliente(Integer.parseInt(empleado_cliente));
        //Accidente accidente = new Accidente(2,new EmpleadoCliente(0, tipo_accidente, tipo_accidente, empresaCliente)empleadoCliente, tipoAccidente, date, descripcion_accidente)
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
        
          out.println("<br>fecha_accidente : " +fecha_accidente);
          out.println("<br>hora_accidente : " +hora_accidente);
          out.println("<br>tipo_accidente : " +tipo_accidente);
          out.println("<br>descripcion_accidente : " +descripcion_accidente);
          out.println("<br>id_empleado_cliente : " +empleado_cliente);
        }
    }
}
