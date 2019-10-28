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
public class CargoEmpleado {
    
    private int id_cargo;
    private String nombre;

    public CargoEmpleado() {
    }

    public CargoEmpleado(int id_cargo, String nombre) {
        this.id_cargo = id_cargo;
        this.nombre = nombre;
    }

    public int getId_cargo() {
        return id_cargo;
    }

    public void setId_cargo(int id_cargo) {
        this.id_cargo = id_cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
