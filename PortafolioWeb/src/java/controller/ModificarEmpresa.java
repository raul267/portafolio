/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DAOEmpresa;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Empresa;

/**
 *
 * @author Raúl Strappa León
 */
@WebServlet(name = "ModificarEmpresa", urlPatterns =
{
    "/ModificarEmpresa"
})
public class ModificarEmpresa extends HttpServlet
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
        HttpSession session = request.getSession();
       
        String nombre = request.getParameter("nombre");
        String direccion = request.getParameter("direccion");
        int id_comuna = Integer.parseInt(request.getParameter("id_comuna"));
        int id_empresa = Integer.parseInt(request.getParameter("id_empresa"));
        
        Empresa e = new Empresa(id_empresa, nombre, direccion, id_comuna);
        DAOEmpresa em = new DAOEmpresa();
        
        if (em.modificar(e))
        {
             response.sendRedirect("cases/CU1/CU1/agregarCliente.jsp"); 
        }
        else
        {
             session.setAttribute("error", "Error al modificar");
             response.sendRedirect("cases/CU1/CU1/agregarCliente.jsp"); 
             
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
