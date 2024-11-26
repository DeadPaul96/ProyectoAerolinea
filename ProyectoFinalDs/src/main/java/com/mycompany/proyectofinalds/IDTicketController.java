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
public class IDTicketController {
        
    private static final String FILE_NAME = "idticket.dat";
    private List<IDTicket> idticket;

    public IDTicketController()
    {
       idticket = new ArrayList<>();
       cargarDatos();
    }

    // Crear
    public void agregaridticket(IDTicket idtickets) {
        idticket.add(idtickets);
        guardarDatos();
    }

    // Leer
    public List<IDTicket> obtenerIDTickets() {
        return idticket;
    }

    // Actualizar
    public void actualizarIDTicket(int index, IDTicket nuevaIDTicket) {
        if (index >= 0 && index < idticket.size()) {
            idticket.set(index, nuevaIDTicket);
            guardarDatos();
        } else {
            System.out.println("Índice no válido");
        }
    }

    // Borrar
    public void borrarIDTicket(int index) {
        if (index >= 0 && index < idticket.size()) {
            idticket.remove(index);
            guardarDatos();
        } else {
            System.out.println("Índice no válido");
        }
    }

    private void cargarDatos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            idticket = (List<IDTicket>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado, se creará uno nuevo.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void guardarDatos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(idticket);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

