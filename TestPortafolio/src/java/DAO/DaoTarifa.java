
package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ConectorOracle;
import model.Tarifa;

public class DaoTarifa {
    ConectorOracle con = new ConectorOracle();
    
    public Tarifa obtener(int id) throws SQLException
    {
        ResultSet rs = con.execute("select * from tarifa where id_tarifa = "+id);
        if(rs.next()) return new Tarifa(
                rs.getInt("id_tarifa"),
                rs.getString("descripcion"),
                rs.getInt("costo"));
        return null;
    }
    public ArrayList<Tarifa> listar() throws SQLException
    {
        ArrayList<Tarifa> list = new ArrayList<Tarifa>();
        ResultSet rs = con.execute("select * from tarifa");
        while(rs.next()) list.add(new Tarifa(
                rs.getInt("id_tarifa"),
                rs.getString("descripcion"),
                rs.getInt("costo"))
        );
        return list;
    }
}
