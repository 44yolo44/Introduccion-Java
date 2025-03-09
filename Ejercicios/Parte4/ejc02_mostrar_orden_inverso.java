package CuartaParte;

import javax.swing.JOptionPane;

public class ejc02_mostrar_orden_inverso {

	public static void main(String[] args) {
		
		int [] array = new int [5]; 
		
		JOptionPane.showMessageDialog(null, "ingrese 5 numeros ");
		
		for (int i = 0 ; i<5 ; i++) {
			
			array[i]=Integer.parseInt(JOptionPane.showInputDialog("numero "+(i+1)));
		}
		
		for ( int i = 4 ; i >= 0 ; i--) {
			
			JOptionPane.showInternalMessageDialog(null, array[i]);
			
		}

	}

}
