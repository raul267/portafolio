package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Capacitacion;
import model.ConectorOracle;

public class DaoCapacitacion {
    ConectorOracle con = new ConectorOracle();
    
    public Capacitacion obtener(int id) throws SQLException{
        for(Capacitacion c : listar()) if(c.getId()==id) return c;
        return null;
    }
    public ArrayList<Capacitacion> listar() throws SQLException{
        ArrayList<Capacitacion> list = new ArrayList<Capacitacion>();
        ResultSet rs = con.execute("select * from capacitacion");
        while(rs.next())list.add(new Capacitacion(
                rs.getInt("id_capacitacion"),
                rs.getString("nombre"),
                rs.getString("descripcion"),
                rs.getInt("cantidad_asistentes"),
                rs.getInt("enterreno"))
        );
        return list;
    } 
    
}
