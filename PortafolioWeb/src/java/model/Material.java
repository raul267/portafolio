package model;

public class Material implements DAO {
	int id, id_capacitacion;
	String descripcion;
	Capacitacion capacitacion;
	public Material(int id, Capacitacion capacitacion, String descripcion) {
		this.id = id;
		this.id_capacitacion = capacitacion.id;
		this.descripcion = descripcion;
		this.capacitacion = capacitacion;
	}
	public String toSql(){
		return "INSERT INTO material " +
				"( id_material, id_capacitacion, descripcion) " +
				"values ('"+ id +"' , '"+ id_capacitacion+"' , '"+ descripcion+"');";
	}
	public static String createDrop(){
		return "\nDROP TABLE material CASCADE CONSTRAINTS; ";
	}
	public static String createTable(){		
		return 
			"\nCREATE TABLE material (" +
				
			"\n id_material NUMBER NOT NULL," +
			"\n id_capacitacion NUMBER NOT NULL," +
			"\n descripcion VARCHAR2(100) NOT NULL);";
			

			//" CONSTRAINT pk_material PRIMARY KEY (id_material)," +
			
			//" CONSTRAINT fk_material_capacitacion FOREIGN KEY (id_capacitacion) REFERENCES capacitacion(id_capacitacion));";
			
			
	}
	public static String createAlter(){
		return "\n ALTER TABLE material ADD CONSTRAINT pk_material PRIMARY KEY (id_material);";
	}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_capacitacion() {
        return id_capacitacion;
    }

    public void setId_capacitacion(int id_capacitacion) {
        this.id_capacitacion = id_capacitacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Capacitacion getCapacitacion() {
        return capacitacion;
    }

    public void setCapacitacion(Capacitacion capacitacion) {
        this.capacitacion = capacitacion;
    }

    @Override
    public String toString() {
        return "Material{" + "id=" + id + ", id_capacitacion=" + id_capacitacion + ", descripcion=" + descripcion + ", capacitacion=" + capacitacion + '}';
    }
	
	
}
