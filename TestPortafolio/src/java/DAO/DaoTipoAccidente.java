
package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.ConectorOracle;
import model.TipoAccidente;

public class DaoTipoAccidente {
    ConectorOracle con = new ConectorOracle();
    ResultSet rs;
    
    public TipoAccidente obtener(int id) throws SQLException{
        rs = con.execute("select * from tipo_accidente");
        if(rs.next()){
            return new TipoAccidente(
                    rs.getInt("id_tipo_accidente"),
                    rs.getString("descripcion"));
        }
        return null;
    }
}
