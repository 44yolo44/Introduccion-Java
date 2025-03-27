package Parte3;

public class Asientos {

	private int fila;
	private int columna;
	private char letraColumna;
	private boolean ocupado;
	
	private Espectador espectador;

	// MÉTODOS
	//constructor
	public Asientos (int fila, int columna) {
		
		this.fila = fila;
		this.columna = columna;
		
	}
	
	

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getColumna() {
		return columna;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}

	public char getLetraColumna() {
		return letraColumna;
	}

	public void setLetraColumna(char letraColumna) {
		this.letraColumna = letraColumna;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}



	public Espectador getEspectador() {
		return espectador;
	}



	public void setEspectador(Espectador espectador) {
		this.espectador = espectador;
	}
	
	

}
