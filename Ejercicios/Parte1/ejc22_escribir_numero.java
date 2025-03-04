/*
 *  Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56 mostrar: cincuenta y seis.
 */
package PrimeraParte;

import java.util.Scanner;

public class ejc22_escribir_numero {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un número entre 0 y 99: ");
        int numero = scanner.nextInt();
        
        if (numero < 0 || numero > 99) {
            System.out.println("El número debe estar entre 0 y 99");

        }
        
        System.out.println("El número " + numero + " escrito es: " + numeroEnPalabras(numero));
        
        scanner.close();
    }
    
    public static String numeroEnPalabras(int numero) {
        String[] unidades = {
            "cero", "uno", "dos", "tres", "cuatro", 
            "cinco", "seis", "siete", "ocho", "nueve",
            "diez", "once", "doce", "trece", "catorce",
            "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve"
        };
        
        String[] decenas = {
            "", "", "veinte", "treinta", "cuarenta",
            "cincuenta", "sesenta", "setenta", "ochenta", "noventa"
        };
        
        if (numero < 20) {
            return unidades[numero];
        } else if (numero % 10 == 0) {
            return decenas[numero / 10];
        } else if (numero < 30) {
            return "veinti" + unidades[numero % 10];
        } else {
            return decenas[numero / 10] + " y " + unidades[numero % 10];
        }
    }
}
