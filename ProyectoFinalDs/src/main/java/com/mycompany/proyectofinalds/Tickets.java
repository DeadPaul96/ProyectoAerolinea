/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinalds;

import java.time.LocalDateTime;

/**
 *
 * @author jeanz
 */
public class Tickets {
    private float precio; 
    private LocalDateTime fechaSalida;
    private int idTiket;
    
    public Tickets(float precio,LocalDateTime fechaSalida,int idTiket )
    {
        this.idTiket = idTiket;
        this.precio = precio;
        this.fechaSalida = fechaSalida;
    }
    public float getPrecio() {
        return precio;
    }
    public int getIdTiket() {
        return idTiket;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setIdTiket(int idTiket) {
        this.idTiket = idTiket;
    } 
    public LocalDateTime getFechaSalida() {
        return fechaSalida;
    }
    public void setFechaSalida(LocalDateTime fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
}
