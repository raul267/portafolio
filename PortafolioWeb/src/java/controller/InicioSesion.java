/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import DAO_ANTIGUO.DAOProfesional;
import DAO_ANTIGUO.DAOUsuario;
import model_antiguo.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Raúl Strappa León
 */
public class InicioSesion extends HttpServlet
{

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
     
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        HttpSession session = request.getSession();
        
        String nick_name = request.getParameter("txtNick_name");
        String password = request.getParameter("txtPassword");      
        
        DAOUsuario u = new DAOUsuario();
       DAO_ANTIGUO.DAOProfesional pro = new DAOProfesional();
       Usuario us = u.UsuarioNombre(nick_name);
        if (us == null)
        {
            session.setAttribute("error", "Usaurio no existe");
            response.sendRedirect("index.jsp"); 
        }else{
        if ((us.getNick_name().equalsIgnoreCase(nick_name) && us.getPassword().equalsIgnoreCase(password)))
        {
            if (us.getId_tipo_usuario()==3) {
                int id_usuario_cliente=0;
                DAO_ANTIGUO.DAOEmpresa em = new DAO_ANTIGUO.DAOEmpresa();
              id_usuario_cliente =  em.EmpresaUserID(us.getId_usuario());
                
                session.setAttribute("id_usuario_cliente", id_usuario_cliente);
            }
         
            session.setAttribute("sesionNombre", us.getNick_name());
            session.setAttribute("sessionTipo", us.getId_tipo_usuario());
             
            if (us.getId_tipo_usuario()==2) {
                int id_profesional = pro.ProfesionalIDByIdUser(us.getId_usuario());
                session.setAttribute("id_profesional", id_profesional);
                        
            }
            
            session.setAttribute("sessionIdUsuario", us.getId_usuario());
               response.sendRedirect("indexx.jsp"); 
        }
        else
        {
            session.setAttribute("error", "Error al ingresar");
            response.sendRedirect("index.jsp"); 
        }
        }
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo()
    {
        return "Short description";
    }// </editor-fold>

}
