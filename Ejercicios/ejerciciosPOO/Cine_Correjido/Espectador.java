package Parte3;


public class Espectador {
	
	private String Nombre ;
	private int edad ;
	private int dinero;
	
	//Constantes
	private final String [] NOMBRES = {"Juan","Ana","Marcela","Mauricio","Enrrique","Percy","Doris","Maria"};
	
	public Espectador () {
		
		Nombre = NOMBRES[metodosSueltos.generadorNumerosAleatorios(0, (NOMBRES.length-1))];
		
		edad = metodosSueltos.generadorNumerosAleatorios(5, 80);
		
		dinero = metodosSueltos.generadorNumerosAleatorios(5, 25);
		
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getDinero() {
		return dinero;
	}

	public void setDinero(int dinero) {
		this.dinero = dinero;
	}
	
	public String toString () {
		
		return " Nombre : "+getNombre()+" Edad "+getEdad()+" Dinero Disponible : "+getDinero();
	}
	
	

}
