/*
 * Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca
un 0.
 */

package SegundaParte;

import java.util.Scanner;

public class ejc02_nega_o_posi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		int numero = 1; 
		
		System.out.println("programa que determina si es + o -");
		
		do {
			System.out.print("\ningrese numero : ");
			numero = entrada.nextInt();
			
			if(numero>0) {
				System.out.println("el numero es positivo");
				}
			else  if(numero<0){
				System.out.println("el numero es negativo");
				}
			else {
				System.out.println("numero invalido");
				}
			}
		while(numero!=0);
			
		}
}