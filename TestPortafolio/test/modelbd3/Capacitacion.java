package modelbd3;
public class Capacitacion implements DAO {
	int id;
	String nombre, descripcion;
	int cantidad_asistentes;
	int enterreno;
        
        
        private String sql_insert ="insert into capacitacion"
                + "(id_capacitacion,FECHA_CAPACITACION,CANTIDAD_ASISTENTES,ID_PROFESIONAL,MATERIALUTILIZAR,LUGAR_CAPACITACION)"
                + " values(s_capacitacion.nextval,?,?,?,?,?)";
        
        // insert into capacitacion values ()
    
	
	public Capacitacion(int id, String nombre, String descripcion,
			int cantidad_asistentes, int enterreno) {
		
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.cantidad_asistentes = cantidad_asistentes;
		this.enterreno = enterreno;
	}
	
	public String toSql(){
		return "INSERT INTO capacitacion " +
				"( id_capacitacion, nombre, descripcion, cantidad_asistentes, enterreno) " +
				"values ('"+ id +"' , '"+ nombre +"' , '"+ descripcion +"' , '"+ cantidad_asistentes +"' , '"+ enterreno+"');";
	}
	public static String createDrop(){
		return "\nDROP TABLE capacitacion CASCADE CONSTRAINTS; ";
	}
	public static String createTable(){		
		return 
				"\nCREATE TABLE capacitacion (" +
				"\n id_capacitacion NUMBER NOT NULL," +
				"\n nombre VARCHAR2(50) NOT NULL," +
				"\n descripcion VARCHAR2(1000) NOT NULL," +
				"\n cantidad_asistentes NUMBER NOT NULL," +
				"\n enterreno NUMBER NOT NULL);";
				//" CONSTRAINT pk_capacitacion PRIMARY KEY (id_capacitacion));";
	}
	public static String createAlter(){
		return "\n ALTER TABLE capacitacion ADD CONSTRAINT pk_capacitacion PRIMARY KEY (id_capacitacion);";
	}
}
