package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ConectorOracle;
import model.DetalleInformeCheck;

public class DaoDetalleInformeCheck {
    ConectorOracle con = new ConectorOracle();
    
    public ArrayList<DetalleInformeCheck> obtener(int id_informe_check) throws SQLException{
        ArrayList<DetalleInformeCheck> list = new ArrayList<DetalleInformeCheck>();
        ResultSet rs = con.execute("select * from detalle_informe_check where id_informe ="+id_informe_check);
        
        while(rs.next()) list.add(new DetalleInformeCheck(
                new DaoInformeCheck().obtener(rs.getInt("id_informe")),
                new DaoCheckItem().obtener(rs.getInt("id_check_item")),
                rs.getInt("estado"),
                rs.getString("propuesta_mejora"))
            );
        return list;
    }
}
