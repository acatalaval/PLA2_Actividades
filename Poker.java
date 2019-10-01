package JuegoDeCartas;

import java.util.ArrayList;
import java.util.Scanner;

public class Poker {
		
		//propiedades o atributos
		private Francesa barajaFran = new Francesa();
		private ArrayList<Jugador> jugadoresPok;
		
		
		public Poker(ArrayList<Jugador> jugadoresPok) {
			super();
			this.jugadoresPok = jugadoresPok;
			
			
			if (jugadoresPok.size < 2) {
				System.out.println("No hay suficientes jugadores");
			} else {
			
			barajaFran.reiniciar();
			}
		}
		
		void addJugador(Jugador j) {
			Scanner entr = new Scanner(System.in);	
			System.out.println("Introduce el nombre del nuevo jugador de Poker: ");
			String nom = entr.nextLine();
			Jugador newjug= new Jugador(nom);
			//newjug.setNomjugador(nom);
			jugadoresPok.add(newjug);
			
			System.out.println(newjug.getNomjugador());
		}
		

}
