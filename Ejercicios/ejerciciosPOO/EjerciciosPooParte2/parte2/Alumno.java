package parte2;

public class Alumno extends Persona implements VinoaClase {

	private int calificacion;
	private boolean asistencia;
	private boolean asistenciaCalculada = false; 
	
	public Alumno (String nombre , String abreviatura , int edad , int calificacion) {
		super (nombre , abreviatura , edad);
		this.calificacion = calificacion;
	}

	public int getCalificacion() {
		return calificacion;
	}
	
	//50% de que vino
	public boolean VinoClase() {
		// Calculate attendance only once
		if (!asistenciaCalculada) {
			int probabilidad = (int) (Math.random() * 100);
			asistencia = probabilidad > 50;
			asistenciaCalculada = true;
		}
		return asistencia;
	}

	public String toString() {
		if (VinoClase()) {
			return  "Alumno [calificacion=" + calificacion + ", nombre=" + getNombre() 
			+ ",Sexo =" + getsexo() + ", edad=" + getEdad() +" , asistencia = Vino]";
		}
		else {
			return "Alumno [calificacion=" + calificacion + ", nombre=" + getNombre() 
			+ ",Sexo =" + getsexo() + ", edad=" + getEdad() +" , asistencia = No vino]";
		}
		
	}

}
