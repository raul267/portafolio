
package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ConectorOracle;
import model.EmpleadoCliente;
import model.EmpresaCliente;



public class DaoEmpleadoCliente {
    ConectorOracle con = new ConectorOracle();
   
    EmpleadoCliente empleadoCliente;         
    ResultSet rs;
    
    public String comboBoxEmpleadoCliente(String name) throws SQLException{
        rs = con.execute("select id_empleado_cliente,nombre from empleado_cliente");
        
        String combobox ="<select name='"+name+"'>";
        while(rs.next()){ combobox+="   <option value='"+rs.getString("id_empleado_cliente")+"'>"+rs.getString("nombre")+"</option>";}
        combobox+="</select>";
        return combobox;
    }
    public ArrayList<EmpleadoCliente> listar() throws SQLException{
        ArrayList<EmpleadoCliente> listaEmpleado = new ArrayList<EmpleadoCliente>();
        /*
        rs = con.execute("select id_empleado_cliente,nombre,mail,id_empresa from empleado_cliente");
        while(rs.next()){ 
            listaEmpleado.add(new EmpleadoCliente(rs.getInt("id_empleado_cliente"),
                    rs.getString("nombre"),
                    rs.getString("maill"),
                    new EmpresaCliente(0,
                            new DaoRubro().obtener(rs.getInt("")),
                            usuario,
                            nombre,
                            direccion,
                            run,
                            mail,
                            fono))
            );
        }
*/
       
        return null;
    }
    
    public EmpleadoCliente obtener(int id) throws SQLException{
        rs = con.execute("select id_empleado_cliente,"
                + "nombre,"
                + "mail,"
                + "id_empresa_cliente"
                + " from empleado_cliente where id_empleado_cliente = "+id);
        while(rs.next()){
            
            return new EmpleadoCliente(
                    rs.getInt("id_empleado_cliente"),
                    rs.getString("nombre"),
                    rs.getString("mail"),
                    new DaoEmpresaCliente().obtener(rs.getInt("id_empresa_cliente")));
            
            //empleadoCliente = new EmpleadoCliente(0,nombre, mail, empresaCliente);
       }
        return empleadoCliente;
    }
    
}
