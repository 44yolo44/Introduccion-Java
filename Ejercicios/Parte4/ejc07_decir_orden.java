/*
 *  Leer por teclado una serie de 10 números enteros. 
 *  La aplicación debe indicarnos si los números están
 *  ordenados de forma creciente, decreciente, o si están desordenados.
 */
package CuartaParte;

import java.util.Scanner;

public class ejc07_decir_orden {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//declaracion de variables
		
		int [] array = new int [10];
		
		System.out.println("ingresa 10 numeros \nel programa determina si esta en orden creciente o decreciente o no ordenado");
		//llenar el array
		for (int i = 0 ; i <10 ; i++) 
			array[i]=entrada.nextInt();
		
		//determinar si esta ordenado (decreciente o creciente) o si no.
		
		boolean creciente = true ;
		boolean decre = true ;
		boolean todosiguales = true;
		//mi forma 
		for ( int i = 0 ; i <9 ; i++) {
			if(array[i]>array[i+1])
				creciente=false;
			if(array[i]<array[i+1])
				decre = false;
			if(array[i]!=array[i+1])
				todosiguales = false;
		
		}	
		
		
		if (todosiguales){
			System.out.println("todos los elemtos son iguales pepito ");
		}
		else if (decre) {
			System.out.println("el arreglo este en orden decreciente");
		}
		else if(creciente) {
			System.out.println("el arreglo esta en orden creciente");
		}
		else {
			System.out.println("el arreglo no esta ordenado ");
		}
		
	
	
	
	
	}

}
