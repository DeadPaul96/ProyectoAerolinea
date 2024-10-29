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
public class TiketsController {
 
   private static final String FILE_NAME = "tikets.dat";
   private List<Tikets> tikets;

   public TiketsController() {
        tikets = new ArrayList<>();
        cargarDatos();
   }

    // Crear
    public void agregarTikets(Tikets persona) {
        tikets.add(persona);
        guardarDatos();
    }

    // Leer
    public List<Tikets> obtenerTiketss() {
        return tikets;
    }

    // Actualizar
    public void actualizarTikets(int index, Tikets nuevaTikets) {
        if (index >= 0 && index < tikets.size()) {
            tikets.set(index, nuevaTikets);
            guardarDatos();
        } else {
            System.out.println("Índice no válido");
        }
    }

    // Borrar
    public void borrarTikets(int index) {
        if (index >= 0 && index < tikets.size()) {
            tikets.remove(index);
            guardarDatos();
        } else {
            System.out.println("Índice no válido");
        }
    }

    private void cargarDatos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            tikets = (List<Tikets>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado, se creará uno nuevo.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void guardarDatos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(tikets);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
    

