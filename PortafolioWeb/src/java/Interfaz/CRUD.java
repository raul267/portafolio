/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.util.ArrayList;

/**
 *
 * @author cetecom
 */
public interface CRUD<Generic> {
    
    public boolean crear(Generic x);
    public boolean eliminar(Generic x);
    public boolean modificar(Generic x);
    
    public ArrayList<Generic> todos();
    
}
