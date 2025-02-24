package bucles;

import java.util.Scanner;

public class Juego_Adivinar_Numero {
	
	public static void main(String[] args) {
	
		int aleatorio = (int)(Math.random()*100);
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		
		int intentos = 0;
		
		/*
		    incorrect por que el numero aleatorio puede ser 0.00008 y va a hacer q sea 0
		    
		    while(numero!=aleatorio) {
			
			System.out.println("introduce un numero porfavor");
			
			numero = entrada.nextInt();
			
			
			if(aleatorio<numero) {
			
				System.out.println("mas bajo");
			}
			else if(aleatorio>numero) {
			
				System.out.println("mas alto");
			}
			
			intentos++;
		}*/
		
		do {
			
			System.out.println("introduce un numero porfavor");
			
			numero = entrada.nextInt();
			
			
			if(aleatorio<numero) {
			
				System.out.println("mas bajo");
			}
			else if(aleatorio>numero) {
			
				System.out.println("mas alto");
			}
			
			intentos++;
		}while(numero!=aleatorio);
	
		System.out.println("correcto lo as conseguido en: "+intentos+" intentos");
		
	}

}
