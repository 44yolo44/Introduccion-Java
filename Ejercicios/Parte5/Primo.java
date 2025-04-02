package Javase;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Primo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		try {
			System.out.print("Ingresa Un numero y comprueba que sea primo : ");
			
			int num = entrada.nextInt();
			
			if (esPrimo(num)) {
				System.out.println("El Numero "+num+" es Primo.");
			} else {
				System.out.println("El Numero "+num+" no es Primo.");
			}
		} catch (InputMismatchException e) {
			System.out.println("ingresa un numero entero");
		}
		
	}

	private static boolean esPrimo(int numero) {
		
		if(numero <= 1 ) {
			return false;
		}else {
			for (int i = 2 ; i < Math.sqrt(numero) ; i++) {
				if(numero % i == 0) {
					return false;
				}
			}
			
		}
		return true;
	}
}


