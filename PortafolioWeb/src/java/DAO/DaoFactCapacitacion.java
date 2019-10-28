package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ConectorOracle;
import model.FactCapacitacion;

public class DaoFactCapacitacion {
    ConectorOracle con = new ConectorOracle();
    
    public FactCapacitacion obtener(int id) throws SQLException{
        for(FactCapacitacion f : listar()) if(f.getId()==id) return f;
        return null;
    }
    public ArrayList<FactCapacitacion> listar() throws SQLException{
        ArrayList<FactCapacitacion> list = new ArrayList<FactCapacitacion>();
        ResultSet rs = con.execute("select * from fact_capacitacion");
        while(rs.next()) list.add(new FactCapacitacion(
                rs.getInt("id_fact_capacitacion"),
                rs.getDate("fecha_fact_capacitacion"),
                new DaoProfesional().obtener(rs.getInt("id_profesional")),
                new DaoCapacitacion().obtener(rs.getInt("id_capacitacion")),
                new DaoServicio().obtener(rs.getInt("id_servicio")))
        );
        return list;
    }
}
