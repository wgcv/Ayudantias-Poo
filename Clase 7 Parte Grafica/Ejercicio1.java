/**
 * @(#)Ejercicio1.java
 *
 *
 * @author
 * @version 1.00 2015/1/29
 */
 //Importamos la libreria JAVAX SWING
import javax.swing.*;
public class Ejercicio1 extends JFrame {

    /**
     * Creates a new instance of <code>Ejercicio1</code>.
     */
    public Ejercicio1() {
    	 //Llamamos al constructor padre y le asignamos un titulo
    	super("Ventana con JFRAME...");
		//Le damos un tamaño a la ventana
		this.setSize(600,400);
		//Hacemos que se cierre con la ejecucion la ventana
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //-- HACEMOS QUE SE INICIALIZE NUESTRA VENTANA JFRAME

		Ventana a = new Ventana();

		//-- HACEMOS QUE NUESTRA VENTANA SE VISIBLE
		a.setVisible(true);
    }
}
