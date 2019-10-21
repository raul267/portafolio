package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;


public class ConectorOracle implements ConectorBD {
//con=java.sql.DriverManager.getConnection(“jdbc:oracle:thin:@aepi:1521:aepi“,”system”,”aepi“);


    private final String JDBC_DRIVER = "oracle.jdbc.OracleDriver";//  oracle.jdbc.driver.OracleDriver
    private String DB_URL;    
    private String USER;
    private String PASS;
    protected Connection con;
     public static ConectorOracle InstConn = new ConectorOracle("localhost", "1521", "bd3", "a", "xe");;
    
     
    public ConectorOracle(String HOST, String PORT,String USER, String PASS, String basedato) {
        
        this.USER = USER;
        this.PASS = PASS;
            //jdbc:oracle:thin:@aepi:1521:aepi“,”system”,”aepi“);
        DB_URL = "jdbc:oracle:thin:@"+HOST+":"+PORT+":"+basedato;
    }
    
    public ConectorOracle(){
        this.USER = "bd3";
        this.PASS = "a";
            //jdbc:oracle:thin:@aepi:1521:aepi“,”system”,”aepi“);
        DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
    }

    
    public synchronized static ConectorOracle InstanciaConn(){
        if (InstConn==null){
            InstConn = new ConectorOracle("localhost", "1521", "bd3", "a", "xe");
        
        }
        return InstConn;
    
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

    @Override
    public ResultSet execute(String query) {
        try{
            return getConection().prepareStatement(query).executeQuery();
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;  
    }
}