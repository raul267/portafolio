package modelbd3;
public class EmpresaCliente implements DAO {
	public int id,id_rubro,id_usuario;
	public String nombre,direccion,run,mail,fono;
	Rubro rubro;
	Usuario usuario;
	
	//object oriented
	CheckList checkList;
	InformeCheck informeCheck;
	
	public EmpresaCliente(int id, Rubro rubro, Usuario usuario, String nombre,
			String direccion, String run, String mail, String fono) {
		super();
		this.id = id;
		this.id_rubro = rubro.id;
		this.id_usuario = usuario.id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.run = run;
		this.mail = mail;
		this.fono = fono;
		this.rubro = rubro;
		this.usuario = usuario;
	}
	
	public void setCheckList(CheckList checkList){
		this.checkList = checkList;
	}
	public void setInformeCheck(InformeCheck informeCheck){
		this.informeCheck = informeCheck;
	}

	public String toSql(){
	
		return "INSERT INTO empresa_cliente " +
				"( id_empresa_cliente, nombre,direccion, run, mail, fono, id_rubro, id_usuario) " +
				"values ('"+ id +"' , '"+ nombre +"' , '"+ direccion +"' , '"+ run +"' , '"+ mail +"' , '"+ fono +"' , '"+ id_rubro +", "+id_usuario+ "');";
	}
	public static String createDrop(){
		return "\nDROP TABLE empresa_cliente CASCADE CONSTRAINTS; ";
	}
	public static String createTable(){		
		return 
			"\nCREATE TABLE empresa_cliente (" +
				
			"\n id_empresa_cliente NUMBER NOT NULL," +
			"\n nombre VARCHAR2(60) NOT NULL," +
			"\n direccion VARCHAR2(50) NOT NULL," +
			"\n run VARCHAR2(50) NOT NULL," +
			"\n mail VARCHAR2(50) NOT NULL," +			
			"\n fono VARCHAR2(50) NOT NULL," +
			
			"\n id_rubro NUMBER NOT NULL," +
			"\n id_usuario NUMBER NOT NULL);"; 

			//" CONSTRAINT id_empleado_cliente PRIMARY KEY (id_empleado_cliente)," +
			//" CONSTRAINT fk_empresa_cliente_rubro FOREIGN KEY (id_rubro) REFERENCES usuario(id_usuario));";
			
	}
	public static String createAlter(){
		return "\n ALTER TABLE empresa_cliente ADD CONSTRAINT pk_empresa_cliente PRIMARY KEY (id_empresa_cliente);";
	}
	
}
