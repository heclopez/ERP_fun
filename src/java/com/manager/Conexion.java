/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.manager;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Lenovo
 */
public class Conexion {
    Connection conectar = null;
    
    String usuario="postgres";
    String contrasenia="2502";//<--Esta es mi contraseña
    String bd="HotelAnaSofi";
    String ip="localhost";
    String puerto="5432";
    
    String cadena="jdbc:postgresql://"+ip+":"+puerto+"/"+bd;
    
    public Connection establecerConexion(){
        try{
            Class.forName("org.postgresql.Driver");
            
            conectar=DriverManager.getConnection(cadena,usuario,contrasenia);
            //JOptionPane.showMessageDialog(null,"Se conecto correctamente a la base de datos ");
            //System.console()instanceof 
        }catch(Exception e){
            //JOptionPane.showMessageDialog(null,"ERROR"+e.toString());
        }
        return conectar;
    }

}
