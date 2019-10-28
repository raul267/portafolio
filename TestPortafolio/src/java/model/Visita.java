
package model;

import java.sql.Date;


public class Visita {
    int id,id_empresa_cliente,id_tipo_visita;
    Date fecha_visita;
    String hora;
    String descripcion;
    
    EmpresaCliente empresaCliente;
    TipoVisita tipoVisita;
    
}
