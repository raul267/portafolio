package model;

import java.sql.Date;
import java.util.ArrayList;

public class DataAccess {

	
	//accidentes
	public static ArrayList<Accidente> listaAccidente = new ArrayList<Accidente>();
	public static ArrayList<CasosAccidente> listaCasosAccidente = new ArrayList<CasosAccidente>();
	public static ArrayList<TipoAccidente> listaTipoAccidente = new ArrayList<TipoAccidente>();
	
	//asesoria
	public static ArrayList<FactAsesoria> listaFactAsesoria = new ArrayList<FactAsesoria>();
	public static ArrayList<Asesoria> listaAsesoria = new ArrayList<Asesoria>();
	public static ArrayList<TipoAsesoria> listaTipoAsesoria = new ArrayList<TipoAsesoria>();
	
	//capacitacion
	public static ArrayList<FactCapacitacion> listaFactCapacitacion = new ArrayList<FactCapacitacion>();
	public static ArrayList<DetalleCapacitacion> listaDetalleCapacitacion = new ArrayList<DetalleCapacitacion>();
	public static ArrayList<Capacitacion> listaCapacitacion = new ArrayList<Capacitacion>();
	public static ArrayList<Material> listaMaterial = new ArrayList<Material>();
	
	//call center
	public static ArrayList<Llamada> listaLlamada = new ArrayList<Llamada>();
	
	//cobroextra
	public static ArrayList<CobroExtra> listaCobroExtra = new ArrayList<CobroExtra>();
	public static ArrayList<Tarifa> listaTarifa = new ArrayList<Tarifa>();
	
	
	//Empresa Cliente
	public static ArrayList<EmpresaCliente> listaCliente = new ArrayList<EmpresaCliente> ();
	public static ArrayList<Rubro> listaRubro = new ArrayList<Rubro>();
	public static ArrayList<Servicio> listaServicio = new ArrayList<Servicio>();
	
	// checklist
	public static ArrayList<CheckList> listaCheckList = new ArrayList<CheckList>();
	public static ArrayList<CheckItem> listaCheckItem = new ArrayList<CheckItem>();
	public static ArrayList<PlantillaCheckRubro> listaPlantillaCheckRubro = new ArrayList<PlantillaCheckRubro>();
	
	public static ArrayList<InformeCheck> listaInforme = new ArrayList<InformeCheck>();
	public static ArrayList<DetalleInformeCheck> listaDetalleInformeCheck = new ArrayList<DetalleInformeCheck>();
	
	// user session control
	public static ArrayList<Profesional> listaProfesional = new ArrayList<Profesional>();
	public static ArrayList<EmpleadoCliente> listaEmpleadoCliente = new ArrayList<EmpleadoCliente>();
	public static ArrayList<Usuario> listaUsuario = new ArrayList<Usuario>();
	public static ArrayList<TipoUsuario> listaTipoUsuario = new ArrayList<TipoUsuario>();
	
	// pagos
	public static ArrayList<ModoPago> listaModoPago = new ArrayList<ModoPago>();
	public static ArrayList<PagoServicio> listaPagoServicio = new ArrayList<PagoServicio>();
	public static ArrayList<DetallePago> listaDetallePago = new ArrayList<DetallePago>();

	public static Empresa empresa = new Empresa(1, "No Mas Accidentes", "Avaras 666", "253456678", "contact@nomasaccidentes.cl", "55566655", "+56977666555");
	
	public static ArrayList<ArrayList> ALL_LIST;
	
	public DataAccess(){init_data();}
	
	public static void main(String[] args) {
			
		System.out.println("Test Check List Profesional");
		init_data();
		
		/* drop tables */
		System.out.println(Empresa.createDrop());
		System.out.println(TipoUsuario.createDrop());
		System.out.println(Usuario.createDrop());
		System.out.println(Profesional.createDrop());
		System.out.println(TipoAccidente.createDrop());
		
		System.out.println(Rubro.createDrop());
		System.out.println(EmpresaCliente.createDrop());
		System.out.println(EmpleadoCliente.createDrop());
		System.out.println(Accidente.createDrop());
		System.out.println(CheckItem.createDrop());
		System.out.println(PlantillaCheckRubro.createDrop());
		System.out.println(CheckList.createDrop());
		System.out.println(InformeCheck.createDrop());
		System.out.println(DetalleInformeCheck.createDrop());
		System.out.println(CasosAccidente.createDrop());		
		System.out.println(Servicio.createDrop());
		
		System.out.println(TipoAsesoria.createDrop());
		System.out.println(Asesoria.createDrop());
		System.out.println(FactAsesoria.createDrop());
		
		System.out.println(Capacitacion.createDrop());
		System.out.println(Material.createDrop());
		
		System.out.println(FactCapacitacion.createDrop());
		System.out.println(DetalleCapacitacion.createDrop());
		
		System.out.println(Llamada.createDrop());
		
		System.out.println(ModoPago.createDrop());
		System.out.println(PagoServicio.createDrop());
		System.out.println(DetallePago.createDrop());
		
		System.out.println(Tarifa.createDrop());
		System.out.println(CobroExtra.createDrop());
		//*/
		
		
		/* CREA SCRIPT CREATE TABLES */		
		System.out.println(Empresa.createTable()+Empresa.createAlter());
		System.out.println(TipoUsuario.createTable()+TipoUsuario.createAlter());
		System.out.println(Usuario.createTable()+Usuario.createAlter());
		System.out.println(Profesional.createTable()+Profesional.createAlter());
		System.out.println(TipoAccidente.createTable()+TipoAccidente.createAlter());
		
		System.out.println(Rubro.createTable()+Rubro.createAlter());
		System.out.println(EmpresaCliente.createTable()+EmpresaCliente.createAlter());
		System.out.println(EmpleadoCliente.createTable()+EmpleadoCliente.createAlter());
		System.out.println(Accidente.createTable()+Accidente.createAlter());
		System.out.println(CheckItem.createTable()+CheckItem.createAlter());
		System.out.println(PlantillaCheckRubro.createTable()+PlantillaCheckRubro.createAlter());
		System.out.println(CheckList.createTable()+CheckList.createAlter());
		System.out.println(InformeCheck.createTable()+InformeCheck.createAlter());
		System.out.println(DetalleInformeCheck.createTable()+DetalleInformeCheck.createAlter());
		System.out.println(CasosAccidente.createTable()+CasosAccidente.createAlter());		
		System.out.println(Servicio.createTable()+Servicio.createAlter());
		
		System.out.println(TipoAsesoria.createTable()+TipoAsesoria.createAlter());
		System.out.println(Asesoria.createTable()+Asesoria.createAlter());
		System.out.println(FactAsesoria.createTable()+FactAsesoria.createAlter());
		
		System.out.println(Capacitacion.createTable()+Capacitacion.createAlter());
		System.out.println(Material.createTable()+Material.createAlter());
		
		System.out.println(FactCapacitacion.createTable()+FactCapacitacion.createAlter());
		System.out.println(DetalleCapacitacion.createTable()+DetalleCapacitacion.createAlter());
		
		System.out.println(Llamada.createTable()+Llamada.createAlter());
		
		System.out.println(ModoPago.createTable()+ModoPago.createAlter());
		System.out.println(PagoServicio.createTable()+PagoServicio.createAlter());
		System.out.println(DetallePago.createTable()+DetallePago.createAlter());
		
		System.out.println(Tarifa.createTable()+Tarifa.createAlter());
		System.out.println(CobroExtra.createTable()+CobroExtra.createAlter());
		// */
		
		
		/* CREA SCRIPT INSERTS */
		// check list zone
		System.out.println(empresa.toSql());
		for (Rubro r : listaRubro) System.out.println(r.toSql());
		for (EmpresaCliente r : listaCliente) System.out.println(r.toSql());
		// user management
		for (TipoUsuario r : listaTipoUsuario) System.out.println(r.toSql());
		for (Usuario r : listaUsuario) System.out.println(r.toSql());
		for (Profesional r : listaProfesional) System.out.println(r.toSql());
		for (EmpleadoCliente r : listaEmpleadoCliente) System.out.println(r.toSql());		
		
		
		for (CheckItem r : listaCheckItem) System.out.println(r.toSql());
		for (CheckList r : listaCheckList) System.out.println(r.toSql());
		
		for (PlantillaCheckRubro r : listaPlantillaCheckRubro) System.out.println(r.toSql());
		
		for (InformeCheck r : listaInforme) System.out.println(r.toSql());
		for (DetalleInformeCheck r : listaDetalleInformeCheck) System.out.println(r.toSql());
			
		// user management
		for (TipoUsuario r : listaTipoUsuario) System.out.println(r.toSql());
		for (Usuario r : listaUsuario) System.out.println(r.toSql());
		for (Profesional r : listaProfesional) System.out.println(r.toSql());
		for (EmpleadoCliente r : listaEmpleadoCliente) System.out.println(r.toSql());
		
		//accidentes
		for(TipoAccidente r : listaTipoAccidente) System.out.println(r.toSql());
		for(Accidente r : listaAccidente) System.out.println(r.toSql());
		for(CasosAccidente r : listaCasosAccidente) System.out.println(r.toSql());
		
		//service
		for(Servicio r : listaServicio) System.out.println(r.toSql());

		for(TipoAsesoria r : listaTipoAsesoria) System.out.println(r.toSql());
		for(Asesoria r : listaAsesoria) System.out.println(r.toSql());
		for(FactAsesoria r : listaFactAsesoria) System.out.println(r.toSql());
		
		for(Material r : listaMaterial) System.out.println(r.toSql());
		for(Capacitacion r : listaCapacitacion) System.out.println(r.toSql());
		for(FactCapacitacion r : listaFactCapacitacion) System.out.println(r.toSql());
		for(DetalleCapacitacion r : listaDetalleCapacitacion) System.out.println(r.toSql());
		
		for(Llamada r : listaLlamada) System.out.println(r.toSql());
		
		for(ModoPago r : listaModoPago) System.out.println(r.toSql());
		for(PagoServicio r : listaPagoServicio) System.out.println(r.toSql());
		for(DetallePago r : listaDetallePago) System.out.println(r.toSql());
		
		for(Tarifa r : listaTarifa) System.out.println(r.toSql());
		for(CobroExtra r : listaCobroExtra) System.out.println(r.toSql());
	    //*/
	}
	
	public static void fillALL_LIST(){
		ALL_LIST.add(listaAccidente);
		ALL_LIST.add(listaAsesoria);
		ALL_LIST.add(listaCapacitacion);
		ALL_LIST.add(listaCasosAccidente);
		ALL_LIST.add(listaCheckItem);
		ALL_LIST.add(listaCheckList);
		ALL_LIST.add(listaCliente);
		ALL_LIST.add(listaCobroExtra);
		ALL_LIST.add(listaDetalleCapacitacion);
		ALL_LIST.add(listaDetalleInformeCheck);
		ALL_LIST.add(listaEmpleadoCliente);
		ALL_LIST.add(listaFactAsesoria);
		ALL_LIST.add(listaFactCapacitacion);
		ALL_LIST.add(listaInforme);
		ALL_LIST.add(listaLlamada);
		ALL_LIST.add(listaPlantillaCheckRubro);
		ALL_LIST.add(listaProfesional);
		ALL_LIST.add(listaRubro);
		ALL_LIST.add(listaTarifa);
		ALL_LIST.add(listaTipoAccidente);
		ALL_LIST.add(listaTipoAsesoria);
		ALL_LIST.add(listaTipoUsuario);
		ALL_LIST.add(listaUsuario);
		/*
		ALL_LIST.add(listaAccidente);
		ALL_LIST.add(listaAccidente);
		ALL_LIST.add(listaAccidente);
		ALL_LIST.add(listaAccidente);
		ALL_LIST.add(listaAccidente);
		ALL_LIST.add(listaAccidente);
		*/
	}
	
	public static void init_data(){
		
		//fillALL_LIST();
		
	    Rubro rubro;
	    EmpresaCliente empresaCliente;
	    CheckList checkList;
	    CheckItem checkItem;
	    
	    DetalleInformeCheck detalleInforme;
	    InformeCheck informeCheck;
	    
	    PlantillaCheckRubro plantillaCheck;
	    
	    Profesional profesional;
	    EmpleadoCliente empleadoCliente;
	    Usuario usuario;
	    TipoUsuario tipoUsuario;
	    //////
	    
	    
	 // CONTROL USER
	    TipoUsuario tipoUsuarioAdmin = new TipoUsuario(1, "admin");
	    TipoUsuario tipoUsuarioProfesional = new TipoUsuario(1, "profesional");
	    TipoUsuario tipoUsuarioCliente = new TipoUsuario(1, "cliente");
	    
	    Rubro rubroMinero = new Rubro(1, "Industrial");
	    Rubro rubroIndustrial = new Rubro(2, "Minero");
	    Rubro rubroConstruccion = new Rubro(3, "Construccion");
	    
	    
	    
	    listaTipoUsuario.add(tipoUsuarioAdmin);
	    listaTipoUsuario.add(tipoUsuarioProfesional);
	    listaTipoUsuario.add(tipoUsuarioCliente);
	    
	    
	    // PROFESIONALES
	    usuario = new Usuario(1, "mauroacc", "mauropass", tipoUsuarioProfesional);
	    profesional = new Profesional(1, "Mauro Cabrera", " dir 16", "182930407", "ma.cabreram@alumnos.duoc.cl", "+56966598345", empresa, usuario);
	    listaProfesional.add(profesional); 
	    listaUsuario.add(usuario);

	    usuario = new Usuario(2, "raulacc", "raulpass", tipoUsuarioProfesional);
	    profesional = new Profesional(2, "Raul Strappa", " dir 13", "224222422", "r.strappa@alumnos.duoc.cl", "+XXXXXXXXXX", empresa, usuario);
	    listaProfesional.add(profesional); 
	    listaUsuario.add(usuario);

	    usuario = new Usuario(3, "kevinacc", "kevinpass", tipoUsuarioProfesional);
	    profesional = new Profesional(3, "Kevin Haro", " dir 27", "334445552", "k.haro@alumnos.duoc.cl", "+XXXXXXXXXXX", empresa, usuario);
	    listaProfesional.add(profesional); 
	    listaUsuario.add(usuario);
	    
	    usuario = new Usuario(4, "eduardoacc", "eduardopass", tipoUsuarioProfesional);
	    profesional = new Profesional(4, "Eduardo", " dir 24", "334445556", "eduardoacc@alumnos.duoc.cl", "+XXXXXXXXXXX", empresa, usuario);
	    listaProfesional.add(profesional); 
	    listaUsuario.add(usuario);
	    
	    rubro = new Rubro(1,"Industrial");
	    listaRubro.add(rubro);
	    empresaCliente = new EmpresaCliente(1,rubro,usuario,"DimenFactory", "Dsika 762", "22.222.22", "Factor@dimenfactory.cl", "02-7034575");
	    listaCliente.add(empresaCliente);
		
	    rubro = new Rubro(2,"Minero");
	    listaRubro.add(rubro);
	    listaCliente.add(new EmpresaCliente(2,rubro,usuario,"MentalFactory", "SerDsikavied 10202", "22.222.22", "Udeur_sr@difactory.cl", "02-1034515"));
	    
	    rubro = new Rubro(3,"Construccion");
	    listaRubro.add(rubro);
	    listaCliente.add(new EmpresaCliente(3,rubro,usuario,"TrapMaker", "Veridia 67", "25.2332.22", "falstiod@gmail.com", "02-7034522"));
	    
	    rubro = new Rubro(4,"Otro");
	    listaRubro.add(rubro);
	    listaCliente.add(new EmpresaCliente(4,rubro,usuario,"Waller", "Uhk Nu 14", "22.33222.22", "Numedia@dlku.ch", "02-65034535"));   
	

	    //INFORME
	    Date date =new Date(System.currentTimeMillis());
	    informeCheck = new InformeCheck(1,date,empresaCliente);
	    listaInforme.add(informeCheck);
	    
	    rubro = new Rubro(1,"Industrial");
	    
	    checkItem = new CheckItem(1, "Proveer instrumentos para Empleados que le aseguren su bienestar.","Entre estos se incluye un uniforme que cumpla con las especificaciones para su uso.");
	    listaCheckItem.add(checkItem);
	    listaCheckList.add(new CheckList(1, 0, empresaCliente,checkItem));
	    listaPlantillaCheckRubro.add(new PlantillaCheckRubro(rubro,checkItem));
	    listaDetalleInformeCheck.add(new DetalleInformeCheck(informeCheck, checkItem, 0,"Propuesta Mejora"));
	    
	    
	    checkItem = new CheckItem(2, "Las instalaciones de trabajo deben estar bien señalizadas.","De esta manera todos los individuos sabrán moverse en el espacio en caso de imprevistos, ya sea para buscar ayuda o salir con urgencia. También deben explicar con claridad las normativas de vestimenta e interacción en el espacio.");
	    listaCheckItem.add(checkItem);
	    listaCheckList.add(new CheckList(2, 0, empresaCliente,checkItem));
	    listaPlantillaCheckRubro.add(new PlantillaCheckRubro(rubro,checkItem));
	    listaDetalleInformeCheck.add(new DetalleInformeCheck(informeCheck, checkItem,0, "Propuesta Mejora"));
	    
	    
	    checkItem = new CheckItem(3, "Prevención y protección para incendios","Toda instalación debe tener por obligación un sistema contra incendios. Este atiende dos puntos básicos. El primero es que el espacio esté protegido en la medida de lo posible para evitar un incendio. El segundo es que debe estar equipado con herramientas para controlar un incendio.");
	    listaCheckItem.add(checkItem);
	    listaCheckList.add(new CheckList(3, 0, empresaCliente,checkItem));
	    listaPlantillaCheckRubro.add(new PlantillaCheckRubro(rubro,checkItem));
	    listaDetalleInformeCheck.add(new DetalleInformeCheck(informeCheck, checkItem,0, "Propuesta Mejora"));
	    
	    checkItem = new CheckItem(4, "Dispositivos de protección y sistemas de seguridad"," Toda instalación industrial debe tener un plan para casos de emergencias. Incluso cada plan debe adaptarse al tipo de emergencias.");
	    listaCheckItem.add(checkItem);
	    listaCheckList.add(new CheckList(4, 0, empresaCliente,checkItem));
	    listaPlantillaCheckRubro.add(new PlantillaCheckRubro(rubro,checkItem));
	    listaDetalleInformeCheck.add(new DetalleInformeCheck(informeCheck, checkItem,0, "Propuesta Mejora"));
	    
	    
	    checkItem = new CheckItem(5, "Condiciones de seguridad en sitios donde la electricidad represente un riesgo.","Cada área tiene sus riesgos específicos. Hay ciertas industrias en las que es necesario la generación de electricidad. debe proporcionar a los trabajadores los equipos necesarios para el trabajo, así como adecuar el espacio laboral para tal.");
	    listaCheckItem.add(checkItem);
	    listaCheckList.add(new CheckList(5, 0, empresaCliente,checkItem));
	    listaPlantillaCheckRubro.add(new PlantillaCheckRubro(rubro,checkItem));
	    listaDetalleInformeCheck.add(new DetalleInformeCheck(informeCheck, checkItem,0, "Propuesta Mejora"));
	    
	    checkItem = new CheckItem(6, "Condiciones adecuadas de seguridad para el manejo de sustancias inflamables."," Esta norma es aplicada en centros donde se almacenen, transporten o manejen sustancia químicas inflamables.");
	    listaCheckItem.add(checkItem);
	    listaCheckList.add(new CheckList(6, 0, empresaCliente,checkItem));
	    listaPlantillaCheckRubro.add(new PlantillaCheckRubro(rubro,checkItem));
	    listaDetalleInformeCheck.add(new DetalleInformeCheck(informeCheck, checkItem,0, "Propuesta Mejora"));
	    
	    
	    checkItem = new CheckItem(7, "Seguridad e Higiene para el manejo de sustancias corrosivas."," Las sustancias como ácidos y químicos corrosivos deben ser tratados con extremo cuidado. Este es uno de los casos en los que la normativa es específica.");
	    listaCheckItem.add(checkItem);
	    listaCheckList.add(new CheckList(7, 0, empresaCliente,checkItem));
	    listaPlantillaCheckRubro.add(new PlantillaCheckRubro(rubro,checkItem));
	    listaDetalleInformeCheck.add(new DetalleInformeCheck(informeCheck, checkItem,0, "Propuesta Mejora"));
	    
	    
	    checkItem = new CheckItem(8, "Seguridad e Higiene en los centros de trabajo donde se  manejen fuentes emisoras de radiaciones."," La radiación representa un riesgo gigante y latente en centros donde esta esté. Sea directa o indirectamente.");
	    listaCheckItem.add(checkItem);
	    listaCheckList.add(new CheckList(8, 0, empresaCliente,checkItem));
	    listaPlantillaCheckRubro.add(new PlantillaCheckRubro(rubro,checkItem));
	    listaDetalleInformeCheck.add(new DetalleInformeCheck(informeCheck, checkItem,0, "Propuesta Mejora"));
	    
	    
	    checkItem = new CheckItem(9, "Dispositivos de seguridad en maquinarias y equipos"," Los trabajadores deben estar entrenados y capacitados para su uso adecuado, de esta forma se evitan accidentes que pueden ser fatales.");
	    listaCheckItem.add(checkItem);
	    listaCheckList.add(new CheckList(9, 0, empresaCliente,checkItem));
	    listaPlantillaCheckRubro.add(new PlantillaCheckRubro(rubro,checkItem));
	    listaDetalleInformeCheck.add(new DetalleInformeCheck(informeCheck, checkItem,0, "Propuesta Mejora"));
	    
	    
	    checkItem = new CheckItem(10, "Materiales y personal de primeros auxilios"," Siempre hay posibilidades de accidentes en ambientes laborales con riesgos, aun cuando los sistemas de prevención sean perfectos.");
	    listaCheckItem.add(checkItem);
	    listaCheckList.add(new CheckList(10, 0, empresaCliente,checkItem));
	    listaPlantillaCheckRubro.add(new PlantillaCheckRubro(rubro,checkItem));
	    listaDetalleInformeCheck.add(new DetalleInformeCheck(informeCheck, checkItem,0, "Propuesta Mejora"));
	

	    
	    
	    
	    /* Admin account */
	    tipoUsuario = new TipoUsuario(1, "admin");
	    usuario = new Usuario(5, "admin", "admin", tipoUsuario);
	    profesional = new Profesional(5, "Sr Administrado", " dir 4", "314445556", "profesional@profesional.cl", "+XXXXXXXXXXX", empresa, usuario);
	    listaProfesional.add(profesional); listaUsuario.add(usuario); 
	    
	    /* Profesional account */
	    tipoUsuario = new TipoUsuario(2, "profesional");
	    usuario = new Usuario(6, "profesional", "profesional", tipoUsuario);
	    profesional = new Profesional(6, "Sr Administrado", " dir 1", "314435556", "admin@admin.cl", "+XXXXXXXXXXX", empresa, usuario);
	    listaProfesional.add(profesional); listaUsuario.add(usuario); 
	    
	    /* Cliente account */
	    tipoUsuario = new TipoUsuario(3, "cliente");
	    usuario = new Usuario(7, "cliente", "cliente", tipoUsuario);
	    empleadoCliente = new EmpleadoCliente(1, "Sr Cliente", "cliente@cliente.com", empresaCliente);
	    listaEmpleadoCliente.add(empleadoCliente); listaUsuario.add(usuario); 
	    
	    //accidentes
	    Accidente accidente;
		TipoAccidente tipoAccidente = new TipoAccidente(1, "Tipo Accidente 1");
		CasosAccidente casosAccidente;

		listaTipoAccidente.add(new TipoAccidente(1, "Laboral"));
		listaTipoAccidente.add(new TipoAccidente(2, "Tipo Accidente 2"));
		listaTipoAccidente.add(new TipoAccidente(3, "Tipo Accidente 3"));
		
		listaAccidente.add(new Accidente(1, empleadoCliente, tipoAccidente, date, "Fractura pies"));
		
		listaTarifa.add(new Tarifa(1, "Asesoria Adicional", 30000));
		listaTarifa.add(new Tarifa(2, "llamado fuera horario", 5000));
		listaTarifa.add(new Tarifa(3, "capacitacion adicional", 45000));
		listaTarifa.add(new Tarifa(4, "Actualizar CheckList", 20000));
		listaTarifa.add(new Tarifa(5, "Visita Adicional", 30000));
		listaTarifa.add(new Tarifa(6, "Actualizacion Informe Extra", 5000));
		listaTarifa.add(new Tarifa(7, "Costo Servicio", 300000));
		listaTarifa.add(new Tarifa(8, "Interes Atraso Pago", 0));
		
		listaTipoAsesoria.add(new TipoAsesoria(1, "Accidente"));
		listaTipoAsesoria.add(new TipoAsesoria(2, "Fiscalizacion"));
		
		listaModoPago.add(new ModoPago(1, "Efectivo"));
		listaModoPago.add(new ModoPago(2, "Cheque"));
		listaModoPago.add(new ModoPago(3, "Tarjeta de Credito"));
		listaModoPago.add(new ModoPago(4, "Tarjeta de Debito"));
		listaModoPago.add(new ModoPago(5, "Otro"));

		Servicio servicio = new Servicio(1, 0, 0, 0, 0, 0, 300000, empresaCliente);
		listaServicio.add(servicio);
		
		Capacitacion capacitacion = new Capacitacion(1, "Capacitacion de Seguridad", "Capacitar a los funcionarios sobre como evitar accidentes", 30, 1);
		listaCapacitacion.add(capacitacion);
		listaCapacitacion.add(new Capacitacion(2, "Capacitacion de Seguridad", "Capacitar a los funcionarios sobre como actuar en emergencias de radioactividad o toxica", 30, 1));
		
		
		listaFactCapacitacion.add(new FactCapacitacion(1, date, profesional, capacitacion, servicio));
		
		//listaDetalleCapacitacion.add(new DetalleCapacitacion(factCapacitacion, empleadoCliente))
	
	}
	
}