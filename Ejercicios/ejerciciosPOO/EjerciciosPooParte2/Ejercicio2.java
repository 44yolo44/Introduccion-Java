package parte1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese los Coeficientes de su Ecuacion ");
		
		System.out.print("Coeficiente Cuadratico : ");
		double a= entrada.nextDouble();
		
		System.out.print("Coeficiente Lineal : ");
		double b= entrada.nextDouble();
		
		System.out.print("Coeficiente Independiente : ");
		double c= entrada.nextDouble();
		
		Raices ecuacion = new Raices(a,b,c);
		
		System.out.println("\n Mostrar Datos");
		
		System.out.println("clacular ecuacion : "+ecuacion.Calcular());
		

	}

}

