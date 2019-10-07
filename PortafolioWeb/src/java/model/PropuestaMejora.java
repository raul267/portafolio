package model;

public class PropuestaMejora{
	private int id;
	private String descripcion;
	private boolean aprovada;
	private boolean verificada;

	//public void verificar(Profesional p)

    public PropuestaMejora(int id, String descripcion, boolean aprovada, boolean verificada) {
        this.id = id;
        this.descripcion = descripcion;
        this.aprovada = aprovada;
        this.verificada = verificada;
    }

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

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public boolean isVerificada() {
        return verificada;
    }

    public void setVerificada(boolean verificada) {
        this.verificada = verificada;
    }
    
}