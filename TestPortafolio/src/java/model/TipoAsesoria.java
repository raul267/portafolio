package model;

public class TipoAsesoria implements DAO {
	int id;
	String descripcion;
	public TipoAsesoria(int id, String descripcion) {
		this.id = id;
		this.descripcion = descripcion;
	}
	
	public String toSql(){
		return "INSERT INTO tipo_asesoria " +
				"( id_asesoria, descripcion) " +
				"values ('"+ id +"' , '"+ descripcion+"');";
	}
	public static String createDrop(){
		return "\nDROP TABLE tipo_asesoria CASCADE CONSTRAINTS; ";
	}
	public static String createTable(){		
		return 
			"\nCREATE TABLE tipo_asesoria (" +
				
			"\n id_asesoria NUMBER NOT NULL," +
			"\n descripcion VARCHAR2(50) NOT NULL);";
			
			//" CONSTRAINT pk_asesoria PRIMARY KEY (id_asesoria));";
			
	}
	public static String createAlter(){
		return "\n ALTER TABLE tipo_asesoria ADD CONSTRAINT pk_tipo_asesoria PRIMARY KEY (id_tipo_asesoria);";
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

    @Override
    public String toString() {
        return "TipoAsesoria{" + "id=" + id + ", descripcion=" + descripcion + '}';
    }
    
	
}
