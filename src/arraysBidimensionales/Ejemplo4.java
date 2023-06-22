package arraysBidimensionales;

import java.util.Random;
/*
Crear una matriz de 3x2, pide introducir sus valores. 
Solicitar la posición de fila y columna para consultar
 dicha posición y muestre el valor guardado en esa posición.
*/
import java.util.Scanner;

public class Ejemplo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int[][] matriz = new int[3][2];
		char res;
		rellenar(matriz);
		mostrar(matriz);
		do {		
			consultar(matriz);
			System.out.println("Quieres continuar");
			res = teclado.next().charAt(0);
			res = Character.toUpperCase(res);
		} while (res == 'S');
		System.out.println("Fin de programa");

	}

	public static void rellenar(int[][] matriz) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Vamos a rellenar la matriz");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Introduce pos " + i + " " + j);
				matriz[i][j] = teclado.nextInt();
			}
		}
	}

	public static void mostrar(int[][] array) {
		// Lo muestro entero el array
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				//System.out.printf("%5d", array[i][j]);
				 System.out.print(array[i][j]+ " ");
			}
			System.out.println();
		}
	}

	public static void consultar(int[][] array) {
		/// Pido la fila y la columna para mostrar
		int fila = 0;
		int columna = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce fila ");
		fila = teclado.nextInt();
		System.out.println("Introduce columna ");
		columna = teclado.nextInt();
		while ((fila >= 3) || (columna >= 2)) {
			System.out.println("Error de posicion.Introduce fila ");
			fila = teclado.nextInt();
			System.out.println("Error de posicion.Introduce columna ");
			columna = teclado.nextInt();
		}
		System.out.println("La posicion tiene un " + array[fila][columna]);

	}

}
