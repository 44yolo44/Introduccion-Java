package TerceraParte;

public class ejc03_tablas_multiplicar1al10 {
	
	public static void main(String[] args) {
		
		System.out.println("******TABLAS DE MULTIPLICAR******");
		
		for (int i = 1 ; i <=10 ; i++) {
			System.out.println("\ntabla del "+i);
			for(int j = 1 ; j<=10 ; j++) {
				System.out.println(i+" * "+j+" = "+(i*j));
			}
		}
	}

}
