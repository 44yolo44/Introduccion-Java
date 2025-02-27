package PrimeraParte;

import javax.swing.*;

public class ejc04_si_2n_son_iguales {

	public static void main(String[] args) {
		
		System.out.println("programa que compara 2 numeros ");
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("ingresa el primer numero"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("ingresa el segundo numero"));
		
		if(n1==n2) {
			
			JOptionPane.showMessageDialog(null, "son iguales");
		}
		else {
			
			JOptionPane.showMessageDialog(null, "no son iguales :c");
		}
	

	}

}
