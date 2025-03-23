package parte1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("CLASE LIBRO : \ningrese datos  ");
		
		Libro1 [] libros =new Libro1 [2];
		
		for (int i = 0 ; i<libros.length ; i++) {
			System.out.println("\nLIBRO "+(i+1));
			
			System.out.print("Nombre: ");
			String nombre = entrada.nextLine();
			
			System.out.print("Titulo: ");
			String titulo = entrada.nextLine();
			
			System.out.print("ISBN: ");
			int isbn = entrada.nextInt();
			
			
			System.out.print("n° de Paginas : ");
			int numpaginas =entrada.nextInt();
			
			
			entrada.nextLine();
			
			libros[i] = new Libro1(isbn , titulo , nombre  , numpaginas);

		}
		
		
		System.out.println("\nDatos: ");

		for(int i = 0 ; i<libros.length ; i++) {
		
			System.out.println("\n"+libros[i].toString());
		}
		
		if(libros[0].getNumeroPaginas()>libros[1].getNumeroPaginas()) {
			System.out.println("el libro con mas paginas es "+libros[0].getTitulo());
		}
		else {
			System.out.println("\nel libro con mas paginas es "+libros[1].getTitulo());
		}
		
		
		
	}

}

