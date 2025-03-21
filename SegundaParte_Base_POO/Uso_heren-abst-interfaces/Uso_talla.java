package paquetepruebas;

import java.util.Scanner;

public class Uso_talla {
	
	//enum talla {Mini , Mediano , Grande , Muy_Grande;}

	enum talla {
		
		MINI ("S") , MEDIANO ("M") , GRANDE ("L") , MUY_GRANDE("XL");
		
	
		private talla (String Abreviatura ) {
			
			this.Abreviatura=Abreviatura; 
			
		}
		
		public String DameAbreviatura () {
			return Abreviatura;
		}
		
		private String Abreviatura;
		
	}
	
	
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe una talla : MINI , MEDIANO , GRANDE , MUY_GRANDE ");
		
		String entrada_datos = entrada.next().toUpperCase();//para ingrese lo q ingrese sea mayusculas
		
		talla La_Talla = Enum.valueOf(talla.class, entrada_datos);//ejemplo metodo valueof
		
		System.out.println("talla = "+ La_Talla);
		
		System.out.println("Abreviatura = "+La_Talla.DameAbreviatura());
	}

}
