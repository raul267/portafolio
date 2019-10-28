package model;

public class CheckItem implements DAO {
	public int id;
	public String nombre, descripcion;
	
	public CheckItem(int id,String nombre, String descripcion){
		this.id = id;
		this.descripcion = descripcion; 
		this.nombre = nombre;
	}
	
	
	
	public String toSql(){
		
		return "INSERT INTO check_item " +
				"( id_check_item, nombre, descripcion ) " +
				"values ('"+ id +"' , '"+ nombre +"' , '"+ descripcion +"');";
	}
	public static String createDrop(){
		return "\nDROP TABLE check_item CASCADE CONSTRAINTS; ";
	}
	public static String createTable(){		
		return 
				"\nCREATE TABLE check_item (" +
				"\n id_check_item NUMBER NOT NULL," +
				"\n nombre VARCHAR2(250) NOT NULL," +
				"\n descripcion VARCHAR2(250) NOT NULL);";
				//" CONSTRAINT pk_check_item PRIMARY KEY (id_check_item));";
	}
	public static String createAlter(){
		return "\n ALTER TABLE check_item ADD CONSTRAINT pk_check_item PRIMARY KEY (id_check_item);";
	}

    @Override
    public String toString() {
        return "CheckItem{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + '}';
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
        
}
