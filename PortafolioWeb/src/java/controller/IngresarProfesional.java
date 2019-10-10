/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DAOProfesional;
import DAO.DAOUsuario;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Profesional;
import model.Usuario;

/**
 *
 * @author Raúl Strappa León
 */
@WebServlet(name = "IngresarProfesional", urlPatterns =
{
    "/IngresarProfesional"
})
public class IngresarProfesional extends HttpServlet
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
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
       
    }

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
       //Crear usuario 
        DAOUsuario u = new DAOUsuario();
        DAOUsuario au = new DAOUsuario();
        DAOProfesional dp = new DAOProfesional();
        
        int id = au.maxID() +1;
        
        HttpSession session = request.getSession();
        int id_usuario = id;
        String nick_name = request.getParameter("nick_name");
        String password = request.getParameter("password");
        int id_tipo_usuario = 4; //2 = Profeiosnal
         Usuario us = new Usuario(id_usuario, nick_name,password,id_tipo_usuario);
        if (u.crear(us))
        {   int id_profesional = id; 
            String nombre = request.getParameter("nombre");
            String rut = request.getParameter("rut");
            String direccion = request.getParameter("direccion");
            int contratado = 1;//Contratado
            
            Profesional p = new Profesional(id_profesional, nombre, rut, direccion, contratado, id_usuario);
            
            if (dp.crear(p))
            {
                response.sendRedirect("cases/CU2/agregarProfesional.jsp"); 
            }
            else
            {
                session.setAttribute("error", "Error al registrar usuario");
                response.sendRedirect("cases/CU2/agregarProfesional.jsp"); 
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
