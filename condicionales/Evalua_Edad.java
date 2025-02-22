package condicionales;

import java.util.*;

public class Evalua_Edad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("ingrese su edad: ");
		
		int edad = entrada.nextInt();
		
		if(edad<18) {
			System.out.println("eres un adolecente");
		}
		else if(edad<40) {
			System.out.println("eres joven");
		}
		else if(edad<65) {
			System.out.println("eres mayor");
		}
		else {
			System.out.println("cuidate");
		}
	}

}
