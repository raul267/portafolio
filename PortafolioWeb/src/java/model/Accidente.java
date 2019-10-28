package model;

import java.sql.Date;

public class Accidente implements DAO {
	int id,id_empleado_cliente,id_tipo_accidente;
	EmpleadoCliente empleadoCliente;
	TipoAccidente tipoAccidente;
	Date date;
	String descripcion;
	public Accidente(int id, EmpleadoCliente empleadoCliente,
			TipoAccidente tipoAccidente, Date date, String descripcion) {
		this.id = id;
		this.id_empleado_cliente = empleadoCliente.id;
		this.id_tipo_accidente = tipoAccidente.id;
		this.empleadoCliente = empleadoCliente;
		this.tipoAccidente = tipoAccidente;
		this.date = date;
		this.descripcion = descripcion;
	}
	
	public String toSql(){
		
		return "INSERT INTO accidente " +
				"( id_accidente, id_empleado_cliente, id_tipo_accidente, date, descripcion ) " +
				"values ('"+ id +"' , '"+ id_empleado_cliente +"' , '"+ id_tipo_accidente +"' , '"+ date +"' , '"+ descripcion +"');";
	}
	
	public static String createDrop(){
		return "\nDROP TABLE accidente CASCADE CONSTRAINTS; ";
	}
	public static String createTable(){		
		return 
				"\nCREATE TABLE accidente (" +
				"\n id_accidente NUMBER NOT NULL," +
				"\n id_empleado_cliente NUMBER NOT NULL," +
				"\n id_tipo_accidente NUMBER NOT NULL," +
				"\n date DATE NOT NULL," +
				"\n descripcion VARCHAR2(1000) NOT NULL);"; 
		
				//" CONSTRAINT pk_accidente PRIMARY KEY (id_accidente)," +
				//" CONSTRAINT fk_empleado_cliente FOREIGN KEY (id_empleado_cliente) REFERENCES empleado_cliente(id_empleado_cliente)," +
				//" CONSTRAINT fk_tipo_accidente FOREIGN KEY (id_tipo_accidente) REFERENCES tipo_accidente(id_tipo_accidente));";
	}
	public static String createAlter(){
		return "\n ALTER TABLE accidente ADD CONSTRAINT pk_accidente PRIMARY KEY (id_accidente);" +
				"\n ALTER TABLE accidente ADD CONSTRAINT fk_empleado_cliente FOREIGN KEY (id_empleado_cliente) REFERENCES empleado_cliente(id_empleado_cliente);" +
				"\n ALTER TABLE accidente ADD CONSTRAINT fk_tipo_accidente FOREIGN KEY (id_tipo_accidente) REFERENCES tipo_accidente(id_tipo_accidente);";

		
	}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_empleado_cliente() {
        return id_empleado_cliente;
    }

    public void setId_empleado_cliente(int id_empleado_cliente) {
        this.id_empleado_cliente = id_empleado_cliente;
    }

    public int getId_tipo_accidente() {
        return id_tipo_accidente;
    }

    public void setId_tipo_accidente(int id_tipo_accidente) {
        this.id_tipo_accidente = id_tipo_accidente;
    }

    public EmpleadoCliente getEmpleadoCliente() {
        return empleadoCliente;
    }

    public void setEmpleadoCliente(EmpleadoCliente empleadoCliente) {
        this.empleadoCliente = empleadoCliente;
    }

    public TipoAccidente getTipoAccidente() {
        return tipoAccidente;
    }

    public void setTipoAccidente(TipoAccidente tipoAccidente) {
        this.tipoAccidente = tipoAccidente;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Accidente{" + "id=" + id + ", id_empleado_cliente=" + id_empleado_cliente + ", id_tipo_accidente=" + id_tipo_accidente + ", empleadoCliente=" + empleadoCliente + ", tipoAccidente=" + tipoAccidente + ", date=" + date + ", descripcion=" + descripcion + '}';
    }
	
}
