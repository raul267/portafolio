package model_antiguo;

/*
	IMPLEMENTAR INTERFACE
*/

public class EmpleadoCliente{

	private int id;
	private String nombre;
	
	private String run;
	private String email;
	
        private int id_empresa;
        private int id_tipo_cargoEmpleado;
	private int operativo;
        private String direccion;

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

    public int getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(int id_empresa) {
        this.id_empresa = id_empresa;
    }

    public int getId_tipo_cargoEmpleado() {
        return id_tipo_cargoEmpleado;
    }

    public void setId_tipo_cargoEmpleado(int id_tipo_cargoEmpleado) {
        this.id_tipo_cargoEmpleado = id_tipo_cargoEmpleado;
    }

    public int getOperativo() {
        return operativo;
    }

    public void setOperativo(int operativo) {
        this.operativo = operativo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public EmpleadoCliente(int id, String nombre, String run, int id_empresa, int id_tipo_cargoEmpleado, int operativo, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.run = run;
        this.id_empresa = id_empresa;
        this.id_tipo_cargoEmpleado = id_tipo_cargoEmpleado;
        this.operativo = operativo;
        this.direccion = direccion;
    }

    public EmpleadoCliente() {
    }

	
	



    

}
