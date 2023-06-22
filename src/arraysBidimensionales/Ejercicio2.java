package arraysBidimensionales;

import java.util.Random;
/*
Hacer un programa que cargue por teclado un array de 3x3 y 
compruebe si existe alguna fila o columna donde todos sus componentes sean iguales.
*/
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner teclado = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		rellenar(matriz);
		mostrar(matriz);
		comprobarFilas(matriz);
		comprobarColumnas(matriz);

	}

	public static void rellenar(int[][] matriz) {

		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("Introduce el numero de la posicion " + i + " , " + j + " :");
				matriz[i][j] = teclado.nextInt();
			}
		}
		teclado.close();
	}

	public static void mostrar(int[][] array) {
		// Lo muestro entero el array
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void comprobarFilas(int[][] matriz) {

		int iguales, primero;
		for (int i = 0; i < matriz.length; i++) {
			iguales = 0;
			primero = matriz[i][0];
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == primero)
					iguales = iguales + 1;
			}
			if (iguales == matriz[i].length) {
				System.out.println("Las filas " + i +" son iguales");
			} else {
				System.out.println("Las filas "+ i + " NO son iguales");
			}
		}
	}
	public static void comprobarColumnas(int[][] matriz) {

		int iguales, primero;
		for (int j = 0; j < matriz.length; j++) {
			iguales = 0;
			primero = matriz[0][j];
			for (int i = 0; i < matriz[j].length; i++) {
				if (matriz[i][j] == primero)
					iguales = iguales + 1;
			}
			if (iguales == matriz[j].length) {
				System.out.println("Las columnas " + j +" son iguales");
			} else {
				System.out.println("Las columnas"+ j + " NO son iguales");
			}
		}

	}

}
