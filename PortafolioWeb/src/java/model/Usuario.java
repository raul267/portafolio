package model;

public class Usuario implements DAO {
	int id, id_tipo;
	String acc,pass;
	public TipoUsuario tipoUsuario;
	
	public Usuario (int id,String acc, String pass, TipoUsuario tipo){
		this.id = id;
		this.acc = acc;
		this.pass = pass;
		this.tipoUsuario = tipo;
		this.id_tipo = tipo.id;
	}
	
	

	public String getAcc() {
		return acc;
	}



	public void setAcc(String acc) {
		this.acc = acc;
	}



	public String getPass() {
		return pass;
	}



	public void setPass(String pass) {
		this.pass = pass;
	}



	public TipoUsuario getTipo() {
		return tipoUsuario;
	}



	public void setTipo(TipoUsuario tipo) {
		this.tipoUsuario = tipo;
	}


	public String toSql(){
		return "INSERT INTO usuario " +
				"( id_usuario, acc, pass, id_tipo_usuario) " +
				"values ('"+ id +"' , '"+ acc +"' , '"+ pass +"' , '"+ id_tipo+"');";
	}
	public static String createDrop(){
		return "\nDROP TABLE usuario CASCADE CONSTRAINTS; ";
	}
	public static String createTable(){		
		return
			"\nCREATE TABLE usuario (" +
				
			"\n id_usuario NUMBER NOT NULL," +
			"\n acc VARCHAR2(50) NOT NULL," +
			"\n pass VARCHAR2(50) NOT NULL," +
			"\n id_tipo_usuario NUMBER NOT NULL);";

			//" CONSTRAINT pk_usuario PRIMARY KEY (id_usuario)," +
			
			//" CONSTRAINT fk_usuario_tipo_usuario FOREIGN KEY (id_tipo_usuario) REFERENCES tipo_usuario(id_tipo_usuario));";
			
			
	}
	public static String createAlter(){
		return "\n ALTER TABLE usuario ADD CONSTRAINT pk_usuario PRIMARY KEY (id_usuario);";
	}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(int id_tipo) {
        this.id_tipo = id_tipo;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", id_tipo=" + id_tipo + ", acc=" + acc + ", pass=" + pass + ", tipoUsuario=" + tipoUsuario + '}';
    }
        
	
}
