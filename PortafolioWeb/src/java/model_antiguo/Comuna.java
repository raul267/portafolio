/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_antiguo;

/**
 *
 * @author Raúl Strappa León
 */
public class Comuna
{
    private int id_comuna;
    private String nombre;
    private int region_id_region;

    public Comuna()
    {
    }

    public Comuna(int id_comuna, String nombre, int region_id_region)
    {
        this.id_comuna = id_comuna;
        this.nombre = nombre;
        this.region_id_region = region_id_region;
    }

    public int getId_comuna()
    {
        return id_comuna;
    }

    public void setId_comuna(int id_comuna)
    {
        this.id_comuna = id_comuna;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public int getRegion_id_region()
    {
        return region_id_region;
    }

    public void setRegion_id_region(int region_id_region)
    {
        this.region_id_region = region_id_region;
    }
    
    
    
}
