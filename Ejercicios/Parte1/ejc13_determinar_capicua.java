/*
 * Pedir un número entre 0 y 9.999, decir si es capicúa.
 */
package PrimeraParte;

import javax.swing.JOptionPane;

public class ejc13_determinar_capicua{

	public static void main(String[] args) {
		
		 System.out.println("ingrese un numero entre 0 y 9.999");
		 
		 int numero = Integer.parseInt(JOptionPane.showInputDialog("0 - 9.999"));
		 
		 String cadena = String.valueOf(numero);
		 
		 char array [] = cadena.toCharArray();
		 char array2 [] = new char [cadena.length()];
	
		 
		 if(numero > 0 && numero < 9999 ) {
			 
			 int j=0;
			 for (int i = cadena.length()-1 ; i>=0 ; i-- ) {
			      
				array2[j]=array[i];
				j++;
			 }
			 cadena = String.valueOf(array);
			 String cadena2 = String.valueOf(array2);
			 
			 if(cadena.equals(cadena2)) {
				 JOptionPane.showMessageDialog(null, "si es capicua");;
			 }
			 else {
				 JOptionPane.showMessageDialog(null, "no es capicua");
			 }
	
		 }
		 else {
			 JOptionPane.showMessageDialog(null, numero+" no esta dentro del rango ");
		 }
		 	 
	}
}
