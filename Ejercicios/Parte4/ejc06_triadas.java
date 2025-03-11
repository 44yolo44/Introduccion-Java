/*
   Leer los datos correspondiente a dos tablas de 12 elementos numéricos, 
   y mezclarlos en una tercera de la
	forma: 3 de la tabla A, 3 de la B, otros 3 de A, otros 3 de la B, etc.
*/

package CuartaParte;

import java.util.Scanner;

public class ejc06_triadas {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		//definir variables 
		
		int [] array1 = new int [12];
		int [] array2 = new int [12];
		int [] array3 = new int [24];
		
		//lleanar arrays
		
		System.out.println("ingrese valores del array 1");
		
		for (int i = 0 ; i <12 ; i++) {
			
			array1[i]=entrada.nextInt();
			
		}
		
		System.out.println("ingrese valores del array 2"); 
		
		for (int i = 0 ; i <12 ; i++) {
			
			array2[i]=entrada.nextInt();
			
		}
		
		//combinar arrays en triadas 
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		for(int i = 0 ; i<4 ; i++) {
			for (int j= 0 ; j<3 ; j++) {
				array3[c]=array1[a];
				c++;
				a++;
			}
			for (int k= 0 ; k<3 ; k++) {
				array3[c]=array2[b];
				c++;
				b++;
			}
			
		}

		
		
		
		//imprimir array 
		for(int i = 0; i<24;i++) {
			
			System.out.print(array3[i]+" - ");
			
		}
		
		
		

	}

}
