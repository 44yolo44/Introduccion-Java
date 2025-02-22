package Switch;

import java.util.*;
import javax.swing.*;

public class Areas {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Elige una Opción : \n1: Cuadrado \n2: Rectángulo \n3: Triángulo \n4: Círculo ");
		
		int figura = entrada.nextInt();
		
		switch(figura) {
		
		case 1:
			int lado = Integer.parseInt(JOptionPane.showInputDialog("intraduce la medida del lado"));
 
			System.out.println("el Area del cuadrado es : "+Math.pow(lado,2));//puede se lado*lado
			
			break;
			
		case 2:
			int largo=Integer.parseInt(JOptionPane.showInputDialog("ingresa el largo"));
			int ancho=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el ancho"));
			
			System.out.println("El Área del Rectángulo es: "+(largo*ancho));
			
			break;
		case 3:
			int base=Integer.parseInt(JOptionPane.showInputDialog("engresa la base"));
			int altura=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la altura"));
			
			System.out.println("El Área del Triangulo es: "+((base*altura)/2));
			
			break;
		case 4:
			int radio=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el radio "));
			
			System.out.println("El Área del Círculo es ");
			System.out.printf("%1.2f", Math.PI*Math.pow(radio, 2));
		
			break;
		default:
			System.out.println("la opcion ingresada no es correcta ");
		}
	}

}
