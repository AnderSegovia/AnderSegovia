
package Afliados;
public class Afiliar {
    protected String Nombre;
    protected float CarnetISSS;
    protected float CarnetINPEP;

    public Afiliar(String nombre, float CarnetISSS, float CarnetINPEP) {
        this.CarnetISSS = CarnetISSS;
        this.Nombre=nombre;
        this.CarnetINPEP = CarnetINPEP;
    }
    //dejo metdos vacios para resscribirlos en las clases hijas de acuerdo a cada dato
    public void IngresarDatos(){
    }
    public void MostrarDatos(){
    }
}
