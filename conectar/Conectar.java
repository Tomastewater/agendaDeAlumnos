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

    public static final String URL = "jdbc:mysql://localhost/agenda";     //pruebajava es el nombre de la base de datos
    public static final String USER = "prueba";
    public static final String CLAVE = "1234";
    
    public Connection getConexion(){
        
        Connection con = null;    // iniciamos un objeto sin nigun valor usando null, o sea un objeto vacio.
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USER, CLAVE);
        } catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERROR DE CONEXION", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return con;
    }
        
}
