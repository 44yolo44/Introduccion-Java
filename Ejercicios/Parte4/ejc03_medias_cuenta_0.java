/*
Leer 5 números por teclado y a continuación realizar la media de los números positivos, la media
de los negativos y contar el número de ceros.
*/

package CuartaParte;

import java.util.Scanner;

public class ejc03_medias_cuenta_0 {
	
	public static void main(String [] args ) {
		
		Scanner entrada = new Scanner(System.in);
		
		 int num ;
		//suma 1  , suma 2  , contador 1 , 2 y 3
		int s1 = 0 , s2 = 0 , c1 = 0 , c2= 0 , c3= 0; 
		
		System.out.println("ingrese 5 numeros : ");
		
		for (int i = 0 ; i<5 ; i++) {
			
			num = entrada.nextInt();
			
			if(num<0) {
				s1+=num;
				c1++;
			}
			else if(num>0) {
				s2+=num;
				c2++;
			}
			else {
				c3++;
			}
			
		}
		
		
		System.out.println("la media de los numeros negativos es : "+(s1/c1));
		System.out.println("la media de los numeros positivos es : "+(s2/c2));
		System.out.println("el numero de ceros es : "+c3);
		
		
		
	}

}
