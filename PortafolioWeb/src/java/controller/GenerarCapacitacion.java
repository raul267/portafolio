/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model_antiguo.EmpleadoCliente;

/**
 *
 * @author 56942
 */
@WebServlet(name = "GenerarCapacitacion", urlPatterns = {"/GenerarCapacitacion"})
public class GenerarCapacitacion extends HttpServlet {

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
            throws ServletException, IOException {
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    /*Aqui se va a validar que todo este en orden para generar una capacitacion, pero no se creara una*/
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
          ArrayList<model_antiguo.EmpleadoCliente> le = (ArrayList<model_antiguo.EmpleadoCliente>)session.getAttribute("empleados");
          int total =0;
          for (EmpleadoCliente empleadoCliente : le) {
              if (0==empleadoCliente.getOperativo()) {
                    total= total+1;
              }
            
        }
          if (total==0) {
            response.sendRedirect("cases/Profesional/GenerarCapacitacion.jsp");
            //aqui se tendria que hacer el mensaje de error
        }else{
              session.setAttribute("total", total);
              response.sendRedirect("cases/Profesional/AgregarCapacitacion.jsp");
          }
        
       
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
