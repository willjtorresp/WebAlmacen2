/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Material;

/**
 *
 * @author wtorr_000
 */
public class MaterialDao {
    public static boolean registrar(Material cat){
        try {
            String SQL="INSERT INTO material(descripcion, umb) VALUES(?, ?);";
            Connection con=conexion.conectar();
            PreparedStatement st=con.prepareStatement(SQL);
            st.setString(1, cat.getDescripcion());
            //st.setString(2, cat.getUMB());
            if(st.executeUpdate()>0){
                return true;
            }else{
                return false;
            }
        } catch (SQLException ex) {
            return false;
        }
        
    }
    
    public static ArrayList<Material> listar(){
        try {
            String SQL="SELECT * FROM material;";
            Connection con=conexion.conectar();
            PreparedStatement st=con.prepareStatement(SQL);
            //st.setString(1, cat.getCategoria());
            ResultSet resultado=st.executeQuery();
            ArrayList<Material> lista=null;
            Material cat;
            while(resultado.next()){
                cat=new Material();
                cat.setId_material(resultado.getInt("Id_material"));
                cat.setDescripcion(resultado.getString("descripcion"));
                cat.setUMB(resultado.getString("UMB"));
                lista.add(cat);                
            }
            return lista;
        } catch (SQLException ex) {
            return null;
        }
        
    }
    
}
    
