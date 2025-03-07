package TerceraParte;

public class ejc01_porgrama_estructuta {

	public static void main(String[] args) {
		
		int suma = 0 ; 
		
		for (int i = 0 ; i < 4 ; i++) {
			for (int j = 0 ; j<4 ; j++) {
				suma = (i*10)+j;
				System.out.print(suma+" - ");
			}
			System.out.println(" ");
		}

	}

}
