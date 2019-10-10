


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
       Registrar Profesinoales
        <a href="../portafolio.pdf"><small>PDF CASO 4</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
        <li class="active">Casos de Uso</li>
      </ol>
    </section>


<section class="content">

    <form method="post" action="../../IngresarProfesional">
            <div class="container">
        <div class="row">
        <div class="col-md-6 col-sm-12">
            <input type="text" id="nombre" name="nombre" class="form-control" placeholder="Nombre Profesional" />
        </div>
        <div class="col-md-3 form-group" id="fg_rut">
            <input type="text" id="rut" name="rut" class="form-control" onkeyup="checkRut(this)" placeholder="Rut : 11111111-1" />
          </div>
            <div class="col-md-3 col-sm-12">
                <div id="mError"></div>
            </div>
        </div><hr>
            <div class="row">
                <div class="col-md-6 col-sm-12">
                    <input type="text" class="form-control" id="direccion" name="direccion" placeholder="Direccion"/>
                    
                </div>
            </div>

                <div class="row">
                    <h1>Usuario</h1>
                <div class="col-md-6 col-sm-12">
                    <input class="form-control" id="nick_name" name="nick_name" type="text" placeholder="Nombre usuario"></input>
                </div>
                    <div class="col-md-6 col-sm-12">
                        <input class="form-control" id="password" name="password" type="password" placeholder="Contraseña"></input>
                    </div>
            </div><hr>
                
        <div class="row">
            <div class="col-md-12">
                <a href="agregarProfesional.jsp" class="btn btn-primary">Volver</a>
                <button type="submit" class="btn btn-success">Registrar Profesional</button>
            </div>
        </div>
    </div>
    </form>
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




