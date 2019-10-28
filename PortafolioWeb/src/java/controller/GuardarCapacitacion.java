/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO_ANTIGUO.DAOCapacitacion;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model_antiguo.Capacitacion;

/**
 *
 * @author 56942
 */
@WebServlet(name = "GuardarCapacitacion", urlPatterns = {"/GuardarCapacitacion"})
public class GuardarCapacitacion extends HttpServlet {

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
        
        
        String fecha = request.getParameter("fecha");
        String lugar = request.getParameter("txtLugar");
        String material = request.getParameter("txtMaterial");
        HttpSession session = request.getSession();
        boolean err = false;
        ArrayList<model_antiguo.Error> lerr = new ArrayList();
        if (fecha.length()==0) {
            
            lerr.add(new model_antiguo.Error("No Agrego fecha"));
            err=true;
        }else{
            String[] parts = fecha.split("-");
String part1 = parts[0]; //año
String part2 = parts[1]; //mes
String part3 = parts[2];//dia
String[] partes = parts[2].split("T");//dia
String parte4 = partes[0];//nuevo dia
String parte5 = partes[1];//hora

            if (parte5.length()<=4) {
              lerr.add(new model_antiguo.Error("No Agrego hora"));
              err=true;
            }else{
            fecha = partes[0]+"/"+parts[1]+"/"+parts[0].substring(parts[0].length()-2)+" "+partes[1];//fecha lista para la base de datos
            
            }
            
        }//if fecha
        int id_profesional = Integer.parseInt(session.getAttribute("id_profesional").toString());
        int total = Integer.parseInt(session.getAttribute("total").toString());
        
        if (lugar.length()==0) {
            err=true;
            lerr.add(new model_antiguo.Error("Debe ingresar un lugar"));
        }
        if (material.length()==0) {
            lerr.add(new model_antiguo.Error("Debe agregar maerial a utilizar"));
            err=true;
        }
        
        if (err) {
            session.setAttribute("errores", lerr);
            response.sendRedirect("cases/Profesional/AgregarCapacitacion.jsp");
        }else{
            DAO_ANTIGUO.DAOCapacitacion capa = new DAOCapacitacion();
            model_antiguo.Capacitacion c = new Capacitacion();
            c.setCantidad_asistentes(total);
            c.setFecha_capacitacion(fecha);
            c.setId_profesional(id_profesional);
            c.setLugarCapacitacion(lugar);
            c.setMaterialAUtilizar(material);
            if (!capa.crear(c)) {
                lerr.add(new model_antiguo.Error("No se pudo crear"));
            }

                session.setAttribute("txtFecha", fecha);
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
