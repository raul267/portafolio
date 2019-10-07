/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import DAO.DAOUsuario;
import model.Usuario;
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
       
       Usuario us = u.UsuarioNombre(nick_name);
        if (us == null)
        {
            session.setAttribute("error", "Usaurio no existe");
            response.sendRedirect("index.jsp"); 
        }else{
        if ((us.getNick_name().equalsIgnoreCase(nick_name) && us.getPassword().equalsIgnoreCase(password)))
        {
            
            response.sendRedirect("indexx.jsp"); 
            session.setAttribute("sesionNombre", us.getNick_name());
            session.setAttribute("sessionTipo", us.getId_tipo_usuario());
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
