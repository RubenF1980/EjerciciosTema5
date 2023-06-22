package arraysBidimensionales;

import java.util.Random;
import java.util.Scanner;
	/*
	Hacer un programa que permita rellenar un array de 3 x 3, 
	según el usuario va introduciendo la coordenada. El valor 
	que se almacenara en cada elemento será la secuencia de los 
	9 primeros números naturales, de forma que en la primera casilla 
	que el usuario elija deberá de almacenarse un 1 , en la segunda
	 casilla un 2 , y así sucesivamente. Se deberá de comprobar que
	 una casilla no esté ocupada. Cuando toda la tabla esté rellenada visualizarla.
	*/

public class Ejercicio5 {

	public static void main(String[] args) {

		int[][] matriz = new int[3][3];
		rellenar(matriz);
		System.out.println("Array lleno");
		mostrar(matriz);

	}

	public static void rellenar(int[][] matriz) {

		Scanner teclado = new Scanner(System.in);
		int fila, columna, numnat = 0;
		do {
			System.out.println("Introduce fila ");
			fila = teclado.nextInt();
			while (fila < 0 || fila > 2) {
				System.out.println("Debe estar entre 0 y 2 .Introduce fila ");
				fila = teclado.nextInt();
			}
			System.out.println("Introduce columna ");
			columna = teclado.nextInt();
			while (columna < 0 || columna > 2) {
				System.out.println("Debe estar entre 0 y 2 .Introduce columna ");
				columna = teclado.nextInt();
			}
			//Compruebo si es cero si no lo relleno 
			if (matriz[fila][columna] == 0) {
				numnat++;
				matriz[fila][columna] = numnat;
			} else {
				System.out.println("Esta ocupado ");
			}

			mostrar(matriz);

		} while (numnat < 9);

	}

	public static void mostrar(int[][] array) {
		// Lo muestro entero el array
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
