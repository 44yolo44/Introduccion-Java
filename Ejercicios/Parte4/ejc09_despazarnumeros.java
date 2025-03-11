/*Crear un programa que lea por teclado una tabla de 10 números enteros 
 * y la desplace una posición hacia abajo: el primero pasa a 
 * ser el segundo, el segundo pasa a ser el 
 * tercero y así sucesivamente. El último pasa a ser el primero.*/

package CuartaParte;

import java.util.Scanner;

public class ejc09_despazarnumeros {

	public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			
			int [] array = new int [10];
			
			System.out.println("ingrese 10 numeros : ");
			
			for (int i = 0 ; i<10; i++) 
				array[i]=entrada.nextInt();
			
			int temp = array[9];
			
			for (int i = 9 ; i>0 ; i--) 
				array[i]=array[i-1];
			
			array[0]=temp;
			
			for(int i = 0 ; i <10 ; i++) {
				System.out.print(array[i]+" - ");
			}
			
			
	}

}
