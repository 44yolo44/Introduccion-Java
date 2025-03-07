package poo;

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Empleado empleado1 = new Empleado("Pepito quispe " , 30000 , 1990 , 12 , 17);
		
		Empleado empleado2 = new Empleado("Ana lopez " , 800 , 2015 , 2 , 13);
		
		Empleado empleado3 = new Empleado("lamine mamani" , 105000 , 2024 , 4 , 16);

		empleado1.subeSueldo(5);
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5);
		
		System.out.println("Nombre : "+empleado1.getnombre()+" Sueldo: "+empleado1.getsueldo()+
							" Fecha de alta: "+empleado1.getfechaContrato());
		
		System.out.println("Nombre : "+empleado2.getnombre()+" Sueldo: "+empleado2.getsueldo()+
				" Fecha de alta: "+empleado2.getfechaContrato());
		
		System.out.println("Nombre : "+empleado3.getnombre()+" Sueldo: "+empleado3.getsueldo()+
				" Fecha de alta: "+empleado3.getfechaContrato());*/
		 
		Empleado[] MisEmpleados = new Empleado[3] ;
		
		MisEmpleados[0] = new Empleado("Pepito quispe " , 30000 , 1990 , 12 , 17) ;
		MisEmpleados[1] = new Empleado("Ana lopez " , 800 , 2015 , 2 , 13);
		MisEmpleados[2] = new Empleado("lamine mamani" , 105000 , 2024 , 4 , 16);
		
		/*1for (int i = 0 ; i<3 ; i++) {
			MisEmpleados[i].subeSueldo(5);
		}
		*/
		for (Empleado e : MisEmpleados ) {
			e.subeSueldo(5);
		}
		
		/*for(int i = 0 ; i<3 ; i++) {
			System.out.println("Nombre : "+MisEmpleados[i].getnombre()+"Sueldo : "+
			MisEmpleados[i].getsueldo()+" Fecha de alta: "+MisEmpleados[i].getfechaContrato());
			
		}
		*/
		
		for (Empleado f : MisEmpleados) {
			System.out.println("Nombre : "+f.getnombre()+"Sueldo : "+
				f.getsueldo()+" Fecha de alta: "+f.getfechaContrato());
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
		
	}
	//getters
	public String getnombre(){
		return nombre;
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
	
	
}
