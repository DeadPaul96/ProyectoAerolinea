
package com.mycompany.proyectofinalds;

import java.util.List;
import pantallas.PantallaPrincipal;


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
        return false;
    }
    public void app()
        {
            PantallaPrincipal pp = new PantallaPrincipal();
            pp.setVisible(true);
        }  
}
