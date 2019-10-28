package modelbd3;
import java.sql.Date;

public class DetallePago implements DAO {
	int id,id_modo_pago,id_pago_servicio;
	PagoServicio pagoServicio;
	ModoPago modoPago;
	Date fechaPago;
	double monto;
	public DetallePago(int id, PagoServicio pagoServicio, ModoPago modoPago,
			Date fechaPago, double monto) {
		super();
		this.id = id;
		this.id_modo_pago = modoPago.id;
		this.id_pago_servicio = pagoServicio.id;
		this.pagoServicio = pagoServicio;
		this.modoPago = modoPago;
		this.fechaPago = fechaPago;
		this.monto = monto;
	}
	
	public String toSql(){
		return "INSERT INTO detalle_pago " +
				"( id_detalle_pago, id_pago_servicio, fecha_pago, monto, id_modo_pago) " +
				"values ('"+ id +"' , '"+ id_pago_servicio +"' , '"+ fechaPago+"' , '"+ monto+"' , '"+ id_modo_pago+"');";
	}
	public static String createDrop(){
		return "\nDROP TABLE detalle_pago CASCADE CONSTRAINTS; ";
	}
	public static String createTable(){		
		return 
			"\nCREATE TABLE detalle_pago (" +
				
			"\n id_detalle_pago NUMBER NOT NULL," +
			"\n id_pago_servicio NUMBER NOT NULL," +
			"\n id_modo_pago NUMBER NOT NULL," +
			"\n fecha_pago DATE NOT NULL," +
			"\n monto NUMBER NOT NULL);";
			//PK
			//" CONSTRAINT pk_detalle_pago PRIMARY KEY (id_detalle_pago),"+
			//FK
			//" CONSTRAINT fk_detalle_pago_servicio FOREIGN KEY (id_pago_servicio) REFERENCES pago_servicio(id_pago_servicio),"+
			//" CONSTRAINT fk_detalle_modo_pago FOREIGN KEY (id_modo_pago) REFERENCES modo_pago(id_modo_pago));";
	}
	public static String createAlter(){
		return "\n ALTER TABLE detalle_pago ADD CONSTRAINT pk_detalle_pago PRIMARY KEY (id_detalle_pago);";
	}
}
