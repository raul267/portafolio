package model;

public class DetalleInformeCheck implements DAO {
	public int id_informe,id_check_item;
	int estado;
	InformeCheck informe;
	CheckItem checkItem;
	String propuestaMejora;
	
	public DetalleInformeCheck(InformeCheck informe,CheckItem checkItem,int estado, String propuestaMejora){
		this.id_informe = informe.id;
		this.id_check_item = checkItem.id;
                this.estado = estado;
		this.informe = informe;
		this.checkItem = checkItem;
		this.propuestaMejora = propuestaMejora;
	}

	
	public String toSql(){
		return "INSERT INTO detalle_informe_check " +
				"( id_informe, id_check_item, estado, propuesta_mejora) " +
				"values ('"+ id_informe +"' , '"+ id_check_item +"' , '"+ estado+"' , '"+ propuestaMejora+"');";
	}
	public static String createDrop(){
		return "\nDROP TABLE detalle_informe_check CASCADE CONSTRAINTS; ";
	}
	public static String createTable(){		
		return 
			"\nCREATE TABLE detalle_informe_check (" +
				
			"\n id_informe NUMBER NOT NULL," +
			"\n id_check_item NUMBER NOT NULL," +
			"\n estado NUMBER NOT NULL," +
			"\n propuesta_mejora VARCHAR2(250) NOT NULL);";

			//" CONSTRAINT pk_informe PRIMARY KEY (id_informe),"+
			//" CONSTRAINT fk_check_item FOREIGN KEY (id_check_item) REFERENCES check_item(id_check_item));";
	}
	public static String createAlter(){
		return "";
	}

    public int getId_informe() {
        return id_informe;
    }

    public void setId_informe(int id_informe) {
        this.id_informe = id_informe;
    }

    public int getId_check_item() {
        return id_check_item;
    }

    public void setId_check_item(int id_check_item) {
        this.id_check_item = id_check_item;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public InformeCheck getInforme() {
        return informe;
    }

    public void setInforme(InformeCheck informe) {
        this.informe = informe;
    }

    public CheckItem getCheckItem() {
        return checkItem;
    }

    public void setCheckItem(CheckItem checkItem) {
        this.checkItem = checkItem;
    }

    public String getPropuestaMejora() {
        return propuestaMejora;
    }

    public void setPropuestaMejora(String propuestaMejora) {
        this.propuestaMejora = propuestaMejora;
    }

    @Override
    public String toString() {
        return "DetalleInformeCheck{" + "id_informe=" + id_informe + ", id_check_item=" + id_check_item + ", estado=" + estado + ", informe=" + informe + ", checkItem=" + checkItem + ", propuestaMejora=" + propuestaMejora + '}';
    }
        
        
	
}
