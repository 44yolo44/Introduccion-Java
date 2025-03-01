/*
 * Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene.

 */

package PrimeraParte;

import java.util.Scanner;

public class ejc11_contar_cifras {

	public static void main(String[] args) {
		
		/*Scanner entrada = new Scanner(System.in);
		
		System.out.println("ingrese un numero entre 0 y 9.999 : ");
		
		int numero = entrada.nextInt();
		
		if(numero > 0 && numero <9999 ) {
			
		   System.out.println("el numero de cifras es: "+String.valueOf(numero).length());
			
		}
		else {
			
			System.out.println("su numero es mayo o menor al rango indicado ");

		}*/
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("ingrese un numero entre 0 y 9.999 : ");
		
		int numero = entrada.nextInt();
		
		if(numero > 0 && numero <9999 ) {
			
			System.out.println("el numero de cifras es : "+((int)Math.log10(Math.abs(numero))+1));
		}
		else {
			System.out.println(" su numero es mayo o menor al rango indicado  ");
		}
		
	}

}
