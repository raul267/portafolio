
package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ConectorOracle;
import model.TipoAsesoria;
import model.TipoUsuario;


public class DaoTipoAsesoria {
    ConectorOracle con = new ConectorOracle();
    
    public ArrayList<TipoAsesoria> listar() throws SQLException{
        ArrayList<TipoAsesoria> list = new ArrayList<TipoAsesoria>();
        ResultSet rs = con.execute("select * from tipo_asesoria");
        while(rs.next())list.add(new TipoAsesoria(
                rs.getInt("id_tipo_asesoria"),
                rs.getString("descripcion")));
        return list;
    }
    public TipoAsesoria obtener(int id) throws SQLException{
        for (TipoAsesoria t : listar()) if(t.getId() == id) return t;
        return null;
    }
    
}
