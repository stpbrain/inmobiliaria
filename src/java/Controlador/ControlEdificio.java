/*
 * To change this license header, choose License Headers in Project Properties.
 * To change t
his template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DB.Conexion;
import Modelo.Comuna;
import Modelo.Edificio;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author papalominos
 */
public class ControlEdificio {
    
    public ArrayList ObtererComuna()
    {
     ArrayList<Comuna> com = new ArrayList<Comuna>();
        try {
                    Conexion conn = new Conexion();
            Connection conexion = conn.getConnection("inmobiliaria");
            Statement stms = conexion.createStatement();
            
            String comunas = "SELECT ID_COMUNA,DESCRIPCION FROM tb_comuna;";
            
             ResultSet rs = stms.executeQuery(comunas);
             
             while(rs.next())
             {
                 Comuna c = new Comuna();
                 c.setId(rs.getInt("ID_COMUNA"));
                 c.setN_comuna(rs.getString("DESCRIPCION"));
                 com.add(c);
             }
             return com;
            
        } catch (Exception e) {
            e.getStackTrace();
            return com;
        }
    }
    
    public boolean InsertarEdificio(Edificio ed)
    {
        try {
              Conexion conn = new Conexion();
            Connection conexion = conn.getConnection("inmobiliaria");
            Statement stms = conexion.createStatement();
            
       String ins = "INSERT tb_edificio VALUE ('"+ed.getId_edificio()+"','"+ed.getN_edifico()+"','"+ed.getDireccion()+"',"+ed.getId_comuna()+","+ed.getPosee_permiso()+");";
            
             stms.executeUpdate(ins);
           
            
            System.out.println("esta es la query =>"+ins);
            return true;
        } catch (Exception e) {
            e.getStackTrace();
            return false;
        }
    }
}
