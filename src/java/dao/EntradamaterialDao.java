/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import controller.EntradaControl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Entradamaterial;

/**
 *
 * @author wtorr_000
 */
public class EntradamaterialDao {
        public static boolean registrar(Entradamaterial ent){
        try {
            String SQL="INSERT INTO entradamaterial(fecha_entrada) VALUES(?,?,?,?);";
            Connection con=conexion.conectar();
            PreparedStatement st=con.prepareStatement(SQL);
            st.setInt(1, ent.getId_entrada());
            st.setString(2, ent.getFecha_entrada());
            st.setInt(3, ent.getCantidad());
            st.setInt(4, ent.getId_material());
            if(st.executeUpdate()>0){
                return true;
            }else{
                return false;
            }
        } catch (SQLException ex) {
            return false;
        }
        
    }
    
    public static ArrayList<Entradamaterial> listar(){
        try {
            String SQL="SELECT * FROM entradamaterial";
            Connection con=conexion.conectar();
            PreparedStatement st=con.prepareStatement(SQL);
            //st.setString(1, cat.getCategoria());
            ResultSet resultado=st.executeQuery();
            ArrayList<Entradamaterial> lista=null;
            Entradamaterial cat;
            while(resultado.next()){
                cat=new Entradamaterial();
                cat.setId_entrada(resultado.getInt("id_entrada"));
                cat.setFecha_entrada(resultado.getString("fecha_entrada"));
                cat.setCantidad(resultado.getInt("cantidad"));
                cat.setId_material(resultado.getInt("id_material"));
                lista.add(cat);                
            }
            return lista;
        } catch (SQLException ex) {
            return null;
        }
        
    }
  //public static boolean registrar(EntradaControl e) {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }   
//}
    
