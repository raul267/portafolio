 
package modelbd3;

import java.sql.ResultSet;

public class ConectionTest {
    static ConectorOracle con = new ConectorOracle("localhost", "1521", "bd3", "a", "xe"); 
    public static void main(String[] args) throws Exception {
        
        
        //ResultSet rs = con.execute("insert into tipo_accidente ( id_tipo_accidente, descripcion) values (10 , 'Otro')");
        
        /* COMBO BOX tipo_accidente 
        ResultSet rs = con.execute("select id_tipo_accidente,descripcion from tipo_accidente order by id_tipo_accidente asc");
        System.out.println("\n<select>");
        while(rs.next()) System.out.println("   <option value='"+rs.getString("id_tipo_accidente")+"'>"+rs.getString("descripcion")+"</option>");
        System.out.println("<select/>");
        
        
        /* COMBO BOX tipo_asesoria 
        rs = con.execute("select id_tipo_asesoria,descripcion from tipo_asesoria");
        System.out.println("\n<select>");
        while(rs.next()) System.out.println("   <option value='"+rs.getString("id_tipo_asesoria")+"'>"+rs.getString("descripcion")+"</option>");
        System.out.println("<select/>");
        
        /* COMBO BOX tipo_usuario 
        rs = con.execute("select descripcion,costo from tarifa");
        System.out.println("\n<table border='1'>");
        while(rs.next()) System.out.println("   <tr><td>"+rs.getString("descripcion")+"<td><td>"+rs.getString("costo")+"<td></tr>");
        System.out.println("<table/>");
        */
        ResultSet rs = con.execute("select MAX(id_tipo_accidente) from tipo_accidente");
        //System.out.println("\n<table border='1'>");  
        while(rs.next()) System.out.println(rs.getString(1));
        //System.out.println("<table/>");
       
    }
}
