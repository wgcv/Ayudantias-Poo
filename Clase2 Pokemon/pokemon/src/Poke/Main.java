package Poke;

import java.util.Scanner;

public class Main {

	public static void main(String [] args){
		Pokemon squirtle;
		squirtle = new Pokemon(7, "squirtle", "Agua", 25, 10);
		squirtle.mostrarPokemon();
		
		
		//Se crea un nuevo Pokemon
		Scanner entrada = new Scanner (System.in);
		String nombre;
		System.out.print("Nombre del Pokemon: ");
		nombre = entrada.next();
		int numero;
		System.out.print("Numero del Pokemon: ");
		numero = entrada.nextInt();
		String tipo;
		System.out.print("tipo del Pokemon: ");
		tipo = entrada.next();
		int ataque1;
		System.out.print("Ataque 1 del Pokemon: ");
		ataque1 = entrada.nextInt();
		int ataque2;
		System.out.print("Ataque 2 del Pokemon: ");
		ataque2 = entrada.nextInt();
		entrada.close();
		
		Pokemon pokemon;
		pokemon = new Pokemon(numero, nombre, tipo, ataque1, ataque2);
		pokemon.mostrarPokemon();
	}
	
}
