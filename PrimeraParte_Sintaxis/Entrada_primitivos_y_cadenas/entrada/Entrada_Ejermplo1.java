package entrada;

import java.util.Scanner;

public class Entrada_Ejermplo1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("ingresa Tu Nombre ");
		
		String nombre = entrada.nextLine();
		
		System.out.println("introduce edad pls : ");
		
		int edad = entrada.nextInt();
		
		System.out.println("hola "+nombre+" el año que viene tendras "+(edad+1)+" años");
	
	
	}

}
