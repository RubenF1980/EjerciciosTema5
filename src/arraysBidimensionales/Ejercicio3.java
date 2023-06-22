package arraysBidimensionales;

import java.util.Random;
/*
Hacer un programa que cargue un array de 3x3 con números aleatorios enteros menores que 10.
Crear y visualizar su transpuesta. (Cambiar filas por columnas)
*/
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner teclado = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		rellenar(matriz);
		mostrar(matriz);
		System.out.println();
		Cambiar(matriz);
		System.out.println();
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
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void Cambiar(int[][] matriz) {
		int[][] arraycambiado = new int[3][3];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				arraycambiado[j][i] = matriz[i][j];
			}
		}
		mostrar(arraycambiado);
	}

}
