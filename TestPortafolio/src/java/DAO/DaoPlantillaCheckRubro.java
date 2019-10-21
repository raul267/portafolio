package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.*;
import model.ConectorOracle;
import model.PlantillaCheckRubro;

public class DaoPlantillaCheckRubro {
    ConectorOracle con = new ConectorOracle();
    
    public ArrayList<PlantillaCheckRubro> listar(int id_rubro) throws SQLException{
        ArrayList<PlantillaCheckRubro> lista = new ArrayList<PlantillaCheckRubro>();
        ResultSet rs = con.execute("select * from plantilla_check_rubro where id_rubro = "+id_rubro);
        
        while(rs.next()){
            lista.add(
                new PlantillaCheckRubro(
                    new DaoRubro().obtener(rs.getInt("id_rubro")),
                    new DaoCheckItem().obtener(rs.getInt("id_check_item"))
                )
            );
        }
        return lista;
    }
}
