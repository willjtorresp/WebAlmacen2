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
import model.Rol;

/**
 *
 * @author wtorr_000
 */
public class RolDao {
    public static boolean registrar(Rol cat){
        try {
            String SQL="INSERT INTO rol(rol) VALUES(?);";
            Connection con=conexion.conectar();
            PreparedStatement st=con.prepareStatement(SQL);
            st.setString(1, cat.getRol());
            if(st.executeUpdate()>0){
                return true;
            }else{
                return false;
            }
        } catch (SQLException ex) {
            return false;
        }
        
    }
    
    public static ArrayList<Rol> listar(){
        try {
            String SQL="SELECT * FROM rol;";
            Connection con=conexion.conectar();
            PreparedStatement st=con.prepareStatement(SQL);
            //st.setString(1, cat.getCategoria());
            ResultSet resultado=st.executeQuery();
            ArrayList<Rol> lista=null;
            Rol cat;
            while(resultado.next()){
                cat=new Rol();
                cat.setId_rol(resultado.getInt("Id_rol"));
                cat.setRol(resultado.getString("rol"));
                lista.add(cat);                
            }
            return lista;
        } catch (SQLException ex) {
            return null;
        }
        
    }
    
}
