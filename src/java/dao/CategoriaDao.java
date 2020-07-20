/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import controller.EntradaMaterialControl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Categoria;

/**
 *
 * @author wtorr_000
 */
public class CategoriaDao {
    public static boolean registrar(Categoria cat){
        try {
            String SQL="INSERT INTO categoria(categoria) VALUES(?);";
            Connection con=conexion.conectar();
            PreparedStatement st=con.prepareStatement(SQL);
            st.setString(1, cat.getCategoria());
            if(st.executeUpdate()>0){
                return true;
            }else{
                return false;
            }
        } catch (SQLException ex) {
            return false;
        }
        
    }
    
    public static ArrayList<Categoria> listar(){
        try {
            String SQL="SELECT * FROM categoria;";
            Connection con=conexion.conectar();
            PreparedStatement st=con.prepareStatement(SQL);
            //st.setString(1, cat.getCategoria());
            ResultSet resultado=st.executeQuery();
            ArrayList<Categoria> lista=null;
            Categoria cat;
            while(resultado.next()){
                cat=new Categoria();
                cat.setId_categoria(resultado.getInt("Id_categoria"));
                cat.setCategoria(resultado.getString("categoria"));
                lista.add(cat);                
            }
            return lista;
        } catch (SQLException ex) {
            return null;
        }
        
    }

    public static boolean registrar(EntradaMaterialControl c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
