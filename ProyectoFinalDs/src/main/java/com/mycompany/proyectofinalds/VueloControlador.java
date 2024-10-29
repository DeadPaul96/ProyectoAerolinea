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
public class VueloControlador {
   private static final String FILE_NAME = "vuelo.dat";
   private List<Vuelo> vuelo;

   public VueloControlador() {
        vuelo = new ArrayList<>();
        cargarDatos();
   }

    // Crear
    public void agregarVuelo(Vuelo persona) {
        vuelo.add(persona);
        guardarDatos();
    }

    // Leer
    public List<Vuelo> obtenerVuelos() {
        return vuelo;
    }

    // Actualizar
    public void actualizarVuelo(int index, Vuelo nuevaVuelo) {
        if (index >= 0 && index < vuelo.size()) {
            vuelo.set(index, nuevaVuelo);
            guardarDatos();
        } else {
            System.out.println("Índice no válido");
        }
    }

    // Borrar
    public void borrarVuelo(int index) {
        if (index >= 0 && index < vuelo.size()) {
            vuelo.remove(index);
            guardarDatos();
        } else {
            System.out.println("Índice no válido");
        }
    }

    private void cargarDatos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            vuelo = (List<Vuelo>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado, se creará uno nuevo.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void guardarDatos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(vuelo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
