/*
 * Crea un programa que comprueba si los paréntesis, llaves y corchetes
 * de una expresión están equilibrados.
 * - Equilibrado significa que estos delimitadores se abren y cieran
 *   en orden y de forma correcta.
 * - Paréntesis, llaves y corchetes son igual de prioritarios.
 *   No hay uno más importante que otro.
 * - Expresión balanceada: { [ a * ( c + d ) ] - 5 }
 * - Expresión no balanceada: { a * ( c + d ) ] - 5 }
 */
package Retos;

import java.util.Stack; 

public class expresionesEquilibradas {

    public static void main(String[] args) {

        String expresion1 = "{ [ a * ( c + d ) ] - 5 }";
        String expresion2 = "{ a * ( c + d ) ] - 5 }";

        System.out.println("Expresión1 está balanceada: " + esBalanceado(expresion1));
        System.out.println("Expresión2 está balanceada: " + esBalanceado(expresion2));
    }

    public static boolean esBalanceado(String expresion) {

        // Creamos una pila para almacenar los símbolos de apertura encontrados
        Stack<Character> pila = new Stack<>();

        // Recorremos cada carácter de la expresión
        for (char e : expresion.toCharArray()) {

            switch (e) {
                // Si encontramos un símbolo de apertura, lo apilamos
                case '{':
                case '[':
                case '(':
                    pila.push(e); // push() añade el símbolo a la cima de la pila
                    break;

                // Si encontramos un símbolo de cierre, verificamos el tope de la pila
                case '}':
                    // Comprobamos dos cosas:
                    // 1. Si la pila está vacía (no hay con qué emparejar el cierre)
                    // 2. Si el símbolo del tope no es el que debería cerrar este delimitador
                    if (pila.isEmpty() || pila.pop() != '{') return false;
                    // pop() saca el último símbolo apilado para compararlo
                    break;

                case ']':
                    if (pila.isEmpty() || pila.pop() != '[') return false;
                    break;

                case ')':
                    if (pila.isEmpty() || pila.pop() != '(') return false;
                    break;

                default:
                    // Si es cualquier otro carácter (letras, números, espacios...), lo ignoramos
            }
        }

        // Al final, la pila debe estar vacía si todo fue correctamente emparejado
        return pila.isEmpty(); // isEmpty() retorna true si no quedó ningún símbolo sin cerrar
    }
}
