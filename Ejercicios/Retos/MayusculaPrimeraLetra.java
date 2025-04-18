/*
 * Crea una función que reciba un String de cualquier tipo y se encargue de
 * poner en mayúscula la primera letra de cada palabra.
 * - No se pueden utilizar operaciones del lenguaje que
 *   lo resuelvan directamente.
 */
package Retos;

import java.util.Scanner;

public class MayusculaPrimeraLetra {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese Palabra :");
		String palabra = entrada.nextLine();
		
		System.out.println(PrimeraMayuscula(palabra));

	}
	
	public static String PrimeraMayuscula(String palabra) {
		palabra.trim();
		char letras [] = palabra.toCharArray();
		StringBuilder resultado = new StringBuilder();
		
		boolean nuevapalabra = true ;
		
		for ( char c : letras) {
			if (c == ' ') {
				nuevapalabra = true;
				resultado.append(c);
			} else {
				if (nuevapalabra && c >= 'a' && c <= 'z') {
					resultado.append((char)(c - 32)); //convierte a mayuscula 
					//la mayuscula de una letra está 32 posiciones antes de su  minúscula en el codigo ascii
				} else {
					resultado.append(c);
				}
				nuevapalabra=false;
			}
			
		}
		return resultado.toString();
		
	}

}
