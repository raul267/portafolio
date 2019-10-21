
package model;

import java.sql.ResultSet;


public class TEST {
    static ConectorOracle con = new ConectorOracle("localhost", "1521", "bd3", "a", "xe"); 
    public static void main(String[] args) throws Exception {
        
        
        //ResultSet rs = con.execute("insert into tipo_accidente ( id_tipo_accidente, descripcion) values (10 , 'Otro')");
        
        // COMBO BOX tipo_accidente 
        ResultSet rs = con.execute("select id_tipo_accidente,descripcion from tipo_accidente order by id_tipo_accidente asc");
        System.out.println("\n<select>");
        while(rs.next()) System.out.println("   <option value='"+rs.getString("id_tipo_accidente")+"'>"+rs.getString("descripcion")+"</option>");
        System.out.println("<select/>");
          
        /* COMBO BOX tipo_asesoria */
        rs = con.execute("select id_tipo_asesoria,descripcion from tipo_asesoria");
        System.out.println("\n<select>");
        while(rs.next()) System.out.println("   <option value='"+rs.getString("id_tipo_asesoria")+"'>"+rs.getString("descripcion")+"</option>");
        System.out.println("<select/>");
        
        /* COMBO BOX tipo_usuario */
        rs = con.execute("select descripcion,costo from tarifa");
        System.out.println("\n<table border='1'>");
        while(rs.next()) System.out.println("   <tr><td>"+rs.getString("descripcion")+"<td><td>"+rs.getString("costo")+"<td></tr>");
        System.out.println("<table/>");
        
        rs = con.execute("select * from check_item");
        System.out.println("\n<table border='1'>");  
        //while(rs.next()) System.out.println("<input type='checkbox' name='check_item_"+rs.getString("id_check_item")+"' value='"+rs.getString("nombre")+"' checked> "+rs.getString("nombre")+"<br>");
        while(rs.next()) System.out.println(rs.getString("nombre"));
        System.out.println("<table/>");
       
    }
}
