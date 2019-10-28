package modelbd3;
import java.sql.Date;

public class PagoServicio implements DAO {
	int id, id_servicio;
	Servicio servicio;
	Date date;
	String comprobantePago;
	public PagoServicio(int id, Servicio servicio, Date date,
			String comprobantePago) {
		this.id = id;
		this.id_servicio = servicio.id;
		this.servicio = servicio;
		this.date = date;
		this.comprobantePago = comprobantePago;
	}
	public String toSql(){
		return "INSERT INTO pago_servicio " +
				"( id_pago_servicio, id_servicio, " +
				"fecha_vencimiento, " +
				"comprobante_pago) " +
				"values ('"+ id +"' , '"+ id_servicio+"' , '"+ date+"' , '"+ comprobantePago+"');";
	}
	public static String createDrop(){
		return "\nDROP TABLE pago_servicio CASCADE CONSTRAINTS; ";
	}
	public static String createTable(){		
		return 
			"\nCREATE TABLE pago_servicio (" +
				
			"\n id_pago_servicio NUMBER NOT NULL," +
			"\n id_servicio NUMBER NOT NULL," +
			"\n fecha_vencimiento DATE NOT NULL," +
			"\n comprobante_pago VARCHAR2(100) NOT NULL);";
			

			//" CONSTRAINT pk_pago_servicio PRIMARY KEY (id_pago_servicio)," +
			
			//" CONSTRAINT fk_pago_servicio_servicio FOREIGN KEY (id_servicio) REFERENCES servicio(id_servicio));";
			
			
	}
	public static String createAlter(){
		return "\n ALTER TABLE pago_servicio ADD CONSTRAINT pk_pago_servicio PRIMARY KEY (id_pago_servicio);";
	}
	
}
