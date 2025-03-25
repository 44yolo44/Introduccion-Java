package parte2;

public class principal {

	public static void main(String[] args) {
		
		Aula aula = new Aula();
		
		if(aula.darClase()) {
			
			System.out.println("La clase se dio con exito");
			
			aula.ContarAlumnos();
			
			//mostrar notas
			
			aula.notas();
			
		}
		else {
			System.out.println("La clase no se pudo dar");
		}
		
		
    }
}



