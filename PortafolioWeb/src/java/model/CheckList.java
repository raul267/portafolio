package model;

public class CheckList implements DAO {
	public int id,id_empresa_cliente,id_check_item;
	int estado;
	EmpresaCliente empresaCliente;
	CheckItem checkItem;
	
	public CheckList (int id,int estado,EmpresaCliente empresaCliente, CheckItem checkItem){
		this.id = id;
		this.id_empresa_cliente = empresaCliente.id;
		this.id_check_item = checkItem.id;
		this.estado = estado;
		this.empresaCliente = empresaCliente;
		this.checkItem = checkItem;
	}
	
	public String toSql(){
		
		return "INSERT INTO check_list " +
				"( id_check_list, id_empresa_cliente, id_checkitem, estado) " +
				"values ('"+ id +"' , '"+ id_empresa_cliente +"' , '"+ id_check_item +"' , '"+ estado +"');";
	}
	public static String createDrop(){
		return "\nDROP TABLE checklist CASCADE CONSTRAINTS; ";
	}
	public static String createTable(){		
		return 
			"\nCREATE TABLE check_list (" +
			"\n id_check_list NUMBER NOT NULL," +
			"\n id_empresa_cliente NUMBER NOT NULL," +
			"\n id_checkitem NUMBER NOT NULL," +
			"\n estado NUMBER NOT NULL);";
			
			//" CONSTRAINT pk_check_list PRIMARY KEY (id_check_list));";
	}
	public static String createAlter(){
		return "\n ALTER TABLE check_list ADD CONSTRAINT pk_check_list PRIMARY KEY (id_check_list);";
	}

    @Override
    public String toString() {
        return "CheckList{" + "id=" + id + ", id_empresa_cliente=" + id_empresa_cliente + ", id_check_item=" + id_check_item + ", estado=" + estado + ", empresaCliente=" + empresaCliente + ", checkItem=" + checkItem + '}';
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

    public EmpresaCliente getEmpresaCliente() {
        return empresaCliente;
    }

    public void setEmpresaCliente(EmpresaCliente empresaCliente) {
        this.empresaCliente = empresaCliente;
    }

    public CheckItem getCheckItem() {
        return checkItem;
    }

    public void setCheckItem(CheckItem checkItem) {
        this.checkItem = checkItem;
    }
        
}
