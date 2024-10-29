/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinalds;
import java.util.ArrayList;
import java.util.List;

/**
 * @author jeanz
 */
public class Vuelo {
    private int idVuelo;
    private List<Destino> destinos;
    private double precio;
    private int capacidad;
    private double peso;

    public Vuelo(int iD, int capacidad, double peso) {
        this.destinos = new ArrayList<>();
        this.precio = 0.0;
        this.idVuelo = iD;
        this.capacidad = capacidad;
        this.peso = peso;
    }

    public void agregarDestino(Destino destino) {
        destinos.add(destino);
    }


    public void calcularPrecio() {
        precio = destinos.size() * 150; // Precio base por destino
        System.out.println("Precio total del boleto: $" + precio);
    }

    public List<Destino> getDestinos() {
        return destinos;
    }

    public int getidVuelo() {
        return idVuelo;
    }

    public void setidVuelo(int idVuelo) {
        this.idVuelo = idVuelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}

