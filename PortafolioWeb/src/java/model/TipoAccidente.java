package model;

public class TipoAccidente  implements DAO {
	int id;
	String descripcion;
	public TipoAccidente(int id, String descripcion) {
		this.id = id;
		this.descripcion = descripcion;
	}
	public String toSql(){
		return "INSERT INTO tipo_accidente " +
				"( id_tipo_accidente, descripcion) " +
				"values ('"+ id +"' , '"+ descripcion+"');";
	}
	public static String createDrop(){
		return "\nDROP TABLE tipo_accidente CASCADE CONSTRAINTS; ";
	}
	public static String createTable(){		
		return 
			"\nCREATE TABLE tipo_accidente (" +
				
			"\n id_tipo_accidente NUMBER NOT NULL," +
			"\n descripcion VARCHAR2(40) NOT NULL);";
			
			//" CONSTRAINT pk_tipo_accidente PRIMARY KEY (id_tipo_accidente));";
			
	}
	public static String createAlter(){
		return "\n ALTER TABLE tipo_accidente ADD CONSTRAINT pk_tipo_accidente PRIMARY KEY (id_tipo_accidente);";
	}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
        
        
	
}
