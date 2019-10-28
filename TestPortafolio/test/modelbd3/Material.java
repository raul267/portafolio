package modelbd3;
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
	
	
}
