package buclefor;

import javax.swing.JOptionPane;

public class Autentificacion_correo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arroba =0;
		
		boolean punto = false;

		String mail = JOptionPane.showInputDialog("Introduce Email: ");
		
		for (int i = 0; i<mail.length();i++) {
			
			if(mail.charAt(i)=='@'){

				arroba++;
			}
			
			if(mail.charAt(i)=='.') {
				
				punto = true;
			}
		}
		
		if(arroba==1&&punto==true) {
			
			System.out.println("es correcto");	
		}
		else {
			
			System.out.println("no es correcto");
		}
	}

}
