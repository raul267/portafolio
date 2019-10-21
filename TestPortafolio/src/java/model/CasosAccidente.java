package model;

public class CasosAccidente implements DAO {
	int id, id_empresa_cliente;
	EmpresaCliente empresaCliente;
	String descripcion,solucion;
        int enterreno;
	
	public CasosAccidente(int id, EmpresaCliente empresaCliente,
			String descripcion, String solucion, int enterreno) {
		this.id = id;
		this.id_empresa_cliente = empresaCliente.id;
		this.empresaCliente = empresaCliente;
		this.descripcion = descripcion;
		this.solucion = solucion;
                this.enterreno = enterreno;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_empresa_cliente() {
        return id_empresa_cliente;
    }

    public void setId_empresa_cliente(int id_empresa_cliente) {
        this.id_empresa_cliente = id_empresa_cliente;
    }

    public EmpresaCliente getEmpresaCliente() {
        return empresaCliente;
    }

    public void setEmpresaCliente(EmpresaCliente empresaCliente) {
        this.empresaCliente = empresaCliente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSolucion() {
        return solucion;
    }

    public void setSolucion(String solucion) {
        this.solucion = solucion;
    }

    public int getEnterreno() {
        return enterreno;
    }

    public void setEnterreno(int enterreno) {
        this.enterreno = enterreno;
    }

    @Override
    public String toString() {
        return "CasosAccidente{" + "id=" + id + ", id_empresa_cliente=" + id_empresa_cliente + ", empresaCliente=" + empresaCliente + ", descripcion=" + descripcion + ", solucion=" + solucion + ", enterreno=" + enterreno + '}';
    }
        
}
