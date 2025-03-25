package parte2;

public abstract class Persona  {
	
	private String nombre ;
	private char sexo ;
	private int edad ;
	private boolean asistencia;
	
	//constantes
	private final String [] NOMBRES_CHICOS = {"Juan","Luis","Mateo","Lucas","Isaias"};
	private final String [] NOMBRES_CHICAS = {"Maria","Elena","Valeria","Kristell","Mariana"};
	private final int CHICO = 0;
	private final int CHICA = 1;
	
	//por que no acepta parametros? : por que los datos seran aleatorios desdde aqui
	public Persona () {
		
		int determinar_sexo =MetodosSuletos.generarNumeroAleatorio(0, 1);
		
		//si es 0 es Hombre
		if(determinar_sexo==CHICO) {
			nombre=NOMBRES_CHICOS[MetodosSuletos.generarNumeroAleatorio(0, 4)];
			sexo = 'H';
		}
		else {
			nombre=NOMBRES_CHICAS[MetodosSuletos.generarNumeroAleatorio(0, 4)];
			sexo = 'M';
		}
		
		disponibilidad();
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	public boolean isAsistencia() {
		return asistencia;
	}

	public void setAsistencia(boolean asistencia) {
		this.asistencia = asistencia;
	}

	public abstract void disponibilidad();
	
	
	

}
