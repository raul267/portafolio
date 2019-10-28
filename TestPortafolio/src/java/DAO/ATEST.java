
package DAO;

import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import model.Accidente;
import model.Rubro;

public class ATEST {
    public static void main(String... args) throws SQLException{
        System.out.println("DAO USUARIO TEST");
        System.out.println(new DaoUsuario().obtener("mauroacc", "mauropass"));
        
     
        System.out.println(new SimpleDateFormat("dd/MM/YYYY").format(new java.sql.Date(System.currentTimeMillis())));
        //new DaoAccidente().ingresar(new Accidente(61345, 1, 1, Date.valueOf("2019-10-22"), "descrip"));
        
        //new SimpleDateFormat("dd/MM/YYYY").format(Date.valueOf("10-26-2019"));
        
    }
}
