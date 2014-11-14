import java.util.Scanner;

public class Potencia {
	private double coe;
	private int exp;


    public Potencia() {
    set(0,0);
    }

    public Potencia(double coe,int exp){
    	this.coe=coe;
    	this.exp=(coe==0&&exp<0)?0:exp;
    }
    public double evaluar(){
    	double r=1;
    	for(int i=0;i<(exp<0?-exp:exp);i++)
    		r*=coe;
    		r=(exp<0)?1/r:r;
    		return r;
    }
    public void print(){
    	System.out.println("Potencia= "+coe+"^"+exp);
    }
    public Potencia multiplicar(Potencia X){
    	Potencia tmp=new Potencia();
    	tmp.coe=(coe==X.coe)?coe:(exp==X.exp?coe*X.coe:evaluar()*X.evaluar());
    	tmp.exp=(coe==X.coe)?exp+X.exp:(exp==X.exp?exp:1);
    	return tmp;
    		/*if(coe==X.coe)
    		 {tmp=coe*X.coe;
    		 tmp.exp=exp;
    		 	}
    		 	else
    		 if(exp==X.exp)
    		 {tmp=coe*X.coe;
    		 tmp.exp=exp;
    		 	}
    		 else
    		 {tmp=evaluar()*X.evaluar();
    		  tmp.exp=1;
    		 	}*/
    }
    public Potencia sumar(Potencia X){
    	return(new Potencia(evaluar()+X.evaluar(),1));

    	/*Potencia tmp=new Potencia(evaluar()+X.evaluar(),1);
    	return tmp;*/

    	/*Potencia tmp=new Potencia();
    	 tmp.coe=evaluar()+X.evaluar();
    	 tmp.exp=1;
    	 return tmp;*/
    }

 public void set (double coe, int exp)
   {
   this.coe=coe;
   this.exp=(coe==0&&exp<0)?0:exp;
   }
    public static void main(String[] args) {
        // TODO code application logic here
	Scanner entrada = new Scanner(System.in);
	int n1,n2;
	System.out.println("Ingrese la base");
	n1= entrada.nextInt();
	System.out.println("Ingrese el exponente");
	n2= entrada.nextInt();
    Potencia a= new Potencia(n1,n2);

    a.print();
    System.out.println(a.evaluar());
    }
}
