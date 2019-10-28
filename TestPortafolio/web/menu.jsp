<%@page import="model.TipoUsuario"%>
<%@page import="model.Usuario"%>
<% 
    boolean cliente = false;
    boolean admin = false;
    boolean profesional = false;
    
    Usuario usuario = (Usuario)session.getAttribute("usuario");
    session.setAttribute("usuario",usuario);
    if(usuario==null) response.sendRedirect("/TestPortafolio");
    
    switch(usuario.getId_tipo()){
        case 1: admin = true; break;
        case 2: profesional = true; break;
        case 3: cliente = true; break;
        default: response.sendRedirect("/TestPortafolio");
    }
%>

    <header>
            <div class="menu_bar">
                <a href="#" class="bt-menu"><span class="icon-list"></span>Menu</a>
            </div>

 <% if(cliente){ %>          <!-- Cliente -->
            <nav>
                <ul>
                    <li><a href='/TestPortafolio/cliente/ReportarAccidente.jsp'><span class="icon-forward"></span>Reportar Accidente</a></li>
                    <li><a href='/TestPortafolio/cliente/SolicitarAsesoria.jsp'><span class="icon-forward3"></span>Solicitar Asesoria</a></li>
                    <li><a href='/TestPortafolio/cliente/SolicitarCapacitacion.jsp'><span class="icon-forward3"></span>Solicitar Capacitacion</a></li>
                    <li><a href='/TestPortafolio/cliente/VerInformeCheck.jsp'><span class="icon-clipboard"></span>Ver Informe Check List</a></li>
                    <li><a href='/TestPortafolio/cliente/VerServicio.jsp'><span class="icon-profile"></span>Ver Servicio</a></li>
                    <li><a href='/TestPortafolio/cliente/VerSolicitudes.jsp'><span class="icon-profile"></span>Ver Solicitudes</a></li>
                    <li><a href='/TestPortafolio/cliente/AgregarEmpleadoCliente.jsp'><span class="icon-profile"></span>Agregar Empleado Cliente</a></li>
                    <li><a href='/TestPortafolio/cerrarSession.jsp'><span class="icon-exit"></span>Cerrar Session</a></li>
                </ul>
            </nav>
<% } %>    
<% if(profesional){ %> 
            <!-- Profesional -->
            <nav>
                <ul>
                    <li><a href='/TestPortafolio/profesional/CrearCapacitacion.jsp'><span class="icon-forward"></span>Crear Capacitacion</a></li>
                    <li><a href='/TestPortafolio/profesional/PlanificarVisita.jsp'><span class="icon-forward3"></span>Planificar Visita</a></li>
                    <li><a href='/TestPortafolio/profesional/RevisarCliente.jsp'><span class="icon-forward3"></span>Revisar Cliente</a></li>
                    <li><a href='/TestPortafolio/profesional/CrearCasoAsesoria.jsp'><span class="icon-clipboard"></span>Crear Caso Asesoria</a></li>
                    <li><a href='/TestPortafolio/profesional/VerServicio.jsp'><span class="icon-profile"></span>Ingresar Actividad Mejora</a></li>
                    <li><a href='/TestPortafolio/profesional/IngresarActividadMejora.jsp'><span class="icon-profile"></span>Ingresar Asesoria</a></li>
                    <li><a href='/TestPortafolio/profesional/VisualizarActividades.jsp'><span class="icon-profile"></span>Visualizar Actividades</a></li>
                    <li><a href='/TestPortafolio/profesional/NotificarAtrasos.jsp'><span class="icon-profile"></span>Notificar Atrasos</a></li>
                    <li><a href='/TestPortafolio/profesional/CrearCheckList.jsp'><span class="icon-profile"></span>Crear Check List</a></li>
                    <li><a href='/TestPortafolio/profesional/ResponderCheckList.jsp'><span class="icon-profile"></span>Responder Check List</a></li>
                    <li><a href='/TestPortafolio/profesional/VerSolicitudes.jsp'><span class="icon-profile"></span>Ver Solicitudes</a></li>
                    <li><a href='/TestPortafolio/profesional/Todo.jsp'><span class="icon-profile"></span>ALL pages</a></li>
                    <li><a href='/TestPortafolio/cerrarSession.jsp'><span class="icon-exit"></span>Cerrar Session</a></li>
                </ul>
            </nav>
<% } %>  
<% if(admin){ %>            
            <!-- Admin -->
            <nav>
                <ul>
                    <li><a href='/TestPortafolio/administrador/MantenerCliente.jsp'><span class="icon-forward"></span>Mantener Cliente</a></li>
                    <li><a href='/TestPortafolio/administrador/MantenerProfesional.jsp'><span class="icon-forward3"></span>Mantener Profesional</a></li>
                    <li><a href='/TestPortafolio/administrador/CalcularAccidentabilidad.jsp'><span class="icon-forward3"></span>Calcular Accidentabilidad</a></li>
                    <li><a href='/TestPortafolio/administrador/CalcularPagoCliente.jsp'><span class="icon-clipboard"></span>Calcular Pago Cliente</a></li>
                    <li><a href='/TestPortafolio/administrador/GenerarReporteGlobal.jsp'><span class="icon-profile"></span>Generar Reporte Global</a></li>
                    <li><a href='/TestPortafolio/administrador/GenerarReporteCliente.jsp'><span class="icon-profile"></span>Generar Reporte Cliente</a></li>
                    <li><a href='/TestPortafolio/cerrarSession.jsp'><span class="icon-exit"></span>Cerrar Session</a></li>
                </ul>
            </nav>
<% } %>              
        </header>
