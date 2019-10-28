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
@WebServlet(name = "SacarEmpleado", urlPatterns = {"/SacarEmpleado"})
public class SacarEmpleado extends HttpServlet {

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
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
        HttpSession session = request.getSession();
          ArrayList<model_antiguo.EmpleadoCliente> le = (ArrayList<model_antiguo.EmpleadoCliente>)session.getAttribute("empleados");
          ArrayList<model_antiguo.EmpleadoCliente> leS = new ArrayList<>();
          int id = Integer.parseInt(request.getParameter("txtId"));
          for (EmpleadoCliente e : le) {
            
              
              if (id==e.getId()) {
                  leS.add(e);
              }
              if (1==e.getOperativo()) {
                  leS.add(e);
              }
           
        }
         
            for (EmpleadoCliente em : leS) {
                le.remove(em);
            }
           
          session.setAttribute("empleados", le);
            
            if (le.size()==0) {
                le=null;
            }
          if (le==null) {
                response.sendRedirect("cases/Profesional/GenerarCapacitacion.jsp");
            }else{
              int t =0;
              for (EmpleadoCliente emp : le) {
                  t=t+1;
              }
              session.setAttribute("total", t);
                response.sendRedirect("cases/Profesional/AgregarCapacitacion.jsp");
            }
          
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
              HttpSession session = request.getSession();
              session.setAttribute("errores", e.getMessage());
           //response.sendRedirect("cases/Profesional/AgregarCapacitacion.jsp");
            
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
