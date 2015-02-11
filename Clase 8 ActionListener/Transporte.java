/**
 * @(#)Transporte.java
 *
 *
 * @author
 * @version 1.00 2015/2/3
 */

public class Transporte {
        protected int capacidad;
        protected double velocidad;
        protected String modelo;

    /**
     * Creates a new instance of <code>Transporte</code>.
     */
     public Transporte(){
     	capacidad =4;
     	modelo="";

     }
    public Transporte(int capacidad, String modelo) {
    	this.capacidad = capacidad;
    	this.modelo = modelo;
    	velocidad=0;
    }
    public void avanzar(double velocidad){
    	this.velocidad = this.velocidad+velocidad;
    	System.out.print("Se esta avanzando con una velocidad de: "+this.velocidad);

    }
    public boolean frenar(double velocidadfrenado){
    	this.velocidad=this.velocidad-velocidadfrenado;
    	System.out.println("Su velocidad es: "+ this.velocidad);
    	if(this.velocidad==0){
    		return true;
    	}else

    	{
    		return false;
    	}
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
