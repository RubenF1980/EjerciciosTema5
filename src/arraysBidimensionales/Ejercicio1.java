package arraysBidimensionales;

import java.util.Random;
/*
Hacer un programa que permita cargar por teclado un array de 
números enteros aleatorios de 3 filas y 4 columnas, y calcule:
La suma de cada una de sus filas.
La suma de cada una de sus columnas.
*/
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int[][] matriz = new int[3][4];

		rellenar(matriz);
		mostrar(matriz);
		sumafilas(matriz);
		System.out.println();
		sumacolumnas(matriz);

	}

	public static void rellenar(int[][] matriz) {
		int aleatorio;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				Random aleatorio1 = new Random();
				aleatorio = aleatorio1.nextInt(10) + 1;
				matriz[i][j] = aleatorio;
			}
		}
	}

	public static void mostrar(int[][] array) {
		// Lo muestro entero el array
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
				// System.out.println(suma(array));
			}
			System.out.println();
		}
	}

	public static void sumafilas(int[][] array) {

		int sumafila = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sumafila += array[i][j];
			}
			System.out.println("La suma de las fila " + i + " es " + sumafila);
			sumafila = 0;			
		}
		
	}

	public static void sumacolumnas(int[][] array) {
		int sumacolumna = 0;
		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < 3; i++) {
				sumacolumna += array[i][j];
			}
			System.out.println("La suma de la columna " + j + " es " + sumacolumna);
			sumacolumna = 0;
		}

	}

}
