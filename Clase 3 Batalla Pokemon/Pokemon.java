/**
 * @(#)Pokemon.java
 *
 *
 * @author
 * @version 1.00 2014/11/13
 */
import java.util.Scanner;
public class Pokemon {
        private int id;
        private String nombre;
        private int ataque1;
        private int ataque2;
       	private int hp;
    /**
     * Creates a new instance of <code>Pokemon</code>.
     */
    public Pokemon(int id, String nombre, int atq1, int atq2) {
    	hp=100;
    	ataque1= atq1;
    	ataque2 = atq2;
    	this.id = id;
    	this.nombre = nombre;
    }
	public String getNombre(){
		return nombre;
	}
	public void setHp(int menosvida){
		hp=hp-menosvida;
	}
	public int atacar(){
		System.out.println("Escoge un ataque 1 o ataque 2");

		Scanner entrada = new Scanner(System.in);
		if(entrada.nextInt() ==1 )
			return ataque1;
		else
			return ataque2;
	}
	public int getHp(){
		return hp;
	}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Pokemon");
        boolean turno1=true;
        Pokemon p1;
        Pokemon p2;
        p1 = new Pokemon(25,"Pikachu",35,25);
        p2 = new Pokemon (7,"squirtle",16,40);
        while(p1.getHp()>0 && p2.getHp()>0){
        	if(turno1){
        		System.out.println("Es el turno de " + p1.getNombre());
        		int i;
        		i = p1.atacar();

        		p2.setHp(i);
        		turno1= false;	}
        	else{
        		System.out.println("Es el turno de " + p2.getNombre());
        		p1.setHp(p2.atacar());
        		turno1= true;
        	}
	}
        	if(p1.getHp()>0){
        	System.out.println("Gano " + p1.getNombre());

        	}else
        		{
        	System.out.println("Gano " + p2.getNombre());

        		}

        	}

        }






