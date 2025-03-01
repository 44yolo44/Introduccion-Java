/*
 Pedir dos números y decir si uno es múltiplo del otro.
 */
package PrimeraParte;

import javax.swing.JOptionPane;

public class ejc06_decir_si_es_multiplo {
	
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "ingrese dos numeros : ");
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("primer numero"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("segundo numero"));
		
		int m1=n1%n2;
		int m2=n2%n1;
		
		if(m1==0) {
			
			JOptionPane.showMessageDialog(null, n2+" es multiplo de "+n1);
		}
		else if (m2==0) {
			
			JOptionPane.showMessageDialog(null, n1+" es multiplo de "+n2);
		}
		else {
			JOptionPane.showMessageDialog(null, "no son multiplos entre si");
		}
		
	}
}
