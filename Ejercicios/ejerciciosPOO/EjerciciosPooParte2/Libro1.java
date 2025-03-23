package parte1;

class Libro1 {
	
	//atributos 
	private int ISBN ;
	private String Titulo ; 
	private String Nombre ; 
	private int numeroPaginas;
	
	//metodos 
	
	public Libro1 (int ISBN , String Titulo , String Nombre , int numeroPaginas) {
		this.setISBN(ISBN);
		this.setNombre(Nombre);
		this.setNumeroPaginas(numeroPaginas);
		this.setTitulo(Titulo);
	}

	

	public int getISBN() {
		return ISBN;
	}



	private void setISBN(int iSBN) {
		ISBN = iSBN;
	}



	public String getTitulo() {
		return Titulo;
	}



	private void setTitulo(String titulo) {
		Titulo = titulo;
	}



	public String getNombre() {
		return Nombre;
	}



	private void setNombre(String nombre) {
		Nombre = nombre;
	}



	public int getNumeroPaginas() {
		return numeroPaginas;
	}



	private void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}



	public String toString (){
		
		return "EI libro "+getTitulo()+" con ISBN : "+getISBN()
		+" creado por eI autor "+ getNombre()+" tiene "+getNumeroPaginas()+" páginas";
	}
	
	
	
}
