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
public class Usuario
{
     private int id_usuario;
    private String nick_name;
    private String password;
    private int id_tipo_usuario;

    public Usuario()
    {
    }

    public Usuario(int id_usuario, String nick_name, String password, int id_tipo_usuario)
    {
        this.id_usuario = id_usuario;
        this.nick_name = nick_name;
        this.password = password;
        this.id_tipo_usuario = id_tipo_usuario;
    }

    public int getId_usuario()
    {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario)
    {
        this.id_usuario = id_usuario;
    }

    public String getNick_name()
    {
        return nick_name;
    }

    public void setNick_name(String nick_name)
    {
        this.nick_name = nick_name;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public int getId_tipo_usuario()
    {
        return id_tipo_usuario;
    }

    public void setId_tipo_usuario(int id_tipo_usuario)
    {
        this.id_tipo_usuario = id_tipo_usuario;
    }
    
    

}
