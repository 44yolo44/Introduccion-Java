package Ejercicio4_CarreraAtletismo;

import java.util.Scanner;

public class principal {
	
	public static int indiceGanador (Atleta [] atletas) {
		int indice=0;
		float tiempo = atletas[0].getTiempo();
		
		for (int i = 1 ; i<atletas.length ; i++) {
			if(atletas[i].getTiempo()<tiempo) {
				tiempo = atletas[i].getTiempo();
				indice = i;
			}
		}
		
		
		
		return indice ;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println(" Carrera de Atletismo ");
		System.out.print("\nCuantos Participante hay : ");
		int n = entrada.nextInt();
		
		Atleta [] atletas = new Atleta [n];
		
		for (int i = 0 ; i<atletas.length ; i++) {
			System.out.print("\ningrese el numero : ");
			int numero = entrada.nextInt();
			System.out.print("ingrese el nombre : ");
			String nombre = entrada.next();
			System.out.print("ingrese el tiempo : ");
			float tiempo = entrada.nextFloat();
			
			atletas[i]=new Atleta(numero, nombre, tiempo);
			
		}
		
		//salida
		System.out.println();
		
		for (int i = 0 ; i<atletas.length ; i++ ) {
			System.out.println("\nAtleta n°"+(i+1)+atletas[i].getDatos());
		}
		
		//determinar el ganador
		System.out.println("\ny el ganador es el atleta n°: "+(indiceGanador(atletas)+1)
							+" "+atletas[indiceGanador(atletas)].getDatos());

	}

}
