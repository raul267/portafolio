<%@page import="model.EmpresaCliente"%>
<%@page import="DAO.DaoEmpresaCliente"%>
<%@page import="DAO.DaoEmpleadoCliente"%>
<%@page import="DAO.DaoAccidente"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="model.ConectorOracle"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%  
    
    Date date = new Date();
    Usuario u = (Usuario)session.getAttribute("usuario");
    EmpresaCliente e = new DaoEmpresaCliente().obtener(u);
    
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reportar Accidente</title>
        
        <%@include file="../linkhead.html" %>
    </head>
    
    <body>
        
        <%@include file="../menu.jsp" %>
        <section>
            <form action="/TestPortafolio/AccidenteController" method="POST">
                <h1><%=e.getNombre() %></h1>

                <h3>Agregar Accidente</h3>
                <label>Fecha Accidente</label>
                <input type="date" value="<%=new SimpleDateFormat("YYYY-MM-dd").format(date)%>"' name="fecha_accidente"/>
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
                <%=new DaoEmpleadoCliente().comboBoxEmpleadoCliente("empleado_cliente",e)%>


                <input type="submit" value="Submit"/>
            </form>
                
                <%if (session.getAttribute("errores")!=null) {%>
                <h3> <%= "<script>alert('" + session.getAttribute("errores") +"')<  </script>"%> </h3>
                <% session.removeAttribute("errores");}%>
                
        </section>
        
            
            
            
            
            
    </body>
    <%@include file="../linkfooter.html" %>
</html>