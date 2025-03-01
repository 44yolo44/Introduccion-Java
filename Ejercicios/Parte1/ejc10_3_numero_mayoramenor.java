/*
 * Pedir tres números y mostrarlos ordenados de mayor a menor.
 */
package PrimeraParte;

import java.util.Scanner;

public class ejc10_3_numero_mayoramenor {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("ingrese 3 numeros : ");
		
		int n1 = entrada.nextInt();		
		int n2 = entrada.nextInt();	
		int n3 = entrada.nextInt();	
		
		if(n1>n2) {
			
			if(n3>n1) {
				System.out.println("el orden es : "+n3+" - "+n1+" - "+n2);
			}
			else {
				if(n3>n2) {
					System.out.println("el orden es : "+n1+" - "+n3+" - "+n2);
				}
				else {
					System.out.println("el orden es : "+n1+" - "+n2+" - "+n3);
				}
			}
		}
		else {
			if(n3>n2) {
				System.out.println("el orden es : "+n3+" - "+n2+" - "+n1);
			}
			else {
				if(n3>n1) {
					System.out.println("el orden es : "+n2+" - "+n3+" - "+n1);
				}
				else {
					System.out.println("el orden es : "+n2+" - "+n1+" - "+n3);
				}
			}
		}
		
		
		/* otra forma es :         Scanner entrada = new Scanner(System.in);
        
        System.out.println("ingrese 3 numeros");
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();

        for (int i = 0; i < 3; i++) {
            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }
            if (b > c) {
                int temp = b;
                b = c;
                c = temp;
            }
        }

        System.out.println("Los numeros ordenados de mayor a menor son: " + c + " " + b + " " + a);
        
        */
		
	}

}
