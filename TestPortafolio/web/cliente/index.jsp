<%-- 
    Document   : index.jsp
    Created on : 22-10-2019, 11:34:53
    Author     : 56942
--%>
<%@page import="DAO.DaoEmpresaCliente"%>
<%@page import="java.util.Date"%>
<%@page import="model.EmpresaCliente"%>
<%  
    
    Date date = new Date();
    Usuario u = (Usuario)session.getAttribute("usuario");
    EmpresaCliente e = new DaoEmpresaCliente().obtener(u);
    
    
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page Cliente</title>
        <%@include file="../linkhead.html" %>
    </head>
    <body>
        <%@include file="../menu.jsp" %>
        
        <section>
            <h1><%=e.getNombre()%></h1>
            
            <%=e%>
            
        </section>
        
        
    </body>
    <%@include file="../linkfooter.html" %>
</html>