/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO_ANTIGUO.DAOEmpleado_Cliente;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model_antiguo.EmpleadoCliente;

/**
 *
 * @author Raúl Strappa León
 */
@WebServlet(name = "IngresarEmpleado", urlPatterns =
{
    "/IngresarEmpleado"
})
public class IngresarEmpleado extends HttpServlet
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
        DAOEmpleado_Cliente de = new DAOEmpleado_Cliente();
        EmpleadoCliente e;
        DAOEmpleado_Cliente ei = new DAOEmpleado_Cliente();
        
        int id = ei.maxID() +1;
        String run = request.getParameter("run");
        String nombre = request.getParameter("nombre");
        String direccion = request.getParameter("direccion");
        int id_empresa = Integer.parseInt(request.getParameter("id_empresa"));
        int operativo = 1; // 1 igual contratado 
        
        //e = new EmpleadoCliente(id, run, nombre, direccion, id_empresa, operativo);
        e = new EmpleadoCliente(id, nombre, run, id_empresa, id_empresa, operativo, direccion);
        if (de.crear(e))
        {
             response.sendRedirect("view/EmpleadoCliente/listarEmpleado.jsp"); 
        }
        else
        {
           session.setAttribute("error","Error al ingresar empleado");
           response.sendRedirect("view/EmpleadoCliente/listarEmpleado.jsp");
                    
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
