/*
 * Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.
 */

package SegundaParte;

import java.util.Scanner;

public class ejc04_contador_numeros {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int c = 0 ; 
		int numero = 0 ; 
		
		System.out.print("programa para contar numeros");
		do
		{
			
			c++;
			
			System.out.print("\ningrese numero  : ");
			numero = entrada.nextInt();
			
			
		}
		while(numero >= 0);
		
		System.out.println("el numero de numeros es : "+c);

	}

}
