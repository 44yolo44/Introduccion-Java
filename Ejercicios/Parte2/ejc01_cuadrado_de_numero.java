/*
 *  Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número
negativo.

 */

package SegundaParte;

import javax.swing.JOptionPane;

public class ejc01_cuadrado_de_numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("programa que calcula el cuadrado");
		
		int numero = 0;
		
		do 
		{
			
			 numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero (positivo"));
			
			if(numero >=0) {
				JOptionPane.showMessageDialog(null, "el cuadrado de"+numero+" es : "+numero*numero);
			}
			else {
				JOptionPane.showMessageDialog(null, "numero invalido");
			}
			
		}
		while(numero>=0);

	}

}
