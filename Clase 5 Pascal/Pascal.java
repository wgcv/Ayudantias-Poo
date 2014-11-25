/**
 * @(#)Pascal.java
 *
 *
 * @author
 * @version 1.00 2014/11/25
 */

public class Pascal {
   int[ ][ ] triangulo;
    /**
     * Creates a new instance of <code>Pascal</code>.
     */
    public Pascal(int i) {
    	triangulo = new int[i][i];
			triangulo[0][0]=1;
			triangulo[1][0]=1;
			triangulo[1][1]=1;
			triangulo[2][0]=1;
			triangulo[2][1]=2;
			triangulo[2][2]=1;

    }
///[n-1][n-1]+[n-1][n]


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pascal p = new Pascal(5);
for (int i = 0; i < p.triangulo.length; i++) {
	for (int j = 0; j < p.triangulo.length; j++) {
      System.out.print(p.triangulo[i][j]+" "); //se muestra cada elemento del array
	}
	System.out.println("");

    }
    }
}
