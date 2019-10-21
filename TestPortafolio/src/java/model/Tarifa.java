package model;

public class Tarifa implements DAO {
	int id;
	String descripcion;
	int cost;
	public Tarifa(int id, String descripcion, int cost) {
		this.id = id;
		this.descripcion = descripcion;
		this.cost = cost;
	}
	
	public String toSql(){
		return "INSERT INTO tarifa " +
				"( id_tarifa, descripcion ,costo) " +
				"values ('"+ id +"' , '"+ descripcion+"' , '"+ cost+"');";
	}
	public static String createDrop(){
		return "\nDROP TABLE tarifa CASCADE CONSTRAINTS; ";
	}
	public static String createTable(){		
		return 
			"\nCREATE TABLE tarifa (" +
				
			"\n id_tarifa NUMBER NOT NULL," +
			"\n descripcion VARCHAR2(40) NOT NULL," +
			"\n costo NUMBER NOT NULL);";
			
			//" CONSTRAINT pk_tarifa PRIMARY KEY (id_tarifa));";
			
	}
	public static String createAlter(){
		return "\n ALTER TABLE tarifa ADD CONSTRAINT pk_tarifa PRIMARY KEY (id_tarifa);";
	}

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCost() {
        return cost;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Tarifa{" + "id=" + id + ", descripcion=" + descripcion + ", cost=" + cost + '}';
    }
        
        
	
}
