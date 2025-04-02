package Javase;


public class poligonos {

	public static void triangulo(int base, int altura) {
		System.out.println((base*altura)/2);
	}
	public static void cuadrado( int lado) {
			System.out.println(lado*lado);
	}
	public static void rectangulo (int base , int altura ) {
		System.out.println(base*altura);
	}
	
	public static void main(String[] args) {
	
		triangulo(3, 4);
		rectangulo(5, 10);
		cuadrado(6);
		
	}
}
