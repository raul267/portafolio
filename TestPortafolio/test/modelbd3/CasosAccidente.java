package modelbd3;
public class CasosAccidente implements DAO {
	int id, id_empresa_cliente;
	EmpresaCliente empresaCliente;
	String descripcion,solucion;
	
	public CasosAccidente(int id, EmpresaCliente empresaCliente,
			String descripcion, String solucion) {
		this.id = id;
		this.id_empresa_cliente = empresaCliente.id;
		this.empresaCliente = empresaCliente;
		this.descripcion = descripcion;
		this.solucion = solucion;
	}
	
	public String toSql(){
		return "INSERT INTO casos_accidente " +
				"( id_casos_accidente, descripcion, solucion, id_empresa_cliente) " +
				"values ('"+ id +"' , '"+ descripcion +"' , '"+ solucion +"' , '"+ id_empresa_cliente+"');";
	}
	public static String createDrop(){
		return "\nDROP TABLE casos_accidente CASCADE CONSTRAINTS; ";
	}
	public static String createTable(){		
		return
				"\nCREATE TABLE casos_accidente (" +
				"\n id_casos_accidente NUMBER NOT NULL," +
				"\n descripcion VARCHAR2(250) NOT NULL," +
				"\n solucion VARCHAR2(250) NOT NULL," +
				"\n id_empresa_cliente NUMBER NOT NULL," +
				"\n enterreno NUMBER NOT NULL);";
				//" CONSTRAINT pk_casos_accidente PRIMARY KEY (id_casos_accidente));";
	}
	public static String createAlter(){
		return "\n ALTER TABLE casos_accidente ADD CONSTRAINT pk_casos_accidente PRIMARY KEY (id_casos_accidente);";
	}
}
