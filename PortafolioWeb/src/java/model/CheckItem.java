package model;

import java.util.ArrayList;

public class CheckItem{

	private int id;
	private String descripcion;
	private int estado;
	private ArrayList<PropuestaMejora> propuestas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public ArrayList<PropuestaMejora> getPropuestas() {
        return propuestas;
    }

    public void setPropuestas(ArrayList<PropuestaMejora> propuestas) {
        this.propuestas = propuestas;
    }

    public CheckItem(int id, String descripcion, int estado, ArrayList<PropuestaMejora> propuestas) {
        this.id = id;
        this.descripcion = descripcion;
        this.estado = estado;
        this.propuestas = propuestas;
    }


}
