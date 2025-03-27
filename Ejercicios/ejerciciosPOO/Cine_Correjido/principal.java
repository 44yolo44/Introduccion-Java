package Parte3;

public class principal {

	public static void main(String[] args) {
		
		Sala sala = new Sala();
		
		System.out.println("Bienvenido al cine");
		
		System.out.println("Disposisicion de la sala");
		sala.infoSala();
		
		System.out.println("");
		System.out.println("Informacion de la sala");
		System.out.println("\n");
		
		System.out.println("Pelicula : "+sala.getPelicula().getTitulo());
		System.out.println("Duracion : "+sala.getPelicula().getDuracion());
		System.out.println("Edad minima : "+sala.getPelicula().getEdadMinima());
		System.out.println("Director : "+sala.getPelicula().getDirector());
		System.out.println("Precio de la entrada : "+sala.getPelicula().getPrecioEntrada());
		
		System.out.println("\n");
		
		sala.infoEspectadores();

	}

}
