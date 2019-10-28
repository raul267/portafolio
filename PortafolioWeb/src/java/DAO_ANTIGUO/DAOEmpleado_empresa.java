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
import model_antiguo.ConectorOracle;
import model_antiguo.EmpleadoCliente;
import model_antiguo.Empresa;

/**
 *
 * @author 56942
 */
public class DAOEmpleado_empresa implements  CRUD<EmpleadoCliente>{

      private String sql_insert = "insert into EMPLEADO_CLIENTE(id_empleado_cliente, run,nombre,direccion,id_empresa,ID_TIPO_CARGOEMPLEADO,operativo) values(s_empleado_C.nextval,?,?,?,?,?,1)";
      private String sql_selectByEmpresa ="select * from empleado_cliente where id_empresa=? and operativo =1";
    //id_EmpleadoCliente
    private static ConectorOracle objConn = ConectorOracle.InstanciaConn();
    private ResultSet rs;
  
    
     @Override
    public boolean crear(EmpleadoCliente x) 
    {
        
         
        try {
           
           PreparedStatement ps;
           ps =objConn.getConection().prepareStatement(sql_insert);
           ps.setString(1, x.getRun());
           ps.setString(2, x.getNombre());
           ps.setString(3, x.getDireccion());
           ps.setInt(4, x.getId_empresa());
           ps.setInt(5, x.getId_tipo_cargoEmpleado());
       
           
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
    public boolean eliminar(EmpleadoCliente x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean modificar(EmpleadoCliente x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<EmpleadoCliente> todos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public ArrayList<EmpleadoCliente> todosByIdEmpresa(int id_empresa) {
        try {
             ArrayList<model_antiguo.EmpleadoCliente> Le = new ArrayList<>();
             PreparedStatement ps ;
             ps = objConn.getConection().prepareStatement(sql_selectByEmpresa);
             ps.setInt(1,id_empresa );
             rs= ps.executeQuery();
             while (rs.next()) {
                
                 Le.add(new EmpleadoCliente(rs.getInt("ID_EMPLEADO_CLIENTE"), rs.getString("nombre"), rs.getString("run"),rs.getInt("id_empresa") , rs.getInt("id_tipo_cargoEmpleado"), rs.getInt("operativo"), rs.getString("direccion")));
             }
             return Le;
         } catch (SQLException ex) {
             Logger.getLogger(DAOEmpresa.class.getName()).log(Level.SEVERE, null, ex);
             return null;
         }finally{
             objConn.cerrar();
         }
    }
    
}
