
package model;
import java.sql.Date;

public class InformeCheck implements DAO {
	int id,id_empresa_cliente;
	Date date;
	EmpresaCliente empresaCliente;
	
	
	public InformeCheck(int id,Date date,EmpresaCliente empresaCliente){
		this.id = id;
		this.date = date;
		this.empresaCliente = empresaCliente;
		this.id_empresa_cliente = empresaCliente.id;
	}

	
	public String toSql(){
		return "INSERT INTO informe_check " +
				"( id_informe, date, id_empresa_cliente) " +
				"values ('"+ id +"' , '"+ date +"' , '"+ id_empresa_cliente+"');";
	}
	public static String createDrop(){
		return "\nDROP TABLE informe_check CASCADE CONSTRAINTS; ";
	}
	public static String createTable(){		
		return 
			"\nCREATE TABLE informe_check (" +
				
			"\n id_informe NUMBER NOT NULL," +
			"\n date DATE NOT NULL," +
			"\n id_empresa_cliente NUMBER NOT NULL);";
			
			//" CONSTRAINT id_informe PRIMARY KEY (id_informe)," +
			
			//" CONSTRAINT fk_informe_check_empresa_cliente FOREIGN KEY (id_empresa_cliente) REFERENCES empresa_cliente(id_empresa_cliente));";
			
	}
	public static String createAlter(){
		return "\n ALTER TABLE informe_check ADD CONSTRAINT pk_informe_check PRIMARY KEY (id_informe_check);";
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public EmpresaCliente getEmpresaCliente() {
        return empresaCliente;
    }

    public void setEmpresaCliente(EmpresaCliente empresaCliente) {
        this.empresaCliente = empresaCliente;
    }

    @Override
    public String toString() {
        return "InformeCheck{" + "id=" + id + ", id_empresa_cliente=" + id_empresa_cliente + ", date=" + date + ", empresaCliente=" + empresaCliente + '}';
    }
        
        
	
}

