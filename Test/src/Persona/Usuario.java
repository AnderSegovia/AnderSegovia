
package Persona;

import javax.swing.JOptionPane;


public class Usuario {
     public int NumeroCuenta;
     public String EstadoCuenta;
    public Usuario(String Estado,int Numero) {
        this.NumeroCuenta = Numero;
        this.EstadoCuenta=Estado;
    }
     //dejar metodo vacio en la clase padre y poder ser reescrito de acuerod a los datos en as clses hijas
   public void Aporte(){
}  
  public void EstadoCuenta(){
        JOptionPane.showMessageDialog(null, "Su estado de cuenat es: "+EstadoCuenta);
  }
}
