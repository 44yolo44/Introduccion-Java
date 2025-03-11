package CuartaParte;

import java.util.*;

public class ejc15_combinar2arrays {

	public static void main(String [] args ) {
		
		int [] array1 = new int [10];
		int [] array2 = new int [10];
		int [] array3 = new int [20];
		
		//llenar arrays:
		System.out.println("array 1 :");
		for (int i=0 ; i<10 ; i++) {
			array1[i]=(int)(Math.random()*100);
			System.out.print(array1[i]+" - ");
		}
		
		System.out.println("\narray 2 :");
		for (int i=0 ; i<10 ; i++) {
			array2[i]=(int)(Math.random()*100);
			System.out.print(array2[i]+" - ");
		}

	
		int j = 0;
		int k = 0;
		
		for (int i = 0 ; i<20 ; i++) {
			
			if (i<=9) {
				array3[i]=array2[j];
				j++;
			}
			else {
				array3[i]=array1[k];
				k++;
			}
			
		}
		
		//ordena el array usa tim sort
		Arrays.sort(array3);
		System.out.println("\ncombinado y en orden ");
		
		for( int e:array3) {
			System.out.print(e+" - ");
		}
	
	}
}
