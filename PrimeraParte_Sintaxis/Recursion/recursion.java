import java.util.Scanner;

public class RecursionExplicada {

    // Función recursiva para calcular el factorial de un número
    public static int factorial(int n) {
        // Paso 1: Caso base
        if (n == 0 || n == 1) {
            System.out.println("factorial(" + n + ") = 1 (caso base alcanzado)");
            return 1;
        }

        // Paso 2: Llamada recursiva
        System.out.println("factorial(" + n + ") = " + n + " * factorial(" + (n - 1) + ")");
        int resultado = n * factorial(n - 1);

        // Paso 3: Mostrar el resultado después de volver de la recursión
        System.out.println("Resultado de factorial(" + n + ") = " + resultado);
        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número para calcular su factorial: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("El factorial no está definido para números negativos.");
        } else {
            System.out.println("\n--- Inicio de la recursión ---");
            int resultado = factorial(numero);
            System.out.println("--- Fin de la recursión ---\n");

            System.out.println("Factorial de " + numero + " es: " + resultado);
        }

        scanner.close();
    }
}
