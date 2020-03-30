
package Afliados;

import javax.swing.JOptionPane;

public class MayorEdad extends Afiliar {
    public float NumeroDui;
    public float NumeroNIE;

    public MayorEdad(String Nombre,float NumeroDui, float NumeroNIE, float CarnetISSS, float CarnetINPEP) {
        super(Nombre, CarnetISSS, CarnetINPEP);
        this.NumeroDui = NumeroDui;
        this.NumeroNIE = NumeroNIE;
    }


    @Override
    public void MostrarDatos(){
       JOptionPane.showMessageDialog(null, "Su informacion\n"+"Nombre: "+Nombre
        +"\nCarnet ISSS: "+CarnetISSS
        +"\nCarnet INPEP: "+CarnetINPEP
               + " \nNumero de Diu: "+NumeroDui
       +"\nNumero de Nie: "+NumeroNIE);
       JOptionPane.showMessageDialog(null, "Te has afiliado con exito "+Nombre);
    }
}
