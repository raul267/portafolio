
package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ConectorOracle;
import model.Llamada;

public class DaoLlamada {
    
    ConectorOracle con = new ConectorOracle();
    
    public Llamada obtener(int id) throws SQLException{
        for(Llamada llamada : listar()) if (llamada.getId() == id) return llamada;    
        return null;
    }
    public ArrayList<Llamada> listar() throws SQLException{
        ResultSet rs = con.execute("select * from llamada");
        ArrayList<Llamada> list = new ArrayList<Llamada>();
        while(rs.next())list.add(new Llamada(
                rs.getInt("id_llamada"),
                new DaoServicio().obtener(rs.getInt("id_servicio")),
                new DaoEmpleadoCliente().obtener(rs.getInt("id_empleado_cliente")),
                rs.getDate("fecha_llamada"),
                rs.getString("observacion"),
                rs.getInt("enhorario"))
        );
        
        
        return list;
    }
}
