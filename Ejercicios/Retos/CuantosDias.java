/*
 * Crea una función que calcule y retorne cuántos días hay entre dos cadenas
 * de texto que representen fechas.
 * - Una cadena de texto que representa una fecha tiene el formato "dd/MM/yyyy".
 * - La función recibirá dos String y retornará un Int.
 * - La diferencia en días será absoluta (no importa el orden de las fechas).
 * - Si una de las dos cadenas de texto no representa una fecha correcta se
 *   lanzará una excepción.
 */

package Retos;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CuantosDias {
	
	
	//usar un try catch como validado (!!)
	public static boolean esFechaValida(String fecha) {
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		try {
			
			LocalDate.parse(fecha , formato );
			return true;
			
			
		} catch (DateTimeException e) {
			return false;
		}

	}
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("INGRESE UNA FECHA \nFormato (dd/mm/aa)");
		String fecha = entrada.nextLine();
		System.out.println("Es Valido : "+esFechaValida(fecha));


	}

}
