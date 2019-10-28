
<%@page import="model.Profesional"%>
<%@page import="DAO.DAOProfesional"%>
<%@page import="model.Empresa"%>
<%@page import="DAO.DAOEmpresa"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Tipo_Actividad"%>
<%@page import="DAO.DAOActividad"%>
<%@page import="model.Actividad" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
        <head>
                <title>Case of Use Master Page. </title>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>

                <%@include file="../../menu.jsp" %>

<!-- ############################################################################################# -->
<!-- ############################################################################################# -->
<!-- ############################################################################################# -->


<%
    DAOActividad da = new DAOActividad();
    Actividad a = da.ActividadID(Integer.parseInt(request.getParameter("id")));
%>
<div class="content-wrapper">
    <section class="content-header">
      <h1>
       Modificar Actividad <%= a.getId_actividad() %>
        <a href="../portafolio.pdf"><small>PDF CASO 4</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
        <li class="active">Casos de Uso</li>
      </ol>
    </section>


<section class="content">

    <form method="post" action="../../IngresarActividad">
      <div class="container">
        <div class="row">
        <div class="col-md-6 col-sm-12">
            <select class="form-control" id="id_empresa" name="id_empresa">
                <option value="">Seleccione una empresa</option>
                <%
                    DAOEmpresa de = new DAOEmpresa();
                    ArrayList<Empresa> e = de.todos();
                    
                    for (Empresa em : e)
                        {
                            if (em.getId_empresa() == a.getId_empresa() )
                                {
                                    out.print("<option selected value="+em.getId_empresa()+">"+em.getNombre()+"</option>");
                                }
                            else
                            {
                                out.print("<option value="+em.getId_empresa()+">"+em.getNombre()+"</option>");
                            }
                        }
                %>
                
            </select>
            
        </div>

        </div><hr>
        <div class="row">
            <div class="col-md-6 col-sm-12">
                 <input type="text" class="form-control"id="direccion" value="<%= a.getDireccion()%>" name="direccion" placeholder="Direccion"/>
            </div>
             <div class="col-md-5">
                 <select class="form-control" id="enterreno" name="enterreno">
                     <option value="">Seleccione si es en terreno</option>
                     <option <% if(a.getEnterreno()==0){%>selected<%}%> value="0">No</option>
                     <option <% if(a.getEnterreno()==1){%>selected<%}%> value="1">Si</option>
                 </select>
            </div>
        </div><hr>
                <div class="row">
                <div class="col-md-6 col-sm-12">
                    <select class="form-control" name="id_empleado" name="id_empleado">
                        <option value="">Seleccione un profesional</option>
                        
                        <%
                            DAOProfesional dp = new DAOProfesional();
                            ArrayList<Profesional> p = dp.todos();
                            
                            for (Profesional pr : p)
                                {
                                   if (pr.getId_profesoinal() == a.getId_empleado())
                                       {
                                            out.print("<option selected svalue="+pr.getId_profesoinal()+">"+pr.getNombre()+"</option>");
                                       }
                                   else
                                   {
                                        out.print("<option value="+pr.getId_profesoinal()+">"+pr.getNombre()+"</option>");
                                   }
                                }
                                
                        %>
                    </select>
                </div>                    
            </div><hr>
            <div class="row">
              <div class="col-md-6 col-sm-12">
                  <input type="date" value="<%= a.getFecha_actividad()%>" class="form-control" id="fecha_actividad" name="fecha_actividad"/>
              </div>
            </div><hr>
                <div class="row">
                    <div class="col-md-6 col-md-12">
                        <select class="form-control" name="id_cheak_list" name="id_cheak_list">
                            <option value="">Seleccione un cheak list</option>
                            <option value="1">Lista numero 1</option>
                        </select>
                    </div>
                </div><hr>
                    <div class="row">
                        <div class="col-md-11 col-sm-12">
                            <label>Ingrese una descripcion de la actividad</label>
                            <textarea style="resize: none;" text=""class="form-control" id="descripcion" name="descripcion"><%= a.getDescripcion()%></textarea>
                        </div>
                    </div><hr>
        <div class="row">
            <div class="col-md-12">
                <a href="../../../indexx.jsp" class="btn btn-primary">Volver</a>
                <button type="submit" class="btn btn-success">Registrar Empresa</button>
            </div>
        </div><hr>
    </div>
    </form>
</section>

</div>




<!-- ############################################################################################# -->
<!-- ############################################################################################# -->
<!-- ############################################################################################# -->
<%@include file="../../scripts.html" %>



<!-- ############################################################################################# -->
<!-- ############################################################################################# -->
<!-- ############################################################################################# -->




