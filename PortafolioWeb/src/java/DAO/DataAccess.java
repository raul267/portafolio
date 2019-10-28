
package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Accidente;
import model.Asesoria;
import model.Capacitacion;
import model.CasosAccidente;
import model.CheckItem;
import model.CheckList;
import model.CobroExtra;
import model.ConectorOracle;
import model.DetalleCapacitacion;
import model.DetalleInformeCheck;
import model.DetallePago;
import model.EmpleadoCliente;
import model.Empresa;
import model.EmpresaCliente;
import model.FactAsesoria;
import model.FactCapacitacion;
import model.InformeCheck;
import model.Llamada;
import model.Material;
import model.ModoPago;
import model.PagoServicio;
import model.PlantillaCheckRubro;
import model.Profesional;
import model.Rubro;
import model.Servicio;
import model.Tarifa;
import model.TipoAccidente;
import model.TipoAsesoria;
import model.TipoUsuario;
import model.Usuario;


public class DataAccess {
    
    
        ConectorOracle con = new ConectorOracle();
        ResultSet rs;
    
        public ArrayList<Accidente> listaAccidente = new ArrayList<Accidente>();
	public ArrayList<CasosAccidente> listaCasosAccidente = new ArrayList<CasosAccidente>();
	public ArrayList<TipoAccidente> listaTipoAccidente = new ArrayList<TipoAccidente>();
	
	//asesoria
	public ArrayList<FactAsesoria> listaFactAsesoria = new ArrayList<FactAsesoria>();
	public ArrayList<Asesoria> listaAsesoria = new ArrayList<Asesoria>();
	public ArrayList<TipoAsesoria> listaTipoAsesoria = new ArrayList<TipoAsesoria>();
	
	//capacitacion
	public ArrayList<FactCapacitacion> listaFactCapacitacion = new ArrayList<FactCapacitacion>();
	public ArrayList<DetalleCapacitacion> listaDetalleCapacitacion = new ArrayList<DetalleCapacitacion>();
	public ArrayList<Capacitacion> listaCapacitacion = new ArrayList<Capacitacion>();
	public ArrayList<Material> listaMaterial = new ArrayList<Material>();
	
	//call center
	public ArrayList<Llamada> listaLlamada = new ArrayList<Llamada>();
	
	//cobroextra
	public ArrayList<CobroExtra> listaCobroExtra = new ArrayList<CobroExtra>();
	public ArrayList<Tarifa> listaTarifa = new ArrayList<Tarifa>();
	
	
	//Empresa Cliente
	public ArrayList<EmpresaCliente> listaEmpresaCliente = new ArrayList<EmpresaCliente> ();
	public ArrayList<Rubro> listaRubro = new ArrayList<Rubro>();
	public ArrayList<Servicio> listaServicio = new ArrayList<Servicio>();
	
	// checklist
	public ArrayList<CheckList> listaCheckList = new ArrayList<CheckList>();
	public ArrayList<CheckItem> listaCheckItem = new ArrayList<CheckItem>();
	public ArrayList<PlantillaCheckRubro> listaPlantillaCheckRubro = new ArrayList<PlantillaCheckRubro>();
	
	public ArrayList<InformeCheck> listaInforme = new ArrayList<InformeCheck>();
	public ArrayList<DetalleInformeCheck> listaDetalleInformeCheck = new ArrayList<DetalleInformeCheck>();
	
	// user session control
	public ArrayList<Profesional> listaProfesional = new ArrayList<Profesional>();
	public ArrayList<EmpleadoCliente> listaEmpleadoCliente = new ArrayList<EmpleadoCliente>();
	public ArrayList<Usuario> listaUsuario = new ArrayList<Usuario>();
	public ArrayList<TipoUsuario> listaTipoUsuario = new ArrayList<TipoUsuario>();
	
	// pagos
	public ArrayList<ModoPago> listaModoPago = new ArrayList<ModoPago>();
	public ArrayList<PagoServicio> listaPagoServicio = new ArrayList<PagoServicio>();
	public ArrayList<DetallePago> listaDetallePago = new ArrayList<DetallePago>();
        
        public ArrayList<Empresa>listaEmpresa = new ArrayList<Empresa>();
        Empresa empresa;

    public DataAccess() throws SQLException {
        init_data();
    }
        
        
        public void init_data() throws SQLException{
            tipo_accidente();
            tipo_asesoria();
            rubro();
            tipo_usuario();
            modo_pago();
            tarifa();
            empresa();
            usuario();
            empresa_cliente();
            accidente();
        }
        public void tipo_accidente() throws SQLException{
            rs = con.execute("select id_tipo_accidente,descripcion from tipo_accidente order by id_tipo_accidente asc");
            while(rs.next()) listaTipoAccidente.add(new TipoAccidente(rs.getInt("id_tipo_accidente"), rs.getString("descripcion")));
        }
        public void tipo_asesoria() throws SQLException{
            rs = con.execute("select id_tipo_asesoria,descripcion from tipo_asesoria order by id_tipo_asesoria asc");
            while(rs.next()) listaTipoAsesoria.add(new TipoAsesoria(rs.getInt("id_tipo_asesoria"), rs.getString("descripcion")));
        }
        public void rubro() throws SQLException{
            rs = con.execute("select id_rubro,descripcion from rubro order by id_rubro asc");
            while(rs.next()) listaRubro.add(new Rubro(rs.getInt("id_rubro"), rs.getString("descripcion")));
        }
        public void tipo_usuario() throws SQLException{
            rs = con.execute("select id_tipousuario, nombre from tipo_usuario");
            while(rs.next()) listaTipoUsuario.add(new TipoUsuario(rs.getInt("id_tipousuario"), rs.getString("nombre")));
        }
        public void modo_pago() throws SQLException{
            rs = con.execute("select id_modo_pago, descripcion from modo_pago");
            while(rs.next()) listaModoPago.add(new ModoPago(rs.getInt("id_modo_pago"), rs.getString("descripcion")));
        }
        public void tarifa() throws SQLException{
            rs = con.execute("select id_tarifa, descripcion,costo from tarifa");
            while(rs.next()) listaTarifa.add(new Tarifa(rs.getInt("id_tarifa"), rs.getString("descripcion"),rs.getInt("costo")));
        }
        public void usuario() throws SQLException{
            rs = con.execute(
                "SELECT usuario.*,tipo_usuario.* FROM usuario inner join tipo_usuario on usuario.id_tipo_usuario = tipo_usuario.id_tipousuario"
            );
            
            while(rs.next()) listaUsuario.add(new Usuario(
                    rs.getInt("id_usuario"),
                    rs.getString("nick_name"),
                    rs.getString("password"),new TipoUsuario(rs.getInt(4), rs.getString(5))));
        }

        public void empresa() throws SQLException{
            rs = con.execute("select id_empresa, nombre, direccion, mail, run, fono, celular from empresa");
            while(rs.next()) listaEmpresa.add(new Empresa(
                    rs.getInt("id_empresa"),
                    rs.getString("nombre"),
                    rs.getString("direccion"),
                    rs.getString("mail"),
                    rs.getString("run"),
                    rs.getString("fono"),
                    rs.getString("celular")
            ));
        } 
        
        public void empresa_cliente() throws SQLException{
            rs = con.execute(
                    "select empresa_cliente.*,tipo_empresa.*,usuario.*,tipo_usuario.* from empresa_cliente " +
                    "inner join tipo_empresa on empresa_cliente.id_tipo_empresa = tipo_empresa.id_tipo " +
                    "inner join usuario on empresa_cliente.id_usuario = usuario.id_usuario " +
                    "inner join tipo_usuario on tipo_usuario.id_tipousuario = usuario.id_tipo_usuario"
            );
            
            while(rs.next()) listaEmpresaCliente.add(new EmpresaCliente(
                    rs.getInt("id_empresa_cliente"),
                    new Rubro(rs.getInt("id_tipousuario"), rs.getString("descripcion")),
                    new Usuario(rs.getInt("id_usuario"), rs.getString("nick_name"), rs.getString("password"), 
                            new TipoUsuario(rs.getInt("id_tipo_usuario"), rs.getString(15))),
                    rs.getString("nombre"),
                    rs.getString("direccion"),
                    rs.getString("run"),
                    rs.getString("mail"),
                    rs.getString("fono")
            ));
        } 
        public void accidente() throws SQLException{
            rs = con.execute("select * from accidente");
            while(rs.next()) listaAccidente.add(new Accidente(
                        rs.getInt("id_accidente"),
                        new DaoEmpleadoCliente().obtener(rs.getInt("id_empleado_cliente")),
                        new DaoTipoAccidente().obtener(rs.getInt("id_tipo_accidente")),
                        rs.getDate("fecha_accidente"),
                        rs.getString("descripcion"))
            );
        } 

    @Override
    public String toString() {
        return "DataAccess{" + "con=" + con + ", rs=" + rs + ", listaAccidente=" + listaAccidente + ", listaCasosAccidente=" + listaCasosAccidente + ", listaTipoAccidente=" + listaTipoAccidente + ", listaFactAsesoria=" + listaFactAsesoria + ", listaAsesoria=" + listaAsesoria + ", listaTipoAsesoria=" + listaTipoAsesoria + ", listaFactCapacitacion=" + listaFactCapacitacion + ", listaDetalleCapacitacion=" + listaDetalleCapacitacion + ", listaCapacitacion=" + listaCapacitacion + ", listaMaterial=" + listaMaterial + ", listaLlamada=" + listaLlamada + ", listaCobroExtra=" + listaCobroExtra + ", listaTarifa=" + listaTarifa + ", listaEmpresaCliente=" + listaEmpresaCliente + ", listaRubro=" + listaRubro + ", listaServicio=" + listaServicio + ", listaCheckList=" + listaCheckList + ", listaCheckItem=" + listaCheckItem + ", listaPlantillaCheckRubro=" + listaPlantillaCheckRubro + ", listaInforme=" + listaInforme + ", listaDetalleInformeCheck=" + listaDetalleInformeCheck + ", listaProfesional=" + listaProfesional + ", listaEmpleadoCliente=" + listaEmpleadoCliente + ", listaUsuario=" + listaUsuario + ", listaTipoUsuario=" + listaTipoUsuario + ", listaModoPago=" + listaModoPago + ", listaPagoServicio=" + listaPagoServicio + ", listaDetallePago=" + listaDetallePago + ", listaEmpresa=" + listaEmpresa + ", empresa=" + empresa + '}';
    }
        
        

}
