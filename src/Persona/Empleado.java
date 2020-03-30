
package Persona;

import javax.swing.JOptionPane;

public class Empleado extends Usuario{
    public double Aporte;
    public double AporteeEmpledor;
    public double Sueldo;

    public Empleado(String EstadoCuenta,double sueldo, int NuemeroCuenta,double aporte) {
        super(EstadoCuenta,NuemeroCuenta);
        this.Sueldo=sueldo;
        this.AporteeEmpledor=aporte;
    }
    //suponer que es el 3% de su sueldo
    @Override
    public void Aporte(){
       Aporte=Sueldo*0.03;
       JOptionPane.showMessageDialog(null, "Numero de cuenra: "+NumeroCuenta);
       JOptionPane.showMessageDialog(null, "El aporte de su empleador es de: "+AporteeEmpledor);
        JOptionPane.showMessageDialog(null, "Aporte total mensual: $"+Aporte+AporteeEmpledor);
    }
    
}
