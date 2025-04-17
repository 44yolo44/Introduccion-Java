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
			
			System.out.println(num+" es numero de amstrong ?  :"+esAmstrong(num));
			
			
		} catch (InputMismatchException e) {
			entrada.next();
			System.out.println("debe ingresar un numero");
		}
		
		

	}
	
	
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


}
