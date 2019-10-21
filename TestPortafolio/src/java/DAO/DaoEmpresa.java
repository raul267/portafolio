
package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.ConectorOracle;
import model.Empresa;


public class DaoEmpresa {
    ConectorOracle con = new ConectorOracle();
    
    public Empresa obtener(int id) throws SQLException{
        ResultSet rs = con.execute("select * from empresa where id_empresa = "+id);
        if(rs.next()) return new Empresa(
                rs.getInt("id_empresa"),
                rs.getString("nombre"),
                rs.getString("direccion"),
                rs.getString("run"),
                rs.getString("mail"),
                rs.getString("fono"),
                rs.getString("celular"));
        return null;
    }
}
