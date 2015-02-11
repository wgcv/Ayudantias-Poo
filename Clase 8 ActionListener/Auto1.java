/**
 * @(#)Auto.java
 *
 *
 * @author
 * @version 1.00 2015/2/3
 */

public class Auto extends Transporte{
        private String color;
        private int puertas;
    /**
     * Creates a new instance of <code>Auto</code>.
     */
    public Auto(String color,int puertas, int capacidad, String modelo) {
    super (capacidad,modelo);
    this.color=color;
    this.puertas = puertas;

    }
    public void info(){
    	System.out.println("Color: "+color+"Modelo: "+modelo+" Capacidad: "+super.capacidad);
    }
    public void frenarCarro(double velocidad){
    	if(super.frenar(velocidad)){
    		System.out.println("Se detuvo el carro");
    	}
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
