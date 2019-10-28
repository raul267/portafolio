/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO_ANTIGUO.DAOUsuario;
import model_antiguo.Usuario;
import DAO_ANTIGUO.DAOEmpresa;
import model_antiguo.ConectorOracle;
import model_antiguo.Empresa;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Raúl Strappa León
 */
@WebServlet(name = "IngresarEmpresa", urlPatterns =
{
    "/IngresarEmpresa"
})
public class IngresarEmpresa extends HttpServlet
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
        int id = au.maxID() +1;
        
        HttpSession session = request.getSession();
        int id_usuario = id;
        String nick_name = request.getParameter("nick_name");
        String password = request.getParameter("password");
        int id_tipo_usuario = 2; //2 = empresa
         Usuario us = new Usuario(id_usuario, nick_name,password,id_tipo_usuario);
        if (u.crear(us))
        {
            String nombre = request.getParameter("nombre");
            int id_tipo_empresa = Integer.parseInt(request.getParameter("id_tipo_empresa"));
            String direccion = request.getParameter("direccion");
            int estado = 1; //1 vigente
            int id_plan = 1; //Unico plan
            int id_comuna = Integer.parseInt(request.getParameter("id_comuna"));
            int id_empresa = id;
       
       DAOEmpresa em = new DAOEmpresa();
       Empresa e = new Empresa(id_empresa, nombre, id_tipo_empresa, direccion, estado, id_plan, id_usuario, id_comuna);
       
            if (em.crear(e))
            {
                response.sendRedirect("cases/CU1/CU1/agregarCliente.jsp"); 
            }
            else
            {
                session.setAttribute("error", "NO se registro");
                
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
