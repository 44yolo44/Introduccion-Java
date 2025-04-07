package Javase;

import java.awt.image.BufferedImage; //manejar imagenes
import java.io.IOException;			//manejar los errores desde la url}
import java.net.URL;				//acceder a url
import javax.imageio.ImageIO;		//leer las imagenes 


public class calcularAspectRatio {

	public static void main(String[] args) {
		
		
	try {
		
		//creamos el objeto url
		String urlImagen = "https://static1.srcdn.com/wordpress/wp-content/uploads/2020/04/Rickroll-Wide.jpg?q=50&fit=crop&w=1140&h=&dpr=1.5";
		URL url = new URL(urlImagen);
		
		//leer la imagen desde la url
		BufferedImage imagen = ImageIO.read(url);
		
		//obtenemos ancho y alto 
		
		int alto = imagen.getHeight();
		int ancho = imagen.getWidth();
		
		//simplificamos el aspect ratio 
		int simpl = MCD (alto , ancho );
		
		int ratioancho= ancho / simpl;
		int rationalto = alto / simpl;
		
		System.out.println("Dimensiones : "+ancho+"X"+alto);
		System.out.println("Aspect Ratio : "+ratioancho+":"+rationalto);
		
		
		
		
		
	} catch (IOException e) {
		System.out.println("La imagen no se puede leer "+e.getMessage());
		}
	
	
	}
	
	//funcion para calcular el mcd y simplificar el aspect ratio
	public static int MCD(int a, int b) {
		while (b!=0) {
			int temp = b; 
			b = a%b;
			a =  temp;
		}
		return a;
	}
}
