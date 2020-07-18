/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author wtorr_000
 */
public class Salidamaterial implements Serializable{
    private int id_salida;
    private int id_remision;
    private int cantidad;
    private int id_material;

    public Salidamaterial() {
        this.id_salida = 0;
        this.id_remision = 0;
        this.cantidad = 0;
        this.id_material = 0;
    }

    public Salidamaterial(int id_salida, int id_remision, int cantidad, int id_material) {
        this.id_salida = id_salida;
        this.id_remision = id_remision;
        this.cantidad = cantidad;
        this.id_material = id_material;
    }

    public int getId_salida() {
        return id_salida;
    }

    public void setId_salida(int id_salida) {
        this.id_salida = id_salida;
    }

    public int getId_remision() {
        return id_remision;
    }

    public void setId_remision(int id_remision) {
        this.id_remision = id_remision;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getId_material() {
        return id_material;
    }

    public void setId_material(int id_material) {
        this.id_material = id_material;
    }
    
    
}
