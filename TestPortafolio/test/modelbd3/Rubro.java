package modelbd3;
public class Rubro implements DAO {
	public int id;
	String descripcion;
	
	public Rubro(int id,String descripcion){
		this.id = id;
		this.descripcion = descripcion;
	}
	
	public String toSql(){
		
		return "INSERT INTO rubro " +
				"( id_rubro, descripcion ) " +
				"values ('"+ id +"' , '"+ descripcion +"');";
	}
	public static String createDrop(){
		return "\nDROP TABLE rubro CASCADE CONSTRAINTS; ";
	}
	public static String createTable(){		
		return 
			"\nCREATE TABLE rubro (" +
				
			"\n id_rubro NUMBER NOT NULL," +
			"\n descripcion VARCHAR2(50) NOT NULL);"; 
			
	}
	public static String createAlter(){
		return "\n ALTER TABLE rubro ADD CONSTRAINT pk_rubro PRIMARY KEY (id_rubro);";
	}
}
