package JuegoDeCartas;

//import java.util.ArrayList;
//import java.util.Collections;

public class Francesa extends Baraja {
	
	public static String[] palo = {"picas", "tréboles", "diamantes", "corazones"};
	public static String[] nombre = {"1","2","3","4","5","6","7","8","9","10","J","Q","K"};
	public static int[] valor = {1,2,3,4,5,6,7,8,9,10,10,11,12}; //ni idea de los valores :)
    //ArrayList<Carta> cartas=new ArrayList<Carta>(); > Ya definida en clase Baraja, por lo que aquí no se pone
	
	public Francesa() {
		super();
		
		this.numCartas=52;
		this.cartasxPalo=13;
		
		reiniciar();
		super.barajar();
	}


	@Override
	public void reiniciar() {
		//cartas = new ArrayList<Carta>(); > Ya definida en clase Baraja, por lo que aquí no se pone
		Carta c= null;
		cartas.clear(); //Borrar el arraylist si estuviera lleno
		
		//Recorremos los palos
		for (int i=0; i<palo.length; i++) {
			// Recorremos los nombres
			for (int j=0; j<cartasxPalo; j++) {
				
				c = new Carta (palo[i], nombre[j], valor[j]);
				cartas.add(((i*10)+j), c); 
			}
		}
		System.out.println(cartas);
	}
	
}
	