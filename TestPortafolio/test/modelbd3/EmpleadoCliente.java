package modelbd3;
public class EmpleadoCliente implements DAO {
	public int id,id_empresa_cliente;
	String nombre;
	String mail;
	Usuario usuario;
	EmpresaCliente empresaCliente;
	
	public EmpleadoCliente(int id,String nombre,String mail,EmpresaCliente empresaCliente){
		this.id = id;
		id_empresa_cliente = empresaCliente.id;
		this.nombre = nombre;
		this.mail = mail;
		this.empresaCliente = empresaCliente;
		
	}
	
	public String toSql(){
		return "INSERT INTO empleado_cliente " +
				"( id_empleado_cliente, nombre, mail, id_usuario, id_empresa_cliente) " +
				"values ('"+ id +"' , '"+ nombre +"' , '"+ mail+"' , '"+ id_empresa_cliente+"');";
	}
	public static String createDrop(){
		return "\nDROP TABLE empleado_cliente CASCADE CONSTRAINTS; ";
	}
	public static String createTable(){		
		return 
			"\nCREATE TABLE empleado_cliente (" +
				
			"\n id_empleado_cliente NUMBER NOT NULL," +
			"\n nombre VARCHAR2(60) NOT NULL," +
			"\n mail VARCHAR2(50) NOT NULL," +

			"\n id_empresa_cliente NUMBER NOT NULL);"; 

			//" CONSTRAINT id_empleado_cliente PRIMARY KEY (id_empleado_cliente)," +
			//" CONSTRAINT fk_empresa_cliente FOREIGN KEY (id_empresa_cliente) REFERENCES empresa_cliente(id_empresa_cliente));";
	}
	public static String createAlter(){
		return "\n ALTER TABLE empleado_cliente ADD CONSTRAINT pk_empleado_cliente PRIMARY KEY (id_empleado_cliente);";
	}
	
}
