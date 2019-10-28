package modelbd3;
public class DetalleCapacitacion implements DAO {
	int id_fact_capacitacion, id_empleado_cliente;
	FactCapacitacion factCapacitacion;
	EmpleadoCliente empleadoCliente;
	public DetalleCapacitacion(FactCapacitacion factCapacitacion,
			EmpleadoCliente empleadoCliente) {
		
		this.id_fact_capacitacion = factCapacitacion.id;
		this.id_empleado_cliente = empleadoCliente.id;
		this.factCapacitacion = factCapacitacion;
		this.empleadoCliente = empleadoCliente;
	}
	public String toSql(){
		return "INSERT INTO detalle_capacitacion " +
				"( id_fact_capacitacion, id_empleado_cliente) " +
				"values ('"+ id_fact_capacitacion +"' , '"+ id_empleado_cliente+"');";
	}
	public static String createDrop(){
		return "\nDROP TABLE detalle_capacitacion CASCADE CONSTRAINTS; ";
	}
	public static String createTable(){		
		return 
			"\nCREATE TABLE detalle_capacitacion (" +
				
			"\n id_fact_capacitacion NUMBER NOT NULL," +
			"\n id_empleado_cliente NUMBER NOT NULL);";
			
			//FK
			//" CONSTRAINT fk_fact_capacitacion FOREIGN KEY (id_fact_capacitacion) REFERENCES fact_capacitacion(id_fact_capacitacion),"+
			//" CONSTRAINT fk_empleado_cliente FOREIGN KEY (id_empleado_cliente) REFERENCES empleado_cliente(id_empleado_cliente));";
	}
	public static String createAlter(){
		return "";
	}
	
}
