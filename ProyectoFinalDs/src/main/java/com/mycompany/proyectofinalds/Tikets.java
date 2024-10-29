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
public class Tikets {
    private float precio; 
    private LocalDateTime fechaSalida;
    private int idTiket;
    
    public Tikets (float precio,LocalDateTime fechaSalida,int idTiket )
    {
        this.idTiket = idTiket;
        this.precio = precio;
    
    }

    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @return the idTiket
     */
    public int getIdTiket() {
        return idTiket;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * @param idTiket the idTiket to set
     */
    public void setIdTiket(int idTiket) {
        this.idTiket = idTiket;
    }
    
}
