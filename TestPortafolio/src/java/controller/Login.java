
package controller;

import DAO.DaoUsuario;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Usuario;

@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {
    
    
    DaoUsuario daoUsuario = new DaoUsuario();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("/TestPortafolio/index.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        String acc = request.getParameter("nick_name");
        String password = request.getParameter("password");
        
        
        
        
        if (acc.isEmpty() || password.isEmpty()){
            response.sendRedirect("/TestPortafolio/index.jsp");
        }
        
        try {
            if (daoUsuario.validarSession(acc, password)){
                Usuario u = daoUsuario.obtener(acc, password);
                
                request.getSession().setAttribute("usuario",u);
                
                int id_tipo_user = u.getTipoUsuario().getId();
                switch(id_tipo_user){
                    case 1: response.sendRedirect("/TestPortafolio/administrador/");break;
                    case 2: response.sendRedirect("/TestPortafolio/profesional/");break;
                    case 3: response.sendRedirect("/TestPortafolio/cliente/");break;
                    default: response.sendRedirect("/TestPortafolio/index.jsp");
                }
                
            }else{
                
                response.sendRedirect("/TestPortafolio/index.jsp");
            }
        } catch (Exception e) {
            try (PrintWriter out = response.getWriter()) {
                e.printStackTrace(new java.io.PrintWriter(out));
            }
        }
            
            
            
        
    }


}
