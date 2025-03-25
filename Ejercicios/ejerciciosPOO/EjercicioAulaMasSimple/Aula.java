package parte2;

import java.util.Iterator;

public class Aula {
	
	private Alumno alumnos [] ;
	private Profesor profe ;
	private int id ;
	private String curso;
	
	private final int MAX_ALUMNOS = 20 ; 
	
	public Aula () {
		
		id = 1 ;
		
		profe = new Profesor() ;
		
		alumnos = new Alumno[MAX_ALUMNOS];
		
		creaAlumnos(); // Se inicializan los alumnos
		
		curso = Constantes.MATERIAS[MetodosSuletos.generarNumeroAleatorio(0,2)];
	}
	
	private void creaAlumnos() {
		
		for (int i = 0; i < alumnos.length; i++) {
			
			alumnos[i]=new Alumno();
			
		}
		
	}
	
	private boolean asistenciaAlumnos () {
		int c = 0 ;
		
		for (int i = 0; i < alumnos.length; i++) {
			
			if (alumnos[i].isAsistencia()) {
				c++;
			}
			
		}
		
		return c >= (alumnos.length)/2 ;
		
	}
	
	
	public boolean darClase() {
		
		if(!profe.isAsistencia()) {
			System.out.println("El Profesor No esta ");
			return false;
		}
		else if (!profe.getCurso().equals(curso)) {
			System.out.println("El profesor es de "+profe.getCurso()+"y no enseña "+curso);
			return false;
		}
		else if (!asistenciaAlumnos()) {
			System.out.println("la Asistencia no seria suficiente");
			return false;
		}
		
		System.out.println("se puede dar clase ");
		return true;
		
		
	}
	
	
	public void ContarAlumnos() {
		
		int chicos = 0;
		int chicas = 0;
		
		for (int i = 0; i < alumnos.length; i++) {
			
			if (alumnos[i].getSexo()=='H') {
				chicos++;
			}
			else {
				chicas++;
			}
			
		}
		
		System.out.println("Hay "+alumnos.length+" alumnos en el aula");
		
	}


	
	public void notas () {
		
		int chicosAprob = 0;
		int chicasAprob = 0;
		
		
		for (int i = 0; i < alumnos.length; i++) {
			
			if (alumnos[i].getCalificacion()>5) {
				if(alumnos[i].getSexo()=='H') {
					chicosAprob++;
				}
				else if(alumnos[i].getSexo()=='M') {
					chicasAprob++;
				}	
			}
			
			System.out.println(alumnos[i].toString());
			
		}
		
		System.out.println("Chicos Aprobados: "+chicosAprob);
		System.out.println("Chicas Aprobadas: "+chicasAprob);
	}
	
}
