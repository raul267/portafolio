/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Interfaz.CRUD;
import model.ConectorOracle;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Usuario;

/**
 *
 * @author cetecom
 */ 
public class DAOUsuario implements CRUD<Usuario>{
    
     private static String sql_insert = "insert into usuario(id_usuario, id_tipo_usuario,nick_name,password) values(?,?,?,?)";
    private static String sql_selectAll = "select * from usuario";
   private static String sql_delete = "delete from usuario where id_usuario=?";
   private static String sql_update ="UPDATE usuario SET login_usuario=?,pass_usuario=?,id_perfil=? WHERE id_usuario=?";
   private static String sql_selectId = "select * from usuario where id_usuario=? ";
   private static String sql_selectNombre = "select * from usuario where nick_name=? ";
   private static String sql_maxID = "select max(id_usuario) id from usuario";
    
   private static ConectorOracle objConn = ConectorOracle.InstanciaConn();
    private ResultSet rs;

    
 public Usuario UsuarioNombre(String nick_name) {
        
         try {
             Usuario Lu = null;
             PreparedStatement ps ;
             ps = objConn.getConection().prepareStatement(sql_selectNombre);
             ps.setString(1, nick_name);
             rs= ps.executeQuery();
             while (rs.next()) {                 
                 Lu =new Usuario(rs.getInt("id_usuario"), rs.getString("nick_name"), rs.getString("password"), rs.getInt("id_tipo_usuario"));
             }
             return Lu;
         } catch (SQLException ex) {
             Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
         }finally{
             objConn.cerrar();
         }
                return null;
    }
    @Override
    public ArrayList<Usuario> todos() {
        
         try {
             ArrayList<Usuario> Lu = new ArrayList<>();
             PreparedStatement ps ;
             ps = objConn.getConection().prepareStatement(sql_selectAll);
             rs= ps.executeQuery();
             while (rs.next()) {                 
                 Lu.add(new Usuario(rs.getInt("id_usuario"), rs.getString("nick_name"), rs.getString("password"), rs.getInt("id_perfil_usuario")));
             }
             return Lu;
         } catch (SQLException ex) {
             Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
         }finally{
             objConn.cerrar();
         }
                return null;
    }

    @Override
    public boolean crear(Usuario x) {
         try {
             PreparedStatement ps;
             
             ps=objConn.getConection().prepareStatement(sql_insert);
                ps.setInt(1, x.getId_usuario());
                ps.setInt(2, x.getId_tipo_usuario());
                ps.setString(3, x.getNick_name());
                ps.setString(4, x.getPassword());
               
            
             if (ps.executeUpdate()>0) {
                 return true;
             }
            
         } catch (SQLException ex) {
             Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
         }finally{
             objConn.cerrar();
         }
         return false;
    }

    @Override
    public boolean eliminar(Usuario x) {
         try {
             PreparedStatement ps;
             
             ps = objConn.getConection().prepareStatement(sql_delete);
             ps.setInt(1, x.getId_usuario());
             if (ps.executeUpdate()>0) {
                 return true;
             }
         } catch (SQLException ex) {
             Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
         }finally{
             objConn.cerrar();;
         }
        return false;
        
    }
    
     public int maxID() {
        
         try {
             int id = 0;
             Usuario u = null;
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
    
    
    

    @Override
    public boolean modificar(Usuario x) { 
         try {
             PreparedStatement ps ;
             //"update from usuario set login_usuario=?, pass_usuario=?,id_perfil=? where id_usuario=?"
             //UPDATE usuario SET login_usuario=?,pass_usuario=?,id_perfil=? WHERE id_usuario=  ?
             ps = objConn.getConection().prepareStatement(sql_update);
             ps.setInt(1, x.getId_usuario());
             ps.setString(2, x.getNick_name());
             ps.setString(3, x.getPassword());
             ps.setInt(4, x.getId_tipo_usuario());
             
             if (ps.executeUpdate()>0) {
                 return true;
             }
         } catch (SQLException ex) {
             Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
         }finally {
          objConn.cerrar();
         }
        
        return false;
        
    }
   
    
}
