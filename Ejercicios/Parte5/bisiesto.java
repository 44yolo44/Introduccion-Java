package Javase;

import java.util.InputMismatchException;
import java.util.Scanner;

public class bisiesto {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		try {
			
			System.out.print("ingrese el anño que desea Comprobar: ");
			int anio = entrada.nextInt();
			
			if(esbisiento(anio)) {
				System.out.println("El Año es Bisiesto");
			}else {
				System.out.println("El Año no es Bisiesto");
			}
			
		} catch (InputMismatchException e) {
			System.out.println("porfavor ingrese un numero");
		}

	}
	
	public static boolean esbisiento (int anio) {
		return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0) ;
	}
}