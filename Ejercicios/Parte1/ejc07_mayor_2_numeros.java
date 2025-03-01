/*
 * Pedir dos números y decir cual es el mayor.
 */

package PrimeraParte;

import javax.swing.JOptionPane;

public class ejc07_mayor_2_numeros {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "ingrese dos numeros : ");
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("primer numero"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("segundo numero"));

		
		if(n1>n2) {
			
			JOptionPane.showMessageDialog(null, "el mayor es "+n1);
		}
		else {
			
			JOptionPane.showMessageDialog(null, "el mayor es "+n2);
		}
		
		
		
	}

}
