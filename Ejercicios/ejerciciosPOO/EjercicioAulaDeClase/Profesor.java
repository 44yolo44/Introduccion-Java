package parte2;

public class Profesor extends Persona implements VinoaClase {
	
	//propiedades
	private String curso;
	private boolean asistencia; // Add this field to store attendance status
	private boolean asistenciaCalculada = false; // Flag to check if attendance was already calculated

	
	public String getCurso() {
        return curso;
    }
	//todo forma parte de la propiedad curso
    
    
    
    //metodos
    
    //costructor
	
	public Profesor ( String nombre , String Abreviatura , int edad , String curso ) {
		super(nombre , Abreviatura , edad);
		this.curso = curso;
	}

	//20% de que vino
	@Override
	public boolean VinoClase() {
		// Calculate attendance only once
		if (!asistenciaCalculada) {
			int probabilidad = (int) (Math.random() * 100);
			asistencia = probabilidad > 20;
			asistenciaCalculada = true;
		}
		return asistencia;
	}

	public String toString() {
		if (VinoClase()) {
			return  "Profesor [Curso " + getCurso() + ", nombre=" + getNombre() 
			+ ",Sexo =" + getsexo() + ", edad=" + getEdad() +" , asistencia = Vino]";
		}
		else {
			return  "Profesor [Curso " + getCurso() + ", nombre=" + getNombre() 
			+ ",Sexo =" + getsexo() + ", edad=" + getEdad() +" , asistencia = no Vino]";
		}
		
	}

	
}
