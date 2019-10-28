package model;

import java.sql.Date;

public class FactCapacitacion implements DAO {
	int id,id_profesional,id_capacitacion,id_servicio;
	Date date;
	Profesional profesional;
	Capacitacion capacitacion;
	Servicio servicio;
	public FactCapacitacion(int id,Date date, Profesional profesional,
			Capacitacion capacitacion, Servicio servicio) {
		
		this.id = id;
		this.date = date;
		this.profesional = profesional;
		this.capacitacion = capacitacion;
		this.servicio = servicio;
		this.id_profesional = profesional.id;
		this.id_capacitacion = capacitacion.id;
		this.id_servicio = servicio.id;
	}
	
	public String toSql(){
		return "INSERT INTO fact_capacitacion " +
				"( id_fact_capacitacion, date, id_profesional, id_capacitacion, id_servicio) " +
				"values ('"+ id +"' , '"+ date+"' , '"+ id_profesional+"' , '"+ id_capacitacion+"' , '"+ id_servicio+"');";
	}
	public static String createDrop(){
		return "\nDROP TABLE fact_capacitacion CASCADE CONSTRAINTS; ";
	}
	public static String createTable(){		
		return 
			"\nCREATE TABLE fact_capacitacion (" +
				
			"\n id_fact_capacitacion NUMBER NOT NULL," +
			"\n date DATE NOT NULL," +
			"\n id_profesional NUMBER NOT NULL," +
			"\n id_capacitacion NUMBER NOT NULL," +
			"\n id_servicio NUMBER NOT NULL);";			

			//" CONSTRAINT id_fact_capacitacion PRIMARY KEY (id_fact_capacitacion)," +
			
			//" CONSTRAINT fk_fact_capacitacion_profesional FOREIGN KEY (id_profesional) REFERENCES profesional(id_profesional)," +
			//" CONSTRAINT fk_fact_capacitacion_capacitacion FOREIGN KEY (id_capacitacion) REFERENCES capacitacion(id_capacitacion)," +
			//" CONSTRAINT fk_fact_capacitacion_servicio FOREIGN KEY (id_servicio) REFERENCES servicio(id_servicio));";
			
	}
	public static String createAlter(){
		return "\n ALTER TABLE fact_capacitacion ADD CONSTRAINT pk_fact_capacitacion PRIMARY KEY (id_fact_capacitacion);";
	}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_profesional() {
        return id_profesional;
    }

    public void setId_profesional(int id_profesional) {
        this.id_profesional = id_profesional;
    }

    public int getId_capacitacion() {
        return id_capacitacion;
    }

    public void setId_capacitacion(int id_capacitacion) {
        this.id_capacitacion = id_capacitacion;
    }

    public int getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Profesional getProfesional() {
        return profesional;
    }

    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }

    public Capacitacion getCapacitacion() {
        return capacitacion;
    }

    public void setCapacitacion(Capacitacion capacitacion) {
        this.capacitacion = capacitacion;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    @Override
    public String toString() {
        return "FactCapacitacion{" + "id=" + id + ", id_profesional=" + id_profesional + ", id_capacitacion=" + id_capacitacion + ", id_servicio=" + id_servicio + ", date=" + date + ", profesional=" + profesional + ", capacitacion=" + capacitacion + ", servicio=" + servicio + '}';
    }
	
}
