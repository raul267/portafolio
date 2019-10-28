package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.ConectorOracle;
import model.Visita;

public class DaoVisita {
    ConectorOracle con = new ConectorOracle();
    ResultSet rs;
    
    public Visita obtener(int id) throws SQLException{
        con.execute("select * from visita where id_visita = "+id);
        if(rs.next());
        return null;
    }
}
