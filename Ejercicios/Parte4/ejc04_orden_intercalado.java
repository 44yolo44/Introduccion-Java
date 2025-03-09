/*9
 *  Leer 10 números enteros. Debemos mostrarlos en el siguiente 
 *  orden: el primero, el último, el segundo, el penúltimo, el tercero, etc.
 */

package CuartaParte;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ejc04_orden_intercalado {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("ingrese 10 numeros ");
		
		int [ ] array = new int [10];
		
		for (int i = 0 ; i<10 ; i++) {
			array[i]=Integer.parseInt(JOptionPane.showInputDialog("numero "+(i+1)+" : "));
		}
		
		for ( int i = 0 ; i<5 ; i++) {
			JOptionPane.showMessageDialog(null, (array[i])+" - "+(array[9-i]));
		}
			

	}

}
