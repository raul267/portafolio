
package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Accidente;
import model.ConectorOracle;
import model.Empresa;
import model.EmpresaCliente;


public class DaoAccidente {
    
    ConectorOracle con = new ConectorOracle();
    
    public Accidente obtener(int id) throws SQLException{
        for(Accidente a : listar()) if(a.getId()==id) return a;
        return null;
    }
    public ArrayList<Accidente> listar() throws SQLException{
        ArrayList<Accidente> list = new ArrayList<Accidente>();
        ResultSet rs = con.execute("select * from accidente order by id_tipo_accidente asc");
        while(rs.next())list.add(new Accidente(
                rs.getInt("id_accidente"),
                new DaoEmpleadoCliente().obtener(rs.getInt("id_empleado_cliente")),
                new DaoTipoAccidente().obtener(rs.getInt("id_tipo_accidente")),
                rs.getDate("fecha_accidente"),
                rs.getString("descripcion"))
        );
        return list;
    }
    
    public String listToTableHTML() throws SQLException{
        String text ="<table class='hovertable' border='1'><tr><th>Id</th><th>Fecha Accidente</th><th>Decripcion</th><th>Empleado Cliente</th><th>Tipo Accidente</th><th>Empresa Cliente</th></tr>";
        for(Accidente accidente : listar()){
            text+="<tr onmouseover=\"this.style.backgroundColor='#ffff66';\" onmouseout=\"this.style.backgroundColor='#d4e3e5';\">"
                    + "<a href='index.jsp?visualizar="+accidente.getId()+"'>"
                    + "<td>"+accidente.getId()+"</td>"
                    + "<td>"+accidente.getDate()+"</td>"
                    + "<td>"+accidente.getDescripcion()+"</td>"
                    + "<td>"+accidente.getEmpleadoCliente().getNombre()+"</td>"
                    + "<td>"+accidente.getTipoAccidente().getDescripcion()+"</td>"
                    + "<td>"+accidente.getEmpleadoCliente().getEmpresaCliente().getNombre()+"</td>"
                    + "</a></tr>";
        }
        text+="</table>";
        return text;
    }
    
    public String estadisticas() throws SQLException{
        for(EmpresaCliente empresa : new DaoEmpresaCliente().listar()){
            
        }
        for(Accidente a : listar()) {
            
        }
        return null;
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
                
                + "descripcion from accidente");
        
        String combobox = "\n<table>";
        while(rs.next()) combobox+="<tr><td>"+rs.getString(rs.getString("id_accidente"))+"</td>"
                + "<td>"+rs.getString(rs.getString("id_empleado_cliente"))+"</td>"
                + "<td>"+rs.getString(rs.getString("id_tipo_accidente"))+"</td>"
                + "<td>"+rs.getString(rs.getString("fecha_accidente"))+"</td>"
                + "<td>"+rs.getString(rs.getString("descripcion"))+"</td></tr>";      
        combobox+="</table>"; 
        return combobox;
    }
    
    
}
