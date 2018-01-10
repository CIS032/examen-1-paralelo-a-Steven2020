/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package david_pacheco_3a;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showInputDialog;

/**
 *
 * @author DAVID
 */
public class David_Pacheco_3A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         int opcion = 0;
        while (opcion != 4){
            String menu = "1. Crear Cuenta ahorro  \n 2. Crear Cuenta Prestamo \n 3. Crear Cuenta Hipoteca \n 4. Salir"; 
            opcion = Integer.parseInt(showInputDialog(
                    null,menu, "Movimientos de Figuras",JOptionPane.QUESTION_MESSAGE));
            switch (opcion){
                case 1:
                    String cliente= showInputDialog(null, "Ingrese el nombre cliente", "Cuenta Ahorro");
                    String tipoCliente = showInputDialog(null, "Igrese el tipo de cliente (empresa)-(persona)", "Cuenta Ahorro");
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                   
                    break;
                   
            }
        
        }
    }
    
}
