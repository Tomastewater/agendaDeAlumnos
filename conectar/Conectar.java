/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conectar;

/**
 *
 * @author tomas
 */
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conectar {

    public static final String URL = "jdbc:mysql://localhost/agendappi2";     //agendappi2 es el nombre de la base de datos
    public static final String USER = "prueba";       
    public static final String CLAVE = "";        // No tiene clave
    
    /**
     * Funcion que hace conexion a la base de datos, sin esta funcion no puedes acceder a ella.
     * @return 
     */
    public Connection getConexion(){
        
        Connection con = null;    // iniciamos un objeto sin nigun valor usando null, o sea un objeto vacio, esperando a que
                                  // si se conecta satisfactoriamente a la base de datos entonces la conexion sera positiva, de otro modo sera denegada
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USER, CLAVE);   // conexion positiva, se guarda en con
        } catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERROR DE CONEXION", "ERROR", JOptionPane.ERROR_MESSAGE);  // alerta si hubo un error de conexion, Revisa el usuario o la clave en tu gestor de base de datos
        }
        return con;
    }
        
}
