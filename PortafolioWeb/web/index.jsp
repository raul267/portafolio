<%-- 
    Document   : login
    Created on : 07-10-2019, 2:02:33
    Author     : Raúl Strappa León
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Bienvenido</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" >
        <style>
            
        
         body
         {
             background-image: url('assets/img/fondo/login.jpg');
             background-repeat: no-repeat;
             background-size: cover;
         }
        .centrar
	{
		position: absolute;
		/*nos posicionamos en el centro del navegador*/
		top:50%;
		left:50%;
		/*determinamos una anchura*/
		width:600px;
		/*indicamos que el margen izquierdo, es la mitad de la anchura*/
		margin-left:-300px;
		/*determinamos una altura*/
		height:330px;
		/*indicamos que el margen superior, es la mitad de la altura*/
		margin-top:-150px;
		padding:5px;
                border-radius: 35px;
                border: 1px solid grey;
                background-color: rgb(255,255,255);
	}
        .btnLogin
        {
            width:78%;
           transition: width 2s; 
        }
        .btnLogin:hover
        {
            
            width: 100%;
             
            
        }
        h2
        {
            position: relative;
            left: 40%;
        }
        input
        {   
            position:relative;
            left:30%;
        }
        .abajo
        {
            margin-top: 25px;
        }
        h1
        {
            position:relative;
            left:30%;
            margin-top:70px;
            font-size: 70px;
        }
        </style>
    </head>
    <body>
        <h1>No mas accidentes</h1>
        <div class="container centrar   ">
            <form method="post" action="InicioSesion">
                <div class="col-md-12 col-sm-12 text-center">
                <div class="row">
                    <h2>Ingresar</h2>
                </div><hr>
                <div class="row">
                    <div class="">
                        <div class="col-md-12 col-sm-12">
                            Usuario
                           <input type="text" class="form-control" id="txtNick_name" name="txtNick_name" required/>
                        </div>
                    </div>
                    <div class="">
                        <div class="col-md-12 col-sm-12">
                            Contraseña
                            <input type="password" class="form-control" id="txtPassword" name="txtPassword" required/>
                        </div>
                    </div>
                </div>
                <div class="row abajo">
                    <div class="col-md-12 col-sm-12 text-center">
                        <input style="position:relative;left:10px;" class="btn btn-success btnLogin" type="submit" text="Ingresar"/>
                    </div>
                </div>
                <div class="row abajo">
                    <div class="col-md-12 col-sm-12 text-left">
                         <a href="#">Olvide mi contraseña</a>
                    </div>
                </div>
                <%if (session.getAttribute("error") !=null)
                    {%>
                    <div class="row">
                        <div class="col-md-12">
                            <label style="color:red;">
                       <%= session.getAttribute("error")
                       %>
                       
                    </label>
                        </div>
                    </div>
                       <% session.removeAttribute("error");}%>
                           
            </div>
            </form>
        </div>
      
        
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    </body>
</html>

