package model;

public class EmpresaCliente implements DAO {
	public int id,id_rubro,id_usuario;
	public String nombre,direccion,run,mail,fono;
	Rubro rubro;
	Usuario usuario;
	
	//object oriented
	//CheckList checkList;
	//InformeCheck informeCheck;
	
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
	/*
	public void setCheckList(CheckList checkList){
		this.checkList = checkList;
	}
	public void setInformeCheck(InformeCheck informeCheck){
		this.informeCheck = informeCheck;
	}
        */
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

    @Override
    public String toString() {
        return "<h3>EmpresaCliente</h3>" + ""
                + "<label><b>id</label> </b><span>" + id + "</span>"
                + "<label><b> id_rubro </b></label> <span>" + id_rubro + "</span>"
                + "<label><b> id_usuario </b></label> <span>" + id_usuario + "</span>"
                + "<label><b> nombre </b></label> <span>" + nombre + "</span>"
                + "<label><b> direccion </b></label> <span>" + direccion + "</span>"
                + "<label><b> run </b></label> <span>" + run + "</span>"
                + "<label><b> mail </b></label> <span>" + mail + "</span>"
                + "<label><b> fono </b></label> <span>" + fono + "</span>"
                + "<label><b> rubro </b></label> <span>" + rubro + "</span>"
                + "<label><b> usuario </b></label> <span>" + usuario + "</span>";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_rubro() {
        return id_rubro;
    }

    public void setId_rubro(int id_rubro) {
        this.id_rubro = id_rubro;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getFono() {
        return fono;
    }

    public void setFono(String fono) {
        this.fono = fono;
    }

    public Rubro getRubro() {
        return rubro;
    }

    public void setRubro(Rubro rubro) {
        this.rubro = rubro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
        
	
}
