package modelbd3;

import java.sql.Date;


public class Accidente implements DAO{
	int id,id_empleado_cliente,id_tipo_accidente;
	EmpleadoCliente empleadoCliente;
	TipoAccidente tipoAccidente;
	Date date;
	String descripcion;
	public Accidente(int id, EmpleadoCliente empleadoCliente,
			TipoAccidente tipoAccidente, Date date, String descripcion) {
		this.id = id;
		this.id_empleado_cliente = empleadoCliente.id;
		this.id_tipo_accidente = tipoAccidente.id;
		this.empleadoCliente = empleadoCliente;
		this.tipoAccidente = tipoAccidente;
		this.date = date;
		this.descripcion = descripcion;
	}
	
	public String toSql(){
		
		return "INSERT INTO accidente " +
				"( id_accidente, id_empleado_cliente, id_tipo_accidente, date, descripcion ) " +
				"values ('"+ id +"' , '"+ id_empleado_cliente +"' , '"+ id_tipo_accidente +"' , '"+ date +"' , '"+ descripcion +"');";
	}
	
	public static String createDrop(){
		return "\nDROP TABLE accidente CASCADE CONSTRAINTS; ";
	}
	public static String createTable(){		
		return 
				"\nCREATE TABLE accidente (" +
				"\n id_accidente NUMBER NOT NULL," +
				"\n id_empleado_cliente NUMBER NOT NULL," +
				"\n id_tipo_accidente NUMBER NOT NULL," +
				"\n date DATE NOT NULL," +
				"\n descripcion VARCHAR2(1000) NOT NULL);"; 
		
				//" CONSTRAINT pk_accidente PRIMARY KEY (id_accidente)," +
				//" CONSTRAINT fk_empleado_cliente FOREIGN KEY (id_empleado_cliente) REFERENCES empleado_cliente(id_empleado_cliente)," +
				//" CONSTRAINT fk_tipo_accidente FOREIGN KEY (id_tipo_accidente) REFERENCES tipo_accidente(id_tipo_accidente));";
	}
	public static String createAlter(){
		return "\n ALTER TABLE accidente ADD CONSTRAINT pk_accidente PRIMARY KEY (id_accidente);" +
				"\n ALTER TABLE accidente ADD CONSTRAINT fk_empleado_cliente FOREIGN KEY (id_empleado_cliente) REFERENCES empleado_cliente(id_empleado_cliente);" +
				"\n ALTER TABLE accidente ADD CONSTRAINT fk_tipo_accidente FOREIGN KEY (id_tipo_accidente) REFERENCES tipo_accidente(id_tipo_accidente);";

		
	}
	
}
