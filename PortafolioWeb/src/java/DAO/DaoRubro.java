
package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ConectorOracle;
import model.Rubro;

public class DaoRubro {
    
    ConectorOracle con = new ConectorOracle();
    ResultSet rs;
    
    public Rubro obtener(int id) throws SQLException{
        rs = con.execute("select * from rubro where id_rubro = " + id);
        if(rs.next()) return new Rubro(rs.getInt(1), rs.getString(2));
        return null;
    }
    public ArrayList<Rubro> listar() throws SQLException{
        ArrayList<Rubro> list = new ArrayList<Rubro>();
        rs = con.execute("select * from Rubro");
        while(rs.next())list.add(new Rubro(rs.getInt("id_rubro"), rs.getString("descripcion")));
        return list;
    }
    public boolean insert(Rubro rubro){
        try {
            con.execute(rubro.toSql());
            return true;
        }catch(Exception e){}
        return false;
    }
    
    
     
}
