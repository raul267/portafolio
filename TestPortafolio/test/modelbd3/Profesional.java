package modelbd3;
public class Profesional implements DAO {
	int id,id_empresa,id_usuario;
	String nombre,direccion,rut,mail,fono;
	Empresa empresa;
	Usuario usuario;
	public Profesional(int id, String nombre, String direccion, String rut,
			String mail, String fono, Empresa empresa, Usuario usuario) {
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.rut = rut;
		this.mail = mail;
		this.fono = fono;
		this.empresa = empresa;
		this.usuario = usuario;
		this.id_empresa = empresa.id;
		this.id_usuario = usuario.id;
	}
	
	public String toSql(){
		return "INSERT INTO profesional " +
				"( id_profesional, nombre, rut, mail, fono, direccion, id_empresa, id_usuario) " +
				"values ('"+ id +"' , '"+ nombre +"' , '"+ rut+"' , '"+ mail + "' , '"+ fono +"' , '"+ direccion +"' , '"+ id_empresa +"' , '"+id_usuario+"');";
	}
	public static String createDrop(){
		return "\nDROP TABLE profesional CASCADE CONSTRAINTS; ";
	}
	public static String createTable(){		
		return 
			"\nCREATE TABLE profesional (" +
				
			"\n id_profesional NUMBER NOT NULL," +
			"\n nombre VARCHAR2(60) NOT NULL," +
			"\n rut VARCHAR2(20) NOT NULL," +
			"\n mail VARCHAR2(60) NOT NULL," +
			"\n fono VARCHAR2(30) NOT NULL," +
			"\n direccion VARCHAR2(100) NOT NULL," +
			"\n id_empresa NUMBER NOT NULL," +
			"\n id_usuario NUMBER NOT NULL);";
			
			//" CONSTRAINT pk_profesional PRIMARY KEY (id_profesional)," +
			
			//"CONSTRAINT fk_profecional_empresa FOREIGN KEY (id_empresa) REFERENCES empresa(id_empresa)," +
			//"CONSTRAINT fk_profesional_usuario FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario));";
			
	}
	public static String createAlter(){
		return "\n ALTER TABLE profesional ADD CONSTRAINT pk_profesional PRIMARY KEY (id_profesional);";
	}
	
	
	
}
