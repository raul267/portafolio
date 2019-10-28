


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <jsp:include page="../../CargaTipoCargoEmpleado" flush="true"></jsp:include>
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
     Agregar Empleado
        
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
        <li class="active">Inserta Empleado</li>
      </ol>
    </section>


<section class="content">

    <form method="post" action="../../AgregarEmpleadoCliente">
           
     
            <table border="0">
                    <tr>
                        <td>RUN</td>
                        <td><input type="text" id="rut" name="txtRun" class="form-control" onkeyup="checkRut(this)" placeholder="Rut : 11111111-1" />
                        
                        <div class="col-md-3 col-sm-12">
                <div id="mError"></div>
            </div>
                        </td>
                    </tr>
                    <tr>
                        <td>Nombre</td>
                        <td><input type="text" name="txtNombre" value="" /></td>
                    </tr>
                    <tr>
                        <td>Direccion</td>
                        <td><input type="text" name="txtDireccion" value="" /></td>
                    </tr>
                    <tr>
                        <td>Cargo Empleado</td>
                        <td>
                             <select name = "ddlCargo">
                                 <c:forEach items="${cargos}" var="a">
                                     <option value = "${a.id_cargo}" >${a.nombre}</option>
                                     
                                 </c:forEach>
            
        
         </select>
                            
                        </td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Guardar Empleado" /></td>
                        <td></td>
                    </tr>
            </table>
          
            
        
     
    </form>
           <%if (session.getAttribute("errores")!=null) {%>
                <h3> <%= session.getAttribute("errores")%> </h3>
                <% session.removeAttribute("errores");%>
                
                
   
<%}%>
</section>

</div>




<!-- ############################################################################################# -->
<!-- ############################################################################################# -->
<!-- ############################################################################################# -->

<%@include file="../../scripts.html" %>

<script>
    
 //Validador y formateador automatico de rut
function checkRut(rut) {
    // Se quitan los puntos y los guiones mediante el metodo replace
    var valor = rut.value.replace('.','');
    valor = valor.replace('-','');

    // Aislar Cuerpo y Dígito Verificador
    var cuerpo = valor.slice(0,-1);
    var dv = valor.slice(-1).toUpperCase();

    // Formatear rut
    rut.value = cuerpo +'-'+ dv;

    // Si no cumple con el mínimo ej. (n.nnn.nnn)
    if(cuerpo.length < 7) {
		$("#fg_rut").addClass('has-error');
        rut.setCustomValidity("RUT Incompleto");
		return false;
    }

    // Calcular Dígito Verificador
    var suma = 0;
    var multiplo = 2;

    // Para cada dígito del Cuerpo
    for(var i=1;i<=cuerpo.length;i++) {

        // Obtener su Producto con el Múltiplo Correspondiente
        var index = multiplo * valor.charAt(cuerpo.length - i);

        // Sumar al Contador General
        suma = suma + index;

        // Consolidar Múltiplo dentro del rango [2,7]
        if(multiplo < 7) {
            multiplo = multiplo + 1;
        }else{
            multiplo = 2;
        }
    }

    // se calcula el dv con modulo 11
    var dvEsperado = 11 - (suma % 11);

    // Casos Especiales (0 y K)
    if(dv == 'K'){
        dv = 10;
    }else{
        dv=dv;
    }
    if(dv == 0){
       dv = 11;
    }else{
       dv = dv;
    }

    // Validar que el Cuerpo coincide con su Dígito Verificador
    if(dvEsperado != dv){
        rut.setCustomValidity("RUT Inválido");
		$("#fg_rut").addClass('has-error');
		return false;
    }



   //se resetea el setCustomValidity en caso de haber ocurrido alguna ocurrencia en el if
    rut.setCustomValidity('');
}


</script>


<!-- ############################################################################################# -->
<!-- ############################################################################################# -->
<!-- ############################################################################################# -->




