/*
 * Escribe una función que calcule si un número dado es un número de Armstrong
 * (o también llamado narcisista).
 * Si no conoces qué es un número de Armstrong, debes buscar información
 * al respecto.
 */
package Retos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class numeroDeAmstromg {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		try {
			
			System.out.println("INGRESE EL NUMERO A PROBRAR");
			
			int num = entrada.nextInt();
			
			System.out.println(num+" es numero de amstrong ? (1) :"+esAmstrong(num));
			
			System.out.println(num+" es numero de amstrong ? (2) :"+esArmstrong2(num));
			
			
		} catch (InputMismatchException e) {
			entrada.next();
			System.out.println("debe ingresar un numero");
		}
		
		

	}
	
	//MI FORMA
	public static boolean esAmstrong(int num) {
		
		if (num<=0) {
			return false;
		} else {
			int numDigitos = String.valueOf(num).length();
			char array [] = String.valueOf(num).toCharArray();
			
			int sum = 0;
			
			for (int i = 0; i < array.length; i++) {
				
				sum += Math.pow(Integer.parseInt(String.valueOf(array[i])),numDigitos);
			}
			
			if (sum == num ) {
				return true;
			}
			else {
				return false;
			}

		}
	}
	
	//Optima
	
	public static boolean esArmstrong2(int num) {
		
		if(num <= 0 ) return false;
		
		int original = num ;
		int suma = 0;
		int numDigitos = String.valueOf(num).length();
		
		while (num > 0) {
			int digito = num % 10;
			suma += Math.pow(digito, numDigitos);
			num /=10; //por como funcionan los int hacer eso como quitarle el ultimo numero
		}
		
		return suma == original;
	}


}
