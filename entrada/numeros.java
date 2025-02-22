package entrada;

import javax.swing.JOptionPane;

public class numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero pls: " ));
		
		System.out.print("la raiz de : "+num1+" es ");
		System.out.printf("%1.2f",Math.sqrt(num1));

	}

}
