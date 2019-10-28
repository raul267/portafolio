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
public class Capacitacion_asistente {
    
    private int ID_CAPACITACION_ASISTENTE;
    private int ID_EMPLEADO_CLIENTE;
            private int ID_ACTIVIDAD;
                    private int ID_CAPACITACION;

    public Capacitacion_asistente(int ID_CAPACITACION_ASISTENTE, int ID_EMPLEADO_CLIENTE, int ID_ACTIVIDAD, int ID_CAPACITACION) {
        this.ID_CAPACITACION_ASISTENTE = ID_CAPACITACION_ASISTENTE;
        this.ID_EMPLEADO_CLIENTE = ID_EMPLEADO_CLIENTE;
        this.ID_ACTIVIDAD = ID_ACTIVIDAD;
        this.ID_CAPACITACION = ID_CAPACITACION;
    }

    public Capacitacion_asistente() {
    }

    public int getID_CAPACITACION_ASISTENTE() {
        return ID_CAPACITACION_ASISTENTE;
    }

    public void setID_CAPACITACION_ASISTENTE(int ID_CAPACITACION_ASISTENTE) {
        this.ID_CAPACITACION_ASISTENTE = ID_CAPACITACION_ASISTENTE;
    }

    public int getID_EMPLEADO_CLIENTE() {
        return ID_EMPLEADO_CLIENTE;
    }

    public void setID_EMPLEADO_CLIENTE(int ID_EMPLEADO_CLIENTE) {
        this.ID_EMPLEADO_CLIENTE = ID_EMPLEADO_CLIENTE;
    }

    public int getID_ACTIVIDAD() {
        return ID_ACTIVIDAD;
    }

    public void setID_ACTIVIDAD(int ID_ACTIVIDAD) {
        this.ID_ACTIVIDAD = ID_ACTIVIDAD;
    }

    public int getID_CAPACITACION() {
        return ID_CAPACITACION;
    }

    public void setID_CAPACITACION(int ID_CAPACITACION) {
        this.ID_CAPACITACION = ID_CAPACITACION;
    }
    
}
