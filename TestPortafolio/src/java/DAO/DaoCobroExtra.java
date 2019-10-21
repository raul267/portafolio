
package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.CobroExtra;
import model.ConectorOracle;

public class DaoCobroExtra {
    
    ConectorOracle con = new ConectorOracle();
  
    public ArrayList<CobroExtra> listar() throws SQLException{
        ArrayList<CobroExtra> list = new ArrayList<CobroExtra>();
        ResultSet rs = con.execute("select * from cobro_extra");
        while(rs.next()) list.add(new CobroExtra(
                rs.getInt("id_cobro_extra"), 
                new DaoServicio().obtener(rs.getInt("id_servicio")),
                new DaoTarifa().obtener(rs.getInt("id_tarifa"))));
        return list;
    }
}
