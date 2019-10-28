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
import Interfaz.CRUD;
import model_antiguo.EmpleadoCliente;
import model_antiguo.Usuario;

/**
 *
 * @author Raúl Strappa León
 */
public class DAOEmpleado_Cliente implements CRUD<EmpleadoCliente>
{
    private static String sql_insert = "insert into empleado_cliente(id_empleado_cliente, run,nombre,direccion,id_empresa,operativo) values(?,?,?,?,?,?)";
    private static String sql_selectAll = "select * from empleado_cliente left join empresa using(id_empresa)";
    private static String sql_selectId = "select * from empleado_cliente left join empresa using(id_empresa)  where id_empleado_cliente=? ";
    private static String sql_delete = "delete from empleado_cliente where id_empleado_cliente = ?";
    private static String sql_update ="update empleado_cliente set nombre =?, direccion = ? where id_empleado_cliente = ?";
    private static String sql_maxID = "select max(id_empleado_cliente) id from empleado_cliente";
    
    private static ConectorOracle objConn = ConectorOracle.InstanciaConn();
    private ResultSet rs;
    @Override
    public boolean crear(EmpleadoCliente x) 
    {
        
        try {
           
           PreparedStatement ps;
           ps =objConn.getConection().prepareStatement(sql_insert);
           ps.setInt(1, x.getId());
           ps.setString(2, x.getRun());
           ps.setString(3, x.getNombre());
           ps.setString(4, x.getDireccion());
           ps.setInt(5, x.getId_empresa());
           ps.setInt(6,x.getOperativo());
           
            if (ps.executeUpdate()>0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOProfesional.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            objConn.cerrar();
        }
        return false;
    }
    
     public ArrayList<EmpleadoCliente> todos() {
        
         try {
             ArrayList<EmpleadoCliente> Lu = new ArrayList<>();
             PreparedStatement ps ;
             ps = objConn.getConection().prepareStatement(sql_selectAll);
             rs= ps.executeQuery();
             while (rs.next()) {                 
            //     Lu.add(new EmpleadoCliente(rs.getInt("id_empleado_cliente"), rs.getString("run"), rs.getString("nombre"), rs.getString("direccion"),rs.getInt("id_empresa"),rs.getInt("operativo")));
             }
             return Lu;
         } catch (SQLException ex) {
             Logger.getLogger(DAOEmpresa.class.getName()).log(Level.SEVERE, null, ex);
         }finally{
             objConn.cerrar();
         }
                return null;
    }

     
     @Override
    public boolean eliminar(EmpleadoCliente x) {
         try {
             PreparedStatement ps;
             
             ps = objConn.getConection().prepareStatement(sql_delete);
             ps.setInt(1, x.getId());
             if (ps.executeUpdate()>0) {
                 return true;
             }
         } catch (SQLException ex) {
             Logger.getLogger(DAOProfesional.class.getName()).log(Level.SEVERE, null, ex);
         }finally{
             objConn.cerrar();
         }
        return false;
        
    }
    
        @Override
    public boolean modificar(EmpleadoCliente x) { 
         try {
             PreparedStatement ps ;
             
             ps = objConn.getConection().prepareStatement(sql_update);
             ps.setString(1, x.getNombre());
             ps.setString(2, x.getDireccion());
             ps.setInt(3, x.getId());
             
             if (ps.executeUpdate()>0) {
                 return true;
             }
         } catch (SQLException ex) {
             Logger.getLogger(DAOProfesional.class.getName()).log(Level.SEVERE, null, ex);
         }finally {
          objConn.cerrar();
         }
        
        return false;
        
    }
    
    public EmpleadoCliente ProfesionalID(int id) {
        
         try {
             EmpleadoCliente p = null;
             PreparedStatement ps ;
             ps = objConn.getConection().prepareStatement(sql_selectId);
             ps.setInt(1, id);
             rs= ps.executeQuery();
             while (rs.next()) {                 
            //     p = new EmpleadoCliente(rs.getInt("id_empleado_cliente"), rs.getString("run"), rs.getString("nombre"), rs.getString("direccion"),rs.getInt("id_empresa"),rs.getInt("operativo"));
             }
             return p;
         } catch (SQLException ex) {
             Logger.getLogger(DAOProfesional.class.getName()).log(Level.SEVERE, null, ex);
         }finally{
             objConn.cerrar();
         }
                return null;
    }
    
    public int maxID() {
        
         try {
             int id = 0;
             PreparedStatement ps ;
             ps = objConn.getConection().prepareStatement(sql_maxID);
             rs= ps.executeQuery();
              while (rs.next()) {   
              id = rs.getInt("id");
              }
             
             return id;
         } catch (SQLException ex) {
             Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
         }finally{
             objConn.cerrar();
         }
                return 0;
    }
}
