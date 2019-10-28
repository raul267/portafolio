package modelbd3;
import java.sql.Date;

public class FactAsesoria implements DAO {
	int id,id_profesional,id_asesoria,id_servicio;
	Date date;
	Profesional profesional;
	Asesoria asesoria;
	Servicio servicio;
	public FactAsesoria(int id, Date date, Profesional profesional,
			Asesoria asesoria, Servicio servicio) {
		
		this.id = id;
		this.id_asesoria = asesoria.id;
		this.id_profesional = profesional.id;
		this.id_servicio = servicio.id;
		this.date = date;
		this.profesional = profesional;
		this.asesoria = asesoria;
		this.servicio = servicio;
	}
	
	public String toSql(){
		return "INSERT INTO fact_asesoria " +
				"( id_fact_capacitacion, date, id_profesional, id_asesoria, id_servicio) " +
				"values ('"+ id +"' , '"+ date+"' , '"+ id_profesional+"' , '"+ id_asesoria+"' , '"+ id_servicio+"');";
	}
	public static String createDrop(){
		return "\nDROP TABLE fact_asesoria CASCADE CONSTRAINTS; ";
	}
	public static String createTable(){		
		return 
			"\nCREATE TABLE fact_asesoria (" +
				
			"\n id_fact_asesoria NUMBER NOT NULL," +
			"\n date DATE NOT NULL," +
			"\n id_profesional NUMBER NOT NULL," +
			"\n id_asesoria NUMBER NOT NULL," +
			"\n id_servicio NUMBER NOT NULL);";			

			//" CONSTRAINT id_fact_capacitacion PRIMARY KEY (id_fact_capacitacion)," +
			
			//" CONSTRAINT fk_fact_asesoria_profesional FOREIGN KEY (id_profesional) REFERENCES profesional(id_profesional)," +
			//" CONSTRAINT fk_fact_asesoria_asesoria FOREIGN KEY (id_asesoria) REFERENCES asesoria(id_asesoria)," +
			//" CONSTRAINT fk_fact_asesoria_servicio FOREIGN KEY (id_servicio) REFERENCES servicio(id_servicio));";
			
	}
	public static String createAlter(){
		return "\n ALTER TABLE fact_asesoria ADD CONSTRAINT pk_fact_asesoria PRIMARY KEY (id_fact_asesoria);";
	}
	
	
}
