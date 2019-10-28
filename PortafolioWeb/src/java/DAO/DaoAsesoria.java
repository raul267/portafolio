
package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Asesoria;
import model.ConectorOracle;

public class DaoAsesoria {
    ConectorOracle con = new ConectorOracle();
    
    public ArrayList<Asesoria> listar() throws SQLException{
        ArrayList<Asesoria> list = new ArrayList<Asesoria>();
        ResultSet rs = con.execute("select * from asesoria");
        while(rs.next()) list.add(new Asesoria(
                rs.getInt("id_asesoria"),
                rs.getString("nombre"),
                rs.getString("descripcion"),
                rs.getInt("enterreno"),
                new DaoTipoAsesoria().obtener(rs.getInt("id_tipo_asesoria")))
        );
        return list;
    }
    public Asesoria obtener(int id) throws SQLException{
        for(Asesoria a : listar()) if(a.getId()==id) return a;
        return null;
    }
}
