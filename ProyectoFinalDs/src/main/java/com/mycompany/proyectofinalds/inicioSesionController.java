
package com.mycompany.proyectofinalds;


public class inicioSesionController {
    private UsuarioController u;
    public inicioSesionController() {
        u = new UsuarioController();
    }
    public boolean validarUsuario(String user, String pass)
    {
        u.obtenerUsuarios();
        
        return false;
    }
}
