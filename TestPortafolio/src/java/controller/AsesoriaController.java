
package controller;

import DAO.DaoAsesoria;
import DAO.DaoTipoAsesoria;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Asesoria;
import model.TipoAsesoria;

@WebServlet(name = "AsesoriaController", urlPatterns = {"/AsesoriaController"})
public class AsesoriaController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Asesoria asesoria;
        
        int id = IDFactory.generate();
        String nombre = request.getParameter("nombre");
        int tipo = Integer.parseInt(request.getParameter("tipo"));
        String descripcion = request.getParameter("descripcion");
        String enterreno = request.getParameter("enterreno");
        
        int terreno = enterreno!=null?1:0;
        
        try {
            asesoria = new Asesoria(
                    id,
                    nombre,
                    descripcion,
                    terreno,
                    new DaoTipoAsesoria().obtener(tipo));
            new DaoAsesoria().insert(asesoria);
        
        } catch (SQLException ex) {
            Logger.getLogger(AsesoriaController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        try (PrintWriter out = response.getWriter()) {
            out.println("<br>id_asesoria : " +id);
            out.println("<br>id_tipo_asesoria : " +tipo);
            out.println("<br>nombre : " +nombre);
            out.println("<br>descripcion : " +descripcion);
            out.println("<br>enterreno : " +terreno);
            out.println("<br>" + new DaoAsesoria().combobox("asesorias"));
        } catch (SQLException ex) {
            Logger.getLogger(AsesoriaController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }


}
