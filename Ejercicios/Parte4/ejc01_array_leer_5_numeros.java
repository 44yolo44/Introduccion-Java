/*
 Leer 5 números y mostrarlos en el mismo orden introducido.
*/

package CuartaParte;

import javax.swing.JOptionPane;

public class ejc01_array_leer_5_numeros {
	public static void main(String[] args) {
		
		int [] array = new int [5]; 
		
		System.out.println("ingrese 5 numeros ");
		
		for (int i = 0 ; i<5 ; i++) {
			
			array[i]=Integer.parseInt(JOptionPane.showInputDialog("numero "+(i+1)));
			
		}

		for (int e: array) {
			
			JOptionPane.showMessageDialog(null, e);;
			
		}
		
	}

}
