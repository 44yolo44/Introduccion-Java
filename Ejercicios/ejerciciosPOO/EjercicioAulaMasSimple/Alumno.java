package parte2;

public class Alumno extends Persona {

	private int calificacion;
	
	public Alumno () {
		super();
		
		setCalificacion(MetodosSuletos.generarNumeroAleatorio(0, 10));
		
		super.setEdad(MetodosSuletos.generarNumeroAleatorio(17, 20));
	}

	@Override
	public void disponibilidad() {
		
		int prob = MetodosSuletos.generarNumeroAleatorio(0, 100);
				
		if(prob<=50) {
			super.setAsistencia(false);
		}
		else {
			super.setAsistencia(true);
		}
		
	}

	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}
	
	public String toString() {
		return "Nombre: "+getNombre()+" Edad: "+getEdad()+" Sexo: "
				+getSexo()+" Calificacion: "+calificacion+" Asistencia: "+isAsistencia();
	}
	
	
}
