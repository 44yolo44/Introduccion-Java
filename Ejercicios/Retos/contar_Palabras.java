package Javase;

import javax.swing.JOptionPane;

public class contar_Palabras {

	public static void main(String[] args) {
		
		
		String frase = JOptionPane.showInputDialog("ingrese una frase");
		
		JOptionPane.showMessageDialog(null, "El numero de palabras es : "+contarPalabras(frase)	);
		

	}
	
	 public static int contarPalabras (String frase) {
		String [] palabras = frase.split("\\s+");
		return palabras.length;
	}

}
