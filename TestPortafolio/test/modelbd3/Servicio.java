package modelbd3;
public class Servicio implements DAO {
	int id,id_empresa_cliente;
	int cantidadVisitas,cantidadAsesoria,cantidadLlamadas,cantidadCapacitacion;
	int checkList_estado;
	int costoTotal;
	EmpresaCliente empresaCliente;
	
	public Servicio(int id, int cantidadVisitas, int cantidadAsesoria,
			int cantidadLlamadas, int cantidadCapacitacion,
			int checkList_estado, int costoTotal, EmpresaCliente empresaCliente) {
		this.id = id;
		this.id_empresa_cliente = empresaCliente.id;
		this.cantidadVisitas = cantidadVisitas;
		this.cantidadAsesoria = cantidadAsesoria;
		this.cantidadLlamadas = cantidadLlamadas;
		this.cantidadCapacitacion = cantidadCapacitacion;
		this.checkList_estado = checkList_estado;
		this.costoTotal = costoTotal;
		this.empresaCliente = empresaCliente;
	}
	public String toSql(){
		return "INSERT INTO servicio " +
				"( id_servicio, id_empresa_cliente, " +
				"cantidad_visitas, " +
				"check_list_estado, " +
				"cantidad_llamadas, " +
				"cantidad_asesoria, " +
				"cantidad_capacitacion, costo_total) " +
				"values ('"+ id +"' , '"+ id_empresa_cliente+"' , '"+ cantidadVisitas+"' , '"
				+ checkList_estado+"' , '"+ cantidadLlamadas+"' , '"+ cantidadAsesoria+"' , '"
				+ cantidadCapacitacion+"' , '"+ costoTotal+"');";
	}
	public static String createDrop(){
		return "\nDROP TABLE servicio CASCADE CONSTRAINTS; ";
	}
	public static String createTable(){		
		return 
			"\nCREATE TABLE servicio (" +
				
			"\n id_servicio NUMBER NOT NULL," +
			"\n id_empresa_cliente NUMBER NOT NULL," +
			"\n cantidad_visitas NUMBER NOT NULL," +
			"\n check_list_estado NUMBER NOT NULL," +
			"\n cantidad_llamadas NUMBER NOT NULL," +
			"\n cantidad_asesoria NUMBER NOT NULL," +
			"\n cantidad_capacitacion NUMBER NOT NULL," +
			"\n costo_total NUMBER NOT NULL);";
			
			
			//" CONSTRAINT pk_servicio PRIMARY KEY (id_servicio)," +
			
			//" CONSTRAINT fk_servicio_empresa_cliente FOREIGN KEY (id_empresa_cliente) REFERENCES empresa_cliente(id_empresa_cliente));";
			
	}
	public static String createAlter(){
		return "\n ALTER TABLE servicio ADD CONSTRAINT pk_servicio PRIMARY KEY (id_servicio);";
	}
	
	
}
