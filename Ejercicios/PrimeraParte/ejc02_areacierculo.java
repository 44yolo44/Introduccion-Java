package PrimeraParte;

import javax.swing.*;

public class ejc02_areacierculo {
	
	public static void main(String[] args) {
		
		System.out.println("programa que calcula el area");
		
		int radio = Integer.parseInt(JOptionPane.showInputDialog("ingrese el radio"));
		
		double area = Math.PI*radio*radio ; 
		
		JOptionPane.showMessageDialog(null, "el area es : "+area);

	}

}
