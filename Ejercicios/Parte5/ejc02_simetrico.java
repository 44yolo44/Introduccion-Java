/*2. Crear y cargar una tabla de tamaño 4x4 y decir si es simétrica 
 * o no, es decir si se obtiene la misma tabla al 
 * cambiar las filas por columnas.
 */

package QuintaParte;

import java.util.Scanner;

public class ejc02_simetrico {
	
	public static void main (String [] args ) {
		Scanner entrada = new Scanner(System.in);
		
		int [][] arreglo = new int [4][4];
		
		System.out.println("intercambiar filas y columnas \nde un arrelgo bidimensional");

		for ( int i = 0 ; i<4 ; i++) {
			for ( int j = 0 ; j<4 ; j++) {
				System.out.print("Ingrese elemento "+(j+1)+" fila "+(i+1)+" :");
				arreglo[i][j]=entrada.nextInt();
			}
		}

		//impirmiendo arreglo
		for ( int i = 0 ; i<4 ; i++) {
			for ( int j = 0 ; j<4 ; j++) {
				System.out.print(arreglo[i][j]+" - ");
			}
			System.out.println();
		}
		
		//cambiando filas por columnas 

		int [][] arreglo2 = new int [4][4];
		for ( int i = 0 ; i<4 ; i++) {
			for ( int j = 0 ; j<4 ; j++) {
				arreglo2[i][j]=arreglo[j][i];
			}
		}
		
		System.out.println("\n");

		//imprimiendo arreglo2
		for ( int i = 0 ; i<4 ; i++) {
			for ( int j = 0 ; j<4 ; j++) {
				System.out.print(arreglo2[i][j]+" - ");
			}
			System.out.println();
		}

		//comparando arreglos
		boolean simetrico = true;
		for ( int i = 0 ; i<4 ; i++) {
			for ( int j = 0 ; j<4 ; j++) {
				if (arreglo[i][j]!=arreglo2[i][j]) {
					simetrico = false;
					break;
				}
			}
		}

		if (simetrico) {
			System.out.println("El arreglo es simetrico");
		} else {
			System.out.println("El arreglo no es simetrico");
		}
		
		
		
		
				
		
	}
}