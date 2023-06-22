package arraysBidimensionales;

import java.util.Random;
/*
Generar una matriz de 6x10 con números aleatorios y visualizarla
*/
import java.util.Scanner;

public class Ejemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int[][] matriz = new int[6][10];
		int aleatorio = 0;

		System.out.println("Vamos a rellenar la matriz");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				Random aleatorio1 = new Random();
				aleatorio = aleatorio1.nextInt(1000) + 1;
				matriz[i][j] = aleatorio;
			}
		}
		// Los muestro
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.printf("%5d", matriz[i][j]);
				 //System.out.print(matriz[i][j]+ " ");
			}
			System.out.println();
		}

	}
}
//Modp profe 
//public static void main(String[] args) {
//public static void main(String[] args) {
//		int[][] mat = new int[6][10];
//		int max = 1000;
//		int min = 0;
//		int range = max - min;
//
//		// generate random numbers within 1 to 10
//		for (int i = 0; i < 6; i++) {
//			for (int j = 0; j < 10; j++) {
//				mat[i][j] = (int) (Math.random() * range) + min;
//			}
//		}
//		visualizar(mat);
//	}
//
//	public static void visualizar(int[][] m) {
//		for (int i = 0; i < 6; i++) {
//			for (int j = 0; j < 10; j++) {
//				System.out.printf("%5d", m[i][j]);
//				// System.out.print(m[i][j]+" ");
//			}
//			System.out.println();
//		}
//	}

//}
