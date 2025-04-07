/*
 * Crea un programa se encargue de transformar un número
 * decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
 */

package Javase;

import javax.swing.JOptionPane;

public class decimalBinario {
	
	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Igrese un numero decimal para convertirlo a binario"));

		JOptionPane.showMessageDialog(null, decimalABinario(numero));
		
		//ejemplos de este problema ya integrados en java 
		
		// metodo Integer.toBinaryString() y Integer.toString() con base 2
		
		System.out.println(Integer.toBinaryString(numero));
		
		System.out.println(Integer.toString(numero,2));
		
		
		
		
	}
	//algoritmo del programa 
    public static String decimalABinario (int decimal) {
       
    	int num = decimal ; 
    	String binario = "";
    	
    	while ( num != 0 ) {
    		int residuo = num %2 ;
    		num = num /2;
    		binario = residuo + binario ; //va agregando el ultimo residuo a la primera posicion 
    	}
    	
    	return binario.isEmpty()?"0":binario; //si binario esta vacio te muestra 0 si no esta vacio muestra el resultado 
    }

}
