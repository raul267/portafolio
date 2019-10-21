
<%@page import="DAO.DaoEmpleadoCliente"%>
<%@page import="DAO.DaoAccidente"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="model.ConectorOracle"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%  
    ConectorOracle con = new ConectorOracle("localhost", "1521", "bd3", "a", "xe"); 
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
        
    </head>
    
    <body>
        <form action="AccidenteController" method="POST">
            <h3>Agregar Accidente</h3>
            <label>Fecha Accidente</label>
            <input type="date" value="<%=new SimpleDateFormat("YYYY-MM-dd").format(date)%>" name="fecha_accidente"/>
            <label>Hora Accidente</label>
            <input type="time" value="<%=new SimpleDateFormat("HH:mm").format(date)%>" name="hora_accidente"/>
            
            <label>Descripcion Accidente</label>
            <textarea rows="4" cols="50" name="descripcion_accidente" placeholder="Descripcion... Que hacia y como sucedio el accidente">
                
            </textarea>
            <label>Tipo Accidente</label>
            
            <!-- COMBO BOX Accidente-->
            <%=new DaoAccidente().comboBoxTipo_Accidente("tipo_accidente")%>
            
            <label>Empleado Cliente que sufrio Accidente</label>
            <!-- COMBO BOX Empleado Cliente-->
            <%=new DaoEmpleadoCliente().comboBoxEmpleadoCliente("empleado_cliente")%>
            <!-- 
                ResultSet rs = con.execute("select * from empleado_cliente");
                out.println("\n<select name='empleado_cliente'>");
                while(rs.next()) out.println("   <option value='"+rs.getString("id_empleado_cliente")+"'>"+rs.getString("nombre")+"</option>");
                out.println("<select/>");
            -->
            
            <input type="submit" value="Submit"/>
        </form>
            <h3>Lista Accidente</h3>
               </body>
</html>
