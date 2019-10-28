/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO_ANTIGUO;

import DAO.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model_antiguo.ConectorOracle;
import model_antiguo.Empresa;
import model_antiguo.CargoEmpleado;

/**
 *
 * @author 56942
 */
public class DAOCargoEmpleado {
    
    
    private String sql_selectAll ="select * from TIPO_CARGOEMPLEADO";
    
     private static ConectorOracle objConn = ConectorOracle.InstanciaConn();
    private ResultSet rs;
    
    
        public ArrayList<CargoEmpleado> todos() {
        
         try {
             ArrayList<CargoEmpleado> Lu = new ArrayList<>();
             PreparedStatement ps ;
             ps = objConn.getConection().prepareStatement(sql_selectAll);
             rs= ps.executeQuery();
             while (rs.next()) {                 
                 Lu.add(new CargoEmpleado(rs.getInt("id_tipo_cargoempleado"), rs.getString("nombre")));
             }
             return Lu;
         } catch (SQLException ex) {
             Logger.getLogger(DAOEmpresa.class.getName()).log(Level.SEVERE, null, ex);
         }finally{
             objConn.cerrar();
         }
                return null;
    }
}
