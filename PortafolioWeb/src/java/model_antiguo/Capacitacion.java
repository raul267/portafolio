/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_antiguo;

/**
 *
 * @author 56942
 */
public class Capacitacion {
    
    private int id_capacitacion;
    private String fecha_capacitacion;
    private int cantidad_asistentes;
    private int id_profesional;
    private String materialAUtilizar;
    private String lugarCapacitacion;

    public Capacitacion() {
    }

    public Capacitacion(int id_capacitacion, String fecha_capacitacion, int cantidad_asistentes, int id_profesional, String materialAUtilizar, String lugarCapacitacion) {
        this.id_capacitacion = id_capacitacion;
        this.fecha_capacitacion = fecha_capacitacion;
        this.cantidad_asistentes = cantidad_asistentes;
        this.id_profesional = id_profesional;
        this.materialAUtilizar = materialAUtilizar;
        this.lugarCapacitacion = lugarCapacitacion;
    }

    public int getId_capacitacion() {
        return id_capacitacion;
    }

    public void setId_capacitacion(int id_capacitacion) {
        this.id_capacitacion = id_capacitacion;
    }

    public String getFecha_capacitacion() {
        return fecha_capacitacion;
    }

    public void setFecha_capacitacion(String fecha_capacitacion) {
        this.fecha_capacitacion = fecha_capacitacion;
    }

    public int getCantidad_asistentes() {
        return cantidad_asistentes;
    }

    public void setCantidad_asistentes(int cantidad_asistentes) {
        this.cantidad_asistentes = cantidad_asistentes;
    }

    public int getId_profesional() {
        return id_profesional;
    }

    public void setId_profesional(int id_profesional) {
        this.id_profesional = id_profesional;
    }

    public String getMaterialAUtilizar() {
        return materialAUtilizar;
    }

    public void setMaterialAUtilizar(String materialAUtilizar) {
        this.materialAUtilizar = materialAUtilizar;
    }

    public String getLugarCapacitacion() {
        return lugarCapacitacion;
    }

    public void setLugarCapacitacion(String lugarCapacitacion) {
        this.lugarCapacitacion = lugarCapacitacion;
    }
    
}
