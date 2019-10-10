/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Interfaz.CRUD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ConectorOracle;
import model.Empresa;
import model.Profesional;

/**
 *
 * @author Raúl Strappa León
 */
public class DAOProfesional implements CRUD<Profesional>
{
    private static String sql_insert = "insert into profesional(id_profesional, nombre,rut,direccion,contratado,id_usuario) values(?,?,?,?,?,?)";
    private static String sql_insert_usuario ="insert into usuario(id_usuario, id_tipo_usuario, nick_name,password) values(?,?,?,?)";
    private static String sql_selectAll = "select * from profesional left join usuario using(id_usuario)";
    private static String sql_selectId = "select * from profesional left join usuario using(id_usuario)  where id_profesional=? ";
    private static String sql_delete = "delete from profesional where id_profesional = ?";
    private static String sql_update ="update profesional  set nombre = ?,direccion =? where id_profesional =?";
    
    
     private static ConectorOracle objConn = ConectorOracle.InstanciaConn();
    private ResultSet rs;
    @Override
    public boolean crear(Profesional x) 
    {
        
        try {
           
           PreparedStatement ps;
           ps =objConn.getConection().prepareStatement(sql_insert);
           ps.setInt(1, x.getId_profesoinal());
           ps.setString(2, x.getNombre());
           ps.setString(3, x.getRut());
           ps.setString(4, x.getDireccion());
           ps.setInt(5, x.getContratado());
           ps.setInt(6,x.getId_usuario());
           
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
    
     public ArrayList<Profesional> todos() {
        
         try {
             ArrayList<Profesional> Lu = new ArrayList<>();
             PreparedStatement ps ;
             ps = objConn.getConection().prepareStatement(sql_selectAll);
             rs= ps.executeQuery();
             while (rs.next()) {                 
                 Lu.add(new Profesional(rs.getInt("id_profesional"), rs.getString("nombre"), rs.getString("rut"), rs.getString("direccion"),rs.getInt("contratado"),rs.getInt("id_usuario")));
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
    public boolean eliminar(Profesional x) {
         try {
             PreparedStatement ps;
             
             ps = objConn.getConection().prepareStatement(sql_delete);
             ps.setInt(1, x.getId_profesoinal());
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
    public boolean modificar(Profesional x) { 
         try {
             PreparedStatement ps ;
             
             ps = objConn.getConection().prepareStatement(sql_update);
             ps.setString(1, x.getNombre());
             ps.setString(2, x.getDireccion());
             ps.setInt(3, x.getId_profesoinal());
             
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
    
    public Profesional ProfesionalID(int id) {
        
         try {
             Profesional p = null;
             PreparedStatement ps ;
             ps = objConn.getConection().prepareStatement(sql_selectId);
             ps.setInt(1, id);
             rs= ps.executeQuery();
             while (rs.next()) {                 
                 p = new Profesional(rs.getInt("id_profesional"),rs.getString("nombre"),
                         rs.getString("rut"),rs.getString("direccion"),rs.getInt("contratado"),
                         rs.getInt("id_usuario"));
             }
             return p;
         } catch (SQLException ex) {
             Logger.getLogger(DAOProfesional.class.getName()).log(Level.SEVERE, null, ex);
         }finally{
             objConn.cerrar();
         }
                return null;
    }
    
}
