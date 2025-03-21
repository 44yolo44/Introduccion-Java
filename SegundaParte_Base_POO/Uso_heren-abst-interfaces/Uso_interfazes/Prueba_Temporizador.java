package poo;

import javax.swing.*; // Importa JOptionPane y otras clases de Swing, incluyendo Timer
import java.awt.event.*; // Importa ActionListener y ActionEvent para el manejo de eventos
import java.util.*; // Importa Date y otras utilidades. Nota: también contiene Timer que podría causar ambigüedad

import javax.swing.Timer; // Especifica explícitamente que usaremos Timer de javax.swing para evitar ambigüedad con java.util.Timer

public class Prueba_Temporizador {

	public static void main(String[] args) {
		// Punto de entrada principal del programa
		
		dameLaHora oyente = new dameLaHora(); // Crea instancia de la clase que implementa ActionListener
		// También se podría declarar usando el tipo de interfaz:
		// ActionListener oyente = new dameLaHora();
		
		Timer miTemporizador = new Timer(5000, oyente); /* Crea un temporizador que se ejecutará cada 5000ms (5s)
		y notificará al oyente registrado cada vez que se cumpla el intervalo */	
		
		miTemporizador.start(); // Inicia el temporizador
		
		JOptionPane.showMessageDialog(null, "Pulsa Aceptar para detener"); /*
		Muestra un cuadro de diálogo que mantiene la aplicación en ejecución
		hasta que el usuario presione Aceptar. Esta es una técnica simple para
		mantener activo el hilo principal sin usar construcciones más avanzadas.
		*/	
		
		System.exit(0); // Termina la aplicación al cerrar el diálogo
		
	}

}

class dameLaHora implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
		// Este método se ejecuta cada vez que el temporizador completa un intervalo
		
		Date ahora = new Date(); // Obtiene la fecha y hora actual
		
		System.out.println("Te muestro la hora cada 5s: " + ahora);
		
	}
	
}
