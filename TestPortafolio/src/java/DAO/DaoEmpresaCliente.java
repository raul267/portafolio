
package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ConectorOracle;
import model.Empresa;
import model.EmpresaCliente;
import model.Usuario;

public class DaoEmpresaCliente {
    
    ConectorOracle con = new ConectorOracle();
    ResultSet rs;
    ArrayList<EmpresaCliente> list = new ArrayList<EmpresaCliente>();
    
    public EmpresaCliente obtener(int id) throws SQLException{
        
        rs = con.execute("select * from empresa_cliente where id_empresa_cliente = "+id);
        //8
        if(rs.next()){
            return new EmpresaCliente(rs.getInt("id_empresa_cliente"),
                    new DaoRubro().obtener(rs.getInt("id_tipo_empresa")),
                    new DaoUsuario().obtener(rs.getInt("id_usuario")),
                    rs.getString("nombre"),
                    rs.getString("direccion"),
                    rs.getString("run"),
                    rs.getString("mail"),
                    rs.getString("fono"));
        }
        return null;
    }
    public EmpresaCliente obtener(Usuario u) throws SQLException{
        
        rs = con.execute("select * from empresa_cliente where id_usuario = "+u.getId());
        //8
        if(rs.next()){
            return new EmpresaCliente(rs.getInt("id_empresa_cliente"),
                    new DaoRubro().obtener(rs.getInt("id_tipo_empresa")),
                    new DaoUsuario().obtener(rs.getInt("id_usuario")),
                    rs.getString("nombre"),
                    rs.getString("direccion"),
                    rs.getString("run"),
                    rs.getString("mail"),
                    rs.getString("fono"));
        }
        return null;
    }
    
    public ArrayList<EmpresaCliente> listar() throws SQLException{
        list = new ArrayList<EmpresaCliente>();
        rs = con.execute("select * from empresa_cliente");
        while(rs.next()){
            list.add( new EmpresaCliente(rs.getInt("id_empresa_cliente"),
                new DaoRubro().obtener(rs.getInt("id_tipo_empresa")),
                new DaoUsuario().obtener(rs.getInt("id_usuario")),
                rs.getString("nombre"),
                rs.getString("direccion"),
                rs.getString("run"),
                rs.getString("mail"),
                rs.getString("fono"))
            );
        }
        return list;
    }
    public String combobox(String name) throws SQLException{
        String combobox = "<select name ='"+name+"'>";
        for(EmpresaCliente e : listar()){ combobox += "<option value='"+e.getId()+"'>"+e.getNombre()+"</option>";}
        combobox += "</select>";
        return combobox;
    }
    
    public String comboboxRevisar(String name) throws SQLException{
        String combobox = "<section><li name ='"+name+"'>";
        for(EmpresaCliente e : listar()){ combobox += "<a href='/TestPortafolio/profesional/RevisarCliente.jsp?id="+e.getId()+"'><li value='"+e.getId()+"'>"+e.getNombre()+"</li></a>";}
        combobox += "</li></section>";
        return combobox;
    }
    
}
