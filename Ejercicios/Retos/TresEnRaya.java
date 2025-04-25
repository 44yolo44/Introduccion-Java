/*
 * Crea una función que analice una matriz 3x3 compuesta por "X" y "O"
 * y retorne lo siguiente:
 * - "X" si han ganado las "X"
 * - "O" si han ganado los "O"
 * - "Empate" si ha habido un empate
 * - "Nulo" si la proporción de "X", de "O", o de la matriz no es correcta.
 *   O si han ganado los 2.
 * Nota: La matriz puede no estar totalmente cubierta.
 * Se podría representar con un vacío "", por ejemplo.
 */
package retos1;

public class TresEnRaya {
	
	public static void main(String[] args) {
		
		//hacer la matriz
		String [][] juego = new String [3][3];
		
		//crearlo aleatoriamente 'X' o 'O'
		

		
        for (int i = 0; i < 4; i++) {
            int a = numAleatorio(0, 2);
            int b = numAleatorio(0, 2);

            while (juego[a][b] != null) {
                a = numAleatorio(0, 2);
                b = numAleatorio(0, 2);
            }

            juego[a][b] = "X";
        }
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
					
				if(juego[i][j]==null) {
					juego[i][j]= "O";
				}
					
			}
		}
		
		   int a = numAleatorio(0, 2);
           int b = numAleatorio(0, 2);

           while (juego[a][b] != "O") {
               a = numAleatorio(0, 2);
               b = numAleatorio(0, 2);
           }
           
           juego[a][b] = " ";
		
		
		for (int i = 0; i < 3; i++) {
			
			for (int j = 0; j < 3; j++) {
				
				System.out.print("|"+juego[i][j]+"|");
			}
			
			System.out.println("\n---------");
		}
	  
		
		juego[a][b] = null;
		
		System.out.println("El juego lo Gano "+ganador3EnRaya(juego));
		System.out.println("El juego lo Gano "+ganador3EnRaya2(juego));
		
		
	}
	//mi version (no dectecta si hay doble ganador se infiere que el q gano lo escribio primero)
	public static String ganador3EnRaya(String [][] juego) {
		
		
		for (int i = 0; i < juego.length; i++) {

			if (juego[i][0] != null && juego[i][0].equals(juego[i][1]) && juego[i][1].equals(juego[i][2])) {
				return juego[i][0];
			}
		}
		
		for (int i = 0; i < juego.length; i++) {

			if (juego[0][i] != null && juego[0][i].equals(juego[1][i]) && juego[1][i].equals(juego[2][i])) {
				return juego[0][i];
			}
		}
		
		if (juego[0][0] !=null && juego[0][0].equals(juego[1][1])&&juego[1][1].equals(juego[2][2])) {
			return juego[0][0];
		}
		
		if (juego[0][2] !=null && juego[0][2].equals(juego[1][1])&&juego[1][1].equals(juego[2][0])) {
			return juego[0][2];
		}
		
		return "Ninguno";
		
	}
	//version correjida por ia (chatgpt , si incluye deteccion de si hay doble ganador)
	public static String ganador3EnRaya2(String[][] juego) {
	    String ganador = null;
	    int contadorGanadas = 0;

	    // Revisar filas
	    for (int i = 0; i < 3; i++) {
	        if (juego[i][0] != null && juego[i][0].equals(juego[i][1]) && juego[i][0].equals(juego[i][2])) {
	            if (ganador == null) {
	                ganador = juego[i][0];
	                contadorGanadas = 1;
	            } else if (ganador.equals(juego[i][0])) {
	                contadorGanadas++;
	                if (contadorGanadas >= 2) {
	                    return "ninguno"; // mismo jugador ganó 2 filas
	                }
	            } else {
	                return "ninguno"; // diferentes ganadores
	            }
	        }
	    }

	    // Revisar columnas
	    for (int i = 0; i < 3; i++) {
	        if (juego[0][i] != null && juego[0][i].equals(juego[1][i]) && juego[0][i].equals(juego[2][i])) {
	            if (ganador == null) {
	                ganador = juego[0][i];
	                contadorGanadas = 1;
	            } else if (ganador.equals(juego[0][i])) {
	                contadorGanadas++;
	                if (contadorGanadas >= 2) {
	                    return "ninguno"; // mismo jugador ganó 1 fila + 1 columna, o 2 columnas
	                }
	            } else {
	                return "ninguno"; // diferentes ganadores
	            }
	        }
	    }

	    // Revisar diagonal principal
	    if (juego[0][0] != null && juego[0][0].equals(juego[1][1]) && juego[0][0].equals(juego[2][2])) {
	        if (ganador == null || ganador.equals(juego[0][0])) {
	            return juego[0][0];
	        } else {
	            return "ninguno";
	        }
	    }

	    // Revisar diagonal secundaria
	    if (juego[0][2] != null && juego[0][2].equals(juego[1][1]) && juego[0][2].equals(juego[2][0])) {
	        if (ganador == null || ganador.equals(juego[0][2])) {
	            return juego[0][2];
	        } else {
	            return "ninguno";
	        }
	    }

	    return ganador != null ? ganador : "Ninguno";
	}


	
	public static int numAleatorio(int minimo , int maximo) {
		
		int num = (int)(Math.floor(Math.random()*(maximo - minimo + 1)+minimo));
		return num;
	}
	
	

}
