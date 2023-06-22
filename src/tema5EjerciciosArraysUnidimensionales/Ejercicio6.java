package tema5EjerciciosArraysUnidimensionales;

import java.util.Random;
import java.util.Scanner;

/*
Hacer un programa en Java que simule el lanzamiento de un dado
 utilizando números aleatorios y contabilice el número de veces 
 que salió cada cara utilizando un array. Realizar el programa mediante métodos.
*/
public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Cuantas veces quieres tirar el dado ");
		int numVeces = teclado.nextInt();
		int[] dado = new int[numVeces];
		tirardado(dado, numVeces);
		for (int i = 0; i < numVeces; i++) {
			System.out.print(dado[i] + "  ");
		}

		System.out.println();
		visualizaycuenta(dado, numVeces);
		teclado.close();
	}

	public static void tirardado(int[] array1, int nveces) {

		for (int i = 0; i < nveces; i++) {
			array1[i] = numaleatorio();

		}
	}

	public static int numaleatorio() {
		int aleatorioaux;
		Random aleatorio = new Random();
		aleatorioaux = aleatorio.nextInt(6) + 1;

		return aleatorioaux;

	}

	public static void visualizaycuenta(int[] array1, int nveces) {
		int[] contador = { 0, 0, 0, 0, 0, 0 };

		for (int i = 0; i < nveces; i++) {
			switch (array1[i]) {
			case 1:
				contador[0]++;
				break;
			case 2:
				contador[1]++;
				break;
			case 3:
				contador[2]++;
				break;
			case 4:
				contador[3]++;
				break;
			case 5:
				contador[4]++;
				break;
			case 6:
				contador[5]++;
				break;
			}
		}
		visualiza(contador);
	}

	public static void visualiza(int[] conta) {
		for (int i = 0; i < 6; i++) {
			System.out.println("ha salido " + (i + 1) + " " + conta[i] + " veces");
		}
	}

}
