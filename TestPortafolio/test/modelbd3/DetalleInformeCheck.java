package modelbd3;
public class DetalleInformeCheck implements DAO {
	public int id_informe,id_check_item;
	int estado;
	InformeCheck informe;
	CheckItem checkItem;
	String propuestaMejora;
	
	public DetalleInformeCheck(InformeCheck informe,CheckItem checkItem, String propuestaMejora){
		this.id_informe = informe.id;
		this.id_check_item = checkItem.id;
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
	
}
