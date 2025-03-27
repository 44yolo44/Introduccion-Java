// File: src/Parte3/Sala.java
package Parte3;

public class Sala {
	
	private static final int FILAS = 8;
	private static final int COLUMNAS = 12;
	private Asientos [][] asientos;
	private Pelicula pelicula;
	private Espectador [] espectadores;
	
	public Sala () {
		
		asientos = new Asientos [FILAS][COLUMNAS];
		
		espectadores = new Espectador [metodosSueltos.generadorNumerosAleatorios(10, 80)];
		
		pelicula = new Pelicula();
		
		inicializarEspectadores();
		inicializarAsientos();
		
		
		
		AsignarEspectadores();
		
		
	}
	
	private void inicializarEspectadores () {
		
		
		
		for (int i = 0; i < espectadores.length; i++) {
			
			espectadores[i] = new Espectador();
			
		}
		
	}
	
	private void inicializarAsientos () {
			
		char [] letras = {'A','B','C','D','E','F','G','H','I','J','K','L'};
		
		for (int i = 0; i < FILAS; i++) {
			
			for (int j = 0; j < COLUMNAS; j++) {
				
				asientos[i][j] = new Asientos(i, j);
				asientos[i][j].setLetraColumna(letras[j]);
				asientos[i][j].setOcupado(false);
			}
		}
		
	}
	
	
	public void infoSala () {
		
		for (int i = 0; i < FILAS; i++) {
			
			for (int j = 0; j < COLUMNAS; j++) {
				
				System.out.print(asientos[i][j].getFila()+""+asientos[i][j].getLetraColumna()+" ");
				
			}
			System.out.println();
		}
		
	}
	
	 public void AsignarEspectadores() {
	        for (int i = 0; i < espectadores.length; i++) {
	        	
	        	
	        	//condicion para ver la pelicula
	            if (espectadores[i].getEdad() >= pelicula.getEdadMinima() 
	            	&& espectadores[i].getDinero() >= pelicula.getPrecioEntrada()) {
	                int a = metodosSueltos.generadorNumerosAleatorios(0, FILAS - 1);
	                int b = metodosSueltos.generadorNumerosAleatorios(0, COLUMNAS - 1);
	    
	                //en caso que el asiento no este ocupado	
	                while (asientos[a][b].isOcupado()) {
	                    a = metodosSueltos.generadorNumerosAleatorios(0, FILAS - 1);
	                    b = metodosSueltos.generadorNumerosAleatorios(0, COLUMNAS - 1);
	                }
	                
	                //asignacion de espectador y indicamos que el asiento esta ocupado
	                asientos[a][b].setEspectador(espectadores[i]);
	                asientos[a][b].setOcupado(true);
	                
	            } 
	        }
	    }

	
	public void infoEspectadores () {
		
		for (int i = 0; i < FILAS; i++) {
			
			for (int j = 0; j < COLUMNAS; j++) {
				
				if (asientos[i][j].isOcupado()) {
					
					//nombre del asiento 
					System.out.print(asientos[i][j].getFila()+""+asientos[i][j].getLetraColumna()+" ");
					//Datos del espectador
					System.out.print(asientos[i][j].getEspectador().toString());
					
				}
				else {
					
					System.out.print(asientos[i][j].getFila()+""+asientos[i][j].getLetraColumna()+" ");
					System.out.print("Asiento vacio");
					
				}
				
				System.out.println();
				
			}
			
		}
		
	}

	public Asientos[][] getAsientos() {
		return asientos;
	}

	public void setAsientos(Asientos[][] asientos) {
		this.asientos = asientos;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}
	
	
	
	
}
