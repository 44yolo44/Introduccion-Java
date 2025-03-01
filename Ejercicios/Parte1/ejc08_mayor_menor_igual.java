/*
 *  Pedir dos números y decir cual es el mayor o si son iguales
 */
package PrimeraParte;

import java.util.Scanner;

public class ejc08_mayor_menor_igual {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("ingrese dos numeros : ");
		
		int n1 = entrada.nextInt();
		int n2 = entrada.nextInt();
		
		if(n1>n2) {
			
			System.out.println("el mayor es : "+n1);
		}
		else if(n2>n1) {
			System.out.println("el mayor es : "+n2);
		}
		else {
			System.out.println(n1+" y "+n2+" son iguales");
		}
			

	}

}
