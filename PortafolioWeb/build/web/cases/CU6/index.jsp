
<%@page import="DAO.DaoEmpresaCliente"%>
<%@page import="model.EmpresaCliente"%>
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
    DAO.DaoAccidente daoAccidente = new DaoAccidente();
    Date date = new Date();
    EmpresaCliente empresaCliente = new DaoEmpresaCliente().obtener(1);
   
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
<%@include file="../../menu.jsp" %>

<!-- ############################################################################################# -->
<!-- ############################################################################################# -->
<!-- ############################################################################################# -->
  
<div class="content-wrapper">

	<section class="content-header">
	<h1> Reportar Accidente ! </h1>
	</section>

    <section class="content">
        <div class="row">
            <% if(cliente){%>
            
            
            
            <div class="box box-primary">

                <form role="form" action="/PortafolioWeb/AccidenteController" method="POST">
                    <div class="box-body">
                        <div class="form-group">
                            <label>Fecha Accidente</label><br>
                            <input type="date" value="<%=new SimpleDateFormat("YYYY-MM-dd").format(date)%>" name="fecha_accidente"/>
                        </div>
                        <div class="form-group">
                            <label>Hora Accidente</label><br>
                            <input type="time" value="<%=new SimpleDateFormat("HH:mm").format(date)%>" name="hora_accidente"/>
                        </div>
                        <div class="form-group">
                            <label>Tipo Accidente</label><br>
                            <!-- COMBO BOX Accidente-->
                            <%=new DaoAccidente().comboBoxTipo_Accidente("tipo_accidente")%>
                        </div>
                        <div class="form-group">
                            <label>Descripcion Accidente</label><br>
                            <textarea rows="4" cols="50" name="descripcion_accidente" placeholder="Descripcion... Que hacia y como sucedio el accidente" required></textarea>
                        </div>
                        
                        <div class="form-group">
                            <label>Empleado de <%=empresaCliente.getNombre()%> que sufrio Accidente</label><br>
                            <!-- COMBO BOX Empleado Cliente-->
                            <%=new DaoEmpleadoCliente().comboBoxEmpleadoCliente("empleado_cliente",empresaCliente.getId())%>
                        </div>
                        <div class="form-group">
                            <input type="submit" value="Submit"/>
                        </div>
                    </div>
                </form>
            </div>
                
                        
                        
                        
                        
                        
            <%}%>
            
            <% if(profesional || admin ){
            
                Accidente accidente;
                
                if(request.getParameter("id")!=null){
                    accidente = daoAccidente.obtener(Integer.parseInt(request.getParameter("id")));
               
            
            %>
            <div class="box box-primary">

                <form role="form" action="/PortafolioWeb/AccidenteController" method="POST">
                    <div class="box-body">
                        <div class="form-group">
                            <label>Fecha Accidente</label><br>
                            <input type="date" value="<%=accidente.getDate()%>" name="fecha_accidente"/>
                        </div>
                        <div class="form-group">
                            <label>Hora Accidente</label><br>
                            <input type="time" value="<%=new SimpleDateFormat("HH:mm").format(date)%>" name="hora_accidente"/>
                        </div>
                        <div class="form-group">
                            <label>Descripcion Accidente</label><br>
                            <textarea rows="4" cols="50" name="descripcion_accidente" placeholder="Descripcion... Que hacia y como sucedio el accidente"><%=accidente.getDescripcion()%></textarea>
                        </div>
                        <div class="form-group">
                            <label>Tipo Accidente</label><br>
                            <!-- COMBO BOX Accidente-->
                            <%=new DaoAccidente().comboBoxTipo_Accidente("tipo_accidente")%>
                        </div>
                        <div class="form-group">
                            <label>Empleado de <%=empresaCliente.getNombre()%> de que sufrio Accidente</label><br>
                            <!-- COMBO BOX Empleado Cliente-->
                            <%=new DaoEmpleadoCliente().comboBoxEmpleadoCliente("empleado_cliente")%>
                        </div>
                        <div class="form-group">
                            <input type="submit" value="Submit"/>
                        </div>
                    </div>
                </form>
            </div>
            <%}}%>
            
            
        <% if(profesional || admin ){%>
        <h3>Lista Accidente</h3>
        <%=  new DaoAccidente().listToTableHTML() %>
            
        <%}%>
        </div>
    </section>
</div>

<!-- ############################################################################################# -->
<!-- ############################################################################################# -->
<!-- ############################################################################################# -->

<script>
document.getElementById("CU6_0").setAttribute("class","treeview active");
document.getElementById("CU6_1").setAttribute("class","fa fa-hand-o-right");
</script>

<%@include file="../../scripts.html" %>


