package Teoria;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exepciones {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//InputMismatchException si colocamos mal la variable del Scanner
		try {
			
			System.out.println("ingrese un numero entero : ");
			int numero = entrada.nextInt();
			
			System.out.println("El numero introducido es  : "+numero);
			
			
		} catch (InputMismatchException e) {
			entrada.next(); //para cerrar el scanner
			System.out.println("debes ingresar un numero entero");
		
		}
		
		//ArithmeticException salta cuando dividimos entre 0 
		try {
			
			int operando1 = 10;
			int operando2= 0;
			
			
			double division = operando1/operando2;
			System.out.println("la division es : "+division);
			
			
		} catch (ArithmeticException e ) {

			System.out.println("no se puede dividir entre 0");
			
		}
		
		//ArrayIndexOutOfBoundsException salta cuando usamos  un valor fuera del rango
		try {
			
			int [] array = {1,2,3,4,5};
			System.out.println(array[10]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("el array solo tiene 5 elementos");
			
		}
		
		//podemos lanzar exepciones generales
		
		try {
			
			System.out.println("introduce un valor del 1 al 10");
			int numero = entrada.nextInt();
			
			validarNumero(numero);
			
			System.out.println("numero valido");
			
			
		} catch (InputMismatchException e) {
			
			System.out.println("Debe introducir un numero ");
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}
		
		
		

	}


//funcion 
//podemos indicar que una funcion va a devolver una exepcion con throws

	public static void validarNumero (int numero ) throws Exception {
		if(!(numero>= 1 && numero <= 10 )) {
			throw new Exception ("debes introducir un numero entre 1 y 10 ");
		}
	}
}

