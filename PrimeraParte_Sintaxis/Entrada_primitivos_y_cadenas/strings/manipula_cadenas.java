package strings;

public class manipula_cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre = "Mauricio";
		
		System.out.println("Mi Nomnre es : " +nombre);
		
		System.out.println("Mi Nombre Tiene: "+nombre.length()+" letras. ");
		
		System.out.println("la primera letra de "+nombre +" es : " +nombre.charAt(0));
	
		System.out.println("la ultima letra de "+nombre +" es : " +nombre.charAt(nombre.length()-1));
	}

}
