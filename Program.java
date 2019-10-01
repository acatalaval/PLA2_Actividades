package JuegoDeCartas;

import java.util.*;

public class Program {

	public static void main(String[] args) {
		Carta c1,c2,c3,c4;
		Española b = new Española();
		Francesa f = new Francesa();
		//b.mostrarBaraja();
		f.mostrarBaraja();
		//b.barajar();
		//b.mostrarBaraja();
		
		Jugador jug1, newjug;
		//b.repartir();
		
		c1= new Carta ("copas","4",4);
		c2= new Carta ("oros","caballo",11);
		c3= new Carta ("bastos", "as",1);
		c4= new Carta ("espada","2",2);

		
		System.out.println("Carta repartida:"+(f.repartir()));
		
		jug1 = new Jugador ("Pepe Palote");
		System.out.println(jug1.getNomjugador());
		
		jug1.darCarta(c2);
		jug1.darCarta(c1);
		jug1.darCarta(c4);
		
		//System.out.println(jug1);
		//System.out.println(jug1.cartasjug);
		//String str_out="";
		jug1.juego();
		System.out.println("juego:"+jug1.juego());
		jug1.juego_v2();
		
		Scanner s = new Scanner(System.in);	
		System.out.println("Introduce el nombre del nuevo jugador de Mus: ");
		String j = s.nextLine();
		newjug = new Jugador (j);
		//Mus.addJugador(newjug);
		System.out.println(newjug.getNomjugador());
		
		
		ArrayList<Jugador> jugadoresMus = new ArrayList<Jugador>();
		Mus.addJugador(jugadoresMus.setNomjugador());
	}
}
		
