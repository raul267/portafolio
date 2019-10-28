/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO_ANTIGUO;

import DAO.*;
import Interfaz.CRUD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model_antiguo.Capacitacion;
import model_antiguo.Capacitacion_asistente;
import model_antiguo.ConectorOracle;

/**
 *
 * @author 56942
 */
public class DAOCapacitacion implements CRUD<model_antiguo.Capacitacion>{

    private String sql_insert ="insert into capacitacion(id_capacitacion,FECHA_CAPACITACION,CANTIDAD_ASISTENTES,ID_PROFESIONAL,MATERIALUTILIZAR,LUGAR_CAPACITACION) values(s_capacitacion.nextval,?,?,?,?,?)";
      private static ConectorOracle objConn = ConectorOracle.InstanciaConn();
    private ResultSet rs;
   @Override
    public boolean crear(model_antiguo.Capacitacion x) 
    {
        
         
        try {
           
           PreparedStatement ps;
           ps =objConn.getConection().prepareStatement(sql_insert);
           ps.setString(1, x.getFecha_capacitacion());
           ps.setInt(2, x.getCantidad_asistentes());
           ps.setInt(3, x.getId_profesional());
           ps.setString(4, x.getMaterialAUtilizar());
           ps.setString(5, x.getLugarCapacitacion());
       
           
            if (ps.executeUpdate()>0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOEmpresa.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            objConn.cerrar();
        }
        return false;
    }

   

    @Override
    public boolean eliminar(Capacitacion x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean modificar(Capacitacion x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Capacitacion> todos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
