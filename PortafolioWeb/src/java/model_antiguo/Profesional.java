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
public class Profesional
{
    public int id_profesoinal;
    public String nombre;
    public String rut;
    public String direccion;
    public int  contratado;
    public int id_usuario;

    public Profesional()
    {
    }

    public Profesional(int id_profesoinal)
    {
        this.id_profesoinal = id_profesoinal;
    }

    public Profesional(int id_profesoinal, String nombre, String rut, String direccion, int contratado, int id_usuario)
    {
        this.id_profesoinal = id_profesoinal;
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
        this.contratado = contratado;
        this.id_usuario = id_usuario;
    }

    public Profesional(int id_profesoinal, String nombre, String direccion)
    {
        this.id_profesoinal = id_profesoinal;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Profesional(int id_profesoinal, int contratado)
    {
        this.id_profesoinal = id_profesoinal;
        this.contratado = contratado;
    }

    public int getId_profesoinal()
    {
        return id_profesoinal;
    }

    public void setId_profesoinal(int id_profesoinal)
    {
        this.id_profesoinal = id_profesoinal;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getRut()
    {
        return rut;
    }

    public void setRut(String rut)
    {
        this.rut = rut;
    }

    public String getDireccion()
    {
        return direccion;
    }

    public void setDireccion(String direccion)
    {
        this.direccion = direccion;
    }

    public int getContratado()
    {
        return contratado;
    }

    public void setContratado(int contratado)
    {
        this.contratado = contratado;
    }

    public int getId_usuario()
    {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario)
    {
        this.id_usuario = id_usuario;
    }




}
