
<%@page import="java.util.ArrayList"%>
<%@page import="DAO.DAOItem_lista" %>
<%@page import="model.CheckItem" %>
<%int n = 1;%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
        <head>
                <title>Case of Use Master Page. </title>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>

                <%@include file="../../menu.jsp" %>

<!-- ############################################################################################# -->
<!-- ############################################################################################# -->
<!-- ############################################################################################# -->



<div class="content-wrapper">
    <section class="content-header">
      <h1>
       Registrar Lista
        <a href="../portafolio.pdf"><small>PDF CASO 4</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
        <li class="active">Casos de Uso</li>
      </ol>
    </section>


<section class="content">
    <div class="container">
        
        <h1>Items</h1><hr>
        <div class="row" style="height:150px; overflow-y: scroll; border: 4px solid #FFFFFF;">
            <div class="col-md-12 col-sm-12">
                <%
                    DAOItem_lista dt = new DAOItem_lista();
                    ArrayList<CheckItem> t = dt.todos();
                
                
                    for (CheckItem ti : t)
                        {%>
                            <div class="row">
                                <div class="col-md-2 col-sm-12">
                                    <label>Nombre: <%= ti.getNombre()%></label>
                                </div>
                                <div style="width:100%; border: 1px solid #FFFFFF;"></div>
                                <div class="col-md-10 col-sm-12">
                                    <p>Decipcion: <%= ti.getDescripcion()%></p>
                                </div>
                            </div>
                       <% }
                
                %>
            </div>
        </div><hr>
            <div style="width:100%; border: 1px solid black;"></div>
            
            <div class="row" style="margin-top:20px;">
                <form method="post" action="../../IngresarItem">
                    <input type="hidden" value="<%= n%>" id="hN" name="hN"/>
                <div class="col-md-12 col-sm-12">
                    <h1>Ingresar Items</h1>
                </div>
                
                <div class="col-md-4 col-sm-12">
                    <input type="text" placeholder="Nombre item" class="form-control" name="nombre<%=n%>" id="nombre<%=n%>" />
                </div>
                <div class="col-md-4 col-sm-12">
                    <input type="text" placeholder="Descripcion item" class="form-control" name="descripcion<%=n%>" id="descripcion<%=n%>" />
                </div>
                
            </div>
                <div id="divAgregar"></div>
    </div>
                <div class="row" style="margin-top:20px; margin-left:30px;">
                    <input type="submit" class="btn btn-success" value="Ingresar"/>
                </div>
                </form>
                <div class="row" style="margin-top:30px;">
                    <div class="col-md-1 col-sm-12">
                    <input type="buton"class="btn btn-primary" id="btnAgregar" value="Agregar Item"/>
                </div>
                </div>
</section>

</div>




<!-- ############################################################################################# -->
<!-- ############################################################################################# -->
<!-- ############################################################################################# -->

<%@include file="../../scripts.html" %>

<script>
    
$("#btnAgregar").click("click",function(){
    
    var n = $("#hN").val();
    n++;
    $("#hN").val(n);
    $("#divAgregar").append('<div class="row" style="margin-top:10px;"><div class="col-md-4 col-sm-12"><input type="text" placeholder="Nombre item '+n+'" class="form-control" name="nombre'+n+'" id="nombre'+n+'" /></div><div class="col-md-4 col-sm-12"><input type="text" placeholder="Descripcion item '+n+'" class="form-control" name="descripcion'+n+'" id="descripcion'+n+'" /></div></div>');
});


</script>


<!-- ############################################################################################# -->
<!-- ############################################################################################# -->
<!-- ############################################################################################# -->




