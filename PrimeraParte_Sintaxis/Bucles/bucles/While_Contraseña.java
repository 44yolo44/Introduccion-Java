package bucles;

import javax.swing.*;

public class While_Contraseña {

	public static void main(String[] args) {
		
		String clave="Mauricio";
		
		String pass="";
		
		while (clave.equals(pass)==false) {
			
			pass=JOptionPane.showInputDialog("Introduce la contraseña ");
			
			if (clave.equals(pass)==false) {
				
				System.out.println("la clave es incorrecta "); 
			}
		}
		
		System.out.println("la clave es correcta. acceso permitido ");

	}

}
