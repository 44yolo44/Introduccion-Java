package PrimeraParte;

import javax.swing.JOptionPane;

public class ejc05_si_es_negativo {

	public static void main(String[] args) {
		
		System.out.println("programa que determina si un numero es positivio o negativo");
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero : "));
		
		if ( numero < 0 ) {
			JOptionPane.showMessageDialog(null, "su numero es negativo");
		}
		else if (numero == 0) {
			
			JOptionPane.showMessageDialog(null, "tu numero es 0");
		}
		else {
			JOptionPane.showMessageDialog(null, "tu numero es positivo");
		}

	}

}
