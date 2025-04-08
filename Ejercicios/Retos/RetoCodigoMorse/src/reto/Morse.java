/*
 * Crea un programa que sea capaz de transformar texto natural a código
 * morse y viceversa.
 * - Debe detectar automáticamente de qué tipo se trata y realizar
 *   la conversión.
 * - En morse se soporta raya "—", punto ".", un espacio " " entre letras
 *   o símbolos y dos espacios entre palabras "  ".
 * - El alfabeto morse soportado será el mostrado en
 *   https://es.wikipedia.org/wiki/Código_morse.
 */

package reto;

import javax.swing.JOptionPane;

public class Morse {

	public static void main(String[] args) {

		String oracion = JOptionPane.showInputDialog("Ingrese mensaje para traducir a codigo morse");
		
		String [] palabras = oracion.split("\\s+");
		
		for (int i = 0 ; i < palabras.length ; i++) {
			
			String [] letras = palabras[i].split("");
			
			for (int j = 0; j < letras.length; j++) {
				
				System.out.print(Enum.valueOf(codigoMorse.class, letras[j].toUpperCase()).getCodigo()+" ");
			}
			System.out.print("  ");
		}
		
		
	}

}
