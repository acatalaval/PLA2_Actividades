package JuegoDeCartas;

import java.util.ArrayList;
import java.util.Scanner;

public class Mus {
	
	//propiedades o atributos
	private Espa�ola barajaEsp;
	private ArrayList<Jugador> jugadores;
	
	//constructor
	public Mus() {
		barajaEsp=new Espa�ola();
	}
 

	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}


	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}


	//m�todo para a�adir un jugador al arraylist de jugadores
	public static void addJugador(Jugador j) {
		jugadores = new ArrayList<Jugador>();
		j.setJugadores(jugadores);
			
	}

}

/*
Scanner s = new Scanner(System.in);	
System.out.println("Introduce el nombre del nuevo jugador de Mus: ");
String cadena = s.nextLine();
*/