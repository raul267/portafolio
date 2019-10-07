<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

        <head>
                <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
                <title>Agregar Cliente </title>


<%@include file="../../menu.jsp" %>

<!-- ############################################################################################# -->
<!-- ############################################################################################# -->
<!-- ############################################################################################# -->
  
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1> Agregar Cliente</h1>
    </section>

	<section class="content">
		<div class="row">
			<div class="col-md-6">
				<b> CU1 - Mantener informacion cliente - Administrador - Mantencion</b>
			</div>
		</div>
	
	
	<div class="row">
	<div class="box box-primary">
<!--            <div class="box-header with-border">
              <h3 class="box-title">Quick Example</h3>
            </div>
             /.box-header -->
            <!-- form start -->
            <form role="form">
              <div class="box-body">
                <div class="form-group">
                  <label for="exampleInputEmail1">Email address</label>
                  <input type="email" class="form-control" id="exampleInputEmail1" placeholder="Enter email">
                </div>
                <div class="form-group">
                  <label for="exampleInputPassword1">Password</label>
                  <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
                </div>
                <div class="form-group">
                  <label for="exampleInputFile">File input</label>
                  <input type="file" id="exampleInputFile">

                  <p class="help-block">Example block-level help text here.</p>
                </div>
                <div class="checkbox">
                  <label>
                    <input type="checkbox"> Check me out
                  </label>
                </div>
              </div>
              <!-- /.box-body -->

              <div class="box-footer">
                <button type="submit" class="btn btn-primary">Submit</button>
              </div>
            </form>
          </div>
		</div>
	</section>

<!-- ############################################################################################# -->
<!-- ############################################################################################# -->
<!-- ############################################################################################# -->

<script>
document.getElementById("CU1_0").setAttribute("class","treeview active");
document.getElementById("CU1_1").setAttribute("class","fa fa-hand-o-right");
</script>

<%@include file="../../scripts.html" %>


