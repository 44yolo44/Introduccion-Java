package Array;

import javax.swing.*;

public class for_each {
	
	public static void main(String[]args) {
		// TODO Auto-generated method stub
		
		String paises [] = new String [8] ;
		
		/*paises[0]="peru";
		paises[1]="españa";
		paises[2]="chile";
		paises[3]="colombia";
		paises[4]="japon";
		paises[5]="usa";
		paises[6]="rusia";
		paises[7]="china";*/
		
		//String [] paises = {"peru","españa","chile","colombia","japon","usa","rusia","china"};
		
		/*for (int i=0; i<paises.length ; i++) {
			
			System.out.println("pais "+(i+1)+" : "+paises[i]);
		}*/
		
		for (int i = 0;i<8;i++) {
			
			paises [i]=JOptionPane.showInputDialog("introduce País "+(i+1));
		}
		
		for (String elemento : paises ) {
			
			System.out.println("pais : "+elemento);
		}

	}

}
