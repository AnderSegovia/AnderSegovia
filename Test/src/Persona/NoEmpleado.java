
package Persona;

import javax.swing.JOptionPane;

public class NoEmpleado extends Usuario {
    public double Aporte;

    public NoEmpleado(String EstadoCuenta,int NumeroCuenta) {
        super(EstadoCuenta,NumeroCuenta);
    }
    
    @Override
    public void Aporte(){
        JOptionPane.showMessageDialog(null, "Su numero de cuenta: "+NumeroCuenta);
        Aporte=Double.parseDouble(JOptionPane.showInputDialog("Cuanto desea agregar a su cuenta: "));
        JOptionPane.showMessageDialog(null, "Ah aportado: "+Aporte+" a su cuenta");
    }
    
    
}
