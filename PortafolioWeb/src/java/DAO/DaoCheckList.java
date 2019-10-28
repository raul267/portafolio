
package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.CheckList;
import model.ConectorOracle;

public class DaoCheckList {
    ConectorOracle con = new ConectorOracle();
    
    public ArrayList<CheckList> obtener(int id_empresa) throws SQLException{
        ArrayList<CheckList> list = new ArrayList<CheckList>();
        ResultSet rs = con.execute("select * from checklist where id_empresa_cliente = "+id_empresa);
        while(rs.next())list.add(new CheckList(
                    rs.getInt("id_check_list"), 
                    rs.getInt("estado"), 
                    new DaoEmpresaCliente().obtener(rs.getInt("id_empresa_cliente")), 
                    new DaoCheckItem().obtener(rs.getInt("id_checkitem"))    
                )
            );
        return list;
    }
}
