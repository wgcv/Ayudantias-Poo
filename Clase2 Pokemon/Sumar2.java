/**
 * @(#)Sumar.java
 *
 *
 * @author
 * @version 1.00 2014/11/11
 */
import java.util.Scanner;
public class Sumar2 {
	private int numero1,numero2;
    /**
     * Creates a new instance of <code>Sumar</code>.
     */
    public Sumar2(int num1,int num2) {
    	this.numero1=num1;
    	this.numero2 = num2;

    }
    public int sumaObjeto(){
    	return (numero1+numero2);
    }

	public int getNumero1(){
		return numero1;
	}
		public int getNumero2(){
		return numero2;
	}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	int n1,n2;
    	Scanner entrada=new Scanner(System.in);

        System.out.println("Este programa suma 2 numeros");
        System.out.print("Ingrese un numero ");
        n1=entrada.nextInt();
        System.out.print("Ingrese otro numero ");
        n2=entrada.nextInt();
        Sumar2 suma=new Sumar2(n1,n2);
       	System.out.printf("%d+%d=%d",suma.getNumero1(),suma.getNumero2(),suma.sumaObjeto());
    }
}
