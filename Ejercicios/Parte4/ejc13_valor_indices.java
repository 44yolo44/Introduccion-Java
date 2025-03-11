	/*
	 * Leer 10 enteros. Guardar en otra tabla los elementos pares de la primera, y a continuación los elementos
	impares.
	Realizar dos versiones: una trabajando con los valores y otra trabajando con los índices.

	 */

package CuartaParte;

import java.util.Scanner;

public class ejc13_valor_indices {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int c = 0 ; 
		int [] array = new int [10];
		int [] array2 = new int [10];
		
		System.out.println("ingrese 10 numeros : ");
		
		for(int i = 0 ; i < 10 ; i++) 
			array[i]=entrada.nextInt();

		
		
		System.out.println("ORDENAMIENTO por\nValor o indice (a/b) ");
		
		String opcion = entrada.next();
		
		
		
		switch (opcion){
		
		case "a" :  
			
			int j=0;
			for(int i = 0 ; i<10 ; i++) {
				if(array[i]%2==0) {
					array2[j]=array[i];
					j++;
				}
			}
		
			for(int i = 0 ; i<10 ; i++) {
				if(array[i]%2!=0) {
					array2[j]=array[i];
					j++;
				}
			}
			
			for(int i=0 ; i<10 ; i++) {
				System.out.print(array2[i]+" - ");
			}
			break;
			
		case "b" : 
			
			int k=0;
			for(int i = 0 ; i<10 ; i++) {
				if((i+1)%2==0) {
					array2[k]=array[i];
					k++;
				}
			}
		
			for(int i = 0 ; i<10 ; i++) {
				if((i+1)%2!=0) {
					array2[k]=array[i];
					k++;
				}
			}
			
			for(int i=0 ; i<10 ; i++) {
				System.out.print(array2[i]+" - ");
			}
			break;
			
			default : System.out.print("aea ");
		
		
		
		}
			
			
		}
		
	}
