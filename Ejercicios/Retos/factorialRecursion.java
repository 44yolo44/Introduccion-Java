package recursion;

import javax.swing.JOptionPane;

public class factorialRecursion {
	
	public static long factorial (long n ) {
		
		if(n<=0) {
			return 1;
		}
		else {
			long respuesta= n*factorial(n-1);
			
			return respuesta;
		}
		
	}
	
	public static void main(String[] args) {
		
		long n = Integer.parseInt(JOptionPane.showInputDialog("Calcular Factoral de :"));
		
		JOptionPane.showMessageDialog(null, factorial(n));
		
	}

}
