/*
 *Construir un programa que permita dirigir el movimiento de un objeto
 *dentro de un tablero y actualice su posición dentro del mismo. 
 *Los movimientos posibles son ARRIBA, ABAJO, IZQUIERDA y DERECHA. 
 *Tras cada movimiento el programa mostrará la nueva dirección elegida y 
 *las coordenadas de situación del objeto dentro del tablero.
 */

package Ejercicio2_movimiento;

import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        System.out.println("1. arriba 2. abajo 3. izquierda 4. derecha 5. salir");


        //posicion inicial    
        movimiento mov = new movimiento(0, 0);

        do {
            
            
            System.out.print("\n\nIntroduce Movimiento: ");
            opcion = sc.nextInt();


            switch (opcion) {
                case 1:
                    mov.moverArriba();
                    break;
                case 2:
                    mov.moverAbajo();
                    break;
                case 3:
                    mov.moverIzquierda();
                    break;
                case 4:
                    mov.moverDerecha();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opcion != 5);

    System.out.println("al final las cordenas son: (" + mov.mostrarPosicion() + ")");
    }

}
