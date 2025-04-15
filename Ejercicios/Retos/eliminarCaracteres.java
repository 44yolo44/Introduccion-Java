/*
 * Crea una función que reciba dos cadenas como parámetro (str1, str2)
 * e imprima otras dos cadenas como salida (out1, out2).
 * - out1 contendrá todos los caracteres presentes en la str1 pero NO
 *   estén presentes en str2.
 * - out2 contendrá todos los caracteres presentes en la str2 pero NO
 *   estén presentes en str1.
 */

package Retos;

import java.util.Scanner;

public class eliminarCaracteres {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("ingrese 2 palabras");
		System.out.print("palabra 1 :");
		String palabra1 = entrada.nextLine();
		System.out.print("\npalabra 2 :");
		String palabra2 = entrada.nextLine();
		
		System.out.println("\nRESULTADO : ");
		
		System.out.println("1 : "+eliminaCaracteres(palabra1, palabra2));
		System.out.println("2 : "+eliminaCaracteres(palabra2, palabra1));
		
		

	}
	
	public static String eliminaCaracteres(String palabra1 , String palabra2 ) {
		
		palabra1 = palabra1.toLowerCase();
		palabra2 = palabra2.toLowerCase();
		
		StringBuilder resultado = new StringBuilder();
		
		for ( char c : palabra1.toCharArray() ) {
			
			if (palabra2.indexOf(c)==-1) { //metodo de string que bu
				resultado.append(c);
			}
			
			
		}
		
		return resultado.toString();
	}

}
