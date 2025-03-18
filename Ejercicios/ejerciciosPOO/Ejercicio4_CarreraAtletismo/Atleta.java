package Ejercicio4_CarreraAtletismo;

public class Atleta {
	
	private int numero ; 
	private String nombre;
	private float tiempo;
	
	public Atleta (int numero , String nombre , float tiempo ) {
		this.nombre=nombre;
		this.numero=numero;
		this.tiempo=tiempo;
	}
	
	public float getTiempo () {
		
		return tiempo;
	}
	
	public String getDatos() {
		
		return "el nombre es: "+nombre+" con el numero : "+numero+" con tiempo de : "+tiempo;
	}

}
