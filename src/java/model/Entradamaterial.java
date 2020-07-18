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
public class Entradamaterial implements Serializable{
    private int id_entrada;
    private String fecha_entrada;
    private int cantidad;
    private int id_material;

    public Entradamaterial() {
         this.id_entrada = 0;
        this.fecha_entrada = "";
        this.cantidad = 0;
        this.id_material = 0;
    }
    
    

    public Entradamaterial(int id_entrada, String fecha_entrada, int cantidad, int id_material) {
        this.id_entrada = id_entrada;
        this.fecha_entrada = fecha_entrada;
        this.cantidad = cantidad;
        this.id_material = id_material;
    }

    public int getId_entrada() {
        return id_entrada;
    }

    public void setId_entrada(int id_entrada) {
        this.id_entrada = id_entrada;
    }

    public String getFecha_entrada() {
        return fecha_entrada;
    }

    public void setFecha_entrada(String fecha_entrada) {
        this.fecha_entrada = fecha_entrada;
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
