package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ConectorOracle;
import model.FactAsesoria;
import model.Profesional;

public class DaoFactAsesoria {
    ConectorOracle con = new ConectorOracle();
    
    public FactAsesoria obtener(int id) throws SQLException{
        for(FactAsesoria f : listar()) if(f.getId()==id) return f;
        return null;
    }
    public ArrayList<FactAsesoria> listar() throws SQLException{
        ArrayList<FactAsesoria> list = new ArrayList<FactAsesoria>();
        ResultSet rs = con.execute("select * from fact_asesoria");
        while(rs.next()) list.add(new FactAsesoria(
                rs.getInt("id_fact_asesoria"),
                rs.getDate("fecha_fact_asesoria"),
                new DaoProfesional().obtener(rs.getInt("id_profesional")),
                new DaoAsesoria().obtener(rs.getInt("id_asesoria")),
                new DaoServicio().obtener(rs.getInt("id_servicio")))
        );
        return list;
    }
}
