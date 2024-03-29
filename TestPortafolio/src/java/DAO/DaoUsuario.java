
package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ConectorOracle;

import model.Usuario;

public class DaoUsuario {
    ConectorOracle con = new ConectorOracle();
    ResultSet rs;
    ArrayList<Usuario> list = new ArrayList<Usuario>();
    
    public Usuario obtener(int id) throws SQLException{
        
        rs = con.execute("select * from usuario where id_usuario = "+id);
        if(rs.next()){
            return new Usuario(
                    rs.getInt("id_usuario"),
                    rs.getString("nick_name"),
                    rs.getString("password"),
                    new DaoTipoUsuario().obtener(rs.getInt("id_tipo_usuario"))
            );
        }
        return null;
    }
    
    public ArrayList<Usuario> listar() throws SQLException{
        list = new ArrayList<Usuario>();
        rs = con.execute("select * from usuario");
        while(rs.next()){
            list.add( new Usuario(
                    rs.getInt("id_usuario"),
                    rs.getString("nick_name"),
                    rs.getString("password"),
                    new DaoTipoUsuario().obtener(rs.getInt("id_tipo_usuario"))
            ));
        }
        return null;
    }
    
    public boolean validarSession(String acc,String password) throws SQLException{
        rs = con.execute("select * from usuario where nick_name = '"+acc+"' and password = '"+password+"'");
        if(rs.next()) return true;
        return false;
    }

    public Usuario obtener(String acc, String password) throws SQLException {
        rs = con.execute("select * from usuario where nick_name='"+acc+ "' and password='"+password+ "'");
        if(rs.next()){
            return new Usuario(
                    rs.getInt("id_usuario"),
                    rs.getString("nick_name"),
                    rs.getString("password"),
                    new DaoTipoUsuario().obtener(rs.getInt("id_tipo_usuario"))
            );
        }
        return null;
    }
    
    
}
