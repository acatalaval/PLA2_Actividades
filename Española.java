package JuegoDeCartas;

//import java.util.ArrayList;

public class Española extends Baraja {
	
	public static String[] palo = {"oros", "espadas", "copas", "bastos"};
	public static String[] nombre = {"1","2","3","4","5","6","7","sota","caballo","rey"};
	public static int[] valor = {1,2,3,4,5,6,7,10,11,12};
	//ArrayList<Carta> cartas;  > Ya definida en clase Baraja, por lo que aquí no se pone
	
	public Española() {
		super();
		
		this.numCartas=40;
		this.cartasxPalo=10;
		
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
		System.out.println(cartas); //no es necesario, pero lo hago para ver salida
	}

}
