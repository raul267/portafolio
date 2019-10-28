package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ConectorOracle;
import model.Empresa;
import model.Servicio;

public class DaoServicio {
    
    ConectorOracle con = new ConectorOracle();
    ResultSet rs;
    
    public ArrayList<Servicio> listar() throws SQLException{
        ArrayList<Servicio> list = new ArrayList<Servicio>();
        rs = con.execute("select * from servicio");
        while(rs.next())
            list.add(new Servicio(
                    rs.getInt("id_servicio"),
                    rs.getInt("cantidad_visitas"),
                    rs.getInt("cantidad_asesoria"),
                    rs.getInt("cantidad_llamadas"),
                    rs.getInt("cantidad_capacitacion"),
                    rs.getInt("check_list_estado"),
                    rs.getInt("costo_total"),
                    new DaoEmpresaCliente().obtener(rs.getInt("id_empresa_cliente"))));
        
        return list;
    }
    public ArrayList<Servicio> listar(int id_empresa_cliente) throws SQLException{
        ArrayList<Servicio> list = new ArrayList<Servicio>();
        for(Servicio s : listar()){
            if(s.getEmpresaCliente().getId()==id_empresa_cliente){
                list.add(s);
            }
        }
        return list;
    }
    public ArrayList<Servicio> listar(Empresa empresa) throws SQLException{
        ArrayList<Servicio> list = new ArrayList<Servicio>();
        for(Servicio s : listar()){
            if(s.getEmpresaCliente().getId()== empresa.getId()){
                list.add(s);
            }
        }
        return list;
    }
    
    public Servicio obtener(int id) throws SQLException{
        for(Servicio servicio : listar()) if(servicio.getId() == id) return servicio;
        return null;
    }
    
}
