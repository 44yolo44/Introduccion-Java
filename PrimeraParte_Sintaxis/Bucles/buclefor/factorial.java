package buclefor;

import javax.swing.*;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int resultado = 1 ; 
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("introduce el numero del factorial "));
		
		for ( int i = numero ; i >0 ; i--) {
			
			resultado = resultado * i ;
		}
		
		System.out.println("el factorial de "+numero+"es :"+resultado);
	}

}
