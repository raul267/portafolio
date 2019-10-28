package model;

public class Asesoria implements DAO {
	int id,id_tipo_asesoria;
	TipoAsesoria asesoria;
	String nombre, descripcion;
	int enTerreno;
	public Asesoria(int id, String nombre, String descripcion, int enTerreno, TipoAsesoria asesoria) {
		this.id = id;
		this.id_tipo_asesoria = asesoria.id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.enTerreno = enTerreno;
	}
	
	public String toSql(){
		return "INSERT INTO asesoria " +
				"( id_asesoria, id_tipo_asesoria, nombre, descripcion, enterreno) " +
				"values ('"+ id +"' , '"+ id_tipo_asesoria +"' , '"+ nombre +"' , '"+ descripcion +"' , '"+ enTerreno+"');";
	}
	public static String createDrop(){
		return "\nDROP TABLE asesoria CASCADE CONSTRAINTS; ";
	}
	public static String createTable(){		
		return 
				"\nCREATE TABLE asesoria (" +
				"\n id_asesoria NUMBER NOT NULL," +
				"\n id_tipo_asesoria NUMBER NOT NULL," +
				"\n nombre VARCHAR2(50) NOT NULL," +
				"\n descripcion VARCHAR2(1000) NOT NULL," +
				"\n enterreno NUMBER NOT NULL);";
				//" CONSTRAINT pk_asesoria PRIMARY KEY (id_asesoria)," +
				//" CONSTRAINT fk_tipo_asesoria FOREIGN KEY (id_tipo_asesoria) REFERENCES tipo_asesoria(id_tipo_asesoria));";
	}
	public static String createAlter(){
		return "\nALTER TABLE asesoria ADD CONSTRAINT pk_asesoria PRIMARY KEY (id_asesoria);" +
				"\nALTER TABLE asesoria CONSTRAINT fk_tipo_asesoria FOREIGN KEY (id_tipo_asesoria) REFERENCES tipo_asesoria(id_tipo_asesoria);";
	
	}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_tipo_asesoria() {
        return id_tipo_asesoria;
    }

    public void setId_tipo_asesoria(int id_tipo_asesoria) {
        this.id_tipo_asesoria = id_tipo_asesoria;
    }

    public TipoAsesoria getAsesoria() {
        return asesoria;
    }

    public void setAsesoria(TipoAsesoria asesoria) {
        this.asesoria = asesoria;
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

    public int getEnTerreno() {
        return enTerreno;
    }

    public void setEnTerreno(int enTerreno) {
        this.enTerreno = enTerreno;
    }

    @Override
    public String toString() {
        return "Asesoria{" + "id=" + id + ", id_tipo_asesoria=" + id_tipo_asesoria + ", asesoria=" + asesoria + ", nombre=" + nombre + ", descripcion=" + descripcion + ", enTerreno=" + enTerreno + '}';
    }
        
}
