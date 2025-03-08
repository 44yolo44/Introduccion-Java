package TerceraParte;

import java.util.Scanner;

public class ejc06_numeroprimoshastaN {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int c = 0;
        int n;
        
        System.out.print("Ingrese un número: ");
        n = entrada.nextInt();
        
        // Código sin optimizar
        /*
        es ineficiente por que revisa uno por uno los numeros menores q i 
	esto en numero grandes seria repetir muechas acciones sin que sea necesario 
        for (int i = 2; i <= n; i++) {
            boolean esPrimo = true;
            for (int j = 2; j < i; j++) { 
                if (i % j == 0) {
                    esPrimo = false;
                }
            }
            if (esPrimo) {
                c++;
            }
        }
        */
        
        // Código optimizado
        // segun un teorema se determina si un número es primo comprobando hasta la raiz de el mismo.
        for (int i = 2; i <= n; i++) {
            boolean esPrimo = true;
            for (int j = 2; j * j < i; j++) { // Se optimiza el rango de búsqueda
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                c++;
            }
        }
        
        System.out.println("Hay " + c + " números primos hasta " + n);
        
    }
    
}
