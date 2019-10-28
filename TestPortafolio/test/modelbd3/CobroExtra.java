package modelbd3;
public class CobroExtra implements DAO {
	int id;
	int id_servicio,id_tarifa;
	Servicio servicio;
	Tarifa tarifa;
	public CobroExtra(int id, Servicio servicio, Tarifa tarifa) {
		this.id = id;
		this.id_servicio = servicio.id;
		this.id_tarifa = tarifa.id;
		this.servicio = servicio;
		this.tarifa = tarifa;
	}
	
	public String toSql(){
		return "INSERT INTO cobro_extra " +
				"( id_cobro_extra, id_servicio, id_tarifa) " +
				"values ('"+ id +"' , '"+ id_servicio +"' , '"+ id_tarifa+"');";
	}
	public static String createDrop(){
		return "\nDROP TABLE cobro_extra CASCADE CONSTRAINTS; ";
	}
	public static String createTable(){		
		return
			"\nCREATE TABLE cobro_extra (" +
				
			"\n id_cobro_extra NUMBER NOT NULL," +
			"\n id_servicio NUMBER NOT NULL," +
			"\n id_tarifa NUMBER NOT NULL);";
			
			//" CONSTRAINT pk_cobro_extra PRIMARY KEY (id_cobro_extra));";
	}
	public static String createAlter(){
		return "\n ALTER TABLE cobro_extra ADD CONSTRAINT pk_cobro_extra PRIMARY KEY (id_cobro_extra);";
	}
}
