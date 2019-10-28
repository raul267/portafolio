<%@page import="model.EmpresaCliente"%>
<%@page import="DAO.DaoServicio"%>
<%@page import="DAO.DaoEmpresaCliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% DaoEmpresaCliente daoEmpresaCliente = new DaoEmpresaCliente();
    String id = request.getParameter("id");
    int id_empresa;
    EmpresaCliente e = new DaoEmpresaCliente().obtener(1);
    if(id!=null){
        id_empresa = Integer.parseInt(id);
        e = new DaoEmpresaCliente().obtener(id_empresa);
        
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Revisar Cliente</title>
        <%@include file="../linkhead.html" %>
    </head>
    <body>
        <%@include file="../menu.jsp" %>
        <h1>Revisar Cliente</h1>
        <%= daoEmpresaCliente.comboboxRevisar("empresa_cliente")%>
        <%= new DaoServicio().exportToHtml(e) %>
    </body>
    <%@include file="../linkfooter.html" %>
</html>
