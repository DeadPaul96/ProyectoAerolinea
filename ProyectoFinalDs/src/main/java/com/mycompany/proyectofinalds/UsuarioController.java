
package com.mycompany.proyectofinalds;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class UsuarioController {
    
    private static final String FILE_NAME = "usuarios.dat";
    private List<Usuario> usuarios;

    public UsuarioController() {
        usuarios = new ArrayList<>();
        cargarDatos();
    }

    // Crear
    public void agregarUsuario(Usuario persona) {
        usuarios.add(persona);
        guardarDatos();
    }

    // Leer
    public List<Usuario> obtenerUsuarios() {
        return usuarios;
    }

    // Actualizar
    public void actualizarUsuario(int index, Usuario nuevaUsuario) {
        if (index >= 0 && index < usuarios.size()) {
            usuarios.set(index, nuevaUsuario);
            guardarDatos();
        } else {
            System.out.println("Índice no válido");
        }
    }
    // Borrar
    public void borrarUsuario(int index) {
        if (index >= 0 && index < usuarios.size()) {
            usuarios.remove(index);
            guardarDatos();
        } else {
            System.out.println("Índice no válido");
        }
    }

    private void cargarDatos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            usuarios = (List<Usuario>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado, se creará uno nuevo.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void guardarDatos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(usuarios);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


