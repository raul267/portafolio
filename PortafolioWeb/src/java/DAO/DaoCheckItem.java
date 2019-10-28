package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.CheckItem;
import model.ConectorOracle;

public class DaoCheckItem {
    
    ConectorOracle con = new ConectorOracle();
    
    public CheckItem obtener(int id) throws SQLException{
        ResultSet rs = con.execute("select * from check_item where id_check_item = "+id);
        if(rs.next()){
            return new CheckItem(
                    rs.getInt("id_check_item"),
                    rs.getString("nombre"),
                    rs.getString("descripcion")
            );
        }
        return null;
    }
}
