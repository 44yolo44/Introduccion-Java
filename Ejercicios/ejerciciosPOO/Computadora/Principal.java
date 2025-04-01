package EjercicioPoo;

public class Principal {
	
	public static void main(String[] args) {	
	
		try {
			Computadora compu1 = new Computadora("DELL","INSPIRION",64,50);
			
			System.out.println(compu1);
			
			compu1.encender();
			compu1.encender();
			
			System.out.println(compu1);
			compu1.apagar();
			
			compu1.encender();
			System.out.println(compu1);
			
			compu1.tranferirArchivos(30);
			compu1.tranferirArchivos(30);
			
			compu1.eliminarArchivos(20);
			compu1.eliminarArchivos(20);
			
			Computadora compu2 = new Computadora("DELL","INSPIRION",64,50);
			System.out.println("computadora2"+compu2);
			
			if (compu1.equals(compu2)) {
				
				System.out.println("las computadoras son iguales");
				
			} else {
				
				System.out.println("las compus son diferentes");

			}
			
		
		
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
