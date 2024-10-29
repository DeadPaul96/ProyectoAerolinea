
package com.mycompany.proyectofinalds;

import java.util.List;


public class inicioSesionController {
    private final UsuarioController u;
    public inicioSesionController() {
        u = new UsuarioController();
    }
    public boolean validarUsuario(String username, String pass)
    {
        List<Usuario> listaUser = u.obtenerUsuarios();
        for (Usuario p: listaUser) 
        {
            if(p.getUsername().equals(username)&& p.getPass().equals(pass))
            {
                return true;
            }
        }
        u.obtenerUsuarios();
        
        return false;
    }
}
