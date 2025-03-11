/*
 * Crear y cargar una tabla de tamaño 3x3, trasponerla y mostrarla.
 */

package QuintaParte;

public class ejc04_transponer3x3 {

	public static void main(String[] args) {
		
		int [][] arreglo = new int [3][3];
		int [][] arreglo2 = new int [3][3];

		System.out.println("Trasponer una tabla de tamaño 3x3");
		
		//cargando arreglo con datos aleatorios
		for ( int i = 0 ; i<3 ; i++) {
			for ( int j = 0 ; j<3 ; j++) {
				arreglo[i][j]=(int)(Math.random()*10);
			}
		}
		//imprimiendo arreglo
		for ( int i = 0 ; i<3 ; i++) {
			for ( int j = 0 ; j<3 ; j++) {
				System.out.print(arreglo[i][j]+" - ");
			}
			System.out.println();
		}

		//trasponiendo arreglos
		for ( int i = 0 ; i<3 ; i++) {
			for ( int j = 0 ; j<3 ; j++) {
				arreglo2[i][j]=arreglo[j][i];
			}
		}
		
		System.out.println("\n");
		System.out.println("Traspuesta de arreglos");

		//imprimiendo arreglo2
		for ( int i = 0 ; i<3 ; i++) {
			for ( int j = 0 ; j<3 ; j++) {
				System.out.print(arreglo2[i][j]+" - ");
			}
			System.out.println();
		}




	}

}
