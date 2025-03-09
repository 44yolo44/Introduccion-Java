/*
 Leer por teclado dos tablas de 10 números enteros y 
  mezclarlas en una tercera de la forma: el 1º de A, el 1º
  de B, el 2º de A, el 2º de B, etc.
*/


package CuartaParte;

import javax.swing.JOptionPane;

public class ejc05_combinar_arrays {
	public static void main(String[] args) {
		
			// Declaración de variables
	
	    int[] arrayA = new int[10];
	    int[] arrayB = new int[10];
	    int[] arrayC = new int[20];
	
	
	    // Llenar los arrays A y B
	
	    for (int i = 0; i < 10; i++) {
	      arrayA[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número "+(i+1)+" para el array A: "));
	    }
	
	    for (int i = 0; i < 10; i++) {
	      arrayB[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número "+(i+1)+" para el array B: "));
	    }
	
	    // Combinar los arrays A y B en el array C
	    
	    //mi forma
	    for (int i = 0 ; i < 10; i++) {
	      arrayC[i * 2] = arrayA[i];
	      arrayC[i * 2 + 1] = arrayB[i];
	    }
	    
	    //otra solucion (mas simple)
	    /*int j = 0;
	    for ( int i = 0 ; i<10 ; i++) {
	    	arrayC[j]=arrayA[i];
	    	j++;
	    	arrayC[j]=arrayB[i];
	    	j++;
	    }*/
	    
	    
	    
	    // Mostrar el array C
	
	    JOptionPane.showMessageDialog(null, "El array C es: ");
	    for (int i = 0; i < 20; i++) {
	      System.out.print(arrayC[i]+" ");
	    }
		
		
	}

}
