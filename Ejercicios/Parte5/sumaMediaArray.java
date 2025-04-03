//Crea un array de numeros y obten la suma y la media de sus elementos.
package Javase;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class sumaMediaArray {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		try {
			
			System.out.print("Ingrese tamaño del arreglo : ");
			int n = entrada.nextInt();
			
			//crear array 
			int [] array = new int [n];
			
			//llenar el array aleatoriamente 
			for (int i = 0; i < array.length; i++) {
				array[i]=(int)(Math.random()*100);
			}
			
			//imprimir array
			for (int e : array) {
				System.out.print(e+" ");
			}
			
			//obtener suma
			int s=0;
			for (int e : array) {
				s+=e;
			}
			System.out.println("\nsuma :"+s);
			System.out.println("suma :"+s/array.length);
			
					
		} catch (InputMismatchException e) {
			System.out.println("Ingrese un numero entero");
		}

	}

}
