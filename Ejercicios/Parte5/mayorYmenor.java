/**
 * Crea un array de numeros y obten el mayor y el menor del array.
 */

package Javase;

import java.util.Arrays;

public class mayorYmenor {

	public static void main(String[] args) {
		
		//primera forma 
		
		int [] array1 = new int [numAlea(5, 15)];
		
		for (int i = 0; i < array1.length; i++) {
			array1[i]=numAlea(0, 100);
		}
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i]+" ");
		}
		

		int mayor = array1 [0];
		int menor = array1 [0];
		
		for (int i = 1; i < array1.length; i++) {
			if (array1[i]<menor) {
				menor = array1[i]; 
			}
			if(array1[i]>mayor) {
				mayor = array1[i];
			}
		}
		
		System.out.println("\nEl mayor :"+mayor);
		System.out.println("El menor :"+menor);
		
		System.out.println(" ");
		//forma facil 
		
		int [] array2 = new int [numAlea(5, 15)];
		
		for (int i = 0; i < array2.length; i++) {
			array2[i]=numAlea(0, 100);
			System.out.print(array2[i]+" ");
		}
		
		Arrays.sort(array2);
		
		System.out.println("\nmayor : "+(array2[(array2.length-1)]));
		System.out.println("menor : "+array2[0]);
		
	}
	
	private static int numAlea(int minimo , int maximo) {
		int num = (int)(Math.floor(Math.random()*(maximo-minimo+1)+minimo));
		return num;
	}
}
