package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	public static void main(String[] args) {

		persona [] lasPersonas = new persona [2];
		
		lasPersonas[0]=new Empleado2("lamine yamal", 50000, 2009, 2, 25);
		
		lasPersonas[1]=new alumno("Mauricio Farro", "ingenieria informatica");
		
		for (persona p : lasPersonas ) {
			System.out.println(p.getNombre()+" ; "+p.dameDescripcion());
		}
		
		
	}

}

abstract class persona  {
	
	public persona ( String nom ) {
		
		nombre = nom ;
	} 
	
	public String getNombre() {
		return nombre;
	}

	public abstract String dameDescripcion ();

	private String nombre	;
}


class Empleado2 extends persona  {
	//constructor
	public Empleado2(String nom , double sue , int agno , int mes , int dia) {
	
		super(nom);
		
		sueldo = sue;
		 
		GregorianCalendar calendario = new GregorianCalendar(agno , mes -1 , dia );
		
		altaContratado = calendario.getTime();
		
		// Asignar id al momento de crear el objeto
		id = idSiguiente;
		idSiguiente++;
	}

	public String dameDescripcion () {
		return "este empleado tiene un id = "+id+" con un sueledo = "+sueldo;
	}
	
	public double getsueldo() {
		return sueldo;
	}
	
	public Date getfechaContrato(){
		return altaContratado;
	}
	//setters
	public void subeSueldo(double porcentaje){
		
		double aumento = sueldo*porcentaje/100;
		sueldo+=aumento;
	}
	

	private double sueldo ; 
	
	private Date altaContratado;
	
    // Variable de clase (por el static)
    private static int idSiguiente =1;
	
    private int id; // ID del empleado
    
}

class alumno extends persona {
	public alumno (String nom , String car ){
		
		super(nom);
		
		carrera = car;
		
	}
	
	public String dameDescripcion() {

		return "este alumno esta estudiando la carrera de "+carrera;
	} 
	
	private String carrera ;

}

