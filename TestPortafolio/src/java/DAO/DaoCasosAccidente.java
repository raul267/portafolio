package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.CasosAccidente;
import model.CheckItem;
import model.ConectorOracle;

public class DaoCasosAccidente {
    ConectorOracle con = new ConectorOracle();
    
    public ArrayList<CasosAccidente> lista(int id_empresa) throws SQLException{
        ArrayList<CasosAccidente> list = new ArrayList<CasosAccidente>();
        ResultSet rs = con.execute("select * from casos_accidente where id_empresa_cliente = " + id_empresa);
        while(rs.next()){
            list.add(new CasosAccidente(
                    rs.getInt("id_casos_accidente"), 
                    new DaoEmpresaCliente().obtener(rs.getInt("id_empresa_cliente")), 
                    rs.getString("descripcion"), 
                    rs.getString("solucion"),
                    rs.getInt("enterreno")
                )
            );
        }
        return list;
    }
}
