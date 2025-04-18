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
