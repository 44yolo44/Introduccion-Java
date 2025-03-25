package parte2;

public class Persona {
	
	private String nombre ;
	private String sexo ;
	private int edad ;
	
	
	

	
	public Persona (String nombre , String Abreviatura , int edad ){
		
		this.nombre=nombre;
		
		this.sexo = Abreviatura;
		
		this.edad = edad;
		
	}



	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}
	
	public String getsexo() {
		return sexo;
	}

	

}
