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
import model.Remision;

/**
 *
 * @author wtorr_000
 */
public class RemisionDao {
    public static boolean registrar(Remision cat){
        try {
            String SQL="INSERT INTO remision(responsable, receptor, precio, fecha) VALUES(?, ?, ?, ?);";
            Connection con=conexion.conectar();
            PreparedStatement st=con.prepareStatement(SQL);
            st.setString(1, cat.getRemision());
            if(st.executeUpdate()>0){
                return true;
            }else{
                return false;
            }
        } catch (SQLException ex) {
            return false;
        }
        
    }
    
    public static ArrayList<Remision> listar(){
        try {
            String SQL="SELECT * FROM remision;";
            Connection con=conexion.conectar();
            PreparedStatement st=con.prepareStatement(SQL);
            //st.setString(1, cat.getCategoria());
            ResultSet resultado=st.executeQuery();
            ArrayList<Remision> lista=null;
            Remision cat;
            while(resultado.next()){
                cat=new Remision();
                cat.setId_remision(resultado.getInt("Id_remision"));
                cat.setResponsable(resultado.getInt("responsable"));
                cat.setReseptor(resultado.getInt("receptor"));                    
                cat.setPrecio(resultado.getInt("precio"));
                cat.setFecha(resultado.getString("fecha"));
                lista.add(cat);                
            }
            return lista;
        } catch (SQLException ex) {
            return null;
        }
        
    }
    
}
