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
import model.Salidamaterial;

/**
 *
 * @author wtorr_000
 */
public class SalidamaterialDao {
    public static boolean registrar(Salidamaterial cat){
        try {
            String SQL="INSERT INTO salidamaterial(id_remision, cantidad, id_material) VALUES(?, ?, ?);";
            Connection con=conexion.conectar();
            PreparedStatement st=con.prepareStatement(SQL);
            st.setInt(1, cat.getSalidamaterial());
            if(st.executeUpdate()>0){
                return true;
            }else{
                return false;
            }
        } catch (SQLException ex) {
            return false;
        }
        
    }
    
    public static ArrayList<Salidamaterial> listar(){
        try {
            String SQL="SELECT * FROM Salidamaterial;";
            Connection con=conexion.conectar();
            PreparedStatement st=con.prepareStatement(SQL);
            //st.setString(1, cat.getCategoria());
            ResultSet resultado=st.executeQuery();
            ArrayList<Salidamaterial> lista=null;
            Salidamaterial cat;
            while(resultado.next()){
                cat=new Salidamaterial();
                cat.setId_salida(resultado.getInt("Id_salida"));
                cat.setId_remision(resultado.getInt("id_remision"));
                cat.setCantidad(resultado.getInt("cantidad"));
                cat.setId_material(resultado.getInt("id_material"));
                lista.add(cat);                
            }
            return lista;
        } catch (SQLException ex) {
            return null;
        }
        
    }
    
}
