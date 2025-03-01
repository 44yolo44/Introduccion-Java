/*
 * Pedir dos números y mostrarlos ordenados de mayor a menor.
 */

package PrimeraParte;

import javax.swing.JOptionPane;

public class ejc09_ordenar_2_numeros {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "ingrese 2 numeros ");
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero "));
		
		if(n1>n2) {
			
			JOptionPane.showMessageDialog(null, "el orden es : "+n1+" - "+n2);
		}
		else if(n2>n1) {
			JOptionPane.showMessageDialog(null, "el orden es : "+n2+" - "+n1);
		}
		else {
			JOptionPane.showMessageDialog(null, "son iguales : "+n1+" = "+n2);
		}
		
	}

}
