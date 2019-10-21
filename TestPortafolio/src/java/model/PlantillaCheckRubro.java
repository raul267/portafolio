package model;

public class PlantillaCheckRubro implements DAO {
	int id_rubro, id_check_item;
	Rubro rubro;
	CheckItem checkItem;
	
	public PlantillaCheckRubro(Rubro rubro, CheckItem checkItem){
		this.rubro = rubro;
		this.checkItem = checkItem;
		this.id_rubro = rubro.id;
		this.id_check_item = checkItem.id;
	}

	@Override
	public String toString() {
		return "PlantillaCheckRubro [id_rubro=" + id_rubro + ", id_check_item="
				+ id_check_item + ", rubro=" + rubro + ", checkItem="
				+ checkItem + "]";
	}
	
	public String toSql(){
		
		return "INSERT INTO plantilla_check_rubro " +
				"( id_rubro, id_check_item ) " +
				"values ('"+ id_rubro +"' , '"+ id_check_item +"');";
	}
	public static String createDrop(){
		return "\nDROP TABLE plantilla_check_rubro CASCADE CONSTRAINTS; ";
	}
	public static String createTable(){		
		return 
			"\nCREATE TABLE plantilla_check_rubro (" +
				
			"\n id_rubro NUMBER NOT NULL," +
			"\n id_check_item NUMBER NOT NULL);"; 

			
			//" CONSTRAINT fk_plantilla_check_item FOREIGN KEY (id_check_item) REFERENCES check_item(id_check_item),"+
			//" CONSTRAINT fk_plantilla_check_rubro FOREIGN KEY (id_rubro) REFERENCES rubro(id_rubro));";
			
	}
	public static String createAlter(){
		return "";
	}
	
}
