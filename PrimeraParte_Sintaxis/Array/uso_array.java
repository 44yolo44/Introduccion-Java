package Array;

public class uso_array {

	public static void main(String[]args) {
		
		/*int [] mi_matriz = new int [5]; //mas usada
		//int mi_matriz2[] = new int [5]; 
		//no hay diferencia ni internamente es igual solo cambia el estilo
		
		mi_matriz[0]=5;
		mi_matriz[1]=38;
		mi_matriz[2]=-15;
		mi_matriz[3]=92;
		mi_matriz[4]=71;*/
		
		//System.out.println(mi_matriz[3]);
		
		int [] mi_matriz = {5,38,-15,92,71,65,12,37,90,1234,1235,67,38,862,46};
		//declaracion simplificada de una matriz -  inplicita
		
		
		for (int i = 0; i<mi_matriz.length ;i++) {
			
			System.out.println("valor de la posicion "+(i+1)+" es : "+mi_matriz[i]);
		}
		
	}

}
