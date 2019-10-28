package modelbd3;
public class Asesoria implements DAO {
	int id,id_tipo_asesoria;
	Asesoria asesoria;
	String nombre, descripcion;
	int enTerreno;
	public Asesoria(int id, String nombre, String descripcion, int enTerreno, Asesoria asesoria) {
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
}
