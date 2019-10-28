
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
    response.sendRedirect("test.jsp");
   
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>No Mas Accidentes</title>
        <%@include file="linkhead.html" %>
    </head>
    <body>
        <section>
            <h3>Log in</h3>
            <form action="Login" method="post">
                <label>Account</label>
                <input type="text" name="nick_name" placeholder="Account" required/>
                <label>Password</label>
                <input type="password" name="password" placeholder="Password" required/>
                
                <input type="submit" value="Submit"/>
            </form>
        </section>
        
        
    </body>
    <%@include file="linkfooter.html" %>
</html>    

