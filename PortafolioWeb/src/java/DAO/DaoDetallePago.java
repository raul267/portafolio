package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ConectorOracle;
import model.DetallePago;

public class DaoDetallePago {
    ConectorOracle con = new ConectorOracle();
    
    public ArrayList<DetallePago> listar() throws SQLException{
        ArrayList<DetallePago> list = new ArrayList<DetallePago>();
        ResultSet rs = con.execute("select * from detalle_pago");
        while(rs.next())list.add(new DetallePago(
                rs.getInt("id_detalle_pago"),
                new DaoPagoServicio().obtener(rs.getInt("id_pago_servicio")),
                new DaoModoPago().obtener(rs.getInt("id_modo_pago")),
                rs.getDate("fecha_pago"),
                rs.getInt("monto")));
        return list;
    }
}
