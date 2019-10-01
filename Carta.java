package JuegoDeCartas;

public class Carta { 
	
	protected String palo; 
	protected String nombre;
	protected int valor;

	public Carta (String palo, String nombre, int valor) {
		this.palo=palo;
		this.nombre=nombre;
		this.valor=valor;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	} 
	
	 @Override
	  public String toString() {           //método para sobreescribir el método toString
	    return (nombre+" de "+palo);
	  }
}

