package poo;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		empleados trabajador1 = new empleados("Paco" );
		
		empleados trabajador2 = new empleados("Ana" );
		
		empleados trabajador3 = new empleados("Antonio");
		
		empleados trabajador4 = new empleados("Maria");
		
		trabajador1.cambiaSeccion("RR.HH");
		//trabajador1.cambiaNombre("maria");
		
		System.out.println(trabajador1.getDatos());
		System.out.println(trabajador2.getDatos());
		System.out.println(trabajador3.getDatos());
		System.out.println(trabajador4.getDatos());
		

	}

}


class empleados {
	
	
	public empleados (String nom ) {
		
		nombre = nom ; 
		
		seccion = "administracion";
		
		id = idSiguiente ;
		
		idSiguiente++;
	}
	
	
	public void cambiaSeccion (String seccion) {//setter
		
		this.seccion = seccion ;
		//el q lleva el this pertenece al campo de clase 
	}
	
	/*public void cambiaNombre(String nombre) {//setter
		
		this.nombre = nombre ;
		//esto no tiene sentido una persona no cambia de normbre 
	}*/
	
	public String getDatos() {
		
		return "El nombre es : "+nombre+" y la seccion es : "+seccion+" y el Id es : "+id;
	}
	
	//campo de clase 
	private final String nombre ; // !!!constante 
	private String seccion;
	
	private int id;
	
	private static int idSiguiente = 1;
}

