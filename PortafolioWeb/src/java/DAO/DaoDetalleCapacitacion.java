
package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ConectorOracle;
import model.DetalleCapacitacion;


public class DaoDetalleCapacitacion {
    ConectorOracle con = new ConectorOracle();
    
    public ArrayList<DetalleCapacitacion> listar() throws SQLException{
        ArrayList<DetalleCapacitacion> lista = new ArrayList<DetalleCapacitacion>();
        ResultSet rs = con.execute("select * from detalle_capacitacion");
        
        while(rs.next()){
            lista.add(
                new DetalleCapacitacion(
                    new DaoFactCapacitacion().obtener(rs.getInt("id_fact_capacitacion")),
                    new DaoEmpleadoCliente().obtener(rs.getInt("id_empleado_cliente"))
                )
            );
        }
        return lista;
    }
}
