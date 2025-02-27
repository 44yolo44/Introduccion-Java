//Mauricio Farro 
//programa que imprime una tabla de aumentos anuales de sueldo todos empiezan en x y van aumentando de 
//10% 11% 12% 13% 14% 15%
package Array;

public class ejercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double s = 0;
		double array [][] = new double [6][5];
		double interes = 0.10;
		
		for (int i = 0 ; i<6 ; i++){
			
			array[i][0]=10000;
			s= 10000;
			
			for (int j = 1 ; j < 5 ; j++ ) {
				
				s = s + (s*interes);
				array[i][j]=s;
			}
			
			interes += 0.01;
		}
			for ( int i = 0 ; i<6 ; i++) {
				
				System.out.println();
				
				for(int j = 0 ; j<5 ; j++) {
					System.out.printf("%1.2f",array[i][j]);
					System.out.print(" ");
				}
			}
		}

	}

