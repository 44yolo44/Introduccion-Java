package poo;

import javax.swing.JOptionPane;

public class uso_coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Coche Renault = new Coche();//ejemplar de una clase - instancia de una clase 
		System.out.println(Renault.dame_largo());
		//System.out.println("este coche tien "+Renault.ruedas+" ruedas");*/
		
		Coche mi_coche = new Coche();
		
		mi_coche.establece_color(JOptionPane.showInputDialog("Introduce color"));
		
		//mi_coche.color = "rosa";
		System.out.println(mi_coche.dame_datos_generales());
		
		System.out.println(mi_coche.dame_color());
		
		mi_coche.configura_asientos(JOptionPane.showInputDialog("su coche tiene asientos de cuero?"));
		
		System.out.println(mi_coche.dime_asientos());
		
		mi_coche.configura_climatizador(JOptionPane.showInputDialog("Su coche lleva climatizador"));
		
		System.out.println(mi_coche.dime_climatizador());
		
		System.out.println(mi_coche.dime_peso_coche());
		
		System.out.println("el precio final del coche es : "+mi_coche.precio_coche());

	}

}
