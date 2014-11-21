
/**
 * @(#)Ahorcado.java
 *
 *
 * @author
 * @version 1.00 2014/11/20
 */
import java.util.Scanner;

public class Ahorcado {

    private int fallos;
    private String palabra;
    private String letrasFalladas;
    private String letrasAcertadas;
    /**
     * Creates a new instance of <code>Ahorcado</code>.
     */
    public Ahorcado() {
        fallos = 0;
        palabra = "holaa";
        letrasFalladas = "";
        letrasAcertadas ="";
    }

    public int contarPalabra() {
        return this.palabra.length();
    }

    public boolean estaLetra(char c) {
        String nuevaPalabra = "";
        for (int x = 0; x < this.contarPalabra(); x = x + 1) {
            if ((palabra.charAt(x) == c)) {
                palabra.charAt(x);
                letrasAcertadas = letrasAcertadas + " " + palabra.charAt(x);

            } else {
                nuevaPalabra = nuevaPalabra + palabra.charAt(x);
            }
        }
        if (nuevaPalabra.equals(palabra)) {
            fallos++;
            letrasFalladas = letrasFalladas + " " + c;
            return false;
        } else {
            this.palabra = nuevaPalabra;
            return true;
        }
    }
public void printRayas(){
   
         System.out.println("Le faltan: " + contarPalabra() + " Letras");
          System.out.println("Las letras acertadas son " + letrasAcertadas);
            System.out.println("Las letras falladas son " + letrasFalladas);
            
}
    public int getfallos() {
        return fallos;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ahorcado i = new Ahorcado();
        Scanner entrada = new Scanner(System.in);
        char letra = 'a';
        while (!(i.palabra.length() == 0) && (i.getfallos() < 5)) {
            letra = entrada.next().charAt(0);
            if (i.estaLetra(letra)) {
                System.out.println("Le acerto");
            } else {
                System.out.println("Fallo");
            }

       i.printRayas();

        }
       
        if (i.contarPalabra() == 0) {
            System.out.println("G A N A S T E ");
        } else {
            System.out.println("PERDISTE :c");
        }
        

    }

}
