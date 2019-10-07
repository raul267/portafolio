
package model;

import java.sql.Date;

public class CobroExtra{
	private int id;
	private Date fechaCobroExtra;
	private String camposNesesarios;
	private double monto;
	private String descripcion;

    public CobroExtra(int id, Date fechaCobroExtra, String camposNesesarios, double monto, String descripcion) {
        this.id = id;
        this.fechaCobroExtra = fechaCobroExtra;
        this.camposNesesarios = camposNesesarios;
        this.monto = monto;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaCobroExtra() {
        return fechaCobroExtra;
    }

    public void setFechaCobroExtra(Date fechaCobroExtra) {
        this.fechaCobroExtra = fechaCobroExtra;
    }

    public String getCamposNesesarios() {
        return camposNesesarios;
    }

    public void setCamposNesesarios(String camposNesesarios) {
        this.camposNesesarios = camposNesesarios;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
        
}