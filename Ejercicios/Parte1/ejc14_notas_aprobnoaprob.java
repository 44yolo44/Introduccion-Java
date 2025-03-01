package PrimeraParte;

import java.util.Scanner;

public class ejc14_notas_aprobnoaprob {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("DETERMINA SI APROBASTE");
		System.out.print("ingrese su nota : ");
		
		float nota = entrada.nextFloat();
		
		if(nota<=10 && nota > 7) {
			
			System.out.println(" su nota es buena ");
			
		}
		else if(nota<=7 && nota>5) {
			
			System.out.println(" su nota es suficiente ");
			
		}
		else if(nota>0 && nota<=5) {
			
			System.out.println(" su nota es insuficiente ");
		}
		else {
			System.out.println(" ingrese nota valida ");
		}
		
		
		
		
		
		
	}

}
