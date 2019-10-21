
package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ConectorOracle;
import model.TipoUsuario;

public class DaoTipoUsuario {
    ConectorOracle con = new ConectorOracle();
    ResultSet rs;
    ArrayList<TipoUsuario> list = new ArrayList<TipoUsuario>();
    
    public TipoUsuario obtener(int id) throws SQLException, SQLException, SQLException, SQLException{
        rs = con.execute("select * from tipo_usuario where id_tipousuario = "+id);
        if(rs.next()){
            return new TipoUsuario(rs.getInt(1), rs.getString(2));
        }
        return null;
    }
    
    public ArrayList<TipoUsuario> listar() throws SQLException{
        list = new ArrayList<TipoUsuario>();
        rs = con.execute("select * from tipo_usuario");
        while(rs.next()){
            list.add( new TipoUsuario(rs.getInt(1), rs.getString(2)));
        }
        return list;
    }
   
}
