/*
 	Necesitamos mostrar un contador con 5 dígitos (X-X-X-X-X), que muestre los números del 0-0-0-0-0
	al 9-9-9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
 */

package TerceraParte;

public class ejc05_contador_5digitos {

	public static void main(String[] args) {
		
		for ( int i = 1 ; i < 10 ; i++) {
			if(i!=3) {
				for ( int j = 0 ; j < 5 ; j++ ) {
				
					System.out.print(i+"-");
					if(j==4) {
						System.out.print(i);
					}
				}
			}
			else {
				for ( int j = 0 ; j < 5 ; j++ ) {
					
					System.out.print("E-");
					if(j==4) {
						System.out.print("E");
					}
				}
			}
			System.out.println();
		}
	
	}

}
