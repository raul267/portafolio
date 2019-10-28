package model;

public class ModoPago implements DAO {
	int id;
	String descripcion;
	public ModoPago(int id, String descripcion) {
		this.id = id;
		this.descripcion = descripcion;
	}
	
	public String toSql(){
		return "INSERT INTO modo_pago " +
				"( id_modo_pago, descripcion) " +
				"values ('"+ id +"' , '"+ descripcion+"');";
	}
	public static String createDrop(){
		return "\nDROP TABLE modo_pago CASCADE CONSTRAINTS; ";
	}
	public static String createTable(){		
		return 
			"\nCREATE TABLE modo_pago (" +
				
			"\n id_modo_pago NUMBER NOT NULL," +
			"\n descripcion VARCHAR2(100) NOT NULL);";
			

			//" CONSTRAINT pk_modo_pago PRIMARY KEY (id_modo_pago));";
			
			
			
	}
	public static String createAlter(){
		return "\n ALTER TABLE modo_pago ADD CONSTRAINT pk_modo_pago PRIMARY KEY (id_modo_pago);";
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
	
	
}
