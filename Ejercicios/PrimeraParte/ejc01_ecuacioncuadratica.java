package PrimeraParte;

import java.util.*;

public class ejc01_ecuacioncuadratica {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Programa para resolver ecuacion cuadratica");
        
        // entrada
        System.out.println("Introduce los coeficientes a,b,c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        
        // discriminante
        double d = b * b - 4 * a * c;
        
        // Verificar
        if (d < 0) {
            System.out.println("no tiene soluciones reales.");
        } else if (d== 0) {
            // Una solo
            double x = -b / (2 * a);
            System.out.println("una sola solucion real: x = " + x);
        } else {
            // Dos soluciones reales
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("la ecuación tiene dos soluciones reales:"+x1+" y "+x2);
        }
	}
}
