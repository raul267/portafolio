
<%@page import="model.Accidente"%>
<%@page import="DAO.DaoEmpleadoCliente"%>
<%@page import="DAO.DaoAccidente"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="model.ConectorOracle"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%  
    ConectorOracle con = new ConectorOracle(); 
    Date date = new Date();
   
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>THING TO USE</title>
        

        <style>
            label {
                display: block; 
                font: 1rem 'Fira Sans', sans-serif;
            }
        </style>
        <!-- CSS goes in the document HEAD or added to your external stylesheet -->
        <style type="text/css">
        table.hovertable {
                font-family: verdana,arial,sans-serif;
                font-size:11px;
                color:#333333;
                border-width: 1px;
                border-color: #999999;
                border-collapse: collapse;
        }
        table.hovertable th {
                background-color:#c3dde0;
                border-width: 1px;
                padding: 8px;
                border-style: solid;
                border-color: #a9c6c9;
        }
        table.hovertable tr {
                background-color:#d4e3e5;
        }
        table.hovertable td {
                border-width: 1px;
                padding: 8px;
                border-style: solid;
                border-color: #a9c6c9;
        }
        </style>
        
<%@include file="menu.jsp" %>
   
    
    <!--
	
        case 1: admin = true; break;
        case 2: profesional = true; break;
        case 3: cliente = true; break;
        case 4: adminsolo = true; break;
        default: cliente = true; break;
    
    -->
    
    <body>
        
        <% if(cliente){%>
        <form action="AccidenteController" method="POST">
          
            <h3>Agregar Accidente</h3>
            
            <label>Fecha Accidente</label>
            <input type="date" value="<%=new SimpleDateFormat("YYYY-MM-dd").format(date)%>" name="fecha_accidente"/>
            <label>Hora Accidente</label>
            <input type="time" value="<%=new SimpleDateFormat("HH:mm").format(date)%>" name="hora_accidente"/>
            
            <label>Descripcion Accidente</label>
            <textarea rows="4" cols="50" name="descripcion_accidente" placeholder="Descripcion... Que hacia y como sucedio el accidente"></textarea>
            
            <label>Tipo Accidente</label>
            <!-- COMBO BOX Accidente-->
            <%=new DaoAccidente().comboBoxTipo_Accidente("tipo_accidente")%>
            
            <label>Empleado Cliente que sufrio Accidente</label>
            <!-- COMBO BOX Empleado Cliente-->
            <%=new DaoEmpleadoCliente().comboBoxEmpleadoCliente("empleado_cliente")%>
            
            <input type="submit" value="Submit"/>
        </form>
            
        <%}%>
        <% if(profesional || admin ){%>
        <form action="AccidenteController" method="POST">
          
            <h3>Visualizar Accidente</h3>
            
            <label>Fecha Accidente</label>
            <input type="date" value="<%=new SimpleDateFormat("YYYY-MM-dd").format(date)%>" name="fecha_accidente"/>
            <label>Hora Accidente</label>
            <input type="time" value="<%=new SimpleDateFormat("HH:mm").format(date)%>" name="hora_accidente"/>
            
            <label>Descripcion Accidente</label>
            <textarea rows="4" cols="50" name="descripcion_accidente" placeholder="Descripcion... Que hacia y como sucedio el accidente"></textarea>
            
            <label>Tipo Accidente</label>
            <!-- COMBO BOX Accidente-->
            <%=new DaoAccidente().comboBoxTipo_Accidente("tipo_accidente")%>
            
            <label>Empleado Cliente que sufrio Accidente</label>
            <!-- COMBO BOX Empleado Cliente-->
            <%=new DaoEmpleadoCliente().comboBoxEmpleadoCliente("empleado_cliente")%>
            
            <input type="submit" value="Submit"/>
        </form>
            
        <%}%>
        <% if(profesional || admin ){%>
        <h3>Lista Accidente</h3>
        <%=  new DaoAccidente().listToTableHTML() %>
            
        <%}%>
          
            
    </body>
</html>
