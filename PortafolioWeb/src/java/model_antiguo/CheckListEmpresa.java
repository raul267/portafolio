
package model_antiguo;
import java.sql.Date;
import java.util.ArrayList;

public class CheckListEmpresa {
	private int id;
	private String descripcion;
	private Date fechaRealizacion;
	private ArrayList<CheckItem> checks;

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

    public Date getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(Date fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    public ArrayList<CheckItem> getChecks() {
        return checks;
    }

    public void setChecks(ArrayList<CheckItem> checks) {
        this.checks = checks;
    }

    public CheckListEmpresa(int id, String descripcion, Date fechaRealizacion, ArrayList<CheckItem> checks) {
        this.id = id;
        this.descripcion = descripcion;
        this.fechaRealizacion = fechaRealizacion;
        this.checks = checks;
    }
}
