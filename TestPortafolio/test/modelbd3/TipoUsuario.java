package modelbd3;
public class TipoUsuario implements DAO {
	int id;
	String descripcion;
	
	public TipoUsuario(int id, String descripcion){
		this.id = id;
		this.descripcion = descripcion;
	}
	
	public String toSql(){
		return "INSERT INTO tipo_usuario " +
				"( id_tipo_usuario, descripcion) " +
				"values ('"+ id +"' , '"+ descripcion+"');";
	}
	public static String createDrop(){
		return "\nDROP TABLE tipo_usuario CASCADE CONSTRAINTS; ";
	}
	public static String createTable(){		
		return 
			"\nCREATE TABLE tipo_usuario (" +
				
			"\n id_tipo_usuario NUMBER NOT NULL," +
			"\n descripcion VARCHAR2(50) NOT NULL);";
			
			//" CONSTRAINT tipo_usuario PRIMARY KEY (id_tipo_usuario));";
			
	}
	public static String createAlter(){
		return "\n ALTER TABLE tipo_usuario ADD CONSTRAINT pk_tipo_usuario PRIMARY KEY (id_tipo_usuario);";
	}
	
	
	public int getId(){ return id; }
	public String getDescripcion(){ return descripcion; }
}
