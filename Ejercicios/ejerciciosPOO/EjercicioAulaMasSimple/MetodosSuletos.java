package parte2;

public class MetodosSuletos {
	
	/**
	 * Genera un número aleatorio entre los valores mínimo y máximo (inclusive).
	 * 
	 * Lógica: 
	 * - Math.random() → valor entre 0.0 y 1.0
	 * - Multiplicado por el rango y sumando el mínimo
	 * - Math.floor() elimina los decimales


	 * @param minimo Límite inferior
	 * @param maximo Límite superior
	 * @return Entero aleatorio en el rango
	 */
	public static int generarNumeroAleatorio (int minimo , int maximo ) {
		
		int num=(int)Math.floor(Math.random() * (maximo - minimo + 1) + minimo);
		
		return num ;
	}

}
 