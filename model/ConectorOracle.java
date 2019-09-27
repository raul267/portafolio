package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;


public class ConectorOracle /* implements ConectorBD */ {

    private final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
    private String DB_URL;
    private String USER;
    private String PASS;
    protected Connection con;

    public ConectorOracle(String HOST, String PORT,String USER, String PASS, String basedato) {

        this.USER = USER;
        this.PASS = PASS;

        DB_URL = "jdbc:oracle:thin:@"+HOST+":"+PORT+":"+basedato;
    }

    public Connection getConection() {
        try{
            Class.forName(JDBC_DRIVER);
            con = DriverManager.getConnection(DB_URL, USER, PASS);
            return con;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    public void cerrar(){
        try{
            if(con!=null)
            if(!con.isClosed())
                con.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public ResultSet execute(String query) {
        try{
            return getConection().prepareStatement(query).executeQuery();
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    /* PROBAR LA CONECCION */
    public void testInsert() throws Exception{
         new ("ip","portafolio","portafolio","portafolio").execute("insert-query");
    }
}
