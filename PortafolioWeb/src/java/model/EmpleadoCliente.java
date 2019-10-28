package model;

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

    public EmpleadoCliente(int id, int id_empresa_cliente, String nombre, String mail) {
        this.id = id;
        this.id_empresa_cliente = id_empresa_cliente;
        this.nombre = nombre;
        this.mail = mail;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_empresa_cliente() {
        return id_empresa_cliente;
    }

    public void setId_empresa_cliente(int id_empresa_cliente) {
        this.id_empresa_cliente = id_empresa_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public EmpresaCliente getEmpresaCliente() {
        return empresaCliente;
    }

    public void setEmpresaCliente(EmpresaCliente empresaCliente) {
        this.empresaCliente = empresaCliente;
    }
	
}
