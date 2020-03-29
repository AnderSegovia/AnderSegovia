
package ejemplo.pkg2.datos.por.joptionpane;

import javax.swing.JOptionPane;

/**
 *
 * @author Ander
 */
public class Ejemplo2DatosPorJoptionPane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String  cadena;
        int entero;
        double decimal;
        float de3;
        char letra;
        
        cadena= JOptionPane.showInputDialog("ingrese una cadena");
        entero= Integer.parseInt(JOptionPane.showInputDialog("ingrese un entero"));
        letra = JOptionPane.showInputDialog("inegrese una letra").charAt(0);
        decimal= Double.parseDouble(JOptionPane.showInputDialog("ingrese numero con decimal"));
        de3= Float.parseFloat(JOptionPane.showInputDialog("ingrese los caracteres "));
        //salida de datos
        JOptionPane.showMessageDialog(null, "la cadena es: "+cadena);
        JOptionPane.showMessageDialog(null, "el entero es: "+entero );
        JOptionPane.showMessageDialog(null, "la letra es "+letra);
        JOptionPane.showMessageDialog(null, "el doble es "+decimal);
        JOptionPane.showMessageDialog(null, "elflotante es"+de3);
        
          
        
    }
    
}
