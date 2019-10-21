package DAO;

import java.sql.SQLException;
import model.*;

public class TestDataAccess {

    public static void main (String[] args) throws SQLException{
        DataAccess data = new DataAccess();
        
        System.out.println("\n# TipoAccidente ");
        for(TipoAccidente t : data.listaTipoAccidente)System.out.println(t.getId() + " - " + t.getDescripcion());
        
        System.out.println("\n# TipoAsesoria ");
        for(TipoAsesoria t : data.listaTipoAsesoria)System.out.println(t.getId() + " - " + t.getDescripcion());
        
        System.out.println("\n# Rubro ");
        for(Rubro t : data.listaRubro)System.out.println(t.getId() + " - " + t.getDescripcion());
        
        System.out.println("\n# TipoUsuario ");
        for(TipoUsuario t : data.listaTipoUsuario)System.out.println(t.getId() + " - " + t.getNombre());
        
        System.out.println("\n# ModoPago ");
        for(ModoPago t : data.listaModoPago)System.out.println(t.getId() + " - " + t.getDescripcion());
        
        System.out.println("\n# Tarifa ");
        for(Tarifa t : data.listaTarifa)System.out.println(t.getId() + " - " + t.getDescripcion() + " - " +  t.getCost());
        
        System.out.println("\n# Empresa ");
        for(Empresa t : data.listaEmpresa)System.out.println(t);
        
        System.out.println("\n# Usuario ");
        for(Usuario t : data.listaUsuario)System.out.println(t);
        
        System.out.println("\n# EmpresaCliente ");
        for(EmpresaCliente t : data.listaEmpresaCliente)System.out.println(t);
        
        System.out.println("\n# Accidente ");
        for(Accidente t : data.listaAccidente)System.out.println(t);
        
        System.out.println("\n# CheckItem ");
        System.out.println(new DaoCheckItem().obtener(10));
        
        System.out.println("\n# DaoPlantillaCheckRubro ");
        System.out.println(new DaoPlantillaCheckRubro().listar(1)); // por rubro
        
        System.out.println("\n# DaoCheckList ");
        System.out.println(new DaoCheckList().obtener(1)); // por empresa_cliente
        
        System.out.println("\n# Dao InformeCheck ");
        for(InformeCheck i : new DaoInformeCheck().obtenerList(1)) System.out.println(i);
        for(InformeCheck i : new DaoInformeCheck().obtenerList(2)) System.out.println(i); // por empresa_cliente
        
        System.out.println("\n# Dao DetalleInformeCheck ");
        for(DetalleInformeCheck i : new DaoDetalleInformeCheck().obtener(2)) System.out.println(i);
        
        System.out.println("\n# Dao DetalleInformeCheck ");
        for(DetalleInformeCheck i : new DaoDetalleInformeCheck().obtener(2)) System.out.println(i);
        
        System.out.println("\n# Dao CasosAccidente ");
        for(CasosAccidente i : new DaoCasosAccidente().lista(1)) System.out.println(i);
        
        System.out.println("\n# Dao Servicio ");
        for(Servicio i : new DaoServicio().listar(1)) System.out.println(i);
        
        System.out.println("\n# Dao Tarifa ");
        for(Tarifa i : new DaoTarifa().listar()) System.out.println(i);

        System.out.println("\n# Dao Cobro_Extra ");
        for(CobroExtra i : new DaoCobroExtra().listar()) System.out.println(i);
        
        System.out.println("\n# Dao Llamada ");
        for(Llamada i : new DaoLlamada().listar()) System.out.println(i);
        
        
    }
}
