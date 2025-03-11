/*
 * Crear una tabla bidimensional de tamaño 5x5 y rellenarla 
 * de la siguiente forma: la posición T[n,m] 
 * debe contener n+m. Después se debe mostrar su contenido.
 */

package QuintaParte;

import java.util.Scanner;

public class ejc01_tabla5x5 {

	public static void main (String [] args ) {
		Scanner entrada = new Scanner(System.in);
		
		//declaracion de variables
		int [][] arreglo = new int [5][5];
		
		for(int i = 0 ;i<5 ; i++) {
			for(int j = 0 ; j<5 ; j++) {
				System.out.print("elemnto n° "+(j+1)+" de la fila "+(i+1)+" : ");
				arreglo[i][j]=entrada.nextInt();
			}
		}
		
		for(int i = 0 ;i<5 ; i++) {
			for(int j = 0 ; j<5 ; j++) {
				System.out.print(arreglo[i][j]+" - ");
			}
			System.out.println();
		}
	}
}
