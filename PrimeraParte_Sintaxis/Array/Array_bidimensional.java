package Array;

public class Array_bidimensional {
	
	public static void main(String[] args) {
		
		/*int [] [] matrix = new int [4] [5];
		
		matrix[0][0] = 1 ;
		matrix[0][1] = 2 ;
		matrix[0][2] = 43 ;
		matrix[0][3] = 12 ;
		matrix[0][4] = 19 ;
		
		matrix[1][0] = 112 ;
		matrix[1][1] = 14 ;
		matrix[1][2] = 56 ;
		matrix[1][3] = 76 ;
		matrix[1][4] = 98 ;
		
		matrix[2][0] = 34 ;
		matrix[2][1] = 52 ;
		matrix[2][2] = 76 ;
		matrix[2][3] = 24 ;
		matrix[2][4] = 64 ;
		
		matrix[3][0] = 87 ;
		matrix[3][1] = 92 ;
		matrix[3][2] = 34 ;
		matrix[3][3] = 234 ;
		matrix[3][4] = 43 ;*/
		
		int matrix [][] = {
				{1,2,43,12,19},
				{112,14,56,76,98},
				{34,52,76,24,64},
				{87,92,34,234,43}
		};
		
		
		
		/*for (int i = 0 ; i < 4 ; i++) {
			
			for ( int j = 0 ; j < 5 ; j++ ) {
				
				System.out.print(matrix[i][j]+" - ");
			}
			
			System.out.println(" ");
		}*/
		
		for(int [] fila:matrix) {
			System.out.println(" ");
			for (int columna : fila) {
				System.out.print(columna + " ");
			}
		}
		
		
	}

}
