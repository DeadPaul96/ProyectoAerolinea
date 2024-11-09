/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinalds;

/**
 *
 * @author jeanz
 */
public class Destino {
    private String pais;
    private String ubicacion;
    private int diasponible;
    
    public Destino (String pais)
    {
        this.diasponible = diasponible;
        this.pais = pais;
        this.ubicacion = ubicacion;
    }

    /**
     * @return the pais
     */
    public String getPais() {
        return pais;
    }

    /**
     * @return the ubicacion
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * @return the diasponible
     */
    public int getDiasponible() {
        return diasponible;
    }

    /**
     * @param pais the pais to set
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * @param ubicacion the ubicacion to set
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    /**
     * @param diasponible the diasponible to set
     */
    public void setDiasponible(int diasponible) {
        this.diasponible = diasponible;
    }
    
    
}   
