
package Retos;

import java.util.HashSet; //
import java.util.Set;	//
import javax.swing.JOptionPane;

public class numeroFeliz {

  public static void main(String[] args) {
	
	  int num = Integer.parseInt(JOptionPane.showInputDialog("ingrese numero"));
	  
	  if(esFeliz(num)) {
		  JOptionPane.showMessageDialog(null, "El Numero SI es feliz");
	  }
	  else {
		  JOptionPane.showMessageDialog(null, "El Numero NO es feliz");
	  }
	  
	  
	  
  }
  
  public static boolean esFeliz(int num) {
	
	    Set<Integer> vistos = new HashSet<>();

        while (num != 1 && !vistos.contains(num)) {
            vistos.add(num);
            num = sumaCuadradosDigitos(num);
        }

        return num == 1;
  }
  
  public static int sumaCuadradosDigitos(int num) {
	  
	  int suma = 0 ; 
	  
	  while (num > 0) {
		  
		  int digito = num%10;
		  suma +=digito*digito;
		  num /= 10;
	  }
	  return suma;
  }
  
  
	
}
