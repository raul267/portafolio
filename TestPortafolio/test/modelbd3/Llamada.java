package modelbd3;
import java.util.Date;

public class Llamada implements DAO {
	int id, id_empleado_cliente, id_servicio;
	Servicio servicio;
	EmpleadoCliente empleadoCliente;
	Date date; 
	String observacion;
	boolean enhorario;
	public Llamada(int id, Servicio servicio, EmpleadoCliente empleadoCliente,
			Date date, String observacion, boolean enhorario) {
		this.id = id;
		this.id_empleado_cliente = empleadoCliente.id;
		this.id_servicio = servicio.id;
		this.servicio = servicio;
		this.empleadoCliente = empleadoCliente;
		this.date = date;
		this.observacion = observacion;
		this.enhorario = enhorario;
	}
	
	public String toSql(){
		return "INSERT INTO llamada " +
				"( id_llamada, id_empleado_cliente, id_servicio, date, observacion, enhorario) " +
				"values ('"+ id +"' , '"+ id_empleado_cliente+"' , '"+ id_servicio+"' , '"+ date+"' , '"+ observacion+"' , '"+ enhorario+"');";
	}
	public static String createDrop(){
		return "\nDROP TABLE llamada CASCADE CONSTRAINTS; ";
	}
	public static String createTable(){		
		return 
			"\nCREATE TABLE llamada (" +
				
			"\n id_llamada NUMBER NOT NULL," +
			"\n date DATE NOT NULL," +
			"\n id_empleado_cliente NUMBER NOT NULL," +
			"\n id_servicio NUMBER NOT NULL," +
			"\n observacion VARCHAR2(100) NOT NULL," +
			"\n enhorario NUMBER NOT NULL);"; 

			//" CONSTRAINT pk_llamada PRIMARY KEY (id_llamada)," +
			
			//" CONSTRAINT fk_llamada_empleado_cliente FOREIGN KEY (id_empleado_cliente) REFERENCES empleado_cliente(id_empleado_cliente)," +
			//" CONSTRAINT fk_llamada_servicio FOREIGN KEY (id_servicio) REFERENCES servicio(id_servicio));";
			
	}
	public static String createAlter(){
		return "\n ALTER TABLE llamada ADD CONSTRAINT pk_llamada PRIMARY KEY (id_llamada);";
	}
	
	
}
