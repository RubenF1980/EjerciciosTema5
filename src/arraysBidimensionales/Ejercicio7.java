package arraysBidimensionales;
/*
Hacer un programa que visualice y sume las diagonales principal
 y secundaria de una matriz 5 por 5 de números aleatorios.
*/

import java.util.Random;

public class Ejercicio7 {

	public static void main(String[] args) {

		int[][] matriz = new int[5][5];
		rellenar(matriz);	
		mostrar(matriz);
		System.out.println("Sumas");
		System.out.println("La suma es " + sumarDiagonal(matriz));
		System.out.println("La suma es " + sumarDiagonal2(matriz));

	}

	public static void rellenar(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				Random aleatorio1 = new Random();
				int aleatorio = aleatorio1.nextInt(10) + 1;
				matriz[i][j] = aleatorio;
			}
		}
	}

	public static int sumarDiagonal(int[][] matriz) {
		int suma = 0;
		for (int i = 0; i < 5; i++) {
			System.out.print(matriz[i][i] + "  ");
			suma += matriz[i][i];
		}
		return suma;
	}

	public static int sumarDiagonal2(int[][] matriz) {
		int suma = 0, j = 5;
		for (int i = 0; i < 5; i++) {
			j--;
			System.out.print(matriz[i][j] + "  ");
			suma += matriz[i][j];
		}
		return suma;
	}

	public static void mostrar(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
