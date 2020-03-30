
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
    
    @Override
    public void EstadoCuenta(){
        if(Aporte>0){
            JOptionPane.showMessageDialog(null, "Su estado de cuenat es: Activo");
        }else{
             JOptionPane.showMessageDialog(null, "Su estado de cuenat es: Inactivo");
        }
    }
}
