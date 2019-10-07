package model;

/*
	IMPLEMENTAR INTERFACE
*/

public class EmpleadoCliente{

	private int id;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String run;
	private String email;
	private String descripcion;
	private String fono;

	//USER
	private Usuario account;

    public EmpleadoCliente(int id, String nombre, String apellidoPaterno, String apellidoMaterno, String run, String email, String descripcion, String fono, Usuario account) {
        this.id = id;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.run = run;
        this.email = email;
        this.descripcion = descripcion;
        this.fono = fono;
        this.account = account;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFono() {
        return fono;
    }

    public void setFono(String fono) {
        this.fono = fono;
    }

    public Usuario getAccount() {
        return account;
    }

    public void setAccount(Usuario account) {
        this.account = account;
    }

}
