/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinalds;

public class inicioSesion {

    private UsuarioController u;

    public inicioSesion() {
        u = new UsuarioController();
    }
    
    public void registro(Usuario usuario)
    {
        u.agregarUsuario(usuario);
    }
    public void login()
    {
    
    }
    
}