package poo;

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {

		
		Jefatura jefe_RRHH =  new Jefatura ("Mauricio" , 200000 , 2026 , 5 , 15 ) ;
		jefe_RRHH.establece_incentivo(62560);
		
		
		 
		Empleado[] MisEmpleados = new Empleado[6] ;
		
		MisEmpleados[0] = new Empleado("Pepito quispe " , 30000 , 1990 , 12 , 17) ;
		MisEmpleados[1] = new Empleado("Ana lopez " , 800 , 2015 , 2 , 13);
		MisEmpleados[2] = new Empleado("lamine mamani" , 105000 , 2024 , 4 , 16);
		
		//de otro constructor 
		
		MisEmpleados[3] = new Empleado("Pedri Quizpe"); 
		
		MisEmpleados [4] = jefe_RRHH ; //principio de sustitucion 
		
		MisEmpleados [5] = new Jefatura("valeria", 150000, 2028, 3, 15);
		
		
		
		
		for (Empleado e : MisEmpleados ) {
			e.subeSueldo(5);
		}
		
		
		
		for (Empleado f : MisEmpleados) {
			System.out.println("Nombre : "+f.getnombre()+" Sueldo : "+
				f.getsueldo()+" Fecha de alta: "+f.getfechaContrato());
			/*
			en f.getsueldo actua en todos como get sueldo del que pertenerce 
			que es mis empleados que es un array tipo empleados 
			en f.getsueldo al lleagr al 4 actua como getsueldo pero de jefatura
			*/
		}
		
	}

}


//
class Empleado {
	//constructor
	public Empleado(String nom, double sue , int agno , int mes , int dia) {
	
		nombre = nom;
		sueldo = sue;
		 
		GregorianCalendar calendario = new GregorianCalendar(agno , mes -1 , dia );
		
		altaContratado = calendario.getTime();
		
		// Asignar id al momento de crear el objeto
		id = idSiguiente;
		idSiguiente++;
	}
	
	//se puede tener varios constructores (no tiene limite) pero debe variar en orden , tipo o cantidad de parametros
	//this lo que hqace es llama al otro constructor llamado igual con el q coicida los parametros 
	public Empleado(String nom) {
		
		this(nom , 30000 , 2025 , 01 , 01);
		
	}
	
		
	
	//getters
	public String getnombre(){
		// Ya no asignamos el id aquí
		return nombre + " ID: "+id;
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
	
	
	
	
	private String nombre ;
	
	private double sueldo ; 
	
	private Date altaContratado;
	
    // Variable de clase (por el static)
    private static int idSiguiente =1;
	
    private int id; // ID del empleado
    
}
	




class Jefatura extends Empleado{
	
	public Jefatura (String nom , double sue , int agno , int mes , int dia ) {
		
		super(nom , sue , agno , mes , dia);
		
	}
	
	//setter incentivo 
	public void establece_incentivo (double b) {
		incentivo=b;
	}
	
	//getter incentivo (machaco el getsueldo de la clase empleado)
	public double getsueldo () {
		
		double SueldoJefe = super.getsueldo();
		
		return SueldoJefe + incentivo ;
	}
	
	
	private double incentivo ; //varaibles  , campos de clase van al principio o al final 
}
