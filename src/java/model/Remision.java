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
public class Remision implements Serializable{
    private int id_remision;
    private int responsable;
    private int reseptor;
    private int precio;
    private String fecha;

    public Remision() {
        this.id_remision = 0;
        this.responsable = 0;
        this.reseptor = 0;
        this.precio = 0;
        this.fecha = "";
    }

    public Remision(int id_remision, int responsable, int reseptor, int precio, String fecha) {
        this.id_remision = id_remision;
        this.responsable = responsable;
        this.reseptor = reseptor;
        this.precio = precio;
        this.fecha = fecha;
    }

    public int getId_remision() {
        return id_remision;
    }

    public void setId_remision(int id_remision) {
        this.id_remision = id_remision;
    }

    public int getResponsable() {
        return responsable;
    }

    public void setResponsable(int responsable) {
        this.responsable = responsable;
    }

    public int getReseptor() {
        return reseptor;
    }

    public void setReseptor(int reseptor) {
        this.reseptor = reseptor;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    
}
