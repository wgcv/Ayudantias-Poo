/**
 * @(#)Ejecuta.java
 *
 *
 * @author
 * @version 1.00 2015/2/3
 */

public class Ejecuta {

    /**
     * Creates a new instance of <code>Ejecuta</code>.
     */
    public Ejecuta() {

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        	Avion a1 = new Avion();
        a1.avanzar(5);
		a1.avanzar(10);
		a1.frenarAvion(8);
		a1.frenarAvion(7);
    }
}
