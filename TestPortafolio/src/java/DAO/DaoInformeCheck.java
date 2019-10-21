package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ConectorOracle;
import model.InformeCheck;

public class DaoInformeCheck {
    
    ConectorOracle con = new ConectorOracle();
    
    
    public ArrayList<InformeCheck> obtenerList(int id_empresa_cliente) throws SQLException{
        ArrayList<InformeCheck> list = new ArrayList<InformeCheck>();
        ResultSet rs = con.execute("select * from informe_check where id_empresa_cliente = "+id_empresa_cliente);
        while(rs.next()){
            list.add(new InformeCheck(
                    rs.getInt("id_informe_check"),
                    rs.getDate("fecha_informe_check"),
                    new DaoEmpresaCliente().obtener(rs.getInt("id_empresa_cliente")))
            );
        }
        return list;
    }
    
    public InformeCheck obtener(int id_informe) throws SQLException{
        ResultSet rs = con.execute("select * from informe_check where id_informe_check = "+id_informe);
        if(rs.next()){
            return new InformeCheck(
                    rs.getInt("id_informe_check"),
                    rs.getDate("fecha_informe_check"),
                    new DaoEmpresaCliente().obtener(rs.getInt("id_empresa_cliente"))
            );
        }
        return null;
    }
}
