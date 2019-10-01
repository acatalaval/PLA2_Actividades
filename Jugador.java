package JuegoDeCartas;

import java.util.ArrayList;

public class Jugador {
	
	private String nomjugador;
	private ArrayList<Carta> cartasjug;
	
	public Jugador (String nomjugador) {
		this.nomjugador=nomjugador;
		cartasjug=new ArrayList<Carta>();
		//La propiedad cartas es un ArrayList de elementos de tipo Carta que inicializaremos en el constructor, pero sin poner elementos
	}

	public String getNomjugador() {
		return nomjugador;
	}

	public void setNomjugador(String nomjugador) {
		this.nomjugador = nomjugador;
	}

	public ArrayList<Carta> getCartasjug() {
		return cartasjug;
	}

	public void setCartasjug(ArrayList<Carta> cartasjug) {
		this.cartasjug = cartasjug;
	}

	void darCarta(Carta c) {
		cartasjug.add(c);   //Toma como par�metro una carta y la a�ade a las cartas del jugador.
	}
	
	Carta retirarCarta(int indice) {
		Carta c_out=cartasjug.remove(indice);  // Que nos eliminar� de las cartas la carta que est� en esa posici�n 
		return c_out;                       // y la devuelve	
	}
	
	String juego() {      //Que nos devuelve una cadena con las cartas que tiene entre corchetes. Ejemplo [1 de bastos, 5 de oros]
		String str="";
		String str_out="";
		for (Carta c:cartasjug) {
			str = c.toString();
			str_out=str+", "+str_out;
		}	
		return ("["+str_out+"]");
	}
	
	public void juego_v2( ) {    //As� obtendo de mejor manera lo pedido en el anterior m�todo
		System.out.println(cartasjug);
	}
}

