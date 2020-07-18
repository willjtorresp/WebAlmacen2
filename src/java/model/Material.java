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
public class Material implements Serializable{
    private int id_material;
    private String descripcion;
    private String UMD;
    private int id_categoria;
    private int id_entrada;

    public Material() {
        this.id_material = 0;
        this.descripcion = "";
        this.UMD = "";
        this.id_categoria = 0;
        this.id_entrada = 0;
    }

    public Material(int id_material, String descripcion, String UMD, int id_categoria, int id_entrada) {
        this.id_material = id_material;
        this.descripcion = descripcion;
        this.UMD = UMD;
        this.id_categoria = id_categoria;
        this.id_entrada = id_entrada;
    }

    public int getId_material() {
        return id_material;
    }

    public void setId_material(int id_material) {
        this.id_material = id_material;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUMD() {
        return UMD;
    }

    public void setUMD(String UMD) {
        this.UMD = UMD;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public int getId_entrada() {
        return id_entrada;
    }

    public void setId_entrada(int id_entrada) {
        this.id_entrada = id_entrada;
    }

    public String getMaterial() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setUMB(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
