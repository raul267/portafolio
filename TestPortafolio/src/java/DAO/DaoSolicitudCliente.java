package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.ConectorOracle;

public class DaoSolicitudCliente {
    ConectorOracle con = new ConectorOracle();
    ResultSet rs;
    public String solicitudesVisita() throws SQLException{
        String solicitudes = "<h4>Visitas</h4>"
                + "<table border=1px>"
                + "<th>Id Solicitud</th>"
                + "<th>Id Visita</th>"
                + "<th>Id Empresa Cliente</th>"
                + "<th>Fecha Solicitud</th>"
                + "<th>Hora</th>"
                + "<th>Confirmacion Cliente</th>"
                + "<th>Confirmacion Profesional</th>"
                + "<th>Estado Solicitud</th>";
        rs = con.execute("select * from solicitud_visita");
        while(rs.next()){
            
            
            solicitudes += "<tr>"
                    + "<td>"+rs.getString("id_solicitud_visita")+"</td>"
                    + "<td>"+rs.getString("id_visita")+"</td>"
                    + "<td>"+rs.getString("id_empresa_cliente")+"</td>"
                    + "<td>"+rs.getString("fecha_solicitud_visita")+"</td>"
                    + "<td>"+rs.getString("hora_solicitud_visita")+"</td>"
                    + "<td>"+rs.getString("confirmacion_cliente")+"</td>"
                    + "<td>"+rs.getString("confirmacion_profesional")+"</td>"
                    + "<td>"+rs.getString("estado")+"</td>"
                    + "</tr>";
        }
        solicitudes += "</table>";
        return solicitudes;
    }
    public String solicitudesAsesoria() throws SQLException{
        String solicitudes = "<h4>Asesoria</h4>"
                + "<table border=1px>"
                + "<th>Id Solicitud</th>"
                + "<th>Id Visita</th>"
                + "<th>Id Empresa Cliente</th>"
                + "<th>Fecha Solicitud</th>"
                + "<th>Hora</th>"
                + "<th>Confirmacion Cliente</th>"
                + "<th>Confirmacion Profesional</th>"
                + "<th>Estado Solicitud</th>";
        rs = con.execute("select * from solicitud_visita");
        while(rs.next()){
            
            String confirmaCliente = rs.getString("confirmacion_cliente").equals("1")
                    ? "Confirmada":
                    "<button onclick='confirmarCliente("+rs.getString("id_solicitud_visita")+")'>Confirmar<button>";
            String confirmaProfesional = rs.getString("confirmacion_profesional").equals("1")
                    ? "Confirmada":
                    "<button onclick='confirmarCliente("+rs.getString("id_solicitud_visita")+")'>Confirmar<button>";
            String estado = ""; 
            switch(rs.getString("estado")){
                case "0": estado = "PENDIENTE"; break;
                case "1": estado = "ACEPTADA"; break;
                case "3": estado = "REALIZADA"; break;
            }
            
            solicitudes += "<tr>"
                    + "<td>"+rs.getString("id_solicitud_visita")+"</td>"
                    + "<td>"+rs.getString("id_visita")+"</td>"
                    + "<td>"+rs.getString("id_empresa_cliente")+"</td>"
                    + "<td>"+rs.getString("fecha_solicitud_visita")+"</td>"
                    + "<td>"+rs.getString("hora_solicitud_visita")+"</td>"
                    + "<td>"+confirmaCliente+"</td>"
                    + "<td>"+confirmaProfesional+"</td>"
                    + "<td>"+estado+"</td>"
                    + "</tr>";
        }
        solicitudes += "</table>";
        return solicitudes;
    }
    public String solicitudesCapacitacion() throws SQLException{
        String solicitudes = "<h4>Capacitacion</h4>"
                + "<table border=1px>"
                + "<th>Id Solicitud</th>"
                + "<th>Id Visita</th>"
                + "<th>Id Empresa Cliente</th>"
                + "<th>Fecha Solicitud</th>"
                + "<th>Hora</th>"
                + "<th>Confirmacion Cliente</th>"
                + "<th>Confirmacion Profesional</th>"
                + "<th>Estado Solicitud</th>";
        rs = con.execute("select * from solicitud_visita");
        while(rs.next()){
            
            
            solicitudes += "<tr>"
                    + "<td>"+rs.getString("id_solicitud_visita")+"</td>"
                    + "<td>"+rs.getString("id_visita")+"</td>"
                    + "<td>"+rs.getString("id_empresa_cliente")+"</td>"
                    + "<td>"+rs.getString("fecha_solicitud_visita")+"</td>"
                    + "<td>"+rs.getString("hora_solicitud_visita")+"</td>"
                    + "<td>"+rs.getString("confirmacion_cliente")+"</td>"
                    + "<td>"+rs.getString("confirmacion_profesional")+"</td>"
                    + "<td>"+rs.getString("estado")+"</td>"
                    + "</tr>";
        }
        solicitudes += "</table>";
        return solicitudes;
    }
    
}
