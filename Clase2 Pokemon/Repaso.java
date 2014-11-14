/**
 * @(#)Repaso.java
 *
 *
 * @author
 * @version 1.00 2014/11/13
 */
import java.util.Scanner;
public class Repaso {

    /**
     * Creates a new instance of <code>Repaso</code>.
     */
    public Repaso() {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Ingrese su nombre:");
        String s;
        Scanner entrada;
        entrada = new Scanner(System.in);
        s=entrada.Nextline();
        System.out.println(s);
    }
}
