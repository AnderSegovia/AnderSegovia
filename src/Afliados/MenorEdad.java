
package Afliados;

import javax.swing.JOptionPane;

public class MenorEdad extends Afiliar{
    public float CarnetMenoridad;

    public MenorEdad(String Nombre,float CarnetMenoridad, float CarnetISSS, float CarnetINPEP) {
        super(Nombre,CarnetISSS, CarnetINPEP);
        this.CarnetMenoridad = CarnetMenoridad;
    }
    @Override
    public void MostrarDatos(){
       JOptionPane.showMessageDialog(null, "Su informacion \n"+"Nombre: "+Nombre
        +"\nCarnet ISSS: "+CarnetISSS
        +"\nCarnet INPEP: "+CarnetINPEP
               + " \nCarnet de Menoridad: "+CarnetMenoridad);
        JOptionPane.showMessageDialog(null, "Te has afiliado con exito "+Nombre);
    }
}
