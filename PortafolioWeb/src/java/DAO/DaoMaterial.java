package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ConectorOracle;
import model.Material;

public class DaoMaterial {
    ConectorOracle con = new ConectorOracle();
    
    public ArrayList<Material> listar() throws SQLException{
        ArrayList<Material> list = new ArrayList<Material>();
        ResultSet rs = con.execute("select * from material");
        while(rs.next()) list.add(new Material(
                rs.getInt("id_material"),
                new DaoCapacitacion().obtener(rs.getInt("id_capacitacion")),
                rs.getString("descripcion")
                )
        );
        return list;
    }
    public Material obtener(int id) throws SQLException{
        for(Material a : listar()) if(a.getId()==id) return a;
        return null;
    }
}
