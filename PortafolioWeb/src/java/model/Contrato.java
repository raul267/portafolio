package model;

import java.sql.Date;

public class Contrato {
        private int id;
	private Date fechaInicio;
	private Date fechaTermino;
	private String ubicacionArchivo;

	public Contrato(int id,Date fechaInicio, Date fechaTermino, String ubicacion){
		this.id = id;
		this.fechaInicio = fechaInicio;
		this.fechaTermino = fechaTermino;
		this.ubicacionArchivo = ubicacion;
	}
	
	public int getId(){ return id; }
	public Date getFechaInicio(){ return fechaInicio; }
	public Date getFechaTermino(){ return fechaTermino; }
	public String ubicacionArchivo(){ return ubicacionArchivo; }    
}
