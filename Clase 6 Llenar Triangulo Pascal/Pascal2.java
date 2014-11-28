/**
 * @(#)Pascal2.java
 *
 *
 * @author
 * @version 1.00 2014/11/27
 */

public class Pascal2 {

	private int tpascal[][];
    /**
     * Creates a new instance of <code>Pascal2</code>.
     */
    public Pascal2(int espacio) {
    	tpascal = new int[espacio][espacio];
    	tpascal[1][1] = 1;
tpascal[0][0] = 1;
tpascal[1][0] = 1;
    	for(int i=2; i<tpascal.length; i++)
    	{
 			for(int j=0; j<tpascal.length;j++)
 			{
			if((j-1)<0){
			tpascal[i][j]=1;
			}else{

    		tpascal[i][j]=tpascal[i-1][j-1] + tpascal[i-1][j];
			}	}




    	}
    }

    public void print(){
    	for(int i=0; i<tpascal.length; i++)
    	{
 			for(int j=0; j<tpascal.length;j++)
 			{
 				System.out.print(tpascal[i][j] + " " );
    }System.out.println("");
    }}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pascal2 triangulo;
        triangulo = new Pascal2(5);
        triangulo.print();

    }
}
