
package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ConectorOracle;
import model.PagoServicio;

public class DaoPagoServicio {
    ConectorOracle con = new ConectorOracle();
    
    public PagoServicio obtener(int id) throws SQLException{
        for(PagoServicio pago : listar()) if(pago.getId()==id) return pago;
        return null;
    }
    public ArrayList<PagoServicio> listar() throws SQLException{
        ArrayList<PagoServicio> list = new ArrayList<PagoServicio>();
        ResultSet rs = con.execute("select * from pago_servicio");
        while(rs.next()) list.add(new PagoServicio(
                rs.getInt("id_pago_servicio"),
                new DaoServicio().obtener(rs.getInt("id_servicio")),
                rs.getDate("fecha_vencimiento"),
                rs.getString("comprobante"))
        );
        return list;
    }
    
}
