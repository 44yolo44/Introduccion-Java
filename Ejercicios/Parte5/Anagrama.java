/*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */

package Javase;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Anagrama {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Ingrese dos palabras y compruebe si es un anagrama ");
		
		String palabra1 = JOptionPane.showInputDialog("Palabra1");
		String palabra2 = JOptionPane.showInputDialog("Palabra2");
		
		if(esAnagrama(palabra1, palabra2)) {
			JOptionPane.showMessageDialog(null, "es un anagrama");
		} else {
			JOptionPane.showMessageDialog(null, "no es un anagrama");
		}
		
		
	}

	
	private static boolean esAnagrama(String palabra1 , String palabra2 ) {
		
		if (palabra1.equalsIgnoreCase(palabra2)) {
			return false;
		} else {
			
			char [] array1 = palabra1.toLowerCase().toCharArray();
			char [] array2 = palabra2.toLowerCase().toCharArray();
			
			if (array1.length == array2.length) {
				
				Arrays.sort(array1);
				Arrays.sort(array2);
				
				if (String.valueOf(array2).equals(String.valueOf(array1))) {
					return true;
				} else {
					return false;
				}
				
			} else {
				return false;
			}

		}

	}
}
