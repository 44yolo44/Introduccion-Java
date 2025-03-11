/*	
 	Diseñar una aplicación que declare una tabla de 10 elementos enteros. 
	Leer mediante el teclado 8 números.
	Después se debe pedir un número y una posición, 
	insertarlo en la posición indicada, desplazando los que estén
	detrás
*/

package CuartaParte;

import java.util.Scanner;

public class ejc08_desplazarelemento {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
			int [] array = new int [10];
			
			
			System.out.println("ingrese 8 numeros  "
					+ "\nel noveno se incertara en la posicion que usted prefiera :");
			//llenar el array 
			for (int i = 0 ; i <8 ; i++)	
				array[i]=entrada.nextInt();
			
			
			//Pdir el numero y la posicion:
			
			System.out.println("ingrese el numero : ");
			int num = entrada.nextInt();
			
			System.out.println(" ingrese la posicion ");
			
			int pos = entrada.nextInt();
			
			//agregar en la posicion adecuada
			
			for (int i= 8 ; i>=pos ; i--)
				array[i]=array[i-1];
			
			array[pos-1]=num;

		 
			for(int i = 0; i<9;i++) {
			System.out.print(array[i]+" - ");
		}
	}

}
