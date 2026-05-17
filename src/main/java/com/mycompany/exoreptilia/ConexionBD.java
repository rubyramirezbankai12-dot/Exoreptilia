/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exoreptilia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author diana
 */
public class ConexionBD {
    private static final String URL = "jdbc:mysql://localhost:3306/Exoreptilia";
    private static final String USER = "root";
    private static final String PASSWORD = "123456";
    
    public static Connection conectar(){
        Connection conexion = null;
        
        try{
            conexion = DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("Conexion exitosa");
        }catch(SQLException e){
            System.out.println("Error de conexion: " +  e.getMessage());
            
        }
        return conexion;        
    }
}
