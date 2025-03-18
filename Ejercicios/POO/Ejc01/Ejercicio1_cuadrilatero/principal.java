/*
Construir un programa que calcule el área y el perímetro 
de un cuadrilátero dada la longitud de sus dos lados. 
Los valores de la longitud deberán introducirse por línea de órdenes. 
Si es un cuadrado, sólo se proporcionará la longitud de uno de los lados al constructor.
*/

package Ejercicio1_cuadrilatero;

import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.println("Calculo de area y perimetro de un cuadrilatero");
    System.out.print("Introduce el lado 1: ");
    int lado1 = entrada.nextInt();

    System.out.print("Introduce el lado 2: ");
    int lado2 = entrada.nextInt();

    if (lado1 == lado2) {
    	cuadrilatero cuadrado = new cuadrilatero(lado1);
    	
        System.out.println("El area del cuadrado es: " + cuadrado.area());
        System.out.println("El perimetro del cuadrado es: " + cuadrado.perimetro());
    } else {
    	cuadrilatero rectangulo = new cuadrilatero(lado1, lado2);
    	
        System.out.println("El area del rectangulo es: " + rectangulo.area());
        System.out.println("El perimetro del rectangulo es: " + rectangulo.perimetro());
    }
    entrada.close();
    }



}
