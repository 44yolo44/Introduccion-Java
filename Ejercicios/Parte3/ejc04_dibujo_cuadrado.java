package TerceraParte;

import java.util.Scanner;

public class ejc04_dibujo_cuadrado {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n = 0 ;
		
		System.out.print("DIBUJO DE CUADRADOS DE N X N CON (*) \n Ingrese N : ");
		n = entrada.nextInt();
		
		//me gusta para simular q limpia la pantalla
		for (int k = 0; k < 50; k++) 
            System.out.println();
    
            
		for(int i = 0 ; i<n ; i++) {
			
			for ( int j = 0 ; j<n ; j++)
				System.out.print("*");
			System.out.println();
		}

	}
}
