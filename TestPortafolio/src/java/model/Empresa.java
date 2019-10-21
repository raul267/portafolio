package model;

public class Empresa implements DAO {
	public int id;
	String nombre, direccion,run,mail,fono,celular;
	
	public Empresa(int id,String nombre, String direccion, String run, String mail, String fono, String celular){
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.run = run;
		this.mail = mail;
		this.fono = fono;
		this.celular = celular;
	}
	
	public String toSql(){
		return "INSERT INTO empresa " +
				"( id_empresa, nombre, direccion, mail, run, fono, celular) " +
				"values ('"+ id +"' , '"+ nombre +"' , '"+ direccion+"' , '"+ mail + "' , '"+ run +"' , '"+ fono +"' , '"+celular+"');";
	}
	public static String createDrop(){
		return "\nDROP TABLE empresa CASCADE CONSTRAINTS; ";
	}
	public static String createTable(){		
		return 
			"\nCREATE TABLE empresa (" +
				
			"\n id_empresa NUMBER NOT NULL," +
			"\n nombre VARCHAR2(50) NOT NULL," +
			"\n direccion VARCHAR2(100) NOT NULL," +
			"\n mail DATE NOT NULL," +
			"\n run VARCHAR2(20) NOT NULL," +
			"\n fono VARCHAR2(20) NOT NULL,"+
			"\n celular VARCHAR2(20) NOT NULL);";
			//PK
			//"CONSTRAINT id_empresa PRIMARY KEY (id_empresa));";
	}
	public static String createAlter(){
		return "\n ALTER TABLE empresa ADD CONSTRAINT pk_empresa PRIMARY KEY (id_empresa);";
	}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Empresa{" + "id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", run=" + run + ", mail=" + mail + ", fono=" + fono + ", celular=" + celular + '}';
    }
        
        
}
