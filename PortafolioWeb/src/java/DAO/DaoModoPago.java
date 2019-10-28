
package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ConectorOracle;
import model.ModoPago;


public class DaoModoPago {
    
    ConectorOracle con = new ConectorOracle();
    
    public ModoPago obtener(int id) throws SQLException{
        for(ModoPago modo : listar()) if (modo.getId()==id) return modo;
        return null;
    }
    public ArrayList<ModoPago> listar() throws SQLException{
        ArrayList<ModoPago> list = new ArrayList<ModoPago>();
        ResultSet rs = con.execute("select * from modo_pago");
        while(rs.next())list.add(new ModoPago(
                rs.getInt("id_modo_pago"),
                rs.getString("descripcion")));
        return list;
    }
}
