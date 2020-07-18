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
import model.Usuario;

/**
 *
 * @author wtorr_000
 */
public class UsuarioDao {
    public static boolean registrar(Usuario cat){
        try {
            String SQL="INSERT INTO usuario(docid, nombres, apellidos, correo, telefono, id_rol) VALUES(?, ?, ?, ?, ?, ?);";
            Connection con=conexion.conectar();
            PreparedStatement st=con.prepareStatement(SQL);
            st.setString(1, cat.getUsuario());
            if(st.executeUpdate()>0){
                return true;
            }else{
                return false;
            }
        } catch (SQLException ex) {
            return false;
        }
        
    }
    
    public static ArrayList<Usuario> listar(){
        try {
            String SQL="SELECT * FROM usuario;";
            Connection con=conexion.conectar();
            PreparedStatement st=con.prepareStatement(SQL);
            //st.setString(1, cat.getCategoria());
            ResultSet resultado=st.executeQuery();
            ArrayList<Usuario> lista=null;
            Usuario cat;
            while(resultado.next()){
                cat=new Usuario();
                cat.setDocid(resultado.getInt("docid"));
                cat.setNombres(resultado.getString("nombres"));
                cat.setApellidos(resultado.getString("apellidos"));
                cat.setCorreo(resultado.getString("correo"));
                cat.setTelefono(resultado.getString("telefono"));
                cat.setId_rol(resultado.getString("id_rol"));
                lista.add(cat);                
            }
            return lista;
        } catch (SQLException ex) {
            return null;
        }
        
    }
    
}
