package parte2;

public class Aula {
	
	private int n = 1;
	private Alumno alumnos [] ;
	private Profesor profe ;
	private int id ;
	boolean hayClase;
	
	private String curso;

	public String getCurso() {
		return curso;
		}
	
	
	public Aula (Alumno [] alumnos , Profesor profe , int id , String cursoAula ) {
		
		this.n = alumnos.length;
		
		this.alumnos = new Alumno [n];
		
		for (int i = 0 ; i <n ; i++) {
			this.alumnos[i] = new Alumno(alumnos[i].getNombre(),alumnos[i].getsexo() , alumnos[i].getEdad(), alumnos[i].getCalificacion());
		}
		
		this.profe=profe;
		
		this.id=id;
		
		this.curso=cursoAula;
	
	}

	public int getId() {
		return id;
	}

	public int NumeroAlumnosVaronesAprobados() {
		int c=0;
		for(int i = 0 ; i<alumnos.length ; i++) {
			if(alumnos[i].getsexo().equals("H") && alumnos[i].getCalificacion()>=5) {
				c++;
			}
		}
		return c;
	}

	public int NumeroAlumnosMujeresAprobadas() {
		int c=0;
		for(int i = 0 ; i<alumnos.length ; i++) {
			if(alumnos[i].getsexo().equals("M") && alumnos[i].getCalificacion()>=5) {
				c++;
			}
		}
		return c;
	}

	public int DameNumeroAlumnos (){
		return alumnos.length;
	}

	public int DameAsistencia (){
		int c=0;
		for(int i = 0 ; i<alumnos.length ; i++) {
			if(alumnos[i].VinoClase()) {
				c++;
			}
		}
		return c;
	}

	public String DameAsistenciaProfesor (){
		if(profe.VinoClase()) {
			return "Vino";
		}
		else {
			return "No vino";
		}
	}

	public boolean DameHayClase () {

		if(profe.VinoClase()==true){

			if(profe.getCurso().equals(curso)){

				if ((DameAsistencia()*2)>DameNumeroAlumnos()) {
					return true ; 
				}
			}
		}
		return false;
	}
	
}
