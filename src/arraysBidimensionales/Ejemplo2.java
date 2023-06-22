package arraysBidimensionales;

import java.util.Scanner;

/*
 * Introduce una matriz de 3x2, muestra los valores introducidos
 *  y decir en que posición fila/columna está el elemento mayor y 
 *  el elemento menor. Si es repetido el número basta con que diga el primero de ellos.
 * 
 * 
 */
public class Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int[][] matriz = new int[3][2];
		int esmayor = 0;
		int esmenor = 100;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Introduce " + i + " " + j);
				matriz[i][j] = teclado.nextInt();
				// esmayor = matriz[i][j];
				if (matriz[i][j] > esmayor) {
					esmayor = matriz[i][j];
				} else if (matriz[i][j] < esmenor) {
					esmenor = matriz[i][j];
				}

			}//for2
		}//for1

		// lo muestro
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Valor de " + i + " " + j + " es " + matriz[i][j]);

			}
		}
		System.out.println("El numero mayor es " + esmayor);
		System.out.println("El numero menor es " + esmenor);

	}

}
