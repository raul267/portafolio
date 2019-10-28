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

                <h3>Agregar Empleado Cliente</h3>
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

</html>



