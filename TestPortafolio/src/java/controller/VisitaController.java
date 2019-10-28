/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Capacitacion;

/**
 *
 * @author 56942
 */
@WebServlet(name = "VisitaController", urlPatterns = {"/VisitaController"})
public class VisitaController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession(); 
        
        
        int id = IDFactory.generate();
        //int cantidad_asistentes = Integer.parseInt(request.getParameter("cantidad_asistentes"));
        String fecha = request.getParameter("fecha");
        String hora = request.getParameter("hora");
        String empresaCliente = request.getParameter("empresaCliente");
        String descripcion = request.getParameter("descripcion");
        
        
        
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CapacitacionController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<a href='/TestPortafolio/profesional'>Volver</a>");
            out.println("<h1>Servlet CapacitacionController at " + request.getContextPath() + "</h1>");
            out.println("<h3>Crear Capacitacion</h3>");
            out.println("<br><label><b> id: </b>" + id + "</label>");
            out.println("<br><label><b> fecha: </b>" + fecha + "</label>");
            out.println("<br><label><b> hora: </b>" + hora + "</label>");
            out.println("<br><label><b> empresaCliente: </b>" + empresaCliente + "</label>");
            out.println("<br><label><b> descripcion : </b>" + descripcion + "</label>");
            out.println("</body>");
            out.println("</html>");
        }
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
            throws ServletException, IOException {
        processRequest(request, response);
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
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
