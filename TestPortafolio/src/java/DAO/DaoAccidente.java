
package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Accidente;
import model.ConectorOracle;


public class DaoAccidente {
    
    ConectorOracle con = new ConectorOracle();
    
    public Accidente obtener(int id) throws SQLException{
        for(Accidente a : listar()) if(a.getId()==id) return a;
        return null;
    }
    public ArrayList<Accidente> listar() throws SQLException{
        ArrayList<Accidente> list = new ArrayList<Accidente>();
        ResultSet rs = con.execute("select * from accidente");
        while(rs.next())list.add(new Accidente(
                rs.getInt("id_accidente"),
                new DaoEmpleadoCliente().obtener(rs.getInt("id_empleado_cliente")),
                new DaoTipoAccidente().obtener(rs.getInt("id_tipo_accidente")),
                rs.getDate("fecha_accidente"),
                rs.getString("descripcion"))
        );
        return list;
    }
    
    public ResultSet selectALL(){
        return con.execute("select * from accidente");
    }
    
    public String comboBoxTipo_Accidente(String name) throws SQLException{   
       
        ResultSet rs = con.execute("select id_tipo_accidente,descripcion from tipo_accidente order by id_tipo_accidente asc");
        String combobox = "\n<select name='"+name+"'>";
        while(rs.next()) combobox+="   <option value='"+rs.getString("id_tipo_accidente")+"'>"+rs.getString("descripcion")+"</option>";
        combobox+="</select>"; 
        return combobox;
    }
    public String listarAccidente() throws SQLException{   
        
        ResultSet rs = con.execute("select id_accidente,id_empleado_cliente,id_tipo_accidente,fecha_accidente,fecha_accidente,descripcion from accidente");
        String combobox = "\n<table>";
        while(rs.next()) combobox+="<tr><td>"+rs.getString(rs.getString("id_accidente"))+"</td>"
                + "<td>"+rs.getString(rs.getString("id_empleado_cliente"))+"</td>"
                + "<td>"+rs.getString(rs.getString("id_tipo_accidente"))+"</td>"
                + "<td>"+rs.getString(rs.getString("fecha_accidente"))+"</td>"
                + "<td>"+rs.getString(rs.getString("descripcion"))+"</td></tr>";      
        combobox+="</table>"; 
        return combobox;
    }
    public String listarTable() throws SQLException{   
        
        ResultSet rs = con.execute("select id_accidente,"
                + "id_empleado_cliente,"
                + "id_tipo_accidente,"
                + "fecha_accidente,"
                + "fecha_accidente,"
                + "descripcion from accidente"
                + "inner join");
        String combobox = "\n<table>";
        while(rs.next()) combobox+="<tr><td>"+rs.getString(rs.getString("id_accidente"))+"</td>"
                + "<td>"+rs.getString(rs.getString("id_empleado_cliente"))+"</td>"
                + "<td>"+rs.getString(rs.getString("id_tipo_accidente"))+"</td>"
                + "<td>"+rs.getString(rs.getString("fecha_accidente"))+"</td>"
                + "<td>"+rs.getString(rs.getString("descripcion"))+"</td></tr>";      
        combobox+="</table>"; 
        return combobox;
    }
    
    public boolean ingresar(Accidente accidente){
        try {
            con.execute(accidente.toSql());
            return true;
        }catch (Exception e){
            return false;
        }
    }    
}
