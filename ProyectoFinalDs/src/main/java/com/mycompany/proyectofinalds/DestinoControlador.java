/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinalds;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author jeanz
 */
public class DestinoControlador {
    
    private static final String FILE_NAME = "destino.dat";
    private List<Destino> destino;

    public DestinoControlador()
    {
       destino = new ArrayList<>();
       cargarDatos();
    }

    // Crear
    public void agregarDestino(Destino persona) {
        destino.add(persona);
        guardarDatos();
    }

    // Leer
    public List<Destino> obtenerDestinos() {
        return destino;
    }

    // Actualizar
    public void actualizarDestino(int index, Destino nuevaDestino) {
        if (index >= 0 && index < destino.size()) {
            destino.set(index, nuevaDestino);
            guardarDatos();
        } else {
            System.out.println("Índice no válido");
        }
    }

    // Borrar
    public void borrarDestino(int index) {
        if (index >= 0 && index < destino.size()) {
            destino.remove(index);
            guardarDatos();
        } else {
            System.out.println("Índice no válido");
        }
    }

    private void cargarDatos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            destino = (List<Destino>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado, se creará uno nuevo.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void guardarDatos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(destino);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
