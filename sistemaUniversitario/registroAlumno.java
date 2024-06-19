/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaUniversitario;

import java.awt.Color;
import java.awt.Panel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author tomas
 */
public class registroAlumno {

    public static Registro registro;
    
    public static void main(String[] args) {
        
        registro = new Registro();
        registro.setVisible(true);
        registro.setBounds(0, 0, 690, 600);
        registro.setResizable(false);
        registro.setLayout(null);
        registro.setLocationRelativeTo(null);

        
        
    }
    
}
