
package model_antiguo;



public class TestConection {
    
    static ConectorOracle conU = new ConectorOracle("localhost", "1521", "system", "system2019", "xe"); 
    
    public static void main (String... args){
        conU.execute("insert into USUARIO VALUES (9,2,'bla','bla') ");
    }
}
