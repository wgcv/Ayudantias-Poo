/**
 * @(#)Avion.java
 *
 *
 * @author
 * @version 1.00 2015/2/3
 */

public class Avion extends Transporte {

  private int numTurbinas;

    public Avion() {
    	super();
    	this.numTurbinas=2;
    }
 public Avion(int numTurbinas,int capacidad,String modelo) {
 	super(capacidad,modelo);
    	this.numTurbinas=numTurbinas;
    }
public void avanzar(double velocidad){
	super.avanzar(velocidad);
	System.out.println(" Volando millas por hora");
}
public void frenarAvion(double velocidad){
	if (super.frenar(velocidad) == true){
		System.out.println("El avion aterrizo");
	}

}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
