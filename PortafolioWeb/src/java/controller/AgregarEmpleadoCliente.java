/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO_ANTIGUO.DAOEmpleado_empresa;
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
import model_antiguo.Error;

/**
 *
 * @author 56942
 */
@WebServlet(name = "AgregarEmpleadoCliente", urlPatterns = {"/AgregarEmpleadoCliente"})
public class AgregarEmpleadoCliente extends HttpServlet {

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
       
        
             HttpSession session = request.getSession();
       
          String run = request.getParameter("txtRun");
        String direccion = request.getParameter("txtDireccion");
        String nombre = request.getParameter("txtNombre");
    
      
        int cargo =Integer.parseInt(request.getParameter("ddlCargo"));
             boolean err= true;
        ArrayList<Error> Lerr = new ArrayList<>();
      /*  
        if (validarRut(run)) {
            err=false;
            Lerr.add(new Error("Run invalido"));
        }
        */
        if (err) {
            try{
            DAO_ANTIGUO.DAOEmpleado_empresa obj = new DAOEmpleado_empresa();
            EmpleadoCliente x = new EmpleadoCliente();
            x.setRun(run);
            x.setDireccion(direccion);
            x.setNombre(nombre);
            x.setId_tipo_cargoEmpleado(cargo);
            x.setId_empresa(Integer.parseInt(session.getAttribute("id_usuario_cliente").toString()));
        
            
            if ( obj.crear(x)) {
                Lerr.add(new Error("Empleado Agregado")); 
                session.setAttribute("errores", "Empleado Agregado");
            }else{
                 session.setAttribute("errores", "TETERA" +" "+Integer.parseInt(session.getAttribute("id_usuario_cliente").toString()));
            }
            }catch(Exception e){System.out.println(e.getMessage() +" "+Integer.parseInt(session.getAttribute("id_usuario_cliente").toString()));
              session.setAttribute("errores", "Error llego a catch");
            }
        }

        response.sendRedirect("cases/Cliente/AgregarEmpleadoCliente.jsp");
    }
    
    public static boolean validarRut(String rut) {

boolean validacion = false;
try {
rut =  rut.toUpperCase();
rut = rut.replace(".", "");
rut = rut.replace("-", "");
int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));

char dv = rut.charAt(rut.length() - 1);

int m = 0, s = 1;
for (; rutAux != 0; rutAux /= 10) {
s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
}
if (dv == (char) (s != 0 ? s + 47 : 75)) {
validacion = true;
}

} catch (java.lang.NumberFormatException e) {
} catch (Exception e) {
}
return validacion;
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
