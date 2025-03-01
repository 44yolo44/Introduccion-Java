/*
 * Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés.
 */
package PrimeraParte;

import javax.swing.JOptionPane;

public class ejc12_invertir_numero {

	public static void main(String[] args) {
		
		 System.out.println("ingrese un numero entre 0 y 9.999");
		 
		 int numero = Integer.parseInt(JOptionPane.showInputDialog("0 - 9.999"));
		 
		 String cadena = String.valueOf(numero);
		 
		 char array [] = cadena.toCharArray();
		 
		 if(0<numero && numero <10000) {
			 
			 for (int i = cadena.length()-1; i>=0 ; i-- ) {
			 
			 	System.out.print(array[i]);
		 	}
			 }
		 else {
			 System.out.println("no esta en el rango");
		 }
		 
		 
	}

}
