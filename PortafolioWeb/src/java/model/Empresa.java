/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Raúl Strappa León
 */
public class Empresa
{
    public int id_empresa;
    public String nombre;
    public int id_tipo_empresa;
    public String direccion;
    public int estado;
    public int id_plan;
    public int id_usuario;
    public int id_comuna;

    public Empresa(int id_empresa, String nombre, int id_tipo_empresa, String direccion, int estado, int id_plan, int id_usuario, int id_comuna)
    {
        this.id_empresa = id_empresa;
        this.nombre = nombre;
        this.id_tipo_empresa = id_tipo_empresa;
        this.direccion = direccion;
        this.estado = estado;
        this.id_plan = id_plan;
        this.id_usuario = id_usuario;
        this.id_comuna = id_comuna;
    }

    public Empresa()
    {
    }

    public int getId_empresa()
    {
        return id_empresa;
    }

    public void setId_empresa(int id_empresa)
    {
        this.id_empresa = id_empresa;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public int getId_tipo_empresa()
    {
        return id_tipo_empresa;
    }

    public void setId_tipo_empresa(int id_tipo_empresa)
    {
        this.id_tipo_empresa = id_tipo_empresa;
    }

    public String getDireccion()
    {
        return direccion;
    }

    public void setDireccion(String direccion)
    {
        this.direccion = direccion;
    }

    public int getEstado()
    {
        return estado;
    }

    public void setEstado(int estado)
    {
        this.estado = estado;
    }

    public int getId_plan()
    {
        return id_plan;
    }

    public void setId_plan(int id_plan)
    {
        this.id_plan = id_plan;
    }

    public int getId_usuario()
    {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario)
    {
        this.id_usuario = id_usuario;
    }

    public int getId_comuna()
    {
        return id_comuna;
    }

    public void setId_comuna(int id_comuna)
    {
        this.id_comuna = id_comuna;
    }
    
    
}
