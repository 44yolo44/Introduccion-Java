package poo;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;


public class Prueba_Temporizador2 {

	public static void main(String[] args) {
		
	
	Reloj miReloj = new Reloj ();
	miReloj.enMarcha(3000 , true);
	
	JOptionPane.showMessageDialog(null, "PULSA ACEPTAR para terminar ");
	
	System.exit(0);
	
		
		
	}

}

///////////////////////////////////////////////////////////////////////////////////////////////

class Reloj {
	
//	public Reloj (int intervalo , boolean sonido ) {
//		this.intervalo = intervalo;
//		this.sonido = sonido;
//		
//	} podemos presindir del constuctor
	
	public void enMarcha (int intervalo , final boolean sonido ) {
		//clase interna local
		 class DameLaHora2 implements ActionListener {
			
			public void actionPerformed( ActionEvent evento ) {
				
				Date ahora = new Date();
				
				System.out.println("la hora cada 3sg "+ahora);
				
				if (sonido) {
					Toolkit.getDefaultToolkit().beep();
				}
				
				
			}

		}
		//hasta aca
		
		ActionListener oyente = new DameLaHora2 ();
		
		Timer  miTemporizador = new Timer (intervalo , oyente);
		
		miTemporizador.start();
	}
	
//	private int intervalo ;
//	private boolean sonido ; podemos presindir
	

}