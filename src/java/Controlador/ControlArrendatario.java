/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DB.Conexion;
import Modelo.Departamento;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created on : 20-nov-2017, 21:51:07
 *  Author     : Kathy
 */
public class ControlArrendatario {
     public boolean permisoMunicipal(String numEdificio){
        try {
            Conexion conn = new Conexion();
            Connection conexion = conn.getConnection("inmobiliaria");
            Statement stmt = conexion.createStatement();
            
            String consulta = "SELECT posee_perm_mun FROM tb_edificio "
                    + "WHERE id_edificio = " + numEdificio +";";
            
            stmt.executeUpdate(consulta);
            
            int temporal = stmt.executeUpdate(consulta);
             if (temporal != 0)
                 return true;
             else{
                System.out.println("El edificio no cuenta con los permisos municipales necesarios para arrendar.");
                return false;
             }
        } catch (Exception e) {
            e.getStackTrace();
            return false;
        }
    }
    
    public boolean buscarEdificio(String numEdificio){
         try {
            Conexion conn = new Conexion();
            Connection conexion = conn.getConnection("inmobiliaria");
            Statement stmt = conexion.createStatement();
            
            String consulta = "SELECT id_edificio FROM tb_edificio "
                    + "WHERE id_edificio = " + numEdificio + ";";
            
            stmt.executeUpdate(consulta);
            
            int temporal = stmt.executeUpdate(consulta);
             if (temporal != 0)
                 return true;
             else{
                System.out.println("El ID de edificio no está registrado");
                return false;
             }
        } catch (Exception e) {
            e.getStackTrace();
            return false;
        }
    }
    
    public ArrayList ListarEdificios(int idDpto)
    {
        ArrayList<Departamento> listaDepto = new ArrayList<Departamento>();
        try {
            Conexion conn = new Conexion();
            Connection conexion = conn.getConnection("inmobiliaria");
            Statement stms = conexion.createStatement();
            
            
            String listar = "SELECT id_departamento, id_edificio, numero, residente, FROM tb_departamento WHERE id_departamento = "+ idDpto +"; ";
            
             ResultSet rs = stms.executeQuery(listar);
             
             while(rs.next())
             {
                 Departamento dpto = new Departamento();
                 
                 dpto.setId_departamento(rs.getInt("id_departamento"));
                 dpto.setId_edificio(rs.getString("id_edificio"));
                 dpto.setNumero_d(rs.getInt("numero"));
                 dpto.setResidente(rs.getString("residente"));
                 
                 listaDepto.add(dpto);
             }
             return listaDepto;
            
        } catch (Exception e) {
            e.getStackTrace();
            return listaDepto;
        }
    }
    
    
}
