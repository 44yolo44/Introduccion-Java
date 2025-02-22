package entrada;
import javax.swing.*;
public class Entrada_Ejemplo2 {

	public static void main(String[] args) {
		
	String nombre_usuario = JOptionPane.showInputDialog("ingresa tu nombre : ");
	
	int edad = Integer.parseInt(JOptionPane.showInputDialog("tu edad papi? : "));
	
	edad++;
	
	System.out.println("hola "+nombre_usuario+" tel otro año tendras  "+edad+" años");

	}

}