/*
 * Crear y cargar dos matrices de tamaño 3x3, sumarlas y mostrar su suma.
 */
package QuintaParte;

public class ejc03_sumararreglos {

	public static void main(String[] args) {
		
		int [][] arreglo1 = new int [3][3];
		int [][] arreglo2 = new int[3][3] ;
		int [][] arreglo3 = new int [3][3];
		
		System.out.println("SUMA DE 2 ARREGLOS 3X3");
		
		//cargando arreglo1 con datos aleatorios
		for ( int i = 0 ; i<3 ; i++) {
			for ( int j = 0 ; j<3 ; j++) {
				arreglo1[i][j]=(int)(Math.random()*10);
			}
		}
		//imprimiendo arreglo1
		for ( int i = 0 ; i<3 ; i++) {
			for ( int j = 0 ; j<3 ; j++) {
				System.out.print(arreglo1[i][j]+" - ");
			}
			System.out.println();
		}
		
		System.out.println();

		//cargando arreglo2 con datos aleatorios
		for ( int i = 0 ; i<3 ; i++) {
			for ( int j = 0 ; j<3 ; j++) {
				arreglo2[i][j]=(int)(Math.random()*10);
			}
		}
		//imprimiendo arreglo2
		for ( int i = 0 ; i<3 ; i++) {
			for ( int j = 0 ; j<3 ; j++) {
				System.out.print(arreglo2[i][j]+" - ");
			}
			System.out.println();
		}


		//sumando arreglos
		for ( int i = 0 ; i<3 ; i++) {
			for ( int j = 0 ; j<3 ; j++) {
				arreglo3[i][j]=arreglo1[i][j]+arreglo2[i][j];
			}
		}
		
		System.out.println("\n");
		System.out.println("Suma de arreglos");

		//imprimiendo arreglo3
		for ( int i = 0 ; i<3 ; i++) {
			for ( int j = 0 ; j<3 ; j++) {
				System.out.print(arreglo3[i][j]+" - ");
			}
			System.out.println();
		}



	}

}
