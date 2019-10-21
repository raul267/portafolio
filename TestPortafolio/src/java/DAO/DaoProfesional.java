
package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ConectorOracle;
import model.Profesional;

public class DaoProfesional {
    ConectorOracle con = new ConectorOracle();
    
    public ArrayList<Profesional> listar() throws SQLException{
        ArrayList<Profesional> list = new ArrayList<Profesional>();
        ResultSet rs = con.execute("select * from profesional");
        while(rs.next())list.add(new Profesional(
                rs.getInt("id_profesional"),
                rs.getString("nombre"),
                rs.getString("direccion"),
                rs.getString("rut"),
                rs.getString("mail"),
                rs.getString("fono"),
                new DaoEmpresa().obtener(rs.getInt("id_empresa")),
                new DaoUsuario().obtener(rs.getInt("id_usuario")))
        );
        return list;
    }
    public Profesional obtener (int id) throws SQLException{
        for(Profesional pro : listar()) if (pro.getId()==id) return pro;
        return null;
    }
}
