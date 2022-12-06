/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.pets.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Este método conecta con la base de datos veterinariadb por medio del conector.
 *  la base de datos conectada
 */

public class Conexion {
    /**
     * Obtiene la conexión hacia MySQL a la base de datos
     * @return la conexión entre la base de datos y el proyecto
     */
    public static Connection obtener(){
        Connection conexion =null;
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/veterinariadb?user=root&password=root");
        } catch (Exception ex){
            System.err.println("Ocurrió un error: " + ex.getMessage());
        }
        return conexion;
    }
    
}
