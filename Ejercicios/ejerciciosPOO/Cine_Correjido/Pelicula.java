package Parte3;

public class Pelicula {

	private String titulo;
	private int duracion;
	private int edadMinima;
	private String director;
	private int precioEntrada;
	
	//constantes
	
	public final String[] TITULOS = {"Inception", "Interstellar", "Titanic", "The Matrix", "Avatar", "Gladiator", "The Dark Knight", "Pulp Fiction", "Forrest Gump", "The Godfather"};
    public final String[] DIRECTORES = {"Christopher Nolan", "Steven Spielberg", "Quentin Tarantino", "Martin Scorsese", "James Cameron", "Ridley Scott", "Francis Ford Coppola", "Stanley Kubrick", "Alfred Hitchcock", "David Fincher"};
    
    public Pelicula () {
		
		titulo = TITULOS[metodosSueltos.generadorNumerosAleatorios(0, (TITULOS.length-1))];
		
		duracion = metodosSueltos.generadorNumerosAleatorios(60, 180);
		
		edadMinima = metodosSueltos.generadorNumerosAleatorios(7, 18);
		
		director = DIRECTORES[metodosSueltos.generadorNumerosAleatorios(0, (DIRECTORES.length-1))];
		
		precioEntrada = metodosSueltos.generadorNumerosAleatorios(5, 10);
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getEdadMinima() {
		return edadMinima;
	}

	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getPrecioEntrada() {
		return precioEntrada;
	}

	public void setPrecioEntrada(int precioEntrada) {
		this.precioEntrada = precioEntrada;
	}
    
    
    
    
	
	
}
