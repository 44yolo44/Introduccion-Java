package parte2;

public class Profesor extends Persona {
	
	private String curso;
	
	public Profesor () {
		
		super();
		
		super.setEdad(MetodosSuletos.generarNumeroAleatorio(30, 50));
		
		curso = Constantes.MATERIAS[MetodosSuletos.generarNumeroAleatorio(0,2)];
		
		
		
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public void disponibilidad() {
		
		int prob = MetodosSuletos.generarNumeroAleatorio(0, 100);
		
		if(prob<=20) {
			super.setAsistencia(false);
		}
		else {
			super.setAsistencia(true);
		}
		
	}
	
	public String toString() {
		return "Nombre: "+getNombre()+" Edad: "+getEdad()+" Sexo: "
				+getSexo()+" Curso: "+curso+" Asistencia: "+isAsistencia();
	}
	
	
	
	
	
}
