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
import model.Empresa;
import model.ConectorOracle;
import model.Usuario;

/**
 *
 * @author Raúl Strappa León
 */
public class DAOEmpresa implements CRUD<Empresa>
{
    private static String sql_insert = "insert into empresa(id_empresa, nombre,id_tipo_empresa,direccion,estado,id_plan,id_usuario,id_comuna) values(?,?,?,?,?,?,?,?)";
    private static String sql_insert_usuario ="insert into usuario(id_usuario, id_tipo_usuario, nick_name,password) values(?,?,?,?)";
    private static String sql_selectAll = "select * from empresa";
    private static String sql_selectId = "select * from empresa where id_empresa=? ";
    private static String sql_delete = "delete from empresa where id_empresa = ?";
    private static String sql_update ="update from empresa set direccion =?, id_estado = ?, id_plan=? where id_empresa =?";
    
    private static ConectorOracle objConn = ConectorOracle.InstanciaConn();
    private ResultSet rs;
    @Override
    public boolean crear(Empresa x) 
    {
        
         //Insertar empresa
        try {
           
           PreparedStatement ps;
           ps =objConn.getConection().prepareStatement(sql_insert);
           ps.setInt(1, x.getId_empresa());
           ps.setString(2, x.getNombre());
           ps.setInt(3, x.getId_tipo_empresa());
           ps.setString(4, x.getDireccion());
           ps.setInt(5, x.getEstado());
           ps.setInt(6,x.getId_plan());
           ps.setInt(7,x.getId_usuario());
           ps.setInt(8,x.getId_comuna());
           
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
    public ArrayList<Empresa> todos() {
        
         try {
             ArrayList<Empresa> Lu = new ArrayList<>();
             PreparedStatement ps ;
             ps = objConn.getConection().prepareStatement(sql_selectAll);
             rs= ps.executeQuery();
             while (rs.next()) {                 
                 Lu.add(new Empresa(rs.getInt("id_empresa"), rs.getString("nombre"), rs.getInt("id_tipo_empresa"), rs.getString("direccion"),rs.getInt("estado"),rs.getInt("id_plan"),rs.getInt("id_usuario"),rs.getInt("id_comuna")));
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
    public boolean eliminar(Empresa x) {
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

    @Override
    public boolean modificar(Empresa x) { 
         try {
             PreparedStatement ps ;
             
             ps = objConn.getConection().prepareStatement(sql_update);
             ps.setString(1, x.getDireccion());
             ps.setInt(2, x.getEstado());
             ps.setInt(3, x.getId_plan());
             ps.setInt(4, x.getId_empresa());
             
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
