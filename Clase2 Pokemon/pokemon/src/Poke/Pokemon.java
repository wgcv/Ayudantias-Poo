package Poke;

public class Pokemon {
	//http://www.pokemon.com/es/pokedex/squirtle
private int id;
private String nombre;
private String tipo;
private int salud;
private int ataque1,ataque2,ataque3;
private int nivel;

public Pokemon(int id, String nombre, String tipo, int ataque1, int ataque2) {
	this.id = id;
	this.nombre = nombre;
	this.tipo = tipo;
	this.ataque1 = ataque1;
	this.ataque2 = ataque2;
	this.ataque3 = 0;
	this.salud = 100;
	this.nivel = 1;
}

public void mostrarPokemon(){
	System.out.printf("Nombre: %s \n", nombre);
	System.out.printf("Nivel: %d \n", nivel);
	System.out.printf("Salud: %d \n", salud);
}
public String toString(){
	 String mostrar;
	mostrar = nombre + "\nNª: "+id+"\nTipo: "+tipo+"\n Ataque 1: " +ataque1+"\t Ataque 2: "+ataque2+"\t Ataque 3: "+ataque3;
	return mostrar;
}


/*
public int getId() {
	return id;
}

public String getNombre() {
	return nombre;
}

public String getTipo() {
	return tipo;
}

public int getSalud() {
	return salud;
}

public void setSalud(int salud) {
	this.salud = salud;
}

public int getAtaque1() {
	return ataque1;
}

private void setAtaque1(int ataque1) {
	this.ataque1 = ataque1;
}

public int getAtaque2() {
	return ataque2;
}

private void setAtaque2(int ataque2) {
	this.ataque2 = ataque2;
}

public int getAtaque3() {
	return ataque3;
}

private void setAtaque3(int ataque3) {
	this.ataque3 = ataque3;
}


public int getNivel() {
	return nivel;
}


private void setNivel(int nivel) {
	this.nivel = nivel;
}

*/

}
