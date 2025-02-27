package PrimeraParte;

import java.util.Scanner;

public class ejc03_perimetro {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("programa que calcula la longitud de un circulo");
		
		System.out.print("\ningresa el radio : ");
		
		double radio = entrada.nextDouble();
		
		double longitud = 2*Math.PI*radio;
		
		System.out.println("\nla longitud del circulo es : "+longitud);
			
	}

}
